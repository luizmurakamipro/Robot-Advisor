/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.DAO;

import Robot.Classes.Endereco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author Luiz Murakami
 */
public class EnderecoDAO extends DAO<Endereco>{

    @Override
    public boolean inserir(Endereco element) {
        try{
            String comando = "insert into endereco (logradouro, numero, pais, uf, cep) values (?,?,?,?,?);";
            
            PreparedStatement stmt = conn.prepareStatement(
                                comando,Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, element.getLogradouro());
            stmt.setString(2, element.getNumero());
            stmt.setString(3, element.getPais());
            stmt.setString(4, element.getUF());
            stmt.setString(5, element.getCEP());
             
            int linhas = stmt.executeUpdate();
            if(linhas==1) {
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                element.setID(rs.getInt(1));
                return true;
            }
        }catch(SQLException e){
            System.out.println("erro ao inserir: "+ e.getMessage());
        }
        return false;
    }

    @Override
    public boolean alterar(Endereco element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Endereco element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Endereco> listar() {
        List<Endereco> pEnd = new LinkedList<>();
        pEnd = ObservableCollections.observableList(pEnd);
        
        String sql = "SELECT * FROM endereco;";
        
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                
                
                Endereco c = new Endereco();
                c.setID(rs.getInt("id"));
                c.setLogradouro(rs.getString("logradouro"));
                c.setNumero(rs.getString("numero"));
                c.setPais(rs.getString("pais"));
                c.setUF(rs.getString("uf"));
                c.setCEP(rs.getString("cep"));
                System.out.println(rs.getString("pais"));
                pEnd.add(c);
            }
            
        }catch(SQLException e){
            System.out.println("erro ao listar");
        }
        return pEnd;
    }
    
}

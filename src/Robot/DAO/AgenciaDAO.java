/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.DAO;
import Robot.Classes.Agencia;
import Robot.Classes.Endereco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 * @author Luiz Paulo
 */
public class AgenciaDAO extends DAO <Agencia>{

    @Override
    public boolean inserir(Agencia element) {
        try {
            EnderecoDAO ed = new EnderecoDAO();
            Endereco e = element.getEndereco();
            
            if (e.getID() == null)
                ed.inserir(e);
            else
                ed.alterar(e);
            
            String comando = "insert into agencia (razaosocial, email, contato, cnpj, tiposervico, id_endereco)"
                    + " values (?,?,?,?,?,?);";
            
            PreparedStatement stmt = conn.prepareStatement(
            comando,Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, element.getRazaoSocial());
            stmt.setString(2, element.getEmail());
            stmt.setString(3, element.getContato());        
            stmt.setString(4, element.getCNPJ());
            stmt.setString(5, element.getTipoServico());
            stmt.setInt(6, element.getEndereco().getID());
            
            int linhas = stmt.executeUpdate();
            
            if(linhas == 1) 
            {
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                element.setID(rs.getInt(1));
                return true;
            }
            
            
            
        } catch (Exception e) {
            System.out.println("erro ao inserir: " + e.getMessage());
        
        }
        return false;
 
    }

    @Override
    public boolean alterar(Agencia element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Agencia element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Agencia> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}

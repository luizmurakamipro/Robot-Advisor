/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.DAO;

import Robot.Classes.Endereco;
import Robot.Classes.Perfil;
import Robot.Classes.Questionario;
import Robot.Classes.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author Laboratorio
 */
public class UsuarioDAO extends DAO<Usuario>{

    @Override
    public boolean inserir(Usuario element) {
        try
        {              
            EnderecoDAO end = new EnderecoDAO();
            //PerfilDAO pfl = new PerfilDAO();
            
            int EndID = -1;
            
            end.inserir(element.getEndereco());
                
            /*for (Endereco e : end.listar())
            {
                if (e.equals(element.getEndereco()))
                {
                    EndID = element.getEndereco().getID();
                    break;
                }
            }*/
            
            /*if (end.listar().isEmpty())
            {
                end.inserir(element.getEndereco());
                
                for (Endereco e : end.listar())
                {
                    if (e.equals(element.getEndereco()))
                    {
                        EndID = element.getEndereco().getID();
                        break;
                    }
                }
            }
            else
            {                           
                for (Endereco e : end.listar())
                {
                    if (e.equals(element.getEndereco()))
                    {
                        EndID = element.getEndereco().getID();
                        break;
                    }
                }
            }*/
            
           /* if (pfl.listar().isEmpty())
            {
                Perfil p = new Perfil();
                Questionario q = new Questionario();
                p.setTipoPerfil("Nenhum");
                p.setQuestionario(q);
                
                pfl.inserir(p);
            }
            
            for (Perfil p : pfl.listar())
            {
                if (p.getID() != null)
                {
                    PrlID = p.getID();
                    break;
                }
            }*/
            
            String comando = "insert into usuario (nome, cpf, rg, datanascimento, sexo, email, id_endereco, id_perfil) values (?,?,?,?,?,?,?,?);";
            
            PreparedStatement stmt = conn.prepareStatement(
                                comando,Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, element.getNome());
            stmt.setString(2, element.getCPF());
            stmt.setString(3, element.getRG());        
            stmt.setDate(4, element.getDtNasc());
            stmt.setString(5, element.getSexo());
            stmt.setString(6, element.getEmail());
            stmt.setInt(7, 4);
            stmt.setInt(8, 0);
            
            
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
    public boolean alterar(Usuario element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Usuario element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> pUser = new LinkedList<>();
        pUser = ObservableCollections.observableList(pUser);
        
        String sql = "SELECT * FROM usuario;";
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Usuario c = new Usuario();
                c.setID(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setCPF(rs.getString("cpf"));
                c.setRG(rs.getString("rg"));
                c.setDtNasc(rs.getDate("datanascimento"));
                c.setEmail(rs.getString("email"));
                
                EnderecoDAO end = new EnderecoDAO();
                Endereco End = new Endereco();

                for (Endereco e : end.listar())
                {
                    if (e.getID() == rs.getInt("id_endereco"))
                    {
                        End = e;
                        break;
                    }
                }
                c.setEndereco(End);
                
                PerfilDAO pfl = new PerfilDAO();
                Perfil Prl = new Perfil();
                
                for (Perfil i : pfl.listar())
                {
                    if (i.getID() == rs.getInt("id_perfil"))
                    {
                        Prl = i;
                        break;
                    }
                }
                
                c.setPerfil(Prl);
                
                pUser.add(c);
            }
            
        }catch(SQLException e){
            System.out.println("erro ao listar");
        }
        return pUser;
    } 
}

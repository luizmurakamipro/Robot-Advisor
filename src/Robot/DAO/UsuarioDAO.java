/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.DAO;

import Robot.Classes.Endereco;
import Robot.Classes.Perfil;
import Robot.Classes.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author Laboratorio
 */
public class UsuarioDAO extends DAO<Usuario>{

    @Override
    public boolean inserir(Usuario element) 
    {
        try
        {              
            EnderecoDAO ed = new EnderecoDAO();
            Endereco e = element.getEndereco();
            
            if (e.getID() == null)
                ed.inserir(e);
            else
                ed.alterar(e);
            
            PerfilDAO pd = new PerfilDAO();
            Perfil p = element.getPerfil();
            
            if (p.getID() == null)
                pd.inserir(p);
            else
                pd.alterar(p);
            
            String comando = "insert into usuario (nome, cpf, rg, datanascimento, sexo, email, login, senha, saldo, administrador, id_endereco, id_perfil)"
                    + " values (?,?,?,?,?,?,?,?,?,?,?,?);";
            
            PreparedStatement stmt = conn.prepareStatement(
                                comando,Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, element.getNome());
            stmt.setString(2, element.getCPF());
            stmt.setString(3, element.getRG());        
            stmt.setDate(4, element.getDtNasc());
            stmt.setString(5, element.getSexo());
            stmt.setString(6, element.getEmail());
            stmt.setString(7, element.getLogin());
            stmt.setString(8, element.getSenha());
            stmt.setDouble(9, element.getSaldo());
            stmt.setBoolean(10, element.getAdministrador());
            stmt.setInt(11, element.getEndereco().getID());
            stmt.setInt(12, element.getPerfil().getID());  
            
            int linhas = stmt.executeUpdate();
            
            if(linhas == 1) 
            {
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                element.setID(rs.getInt(1));
                return true;
            }
        }catch(SQLException e)
        {
            System.out.println("erro ao inserir: " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean alterar(Usuario element) 
    {
        try
        {              
            String comando = "update usuario (nome, cpf, rg, datanascimento, sexo, email, login, senha, saldo, administrador, id_endereco, id_perfil) values (?,?,?,?,?,?,?,?,?,?,?,?);";
            
            PreparedStatement stmt = conn.prepareStatement(
                                comando,Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, element.getNome());
            stmt.setString(2, element.getCPF());
            stmt.setString(3, element.getRG());        
            stmt.setDate(4, element.getDtNasc());
            stmt.setString(5, element.getSexo());
            stmt.setString(6, element.getEmail());
            stmt.setString(7, element.getLogin());
            stmt.setString(8, element.getSenha());
            stmt.setDouble(9, element.getSaldo());
            stmt.setBoolean(10, element.getAdministrador());
            stmt.setInt(11, element.getEndereco().getID());
            stmt.setInt(12, element.getPerfil().getID());  
            
            int linhas = stmt.executeUpdate();
            
            if(linhas == 1) 
            {
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                return true;
            }
        }catch(SQLException e)
        {
            System.out.println("erro ao alterar: " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean excluir(Usuario element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listar() 
    {
        List<Usuario> pUser = new ArrayList<>();
        pUser = ObservableCollections.observableList(pUser);
        
        String sql = "SELECT * FROM usuario;";
        
        try
        {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            PerfilDAO pd = new PerfilDAO();
            EnderecoDAO ed = new EnderecoDAO();
            
            while(rs.next())
            {
                Usuario c = new Usuario();
                c.setID(rs.getInt("id_usuario"));
                c.setNome(rs.getString("nome"));
                c.setCPF(rs.getString("cpf"));
                c.setRG(rs.getString("rg"));
                c.setDtNasc(rs.getDate("datanascimento"));
                c.setEmail(rs.getString("email"));
                c.setLogin(rs.getString("login"));
                c.setSenha(rs.getString("senha"));
                c.setSaldo(rs.getDouble("saldo"));
                c.setAdministrador(rs.getBoolean("administrador"));
                c.setEndereco(ed.getById(rs.getInt("id_endereco")));
                c.setPerfil(pd.getById(rs.getInt("id_perfil")));
                
                pUser.add(c);
            }
            
        }catch(SQLException e)
        {
            System.out.println("erro ao listar: " + e.getMessage());
        }
        return pUser;
    } 
    
    public Boolean getLogin(String Login)
    {
        String sql = "SELECT * FROM usuario WHERE login = ?";
        try
        {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, Login);
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()) 
            {
                return true;
            }
        }catch(SQLException e)
        {
            System.out.println("erro ao retornar login por parametro" + e.getMessage());
        }
        
        return false;
    }
    
    public Boolean getSenha(String Senha)
    {
        String sql = "SELECT * FROM usuario WHERE senha = ?";
        try
        {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, Senha);
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()) 
            {
                return true;
            }
        }catch(SQLException e)
        {
            System.out.println("erro ao retornar senha por parametro" + e.getMessage());
        }
        
        return false;
    }
    
    public Usuario getByLoginSenha(String Login, String Senha)
    {
        String sql = "SELECT * FROM usuario WHERE login = ? and senha = ?";
        
        try
        {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, Login);
            stmt.setString(2, Senha);
            
            ResultSet rs = stmt.executeQuery();
            
            EnderecoDAO ed = new EnderecoDAO();
            PerfilDAO pd = new PerfilDAO();
            
            if(rs.next()) 
            {
                Usuario c = new Usuario();
                c.setID(rs.getInt("id_usuario"));
                c.setNome(rs.getString("nome"));
                c.setCPF(rs.getString("cpf"));
                c.setRG(rs.getString("rg"));
                c.setDtNasc(rs.getDate("datanascimento"));
                c.setEmail(rs.getString("email"));
                c.setLogin(rs.getString("login"));
                c.setSenha(rs.getString("senha"));
                c.setSaldo(rs.getDouble("saldo"));
                c.setAdministrador(rs.getBoolean("administrador"));
                c.setEndereco(ed.getById(rs.getInt("id_endereco")));
                c.setPerfil(pd.getById(rs.getInt("id_perfil")));
                
                return c;
            }
        }catch(SQLException e)
        {
            System.out.println("erro ao retornar endereco por id" + e.getMessage());
        }
        return null;
    }

    public Usuario getByLogin(String Login) {
        
        String sql = "SELECT * FROM usuario WHERE login = ?";
        try
        {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, Login);
            
            ResultSet rs = stmt.executeQuery();
             EnderecoDAO ed = new EnderecoDAO();
            PerfilDAO pd = new PerfilDAO();
            
            if(rs.next()) 
            {
                Usuario c = new Usuario();
                c.setID(rs.getInt("id_usuario"));
                c.setNome(rs.getString("nome"));
                c.setCPF(rs.getString("cpf"));
                c.setRG(rs.getString("rg"));
                c.setDtNasc(rs.getDate("datanascimento"));
                c.setEmail(rs.getString("email"));
                c.setLogin(rs.getString("login"));
                c.setSenha(rs.getString("senha"));
                c.setSaldo(rs.getDouble("saldo"));
                c.setAdministrador(rs.getBoolean("administrador"));
                c.setEndereco(ed.getById(rs.getInt("id_endereco")));
                c.setPerfil(pd.getById(rs.getInt("id_perfil")));
                
                return c;
            }
        }catch(SQLException e)
        {
            System.out.println("erro ao retornar senha" + e.getMessage());
        }
        return null;



///throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}

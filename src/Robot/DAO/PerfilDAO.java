/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.DAO;

import Robot.Classes.Perfil;
import Robot.Classes.Questionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author Luiz Murakami
 */
public class PerfilDAO extends DAO<Perfil>{

    @Override
    public boolean inserir(Perfil element) 
    {
        try
        {
            QuestionarioDAO qd = new QuestionarioDAO();
            Questionario q = element.getQuestionario();
            
            if(q.getID() == null)
                qd.inserir(q);
             else 
                qd.alterar(q);
            
            String comando = "insert into perfil (tipoperfil, id_questionario) values (?,?);";
            
            PreparedStatement stmt = conn.prepareStatement(
                                comando,Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, element.getTipoPerfil());
            stmt.setInt(2, element.getQuestionario().getID());
            
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
            System.out.println("erro ao inserir: "+ e.getMessage());
        }
        return false;
    }

    @Override
    public boolean alterar(Perfil element) 
    {
        try
        {
            String comando = "update perfil (tipoperfil, id_questionario) values (?,?);";
            
            PreparedStatement stmt = conn.prepareStatement(
                                comando,Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, element.getTipoPerfil());
            stmt.setInt(2, element.getQuestionario().getID());
            
            int linhas = stmt.executeUpdate();
          
            if(linhas == 1) 
            {
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                
                return true;
            }
        }catch(SQLException e)
        {
            System.out.println("erro ao alterar: "+ e.getMessage());
        }
        return false;
    }

    @Override
    public boolean excluir(Perfil element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Perfil> listar() 
    {
        List<Perfil> pPerfil = new ArrayList<>();
        pPerfil = ObservableCollections.observableList(pPerfil);
        
        String sql = "SELECT * FROM perfil;";
        
        try
        {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            QuestionarioDAO qd = new QuestionarioDAO();
            
            while(rs.next())
            {
                Perfil c = new Perfil();
                c.setID(rs.getInt("id_perfil"));
                c.setTipoPerfil(rs.getString("tipoperfil"));
                c.setQuestionario(qd.getById(rs.getInt("id_questionarioy")));
                
                pPerfil.add(c);
            }
            
        }catch(SQLException e)
        {
            System.out.println("erro ao listar: " + e.getMessage());
        }
        return pPerfil;
    }
    
    public Perfil getById(int id)
    {
        String sql = "SELECT * FROM perfil WHERE id_perfil = ?";
        try
        {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            QuestionarioDAO qd = new QuestionarioDAO();
            
            if(rs.next()) 
            {
                Perfil p = new Perfil();
                p.setID(rs.getInt("id_perfil"));
                p.setTipoPerfil(rs.getString("tipoperfil"));
                p.setQuestionario(qd.getById(rs.getInt("id_questionario")));
                return p;
            }
        }catch(SQLException e)
        {
            System.out.println("erro ao retornar perfil por id" + e.getMessage());
        }
        return null;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.DAO;

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
public class QuestionarioDAO extends DAO<Questionario>
{
    @Override
    public boolean inserir(Questionario element) 
    {
        try
        {
            String comando = "insert into questionario (perguntas, respostas) values (?,?);";
            
            PreparedStatement stmt = conn.prepareStatement(
                                comando,Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, "");
            stmt.setInt(2, 1);
            
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
    public boolean alterar(Questionario element) 
    {
        try
        {
            String comando = "update questionario (perguntas, respostas) values (?,?);";
            
            PreparedStatement stmt = conn.prepareStatement(
                                comando,Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, element.getPerguntas(0));
            stmt.setInt(2, 1);
            
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
    public boolean excluir(Questionario element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Questionario> listar() 
    {
        List<Questionario> pQuest = new ArrayList<>();
        pQuest = ObservableCollections.observableList(pQuest);
        
        String sql = "SELECT * FROM questionario;";
        
        try
        {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next())
            {
                Questionario c = new Questionario();
                c.setID(rs.getInt("id_questionario"));
                pQuest.add(c);
            }
            
        }catch(SQLException e)
        {
            System.out.println("erro ao listar");
        }
        return pQuest;
    }
    
    public Questionario getById(int id)
    {
        String sql = "SELECT * FROM questionario WHERE id_questionario = ?";
        try
        {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()) 
            {
                Questionario q = new Questionario();
                q.setID(rs.getInt("id_questionario"));
                return q;
            }
        }catch(SQLException e)
        {
            System.out.println("erro ao retornar questionario por id" + e.getMessage());
        }
        return null;
    }
}
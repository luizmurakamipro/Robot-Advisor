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
import java.util.LinkedList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author Luiz Murakami
 */
public class PerfilDAO extends DAO<Perfil>{

    @Override
    public boolean inserir(Perfil element) {
        try{
            QuestionarioDAO qd = new QuestionarioDAO();
            int QuestID = -1;
            
            if (qd.listar().isEmpty())
            {
                Questionario q = new Questionario();
                qd.inserir(q);
            }
            else
            {
                for (Questionario i : qd.listar())
                {
                    if (i.getID() != null)
                    {
                        QuestID = i.getID();
                        break;
                    }
                }
            }
            
            String comando = "insert into perfil (tipoperfil, id_questionario) values (?,?);";
            
            PreparedStatement stmt = conn.prepareStatement(
                                comando,Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, element.getTipoPerfil());
            stmt.setInt(2, QuestID);
            
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
    public boolean alterar(Perfil element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Perfil element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Perfil> listar() {
        List<Perfil> pPerfil = new LinkedList<>();
        pPerfil = ObservableCollections.observableList(pPerfil);
        
        String sql = "SELECT * FROM perfil;";
        
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Perfil c = new Perfil();
                c.setID(rs.getInt("id"));
                c.setTipoPerfil(rs.getString("tipoperfil"));
                
                Questionario q = new Questionario();
                q.setID(rs.getInt("id_questionario"));
                c.setQuestionario(q);
                
                pPerfil.add(c);
            }
            
        }catch(SQLException e){
            System.out.println("erro ao listar");
        }
        return pPerfil;
    }
    
}
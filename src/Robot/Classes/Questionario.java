/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.Classes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luiz Murakami
 */
public class Questionario 
{
    private List<String> Perguntas;
    private int[] Respostas;
    
    private Integer ID;

    public static final String PROP_ID = "ID";

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        Integer oldID = this.ID;
        this.ID = ID;
        propertyChangeSupport.firePropertyChange(PROP_ID, oldID, ID);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    // Responsible for initializing the list
    public Questionario()
    {
        Perguntas = new ArrayList<>();
        Respostas = new int[10];
    }
    
    // Look for a question for another function
    private String findPerguntas(String q)
    {
        String Finded = null;
        
        for (String item : Perguntas)
        {
            if (item.equals(q))
            {
                Finded = item;
                break;
            }
        }
        
        return Finded;
    }
      
    // Add a question to the list
    public void addPerguntas(String q)
    {
        String Finded = findPerguntas(q);
        
        if (Finded == null)
            Perguntas.add(q);
    }
    
    // Remove a question from the list
    public void removePergunta(String q)
    {
        String Finded = findPerguntas(q);
        
        if (Finded != null)
            Perguntas.remove(q);
    }
    
    // Take a question from the list
    public String getPerguntas(int ID)
    {
        return Perguntas.get(ID);
    }
    
    // Get list size
    public int getLength()
    {
        return Perguntas.size();
    }
}

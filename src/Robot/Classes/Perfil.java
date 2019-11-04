/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.Classes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Luiz Paulo
 */
public class Perfil  {
    private String TipoPerfil;
    private Questionario pQuestionario;
    
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
    
    public Questionario getQuestionario() {
        return pQuestionario;
    }

    public void setQuestionario(Questionario Quest) {
        this.pQuestionario = Quest;
    }

    public String getTipoPerfil() {
        return TipoPerfil;
    }

    public void setTipoPerfil(String tipoPerfil) {
        this.TipoPerfil = tipoPerfil;
    }
}

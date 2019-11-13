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
 * @author Laboratorio
 */
public class Pergunta {
    
    private String textoPergunta;

    public static final String PROP_TEXTOPERGUNTA = "textoPergunta";

    public String getTextoPergunta() {
        return textoPergunta;
    }

    public void setTextoPergunta(String textoPergunta) {
        String oldTextoPergunta = this.textoPergunta;
        this.textoPergunta = textoPergunta;
        propertyChangeSupport.firePropertyChange(PROP_TEXTOPERGUNTA, oldTextoPergunta, textoPergunta);
    }

    private int resposta;

    public static final String PROP_RESPOSTA = "resposta";

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        int oldResposta = this.resposta;
        this.resposta = resposta;
        propertyChangeSupport.firePropertyChange(PROP_RESPOSTA, oldResposta, resposta);
    }
    
    
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}

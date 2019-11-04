package Robot.Classes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laboratorio
 */
public class Endereco {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.CEP);
        hash = 29 * hash + Objects.hashCode(this.Numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Endereco other = (Endereco) obj;
        if (!Objects.equals(this.CEP, other.CEP)) {
            return false;
        }
        if (!Objects.equals(this.Numero, other.Numero)) {
            return false;
        }
        return true;
    }

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

    private String Logradouro, CEP, UF, Bairro, Numero, Pais, Cidade;

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        this.Bairro = bairro;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.Logradouro = logradouro;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String n) {
        this.Numero = n;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String cep) {
        this.CEP = cep;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String uf) {
        this.UF = uf;
    }
    
    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        this.Pais = pais;
    }
 
 
 
 
 
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.Classes;

import Robot.Classes.Endereco;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Laboratorio
 */
public class Usuario 
{   

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

    private String Nome, RG, CPF, Email, Sexo, Login, Senha;

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    private Date DataNascimento;
    private Endereco EnderecoUsuario;
    private Perfil PerfilUsuario;
    private double Saldo;
    private Boolean Administrador;

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public Boolean getAdministrador() {
        return Administrador;
    }

    public void setAdministrador(Boolean Administrador) {
        this.Administrador = Administrador;
    }
    
    public Perfil getPerfil() {
        return PerfilUsuario;
    }

    public void setPerfil(Perfil PerfilUsuario) {
        this.PerfilUsuario = PerfilUsuario;
    }

    public String getNome() {
        return Nome;
    }
    
 

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rg) {
        this.RG = rg;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cpf) {
        this.CPF = cpf;
    }

    public Date getDtNasc() {
        return DataNascimento;
    }

    public void setDtNasc(Date dtNasc) {
        this.DataNascimento = dtNasc;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        this.Sexo = sexo;
    }
    
    public void setEndereco(Endereco e)
    {
        this.EnderecoUsuario = e;
    }
    
    public Endereco getEndereco()
    {
        return this.EnderecoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.RG);
        hash = 89 * hash + Objects.hashCode(this.CPF);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.RG, other.RG)) {
            return false;
        }
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        return true;
    }
    
}

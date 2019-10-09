package Robot.Classes;

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
    
 private String Logradouro, CEP, UF, Bairro, Numero;


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
 
 
 
 
 
    
    
    
}

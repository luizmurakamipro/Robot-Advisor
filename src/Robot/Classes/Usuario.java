/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.Classes;

import Robot.Classes.Endereco;
import java.util.Date;

/**
 *
 * @author Laboratorio
 */
public class Usuario 
{   
    private String Nome, RG, CPF, Email, Sexo;
    private Date DataNascimento;
    private Endereco EnderecoUsuario;

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
        
        if (getEmail().equals("")){
         System.out.printf("Necessario todos os campos preenchidos");
           }else{
           System.out.printf("Necessario todos os campos preenchidos");
                }
        
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
    
}

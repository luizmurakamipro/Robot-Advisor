/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.Classes;

/**
 *
 * @author Laboratorio
 */
public class Agencia {
    private String RazaoSocial;
    private String Email;
    private String Contato;
    private String CNPJ;
    private String TipoServico;
    private Endereco enderecoAqgencia;
    private Integer ID;

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String razaoSoci) {
        this.RazaoSocial = razaoSoci;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getContato() {
        return Contato;
    }

    public void setContato(String contato) {
        this.Contato = contato;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cnpj) {
        this.CNPJ = cnpj;
    }

    public String getTipoServico() {
        return TipoServico;
    }

    public void setTipoServico(String typeService) {
        this.TipoServico = typeService;
    }

    public Endereco getEndereco() {
        return enderecoAqgencia;
    }

    public void setEndereco(Endereco enderecoAqgencia) {
        this.enderecoAqgencia = enderecoAqgencia;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    

    
    
    
}

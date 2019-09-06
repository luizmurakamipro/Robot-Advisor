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
public class Investimento 
{
    private String TipoInvestimento, Dicas, Opcoes, Informacoes;
    private float Valores;
    private Perfil pPerfil;
    private Agencia pAgencia;
    
    public String getTipoInvestimento() {
        return TipoInvestimento;
    }

    public void setTipoInvestimento(String TipoInvestimento) {
        this.TipoInvestimento = TipoInvestimento;
    }

    public String getDicas() {
        return Dicas;
    }

    public void setDicas(String Dicas) {
        this.Dicas = Dicas;
    }

    public String getOpcoes() {
        return Opcoes;
    }

    public void setOpcoes(String Opcoes) {
        this.Opcoes = Opcoes;
    }

    public String getInformacoes() {
        return Informacoes;
    }

    public void setInformacoes(String Informacoes) {
        this.Informacoes = Informacoes;
    }

    public float getValores() {
        return Valores;
    }

    public void setValores(float Valores) {
        this.Valores = Valores;
    }

    public Perfil getPerfil() {
        return pPerfil;
    }

    public void setPerfil(Perfil pPerfil) {
        this.pPerfil = pPerfil;
    }

    public Agencia getAgencia() {
        return pAgencia;
    }

    public void setAgencia(Agencia pAgencia) {
        this.pAgencia = pAgencia;
    }
}

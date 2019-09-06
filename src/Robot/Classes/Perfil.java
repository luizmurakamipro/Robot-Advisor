/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.Classes;

/**
 *
 * @author Luiz Paulo
 */
public class Perfil  {
    private Usuario pUsuario;
    private String TipoPerfil;
    private Questionario pQuestionario;
    
    public void setUsuario(Usuario u)
    {
        pUsuario = u;
    }
    
    public Usuario getUsuario()
    {
        return pUsuario;
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

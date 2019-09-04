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
    private Usuario pUser;
    private String tipoPerfil;
    private Question Quest;
    
    public void setUser(Usuario u)
    {
        pUser = u;
    }
    
    public Usuario getUser()
    {
        return pUser;
    }
    
    public Question getResult() {
        return Quest;
    }

    public void setResult(Question Quest) {
        this.Quest = Quest;
    }

    public String getTipoPerfil() {
        return tipoPerfil;
    }

    public void setTipoPerfil(String tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }
    
}

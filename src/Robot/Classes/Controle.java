/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.Classes;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Laboratorio
 */
public class Controle {
    public static Controle Instancia;
    private static Usuario User;
    
    public static Controle getInstancia()
    {
        if (Instancia == null)
            Instancia = new Controle();
        
        return Instancia;
    }
    
    public void setUser(Usuario u)
    {
        User = u;
    }
    
    public Usuario getUser()
    {
        return User;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.Interface;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JDesktopPane;

/**
 *
 * @author Luiz Murakami
 */
public class AreaPrincipal extends JDesktopPane
{
    public AreaPrincipal()
    {
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        float[] hsbvals = new float[3];
        Color.RGBtoHSB(128, 128, 128, hsbvals);
        g.setColor(Color.getHSBColor(hsbvals[0], hsbvals[1], hsbvals[2]));
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}

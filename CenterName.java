/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch1;

import java.applet.Applet;
import java.awt.*;

public class CenterName extends Applet {
    public void paint(Graphics g)
    {
        g.drawOval((getWidth()-100)/2, (getHeight()-100)/2, 100, 100);
        g.drawString("Yash", (getWidth()-20)/2, (getHeight())/2);
//         g.drawString("A", (getWidth())/2, (getHeight())/2);
//          g.drawString("S", (getWidth())/2, (getHeight()+20)/2);
//           g.drawString("H", (getWidth())/2, (getHeight()+40)/2);
        setSize(500,300);
    }
}
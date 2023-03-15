/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch1;

import java.applet.Applet;
import java.awt.*;
public class RecAndCir extends Applet {
    public void paint(Graphics g)
    {
        g.drawRect((getWidth()-200)/2, (getHeight()-100)/2, 200, 100);
        g.drawOval((getWidth()-100)/2, (getHeight()-100)/2, 100, 100);
//        g.drawString("YASH", (getWidth()-30)/2, (getHeight()+10)/2);
//        setSize(300,150);
    }
}

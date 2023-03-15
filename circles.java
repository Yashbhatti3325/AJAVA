/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch1;
import java.applet.Applet;
import java.awt.*;
public class circles extends Applet {
    public void paint(Graphics g)
    {
        int x = 10;
        int y = 30;
         for(int i=0;i<5;i++)
        {
        g.drawOval(x, y, 20, 20);
        y = y+20;
        }
        for(int i=0;i<5;i++)
        {
        g.drawOval(x, y-20, 20, 20);
        x = x+20;
        }
    }
}
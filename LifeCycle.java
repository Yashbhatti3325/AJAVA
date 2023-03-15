package Ch1;
import java.applet.Applet;
import java.awt.*;
public class LifeCycle extends Applet {
    int initcount = 0;
    int startcount = 0;
    int paintcount = 0;
    int stopcount = 0;
    int destroycount = 0;
    public void init() {
        initcount++;
    }
    public void start()
    {
        startcount++;
    }
    public void paint(Graphics g)
    {
        paintcount++;
        g.drawString("init method called " + initcount, 100, 20);
        g.drawString("start method called" + startcount, 100, 40);
        g.drawString("paint method called" + paintcount, 100, 60);
        g.drawString("stop method called" + stopcount, 100, 80);
        g.drawString("destroy method called" + destroycount, 100, 100);
    }
    public void stop()
    {
        stopcount++;
    }
    public void destroy()
    {
        destroycount++;
    }
}

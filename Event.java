package Ch1;
import java.awt.*;
import java.awt.event.*;

public class Event extends Frame implements ActionListener{
    
    Frame f = new Frame();
    TextField t1 ;
    TextField t2 ;
    TextField t3 ;
    Button b1;
    Button b2;
    
    Event()
    {
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        b1 = new Button("+");
        b2 = new Button("-");
        
        t1.setBounds(50,50,150,20);
        t2.setBounds(50,100,150,20);
        t3.setBounds(50,150,150,20);
        
        b1.setBounds(50,200,50,50);
        b2.setBounds(120,200,50,50);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        f.setLayout(null);
        f.setVisible(true);
        
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(b2);
    }
    public void actionPerformed (ActionEvent e) 
    {
        String s1 = t1.getText();
        String s2 = t2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c=0;
        if (e.getSource()==b1) {
            c=a+b;
        }
        if (e.getSource()==b2) {
            c=a-b;
        }
        String result = String.valueOf(c);
        t3.setText(result);
    }
    public static void main(String s[]){
        Event e = new Event();
    }
}

/*Name : Om G. Panchwate        ID code : 19CM044
Practical 6 : PRACTICAL 10: WRITE A PROGRAM TO DEMONSTRATE STATUS OF KEY ON APPLET WINDOW SUCH AS KEYPRESSED, KEYRELEASED, 
                KEYUP, KEYDOWN */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class P6 extends Frame implements KeyListener
{
    JLabel l;
    JTextField area;
    P6()
    {
        l=new JLabel();
        l.setBounds(20,50,100,20);
        area=new JTextField();
        area.setBounds(20,80,300, 30);
        area.addKeyListener(this);
        add(l);
        add(area);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public void keyPressed(KeyEvent e) 
    {
        l.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent e) 
    {
        l.setText("Key Released");
    }
    public void keyTyped(KeyEvent e) 
    {
        l.setText("Key Typed");
    }

    public static void main(String[] args) 
    {
        new P6();
    }
}
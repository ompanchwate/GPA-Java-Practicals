/*Name: Om G. Panchwate
ID Code: 19CM044
Practical No: 9
AIM: write a program to demostrate the use of window adapter class 
*/
import java.awt.*;    
import java.awt.event.*;    
public class pract9 extends MouseAdapter 
{    
    Frame f;     
    pract9() 
    {    
        f = new Frame ("Mouse Adapter");    
        f.addMouseListener(this);    
        f.setSize (300, 300);    
        f.setLayout (null);    
        f.setVisible (true);    
    }    
    public void mouseClicked (MouseEvent e) {    
        Graphics g = f.getGraphics();    
        g.setColor (Color.BLUE);    
        g.fillOval (e.getX(), e.getY(), 30, 30);    
    }    
public static void main(String[] args) {    
    new pract9();    
}    
}
import java.awt.*;
import java.applet.*;
public class setcolor1 extends Applet{

public void init()
{
 setBackground(Color.blue);
 setForeground(Color.red);
}

public void paint(Graphics g)
{
 
 //g.setColor(Color.YELLOW);

 g.drawString("hellow",10,20);
 g.fillOval(10,20,100,50);
}
}
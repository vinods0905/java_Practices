import java.awt.*;
import java.applet.*;

public class Appletskell extends Applet{

public void init()
  {
   System.out.println("initialize");
  }
public void start()
 {
  System.out.println("start");
 }

public void stop()
{
  System.out.println("stop");

}
public void destroy()
{
System.out.println("destroy");
}
public void paint(Graphics g)
{
g.drawString("hello",23,43);
}

}

import java.awt.*;
import java.awt.event.*;

class firstwindowslistener extends Frame implements WindowListener{

Frame f;

firstwindowslistener() //constructor for the class firstwindowslistener
  {

    f=new Frame();
    f.setVisible(true);
    f.setSize(800,800);
    f.setTitle("windowlistener");
    f.setLayout(null);

    f.addWindowListener(this);

  }

 public static void main(String args[])
   {
    
    firstwindowslistener t=new firstwindowslistener();
   }
// methods for implement the listener interface

  public void windowOpened(WindowEvent we)
     {
      System.out.println("window opened in frame"); 
     }
  public void windowClosing(WindowEvent we)
    {
      System.out.println("Window closing in frame:");
    }
  public void windowClosed(WindowEvent we)
    {
     System.out.println("window closed");
    }
  public void windowIconified(WindowEvent we)
     {
       System.out.println("windowiconified");
     }
  public void windowDeiconified(WindowEvent we)
     {
       System.out.println("windowdeiconified");
     }
  public void windowActivated(WindowEvent we)
     {
       System.out.println("windowactivated");
     }
  public void windowDeactivated(WindowEvent we)
     {
       System.out.println("windowdeactivated");
     }
}

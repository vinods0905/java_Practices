import java.awt.*;
import java.awt.event.*;

class firstwindowsfocuslistener extends Frame implements WindowFocusListener{

Frame f;
Button b2;

firstwindowsfocuslistener()
 {
   f=new Frame();
   f.setVisible(true);
   f.setSize(800,800);
   f.setTitle("windows focus listner");
   f.setLayout(null);

   b2=new Button("focus");
   f.add(b2);

   b2.setBounds(150,200,30,30);
 
   f.addWindowFocusListener(this);
 }

    public static void main(String args[])
      {
     
        firstwindowsfocuslistener t=new firstwindowsfocuslistener();
       }
         public void windowGainedFocus(WindowEvent we)
         {
 	   b2.setBackground(Color.red); 
         }
	public void windowLostFocus(WindowEvent we)
        {
          b2.setBackground(Color.green); 
        }
}






 
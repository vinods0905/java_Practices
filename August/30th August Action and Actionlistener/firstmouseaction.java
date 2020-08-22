import java.awt.*;
import java.awt.event.*;

class firstmouseaction{

  
 public static void main(String args[])
 
  {

    Frame f=new Frame();
    f.setVisible(true);
    f.setSize(800,800);
    f.setTitle("Mouse actions");
    f.setLayout(null);

    Label l1=new Label();
    f.add(l1);

    l1.setBounds(50,110,100,30);
 
    f.addMouseListener(new MouseListener()      //registering the listener(interface) to the source object
        {
          public void mouseClicked(MouseEvent me) //action performed 
               {
                 l1.setText("mouse clicked");    // result of the action
                 
                }
          public void mouseEntered(MouseEvent me)
                {
                 l1.setText("Mouse entered");
                }
          public void mouseExited(MouseEvent me)
               {
                 l1.setText("Mouse exited");
               }
          public void mousePressed(MouseEvent me)
               {
                  l1.setText("Mouse pressed");
               }
          public void mouseReleased(MouseEvent me)
              {
                 l1.setText("Mouse released");
               }
         });
    }

  }

     

             
               
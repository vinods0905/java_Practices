import java.awt.*;
import java.awt.event.*;

class firstmousemotionlistener extends Frame implements MouseMotionListener{

 Frame f;
 Label l1;

firstmousemotionlistener()
  {
   f=new Frame();
   f.setVisible(true);
   f.setSize(800,800);
   f.setTitle("first motion listener");
   f.setLayout(null);

   l1=new Label();
   f.add(l1);

   l1.setBounds(50,110,100,30);

   f.addMouseMotionListener(this);
 }

public static void main(String args[])
 {
  firstmousemotionlistener s=new firstmousemotionlistener();
  }

//implements the methods of the listener

public void mouseDragged(MouseEvent me)
  {
      l1.setText("mouse dragged");
   }
public void mouseMoved(MouseEvent me)
   {
     l1.setText("mouse moved");
   }

}

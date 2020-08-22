import java.awt.*;
import java.awt.event.*;

class firstfocuslistener extends Frame implements FocusListener{

Frame f;
Button b2,b1;

firstfocuslistener()
 {
   f=new Frame();
   f.setVisible(true);
   f.setSize(600,600);
   f.setTitle("FocusListener");
   f.setLayout(null);

   b2=new Button("focus");
   f.add(b2);
   b1=new Button("point");
   f.add(b1);

  b2.setBounds(150,200,50,30);
  b1.setBounds(250,200,50,30);
  b2.addFocusListener(this);

}

public static void main(String args[])
 {
  firstfocuslistener t=new firstfocuslistener();
 }
public void focusGained(FocusEvent fe)
 {
  b2.setBackground(Color.green);
  b1.setBackground(Color.red);
 }
public void focusLost(FocusEvent fe)
{
 b2.setBackground(Color.red);
 b1.setBackground(Color.green);
}

}
import java.awt.*;
import java.awt.event.*;

class firstactionlistener extends Frame implements ActionListener{

Frame f;
Label l1;
Button b1;

firstactionlistener()
 {
   f=new Frame();
 
  f.setVisible(true);
  f.setSize(800,800);
  f.setTitle("action listener this");
  f.setLayout(null);

  b1=new Button("click");
  f.add(b1);

  l1=new Label();
  f.add(l1);

  b1.setBounds(150,200,30,30);
  l1.setBounds(50,110,80,30);

  b1.addActionListener(this);   //adding action listener to the button,registering the action listener
}
    public static void main(String args[])

    {
      firstactionlistener s=new firstactionlistener();

    }

//implements methods of the action listener

 public void actionPerformed(ActionEvent ae)
     {
       l1.setText("click here");
      }
}
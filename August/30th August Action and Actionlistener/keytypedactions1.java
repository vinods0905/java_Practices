import java.awt.*;
import java.awt.event.*;

class keytypedactions1 extends Frame implements KeyListener{

  Frame f;
  Label l1;
  String msg="";
 keytypedactions1()  //constructor for the class
  {
    f=new Frame();
    
    f.setVisible(true);
    f.setSize(800,800);
    f.setTitle("keyboard actions");
    f.setLayout(null);

    l1=new Label();
    f.add(l1);

    l1.setBounds(50,110,300,30);
     
    f.addKeyListener(this);  //adding keylistener to the frame
  }

   public static void main(String args[])
     {
        keytypedactions1 k=new keytypedactions1();  //to intialise the constructor
      } 

  //implement the methods of the Keylistener (type listener) actions and results of actions

    
    public void keyPressed(KeyEvent ke)
      {
        l1.setText("keypressed");
       }
    public void keyReleased(KeyEvent ke)
      {
        l1.setText("keyreleased");
      }

   public void keyTyped(KeyEvent ke)
      {
        msg=msg+ke.getKeyChar();
        l1.setText(msg);
      }
}





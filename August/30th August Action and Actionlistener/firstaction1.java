import java.awt.*;
import java.awt.event.*;

class firstaction1 {
   
    public static void main(String args[])
     
  {
     Frame f=new Frame();
     f.setVisible(true);
     f.setSize(800,800);
     f.setTitle("Button Action frame");
     f.setLayout(null);

     Button b1;
     b1=new Button("click");
     f.add(b1);
    
     Label l1=new Label();
     f.add(l1);

     b1.setBounds(150,200,30,30);
     l1.setBounds(50,110,80,30);

     b1.addActionListener(new ActionListener()
                   {
              public void actionPerformed(ActionEvent e)
                       {
                        l1.setText("click here");
                        }
                    });  
     
    


     
   }
}
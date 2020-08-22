import java.awt.*;
import java.awt.event.*;

class firstmouseactions extends Frame implements MouseListener{

 Frame f;
 Label l1;

firstmouseactions()
{
	f=new Frame();
    	f.setVisible(true);
    	f.setSize(800,800);
    	f.setTitle("Mouse actions");
    	f.setLayout(null);

    	l1=new Label();
    	f.add(l1);

    	l1.setBounds(50,110,100,30);
 
    	f.addMouseListener(this);   
}

 public static void main(String args[])
 
  	{

		firstmouseactions f=new firstmouseactions(); 
	}  
     
          
	public void mouseClicked(MouseEvent me) 
               {
                 l1.setText("mouse clicked");    
                 
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
         
    

  }

     

             
               
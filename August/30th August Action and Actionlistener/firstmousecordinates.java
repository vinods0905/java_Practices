import java.awt.*;
import java.awt.event.*;

class firstmousecordinates extends Frame implements MouseListener,MouseMotionListener{

int mousex=0,mousey=0;
Frame f;
Label l1;

firstmousecordinates()
 {
  f=new Frame();
  f.setVisible(true);
  f.setSize(800,800);
  f.setTitle("mouse cordinates");
  f.setLayout(null);

  l1=new Label();
  f.add(l1);

  l1.setBounds(50,110,200,30);
  
  f.addMouseListener(this);
  f.addMouseMotionListener(this);
}
public static void main(String args[])
  {
   firstmousecordinates s=new firstmousecordinates();
  }


//implement methods of the interface MouseListener and MouseMotionListener

public void mouseClicked(MouseEvent me)
 	{
 	 mousex=0;
 	 mousey=10;
 	 l1.setText("mouse clicked");
 	}
public void mouseEntered(MouseEvent me)
             {
 		 mousex=0;
 	 	 mousey=10;
                 l1.setText("Mouse entered");
             }
public void mouseExited(MouseEvent me)
               {
                mousex=0;
 	 	 mousey=10;
                l1.setText("Mouse exited");
               }
public void mousePressed(MouseEvent me)
               {
                  mousex=me.getX();
                  mousey=me.getY();
                  l1.setText("Mouse pressed");
               }
public void mouseReleased(MouseEvent me)
              {
                 mousex=me.getX();
                 mousey=me.getY();

                 l1.setText("Mouse released");
               }
public void mouseDragged(MouseEvent me)
  {
    mousex=me.getX();
    mousey=me.getY();     //its static so we are storing getx and gety in mousex and mousey      
    l1.setText("mouse dragged at the point"+mousex+","+mousey);
 } 
public void mouseMoved(MouseEvent me)
   {
     mousex=me.getX();
     mousey=me.getY(); //its a dynamic event cordinates moves as the mouse moves
     l1.setText("mouse moving at"+me.getX()+","+me.getY());
   }
}
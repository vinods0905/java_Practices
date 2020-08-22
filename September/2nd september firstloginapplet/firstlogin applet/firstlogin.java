import java.awt.*;
import java.awt.event.*;

public class firstlogin extends Frame implements ActionListener{
Frame f;
  Label l1,l2,l3;
  Button b1,b2;
  TextField t1,t2;
firstlogin()
{

   f=new Frame();

   f.setVisible(true);
   f.setSize(800,800);
   f.setTitle("frame with login");
   f.setLayout(null);

   b1=new Button("Login");
   b2=new Button("Cancel");
   f.add(b1);
   f.add(b2);
 
   l1=new Label("Username");
   l2=new Label("Password");
   l3=new Label();
   
   f.add(l1);
   f.add(l2);
   f.add(l3);

   t1=new TextField();
   t2=new TextField();
   f.add(t1);
   f.add(t2);

   t1.setBounds(80,160,200,30);
   t2.setBounds(80,110,200,30);

   l1.setBounds(30,110,80,30);
   l2.setBounds(30,160,80,30);
   
   b1.setBounds(150,200,30,30);
   b2.setBounds(220,200,30,30);
  
   l3.setBounds(50,250,80,30);
    
   
   

//adding b1 to the actiion listener
 
  	b1.addActionListener(this);
	b2.addActionListener(this);
}
     
  public void actionPerformed(ActionEvent e)
   {
		String s1="vinods";
  		String s2="vinod123";

	if(e.getSource()==b1)
	{
   		if(t1.equals(s1) && t2.equals(s2))
     		{
      			l3.setText("login successful");
     		}
    		else
     		{
      			l3.setText("login unsuccessful");
     		}
	}
	else
	{
 			t1.setText("");
    			t2.setText("");
	}
   
    

 

 

}

  public static void main(String args[])
{
  
 firstlogin f=new firstlogin(); 
}
 }
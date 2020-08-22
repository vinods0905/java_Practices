import java.awt.*;

class firstlabel extends Frame{
     public static void main(String args[])
      {
        Frame f=new Frame();
        
        f.setVisible(true);
        f.setSize(500,600);
        f.setTitle("text field and label in frame");
        f.setLayout(null);

        Button b1;
        b1=new Button("click");
        f.add(b1);  //adding button to the frame

        TextField t1,t2;
        t1=new TextField();
        t2=new TextField();
        f.add(t1);  //adding textfield to the frame
        f.add(t2);

        Label l1,l2;
        l1=new Label("username");
        l2=new Label("password");
        f.add(l1);
        f.add(l2);

        t1.setBounds(120,160,200,30);
        t2.setBounds(120,110,200,30);
        l2.setBounds(50,160,80,30);
        l1.setBounds(50,110,80,30);
        b1.setBounds(150,200,30,30);
      }
} 
       

        


	
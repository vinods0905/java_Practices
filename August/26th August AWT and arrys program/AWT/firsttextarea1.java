import java.awt.*;

class firsttextarea1 extends Frame{
    public static void main(String args[])
       {
        Frame f=new Frame();
    
        f.setVisible(true);
        f.setSize(500,600);
        f.setTitle("first text area");
        f.setLayout(null);
       
        Button b1;
        b1=new Button("click");
        f.add(b1);

       TextField t1,t2;
        t1=new TextField();
        t2=new TextField();
        f.add(t1); //add textfield to the frame
        f.add(t2);

       Label l1,l2,l3;
       l1=new Label("username");
       l2=new Label("password");
       l3=new Label("address");
       f.add(l1);
       f.add(l2);
       f.add(l3);
       
       TextArea a2;
       a2=new TextArea();
       f.add(a2);

        t1.setBounds(120,160,200,30);
        t2.setBounds(120,110,200,30);
        
        
        l1.setBounds(50,110,80,30);
        l2.setBounds(50,160,80,30);
        l3.setBounds(50,300,50,30);
  
        b1.setBounds(150,200,30,30);

        a2.setBounds(120,260,200,100);

        
      }
}


 
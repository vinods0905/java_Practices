import java.awt.*;

class firstcheckbox1 extends Frame{
  public static void main(String args[])
     {
      Frame f=new Frame();

      f.setVisible(true);
      f.setSize(500,600);
      f.setTitle("first check box");
      f.setLayout(null);

     Button b1;
      b1=new Button("click");
      f.add(b1);

      TextField t1,t2;
      
      t1=new TextField();
      t2=new TextField();
      f.add(t1);
      f.add(t2);

      Label l1,l2,l3;
      l1=new Label("Username"); //creating an object
      l2=new Label("password");
      l3=new Label("Address");
      f.add(l1);
      f.add(l2);
      f.add(l3);//adding label to frame

      TextArea a1;
      a1=new TextArea();
      f.add(a1);//adding textarea to frame

      


        t1.setBounds(120,160,200,30);
        t2.setBounds(120,110,200,30);
        
        
        l1.setBounds(50,110,80,30);
        l2.setBounds(50,160,80,30);
        l3.setBounds(50,300,50,30);
  
        b1.setBounds(150,200,30,30);

        a1.setBounds(120,260,200,100);

	Checkbox cb1,cb2;
      	cb1=new Checkbox("yes");
      	cb2=new Checkbox("no");
      	f.add(cb1);
      	f.add(cb2);

        cb1.setBounds(150,350,50,50);
        cb2.setBounds(200,350,50,50);
}
}



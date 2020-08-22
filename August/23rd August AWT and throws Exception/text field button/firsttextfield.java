import java.awt.*;

class firsttextfield extends Frame{
      public static void main(String args[])
        {
          Frame obj=new Frame();
          obj.setVisible(true);
          obj.setSize(500,600);
          obj.setTitle("button and text field in frame");
          obj.setLayout(null);


          Button b1=new Button("click");
          Button b2=new Button("valid");
          Button b3=new Button("Test");
          Button b4=new Button("1");
          obj.add(b1);
          obj.add(b2);
          obj.add(b3);
          obj.add(b4);
         // b1.setBounds(50,60,80,90);
         // b2.setBounds(30,40,50,60);
         // b3.setBounds(100,75,75,75);
         // b4.setBounds(25,25,25,25);


          TextField t1=new TextField();
          TextField t2=new TextField();
          obj.add(t1);
          obj.add(t2);
          t1.setBounds(50,110,200,30);
          t2.setBounds(50,160,200,30);
	
     }
}

        


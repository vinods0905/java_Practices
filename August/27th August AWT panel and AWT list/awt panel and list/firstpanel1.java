	

class firstpanel1 extends Frame{

  public static void main(String args[])
 
 {
  Frame f=new Frame();
  f.setVisible(true);
  f.setSize(800,800);
  f.setTitle("frame with panel");
  f.setLayout(null);

  Button b1;
  b1=new Button("click");
  f.add(b1);

  TextField t1,t2;
  t1=new TextField();
  t2=new TextField();
  f.add(t1);
  f.add(t2);

  Label l1,l2,l3,l4;
  l1=new Label("Username");
    l2=new Label("password");
    l3=new Label("Address");
    l4=new Label("Country");
    f.add(l1);
    f.add(l2);
    f.add(l3); 
    f.add(l4);   //adding label to frame


 TextArea a1;
 a1=new TextArea();
 f.add(a1);

  Checkbox cb1,cb2;
    cb1=new Checkbox("yes");
    cb2=new Checkbox("no");
    f.add(cb1);
    f.add(cb2);  //add checkbox to frame

  List lt1=new List(5);
   f.add(lt1);

 
    lt1.add("India");
    lt1.add("Australia");
    lt1.add("Moracco");
    lt1.add("Ireland");
    lt1.add("Newzeland");  //add list to frame

    Panel p1;
    p1=new Panel();
    f.add(p1);
    p1.setBackground(Color.yellow);   //add panel to frame

                 
        t1.setBounds(120,160,200,30);//text field
        t2.setBounds(120,110,200,30);
        
        
        l1.setBounds(50,110,80,30);  //label username
        l2.setBounds(50,160,80,30);  //label password
        l3.setBounds(50,300,50,30);  //label address
        l4.setBounds(350,300,50,30); //label country	

  
        b1.setBounds(150,200,30,30); //button

        a1.setBounds(120,260,200,100);//text area

        lt1.setBounds(400,260,70,90); //list
        
         p1.setBounds(400,110,100,100);  
   

 }

}







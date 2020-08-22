import java.awt.*;

class firstbutton extends Frame{
       public static void main(String args[])
          {
            Frame obj=new Frame();
            obj.setVisible(true);
            obj.setSize(500,600);
            obj.setTitle("button inside frame");
            obj.setLayout(null);
            Button b=new Button("click");
            obj.add(b);
            b.setBounds(100,50,45,30);
         }
}
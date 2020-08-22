class Area1{
    int radius;
    float pi=3.14f;
    int length,breadth,side;
    
	Area1(int r)
         {
           radius=r;
	   System.out.println("radius="+radius);

         }
	Area1(int l,int b)
         {
          length=l;
          breadth=b;
          System.out.println("lenght="+length);
          System.out.println("breadth="+breadth);
         }
	Area1()
         {
          
          side=5;
          System.out.println("side="+side);
         }
       void circlearea()
	{ 
         
          float Area=pi*radius*radius;
          System.out.println("area="+Area);
        }
       void rectanglearea()
        {
         
          float Area=length*breadth;
         System.out.println("area="+Area);
        }
       void squarearea()
        {
         
         float Area=side*side;
         System.out.println("area="+Area);
        }
}
       class calcarea{
            public static void main(String args[])
         {
           Area1 circle=new Area1(3);
           Area1 rectangle=new Area1(5,6);
	   Area1 square=new Area1();

           circle.circlearea();
           rectangle.rectanglearea();
           square.squarearea();

        }
}
         
         

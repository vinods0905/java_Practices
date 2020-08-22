abstract class Area{
		abstract void area();
            }
class Areasquare extends Area{

               int side;
           Areasquare(int i)
             {
              side=i;
              }

                 void area()
                   {
                             
                       float area=side*side;
                       System.out.println("area of square"+area);
                   }
 }
class Areacircle extends Area{
                 int radius;
	          Areacircle(int a)
                    {
	             radius=a;
	
	             }
               
                      void area()
                      {
                        
                        float area=3.14f*radius*radius;
                        System.out.println("Area of circle"+area);
                      }
}

class Arearectangle extends Area{

           int length,breadth;
                Arearectangle(int a,int b)
         {
          length=a;
           breadth=b;

         }

                            void area()
                     {
                       
                        float area=length*breadth;
                        System.out.println("Area of rectangle"+area);
         
                     }
}
class Areacalculate{
            public static void main(String args[])
             {
               Areasquare obj1=new Areasquare(2);
               Areacircle obj2=new Areacircle(3);
               Arearectangle obj3=new Arearectangle(4,5);

               obj1.area();
               obj2.area();
               obj3.area();
             }
}
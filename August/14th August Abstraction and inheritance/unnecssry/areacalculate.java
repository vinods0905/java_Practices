abstract class Area{

      abstract void areacircle();
      abstract void arearectangle(int a,int b);
      abstract void areasquare(int len);
     }
class Calculatearea extends Area{
       
              void areacircle(int a)
                       {
                        int radius;
                        radius=a;
                        float area=3.14f*radius*radius;
                        System.out.println("Area of circle"+area);
                        }
              void arearectangle(int a,int b)
                     {
                       int length,breadth;
                        length=a;
                        breadth=b;
                        float area=length*breadth;
                        System.out.println("Area of rectangle"+area);
                     }
              void areasquare(int len)
                     {
                       int length,breadth;
                       length=breadth=len;
                       float area=length*breadth;
                       System.out.println("area of square"+area);
      }                }
class areacalculate{
          public static void main(String args[])
             {
               Calculatearea obj1=new Calculatearea();
                obj1.areacircle(2);
                obj1.arearectangle(4,3);
                obj1.areasquare(4);
           }
 }

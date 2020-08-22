class Area{
           float area;
           int length,breadth;

   


                  
               void area(int a,int b)
                    {
			length=a;
                    breadth=b;
                      area=length*breadth;
                      System.out.println("area="+area);

                    }
        }

class Areasquare extends Area{
                 
              

            void area(int side)

              { 
		length=breadth=side;             
                 area=length*breadth;
                 System.out.println("area="+area);
              }
      }

class Areacircle extends Areasquare{
int radius;

                     Areacircle(int r)
                          {
                            radius=r;
                          }
             float area()
                {
                  area=3.14f*radius*radius;
                  return area;
                }         

}

class Areacalculate{
     public static void main(String args[])
             {

              
                 Areacircle obj3=new Areacircle(3);
                 float ac;
                 obj3.area(2,3);
                 obj3.area(3);
                 ac=obj3.area();
System.out.println(ac);
                 

             }
}
              
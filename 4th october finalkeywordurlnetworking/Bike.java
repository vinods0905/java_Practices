class Bike{
 void run()
 {
  System.out.println("running");
 }
class honda extends Bike{

  void run()
     {
      System.out.println("running safely with 100km");
     }
}
}
class mainBike
{

public static void main(String args[])
{
 honda obj=new honda();
 
 
 obj.run();
}
}
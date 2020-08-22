class Box
{


          double depth;
          double width;
          double height;
         
      void boxdim(double d,double w,double h)
         {
           depth=d;
           width=w;
           height=h;
           
         }
      
      
     }
class Boxweight extends Box
{
                       
		double weight,volume;
                        
        void Boxweightdim()
            {
             
			weight=depth*width*height;
      
            }
     void Boxvolume()
          {
            volume=depth*width*height;
            System.out.println("volume="+volume);
          }
	
}
class Boxcost extends Boxweight
{

                               double cost;
                              void Boxcostdim()
                              {
                         
                              cost=weight*1.2f;
                       		System.out.println("Total cost "+cost);
                              }
          
}
class Boxcalculation{
                      public static void main(String args[])
                     {

                       Boxcost obj3=new Boxcost();
                     
                       	obj3.boxdim(2,3,4);
                        obj3.Boxvolume();
                        obj3.Boxweightdim();
                        obj3.Boxcostdim();
                       
                  }
       }




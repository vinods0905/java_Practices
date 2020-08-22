import java.util.*; 
interface markcalculation
{
   		  int markCalculations();
}

class internalmarks implements markcalculation
{

           public int markCalculations()
              { 
                int attendance,internalsessionmarks,attendancemarks,totalinternalmarks;


                 Scanner s=new Scanner(System.in);

                 System.out.println("enter the value of internalsessionmarks:");
                      internalsessionmarks=s.nextInt();
                 
                 System.out.println("enter the value of attendance:");
                 attendance=s.nextInt();	
		

                 System.out.println("attendance="+attendance);
                     if(attendance<30)
                         {
                          attendancemarks=5;
                           
                          }
                       else
                          {
                            
                            attendancemarks=10;
                          }

                        
                        
                        totalinternalmarks=attendancemarks+internalsessionmarks;
	
                        System.out.println("totalinternalmarks="+totalinternalmarks);
			return totalinternalmarks;
                }
 }
class externalmarks implements markcalculation{
                        
                    public int markCalculations()
                         {
                           int practicalmarks,theorymarks,totalexternalmarks;
                            
                           Scanner s=new Scanner(System.in);
                           System.out.println("enter the practical marks:");
                           practicalmarks=s.nextInt();
                           System.out.println("enter the theorymarks:");
                           theorymarks=s.nextInt();
                           totalexternalmarks=practicalmarks+theorymarks;
                           System.out.println("totalexternalmarks="+totalexternalmarks);
			return totalexternalmarks;
                         }

              }
class Totalmarkcalculation{
                 public static void main(String args[])
                  {
                    int totalmarks,t1,t2;
                    markcalculation obj1=new externalmarks();
                    markcalculation obj2=new internalmarks();

                    t1=obj1.markCalculations();
			t2=obj2.markCalculations();
			totalmarks=t1+t2;
                    System.out.println("total marks="+totalmarks);
                  }
}
                    




                        


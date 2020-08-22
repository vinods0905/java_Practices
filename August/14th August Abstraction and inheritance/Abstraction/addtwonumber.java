abstract class add
{ 	
      
 abstract void add(int a ,int b);// abstract method

   
   
 	  void mul(int a,int b)
            {
		int i,j,mul;
              i=a;
              j=b;
              mul=i*j;
              System.out.println("mulitplication:"+mul);
            }
}
class addtwonum extends add
{
    			void add(int a,int b)
                          {
                           int i,j,sum;
			    i=a;
                            j=b;
                           sum=i+j;
                           System.out.println("sum="+sum);
                          }
               }
     
class addtwonumber{
             public static void main(String args[])
                 {
                    addtwonum obj1=new addtwonum();

                     obj1.add(2,3);
                     obj1.mul(6,2);
                 }
         }
             
     
 
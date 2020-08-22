
class product1{

	int a,b;
	        
	float z;
	 
	float area()
		{
		  a=3;
		  b=2;
		  
		  z=(a+b)*(a-b);
		  return z;
		}
}

class crossproduct{
      		public static void main(String args[])
                  {

                    product1 obj=new product1();
                    float i= obj.area();
		    System.out.println(i);
       }
	}
 	   
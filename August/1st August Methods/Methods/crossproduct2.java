class product2{
	
	int a,b;
		
	float z,y;
	float aplusb()
		{a=3;
		 b=2;		  
	          
		  z=a+b;
		  return z;
		 }
	float aminusb()
             	{
		 a=4;
		 b=2;
                 		 
		 y=a-b;
		 return y;
                }
}
       class crossproduct2{
  		     public static void main(String args[])
			{
			     product2 obj=new product2();
                             float i=obj.aplusb();
                             float j=obj.aminusb();
				float k=i*j;
			     System.out.println(k);
         }
}				
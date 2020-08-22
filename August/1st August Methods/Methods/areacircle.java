class areacirc{

	float a;
	int r;
	// float pi=3.14f;
	  float area()
		{
		  r=2;
 		  a=(r*r)*3.14f;
		  return a;
		}
	}
class areacircle{

         public static void main(String args[])
		{

		  areacirc obj=new areacirc();
		  float i= obj.area();
		  System.out.println(i);
}
}

 




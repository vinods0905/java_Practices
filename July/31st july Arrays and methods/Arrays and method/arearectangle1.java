class arearect1{
	
	int l,b,a;

	int area()
		{
		 int l=8;
		 int b=8;
		a=l*b;
		return a;
		}
 }

class arearectangle1{
  	
	public static void main(String args[])
	{
	 arearect1 obj=new arearect1();
		int i=obj.area();
		System.out.println(i);
	}
}

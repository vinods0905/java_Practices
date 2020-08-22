class arearect{
    int l,b,a;
	void area()
		{
		  l=8;
		  b=8;
		a=l*b;
		System.out.println("area="+a);
		}
	}

class arearectangle{
       			
		public static void main(String args[])
		
		{
			arearect obj=new arearect();
			obj.area();
		}
}
class addition1{
	
	int a,b;
        int sum;
  addition1()
	{
	 a=2;
         b=2;
         System.out.println("a="+a);
         System.out.println("b="+b);
        }
 void sum1()
      {
        sum=a+b;
	System.out.println("sum="+sum);
      }
  }
 class Addsum{
        public static void main(String args[])
     {
      addition1 obj=new addition1();
      obj.sum1();
     }
}
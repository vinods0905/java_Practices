class addition2{
	int a,b;
	int sum;
 addition2(int i,int j)
    {
     a=i;
     b=j;
     System.out.println("a="+a);
     System.out.println("b="+b);
    }
 void sum2()
   {
    sum=a+b;
    System.out.println("sum="+sum);
   }
}
class Addsum2{
  	public static void main(String args[])
   {
	
	addition2 obj=new addition2(2,3);
	obj.sum2();
   }
}
  
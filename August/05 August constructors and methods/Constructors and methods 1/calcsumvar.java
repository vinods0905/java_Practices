class calsum
{
   int a,b;
   float c,d;
   int e;
   float f;
 calsum(int x,int y)
  {
   a=x;
   b=y;
   System.out.println("a="+a);
   System.out.println("b="+b);

  }
 calsum(float i,float j)
  {

   c=i;
   d=j;
   System.out.println("c="+c);
   System.out.println("d="+d);
   }
 calsum(float i,int x)
   {
    f=i;
    e=x;
    
    System.out.println("c="+f);
    System.out.println("a="+e);
   }
int sum1()
   {
    int sum=a+b;
    System.out.println("sum="+sum);
    return sum;
    

   }
float sum2()
   {
     float sum=c+d;
     System.out.println("sum="+sum);
     return sum;
     
   }
float sum3()
   {
     float sum=f+e;
     System.out.println("sum="+sum);
     return sum;
     
   }

}
class calcsumvar{
    public static void main(String args[])
     {

       calsum obj2=new calsum(2,3);
       calsum obj3=new calsum(2.5f,3.5f);
       calsum obj4=new calsum(2.5f,2);
       int l=obj2.sum1();
      float m=obj3.sum2();
       float n=obj4.sum3();
      System.out.println("sum of wo integer="+l);
      System.out.println("sum of two Float value"+m);
      System.out.println("sum of Float and Integer="+n);
      
  }
}
      
  


     
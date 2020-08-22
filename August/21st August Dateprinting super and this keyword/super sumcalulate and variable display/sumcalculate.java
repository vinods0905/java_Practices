class sum{

  int i,j,sum;
  sum(int a,int b)
   {
     i=a;
     j=b;
     sum=i+j;
     System.out.println("sum="+sum);
   }
}

class threesum extends sum{

     int k;
     threesum(int a,int b,int c)
      {
        super(a,b);
        k=c;
        sum=i+j+k;
        System.out.println("sum="+sum);
      }
}
class foursum extends threesum{
       int l;
        foursum(int a,int b,int c,int d)
         {
           super(a,b,c);
           l=d;
           sum=i+j+k+l;
           System.out.println("sum="+sum);
        }
}
class sumcalculate{
       public static void main(String args[])
        {
           foursum obj=new foursum(2,2,3,4);
          }
} 

          
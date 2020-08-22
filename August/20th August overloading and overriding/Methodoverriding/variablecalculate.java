class sum{

   double i,j,k,l,sum,mul,minus;     //eventhough the method name remains same the application inside the body differs
     void sum(int a,int b,int c,int d)
        {

          i=a;
          j=b;
          k=c;
          l=d;
          sum=i+j+k+l;
          System.out.println("sum="+sum);
         }
}
class fourmul extends sum{
             void sum(int a,int b,int c,int d)
          {
           i=a;
          j=b;
          k=c;
          l=d;
          mul=i*j*k*l;
          System.out.println("multiplication="+mul);
         }
}
class fourminus extends fourmul{
           void sum(int a,int b,int c,int d)
            {
              i=a;
              j=b;
               k=c;
               l=d;
               minus=i-j-k-l;
            System.out.println("subtraction="+minus);
          }
}

class variablecalculate{
      public static void main(String args[])
        {
          sum obj1=new sum();
          fourmul obj2=new fourmul();
          fourminus obj3=new fourminus();
          sum s;
          s=obj1; // s refers to sum object
          s.sum(20,4,3,1);
         
          s=obj2; //s refers to fourmul object
          s.sum(20,4,3,1);

          s=obj3;  //s refers to fourminus object
          s.sum(20,4,3,1);
}
}
        
class A{
        int i,j;
         int sum;
         void sum()
          {
            i=4;
            j=3;
            sum=i+j;
            System.out.println("sum="+sum);
          }
        }
class B extends A{
                  int sub;
                   void sub()
                     {
                       sub=i-j;
                       System.out.println("sub="+sub);
                     }
               }
class Execution2{
            public static void main (String args[])
             {
              B obj1=new B();
              obj1.sum();
              obj1.sub();
             }
   }
          
            
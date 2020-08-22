class A{
      int i,j,mul;
  void multiply(int a,int b)
     {
       mul=i*j;
       System.out.println("multiplication="+mul);
     }     

    
}

class B extends A{
        B(int a,int b)
         {
          super.i=a;
          super.j=b;
           i=a;
           j=b;
          }
      void show()
        {
         System.out.println("i in a="+super.i);
         System.out.println("j in a="+super.j);
         System.out.println("i in b="+i);
         System.out.println("j in b="+j);

        }

       void display()
       {
      super.multiply(1,2);
      }
     
    }
class supervariablemultiple{
      public static void main(String args[])
         {
           B obj=new B(1,2);
           obj.show();
           obj.display();
           
        }
}

     

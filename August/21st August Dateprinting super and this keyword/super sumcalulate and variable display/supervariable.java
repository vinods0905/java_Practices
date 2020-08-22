class A{
      int i,j,mul;     

    
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
    
     
    }
class supervariable{
      public static void main(String args[])
         {
           B obj=new B(1,2);
           obj.show();
           
        }
}

     

     
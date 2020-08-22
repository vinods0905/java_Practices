class numberdivide{
        public static void main(String args[])
{
        try {
           int i=2;
           float div;
           div=i/0;
           System.out.println("division="+div);
           System.out.println("division");
         }catch(ArithmeticException e)

          {
            System.out.println("division");
          }
System.out.println("After Exception");
    }
 }
 
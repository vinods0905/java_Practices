class add1{
   static int i=1;
   static int j=2;
   int sum;
static int sum()
   {
     
     sum=i+j;
     return sum;
   }

}
class addvariable{
       public static void main(String args[])
        {

         int s=add1.sum();
          System.out.println("sum="+sum);
        }
 }
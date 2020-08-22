import java.util.*;

class calculator1{

       	 int x,y;
        int add,sub,mul,div;
        int i;
      void getnumber()
        {
         Scanner s=new Scanner(System.in);
	 System.out.println("enter the value of x:");
         x=s.nextInt();
         System.out.println("enter the value of y:");
         y=s.nextInt();
        }
       void getoperation()
        {

         

          Scanner s=new Scanner(System.in);
          System.out.println("enter the value of i:");
          i=s.nextInt();
           switch(i)

             {
                case 1:
	       	{
                	add=x+y;
                	System.out.println("add="+add);
                	break;
               }
               case 2:
                {
                sub=x-y;
                System.out.println("sub="+sub);
                break;
                }
               case 3:
                 {
                 mul=x*y;
                 System.out.println("mul="+mul);
                 break;
                 }
                case 4:
                  {
                 div=x/y;
                 System.out.println("div="+div);
                 break;
                 }
               }
        }
 }
 class calcexecute1{
       public static void main(String args[])
           {
             calculator1 obj=new calculator1();
             obj.getnumber();
             obj.getoperation();
          }
   }             

           
	
   
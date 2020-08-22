import java.util.*;

class Readnumber{
               int n;
   void getnumber()
         {
           Scanner s=new Scanner(System.in);
           System.out.println("enter the value of n:");
           n=s.nextInt();
         }
    }
class Reversenumber extends Readnumber{
                    int reverse=0;
                    int a;
         void reversenumber()
                 {
			int i=n;
                    for(;n!=0;n/=10)
                     {
                      int reminder=n%10;
                      reverse=reverse*10+reminder;
                     }
                  System.out.println("reverse="+reverse);
		a=i;
	          
                }
          }
class Comprnumber extends Reversenumber{
          
       void comparenumber()
             {
                if(reverse==a)
                  System.out.println(a+" is a palndrome:");
                 else
                   System.out.println(a+" is not a palndrome:");
             }

   }

class palandrome{
         public static void main(String args[])
           {
             Comprnumber obj=new Comprnumber();
             obj.getnumber();
             obj.reversenumber();
             obj.comparenumber();
           }
 }
             


                    

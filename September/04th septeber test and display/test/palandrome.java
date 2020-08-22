import java.util.*;

class palandrome{
 public static void main(String args[])
  {
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the value of n:");
    n=s.nextInt();
    
    int reverse=0;
    int a=n;
    
    for(;n!=0;n/=10)
      {
       int remainder=n%10;
        reverse=reverse*10+remainder;
       }
      System.out.println("reverse="+reverse);
      if(reverse==a)
        System.out.println("n is a palandrome");
      else
        System.out.println("n is not a palndrome");
     
  }
}
 
 
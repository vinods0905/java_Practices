import java.util.*;

class stringpalndrome{
 public static void main(String args[])
  {

   Scanner s=new Scanner(System.in);
   String name;
   System.out.println("enter the value of name:");
   name=s.nextLine();
   String reverse="";
   String a=name;
   for(int i=name.length()-1;i>=0;i--)
    {
     reverse=reverse+name.charAt(i);
    }

   System.out.println("reverse="+reverse);
    if(reverse.equals(a))
      System.out.println("name is a palndrome:");
    else
      System.out.println("name is not a palndrome:");
 
  }
}
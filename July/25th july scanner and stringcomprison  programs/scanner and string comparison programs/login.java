
import java.util.*;
class login
{

 public static void main(String args[])
  {

   String username="vinods";
   String password="vinod123";
	
	String s1,s2;
   	Scanner s=new Scanner(System.in);
   	
	System.out.println("enter the username:");
  	s1=s.nextLine();
  
   	System.out.println("enter the password:");
   	s2=s.nextLine();
   
   
      	if(username.equals(s1) && password.equals(s2))
	{
         	System.out.println("login successful:"); 
	}
	else
	{
         	System.out.println("login unsuccessful:");  
   
	}
}
     
}    








   
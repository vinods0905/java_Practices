import java.util.*;

class Scanner1{

  public static void main(String args[])
       {
         
	Scanner s=new Scanner(System.in);
	String name;
        int age,marks;
        System.out.println("enter the name:");
        name=s.nextLine();
	System.out.println("enter the age:");
        age=s.nextInt();
        System.out.println("enter the marks:");
        marks=s.nextInt();
        System.out.println("enter the name:" +name);
        System.out.println("enter the marks:" +marks);
	System.out.println("enter the age:" +age);
 
     }
}



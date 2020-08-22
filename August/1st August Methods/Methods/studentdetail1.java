import java.util.*;

class Student1{
  	String name;
        int rollno;
       int semester;
	
   void getstudent(String n,int r,int s)
         {
            name=n;
            rollno=r;
            semester=s;
      
          }
   void printstudent()
        {
          System.out.println("name="+name);     
           System.out.println("rollno="+rollno);
           System.out.println("semester="+semester);
        }
}
  class studentdetail1{

          public static void main(String args[])
         {
           String name;
           int rollno;
           int semester;
         
 	   Scanner s=new Scanner(System.in);
           System.out.println("enter the name:");
            name=s.nextLine();
	   System.out.println("enter the roll number:");
	    rollno=s.nextInt();
           System.out.println("enter the semester:");
	    semester=s.nextInt();

          Student1 fetch=new Student1();

            
           fetch.getstudent(name,rollno,semester);
           fetch.printstudent();
    }
}
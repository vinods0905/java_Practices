import java.util.*;
class Student{
 	 String name;
	 int rollno;
         int semester;

         
  void getstudent()
         {           
           Scanner s=new Scanner(System.in);
           System.out.println("enter the name:");
            name=s.nextLine();
	   System.out.println("enter the roll number:");
	    rollno=s.nextInt();
           System.out.println("enter the semester:");
	    semester=s.nextInt();
          }
   void printstudent()
         {
           System.out.println("name="+name);     
           System.out.println("rollno="+rollno);
           System.out.println("semester="+semester);
         }
}
 class studentdetail{
       public static void main(String args[])
       {
         Student fetch=new Student();
	 
         fetch.getstudent();
         fetch.printstudent();
	 

       }
}
import java.util.*;
class student1{
        String name;
	int rollno;
	int semester;
  student1(String n,int r,int s)
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
 class studentdetail3{
	public static void main(String args[])
      {
        String name;
	int rollno;
	int semester;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the name:");
	name=s.nextLine();
	System.out.println("enter the roll no:");
        rollno=s.nextInt();
	System.out.println("enter the semester:");
        semester=s.nextInt();
        
      
        student1 obj=new student1(name,rollno,semester);
        System.out.println("Name"+obj.name);
        obj.printstudent();
     }
}


 
import java.util.*;

class student
{
    static String cname="st.alphons";
    String name;
    int rollno;
    int semester;

 void studentgetdata()
        {
           Scanner s=new Scanner(System.in);
           System.out.println("enter the name");
           name=s.nextLine();
           System.out.println("enter the rollno:");
           rollno=s.nextInt();
           System.out.println("enter the semester:");
           semester=s.nextInt();
        }
     void studentprintdata()
      {
        System.out.println("name="+name);
        System.out.println("rollno="+rollno);
        System.out.println("semester="+semester);
        System.out.println("cname="+cname);

      }
}
class studentdetail8
{
          public static void main(String args[])
            {
	

            student s1=new student();
	    student s2=new student();
	    student s3=new student();
              
		s1.studentgetdata();
		s1.studentprintdata();

                s2.studentgetdata();
 		s2.studentprintdata();
		
		s3.studentgetdata();
          	s3.studentprintdata();

      }
}
        
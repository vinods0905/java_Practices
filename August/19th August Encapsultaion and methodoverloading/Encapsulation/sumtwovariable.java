
import java.util.*;
import sumtwonumber.twovariables;

public class sumtwovariable{
         public static void main(String args[])
            {
              Scanner s=new Scanner(System.in);
              int i,j;
              
              System.out.println("enter the value of i:");
              i=s.nextInt();
              System.out.println("enter the value of j:");
              j=s.nextInt();

              twovariables obj=new twovariables();
               obj.add(i,j);
            }
}
import java.util.*;

class Array1{

public static void main(String args[])

{

Scanner s=new Scanner(System.in);


 int a[]=new int[3];
int i=0;
int sum=0;

	for(i=0;i<3;i++)
		{
  		a[i]=s.nextInt();
 		System.out.println("a[i]="+a[i]);
 		sum=sum+a[i];

		}
		System.out.println("sum="+sum);

	}
}
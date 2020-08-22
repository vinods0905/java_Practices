import java.util.*;
class smalles{

public static void main(String args[])

{

	Scanner s=new Scanner(System.in);
	int a[]=new int[3];
	int i;
 		 for(i=0;i<3;i++)
			{
			a[i]=s.nextInt();
			//System.out.println("a[i]=",+a[i]);
                        }
	int min=a[0];
	
		for(i=0;i<3;i++)
			{
			  if(a[i]<min)
			{	
			   min=a[i];
			}
			}
	System.out.println("minimum="+min);

	}
}

       

 
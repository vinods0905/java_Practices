import java.util.*;

class greates{
 
	public static void main(String args[])
	{
 	
     	
	Scanner s=new Scanner(System.in);

	int a[]=new int[3];
	int max=a[0];

	int i;
		for(i=0;i<3;i++)
			{
				a[i]=s.nextInt();
 				//System.out.println("a[i]="+a[i]);
					if(a[i]>max)
						
						max=a[i];
					
						
						
						
			}

		
         System.out.println("mximum="+max);

	}
}

 
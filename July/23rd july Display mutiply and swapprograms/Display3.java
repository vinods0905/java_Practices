class Display3{

 public static void main(String args[])
 
{
  int i,j;
	int a=1;
    for(i=0;i<3;i++)
     {
       for(j=0;j<=i;j++)
         {
           System.out.print("\t"+a);
            
           a++;
           
         }
	
       System.out.println("");
     }
}
}
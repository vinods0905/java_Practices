class Display4{

    public static void main(String args[])
    {
     char c='a';
     int i,j;
     for(i=1;i<=3;i++)
       {
         for(j=1;j<=i;j++)
           {
             System.out.print("\t"+c);
              c++;
            }
          System.out.println("");

       }

   }
 }
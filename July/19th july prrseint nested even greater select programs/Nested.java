class Nested

 {
   public static void main(String args[])

    {

        int i,j,k;
        i=Integer.parseInt(args[0]);
        j=Integer.parseInt(args[1]);
        k=Integer.parseInt(args[2]);

         if(i==10)
            {
              if(j<20)
                 System.out.println("a=b");	
                 if(k>100)
                   System.out.println("c=d");

                   else
                       System.out.println("a=c");
                   
                }

           else  
                 System.out.println("a=d");
 }
 }
class Select1

  {

     public static void main(String args[])

    {

     int i,j;
     String k;
     i=Integer.parseInt(args[0]);
     j=Integer.parseInt(args[1]);
     k=args[2];
     char c=k.charAt(0);


    if(c=='+')

       {
         int sum=i+j;
         System.out.println("sum="+sum);

     }
       else if(c=='b')

        {

          int mul=i*j;
          System.out.println("mul="+mul);

       }
 else if(c=='a')
   {

     int div=i/j;
     System.out.println("div="+div);

   }

}
}


       
     



 
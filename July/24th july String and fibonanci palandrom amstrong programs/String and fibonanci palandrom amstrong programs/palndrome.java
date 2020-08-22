	class palndrome{
  public static void main(String args[])

    {
       int n;
       n=Integer.parseInt(args[0]);
       System.out.println("n="+n);
       int reverse=0;
       int a=n;
       
         for(;n!=0;n/=10)   // n=n/10 where n is the quotient
        
            {
              int reminder=n%10;
               reverse=reverse*10+reminder;
            }
           System.out.println("reverse="+reverse);
           
              if(reverse==a)
                System.out.println("n is palndrome"); 
               else
                 System.out.println("n is not palndrome");            



     }
 }
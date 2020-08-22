class revese1{

    public static void main(String args[])
       {

    int n;
    n=Integer.parseInt(args[0]);
    System.out.println("n="+n);
    int rev=0;
    int rem=0;
     for(;n!=0;n/=10)

           {
              int digit=n%10;
              rev=rev*10+digit;
            }
           System.out.println("reversed:"+rev);





    }
}
 



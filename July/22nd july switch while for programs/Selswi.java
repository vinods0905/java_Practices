class Selswi
   {
     public static void main(String args[])

     {
       int i,j;
       i=Integer.parseInt(args[0]);
       j=Integer.parseInt(args[1]);
       String k;
       k=args[2];
       char c=k.charAt(0);
       switch(c)
           {

            case '+':
                    {  

                    int sum=i+j;
                    System.out.println("sum"+sum);
                    break;
                    }
            case '*':
                    {
                     int mul=i*j;
                     System.out.println("mul"+mul);
                     break;
                     }
            default:
                    {
                     int div=i/j;
                     System.out.println("div"+div);
                     }

        }
}

}

              
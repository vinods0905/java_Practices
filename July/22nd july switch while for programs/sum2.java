class sum2{
   public static void main(String args[])
    
     {
        
        int j;
        j=Integer.parseInt(args[0]);
        int i=0;
        int sum=0;
        do
             {
               
               
               sum+=i;
		i++;
               

              }while(i<=j);
              System.out.println("sum="+sum);
            }
}
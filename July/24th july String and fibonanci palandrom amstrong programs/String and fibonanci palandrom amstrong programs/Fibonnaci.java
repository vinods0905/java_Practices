class Fibonnaci{
 
 

   public static void main(String args[])
    {
     int i=0;
     int j=1;
     int sum=0;
     int n=10; 
       for(int k=0;k<=n;k++)
            {     
               System.out.println(i); 
                sum=i+j;
                 i=j;
                 j=sum;
                 
                
             }
        

    }
}
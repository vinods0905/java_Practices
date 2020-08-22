class Average 
     {
   public static void main(String args[])

    {
       int i,j,k;
       String name;
       name=args[3];
       i=Integer.parseInt(args[0]);
       j=Integer.parseInt(args[1]);
       k=Integer.parseInt(args[2]);
       int sum=i+j+k;
         
       int average=sum/3;
       System.out.println("average="+average);
       int marks=average/10;
       System.out.println("marks="+marks);

       switch(marks)
          {
            case 9:
                  System.out.println("A grade");
                  break;
            case 8: 
                  System.out.println("b grade");
                  break;
            case 7: 
                  System.out.println("c grade");
                  break;
            case 6: 
                  System.out.println("d grade");
                  break;
            case 5: 
                  System.out.println("e grade");
                  break;
             
             


            default:
                  System.out.println("fail grade");
     
          } 
       

   }
}

       

class Display1{
   
     public static void main(String args[])

{
    int two[][]=new int[3][3];
       
    int i,j,k=0;
    for(i=0;i<=3;i++)
      
       		for(j=0;j<i+1;j++)
       			 { 

                                        k++;
          			 
           				two[i][j]=k;
                                         

                          }

               for(i=0;i<=3;i++)
                        {
       			for(j=0;j<i+1;j++)
       			 { 
    				System.out.print(two[i][j] +"");
                                 System.out.println();
                                
			  }

      		
        
   }

 }
 }

        
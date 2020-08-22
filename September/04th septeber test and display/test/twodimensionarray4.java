class twodimensionarray4{

 public static void main(String args[])
   {
     int i,j;
     int k=1;
  int a[][]=new int[4][];
   a[0]=new int[1];
   a[1]=new int[2];
   a[2]=new int[3];
   a[3]=new int[4];

 for(i=0;i<4;i++)
   for(j=0;j<i+1;j++)
     {
       a[i][j]=k;
        k++;
     }

for(i=0;i<3;i++)
   {
   for(j=0;j<i+1;j++)
     
       System.out.print(a[i][j]+"");
       System.out.println();
     }
}
}
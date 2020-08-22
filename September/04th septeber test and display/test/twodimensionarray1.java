class twodimensionarray1{
 public static void main(String args[])
  {
   int k;
   int a[][];
   a=new int[2][3];
 a[0][0]=2;
 a[0][1]=3;
 a[0][2]=5;
 a[1][0]=6;
 a[1][1]=8;
 a[1][2]=5;
 
for(int i=0;i<2;i++)
  {
   for(int j=0;j<3;j++)
   System.out.print(a[i][j]+"");
   System.out.println();
  }
}
}
 
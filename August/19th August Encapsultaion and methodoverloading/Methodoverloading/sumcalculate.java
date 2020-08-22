class sum{

     float i,j,k,l,m,sum;
        void sum(int a,int b)
            {
             i=a;
             j=b;
             sum=i+j;
             System.out.println("sum="+sum);
            }
}

class threesum extends sum{

        void sum(int a,int b,int c)
           {
             i=a;
             j=b;
             k=c;
             sum=i+j+k;
             System.out.println("sum="+sum);
           }
}
class foursum extends threesum{

            void sum(int a,int b,int c,int d)
             {
               i=a;
               j=b;
               k=c;
               l=d;
               sum=i+j+k+l;
               System.out.println("sum="+sum);
             }
}
class fivesumreturn extends foursum
         {
           float sum(float a,float b,float c,float d)
            {
               i=a;
               j=b;
               k=c;
               l=d;
               
               sum=i+j+k+l;
               return sum;
            }
        }
class sumcalculate{
         public static void main(String args[])
         {
          fivesumreturn obj=new fivesumreturn();

             float sumreturn;
            
              sumreturn=obj.sum(3.5f,6.5f,4.5f,6.5f);
              System.out.println("sum="+sumreturn);

              obj.sum(3,4,5,6);

              obj.sum(2,5,3);
              obj.sum(3,5);
          }
}
      
          
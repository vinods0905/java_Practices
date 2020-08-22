class interest{
 int principal,noy,rate,interest;
   void interest(int p,int n,int r)
    {
       principal=p;
         noy=n;
         rate=r;
         interest=p*n*r/100;
         System.out.println("interest="+interest);
    }
}
class homeloan extends interest{
             void interest(int p,int n,int r)
         {
          principal=p;
         noy=n;
         rate=r;
         interest=p*n*r/100;
         System.out.println("home loan interst="+interest);
        }
}
class personalloan extends interest{
         
              void interest(int p,int n,int r)
         {
          principal=p;
         noy=n;
         rate=r;
         interest=p*n*r/100;
         System.out.println("personal loan interst="+interest);
        }
}
class carloan extends interest{

     void interest(int p,int n,int r)
         {
          principal=p;
         noy=n;
         rate=r;
         interest=p*n*r/100;
         System.out.println("car loan interst="+interest);
        }
}
class customerinterestcalcu{
    public static void main(String args[])
     {
        homeloan obj1=new homeloan();
        personalloan obj2=new personalloan();
        carloan obj3=new carloan();

        interest i;//obtain a reference of type interest
       
        i=obj1; //i refers to an obj1 object
        i.interest(20000,3,7);
 
        i=obj2;
        i.interest(10000,4,8);
        
        i=obj3;
        i.interest(20000,5,11);


       // obj1.interest(20000,3,7);
       // obj2.interest(10000,4,8);
       // obj3.interest(20000,5,11);  
       }

}

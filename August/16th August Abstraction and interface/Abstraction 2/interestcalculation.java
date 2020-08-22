abstract class interest{

 abstract void interestcalculate();
 int principal,noy,rate;
 

    void interstvariable(int p,int n,int r)
           {
             principal=p;
             noy=n;
             rate=r;
             
           }              
           

}

class sbi extends interest{

             void interestcalculate()
               {
                int interest;
                interest=(principal*noy*rate)/100;
                System.out.println("interest of sbi="+interest);
               }

}

class ubi extends interest{

               void interestcalculate()
               {
                int interest;
                interest=(principal*noy*rate)/100;
                System.out.println("interest of ubi="+interest);
               }

}

class uti extends interest{

                   void interestcalculate()
               {
                int interest;
                interest=(principal*noy*rate)/100;
                System.out.println("interest of uti="+interest);
               }
 }

class interestcalculation{
             public static void main(String args[])

        {

         sbi obj1=new sbi();
         ubi obj2=new ubi();
         uti obj3=new uti();

         obj1.interstvariable(2000,2,7);
         obj2.interstvariable(2000,2,8);
         obj3.interstvariable(2000,2,11);
         obj1.interestcalculate();
         obj2.interestcalculate();
         obj3.interestcalculate();
       }
}        

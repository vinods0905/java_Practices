import balance.Balanceaccount;

public class Balanceaccountcalculate{
        public static void main(String args[])
           {
             Balanceaccount obj[]=new Balanceaccount[2];
             
          
             obj[0]=new Balanceaccount("vinod",20);
             obj[1]=new Balanceaccount("anand",200);
             for(int i=0;i<2;i++)
                 { 
                    obj[i].show();
                 }
           }
}
 
class Balanceaccount1{

        String name;
        int bal;
 Balanceaccount1(String n,int b)
   {
     name=n;
     bal=b;
   }
  void show()
   {
     System.out.println(name+"="+bal);
   }
}
class Balanceaccountcalculate1{
        public static void main(String args[])
           {
             Balanceaccount1 obj[]=new Balanceaccount1[4];
             
          
             obj[0]=new Balanceaccount1("vinod",20);
             obj[1]=new Balanceaccount1("anand",200);
             obj[2]=new Balanceaccount1("susheela",200);
             obj[3]=new Balanceaccount1("subramanian",200);
         
             for(int i=0;i<4;i++)
                 { 
                    obj[i].show();
                 }
           }
}
package balance;

public class Balanceaccount{

        String name;
        int bal;
public Balanceaccount(String n,int b)
   {
     name=n;
     bal=b;
   }
 public void show()
   {
     System.out.println(name+"="+bal);
   }
}

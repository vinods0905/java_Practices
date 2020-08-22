class Amstrong{

 public static void main(String args[])

{
  int n;
  n=Integer.parseInt(args[0]);
  System.out.println("n="+n);
  int sum=0;
  int a=n;
    for(;n!=0;n/=10)      //here n varies with every loop
        {
          int reminder=n%10;

          sum=sum+(reminder*reminder*reminder);

        }
     System.out.println("sum="+sum);
           if(a==sum)       
             System.out.println(+a+" is amstong");
           else
              System.out.println(+a+"is not amstong");



 }
 }

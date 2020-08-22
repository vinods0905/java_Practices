class forfact{

public static void main(String args[])

{
int i=1;
int j;
j=Integer.parseInt(args[0]);
int mul=1;
for(i=1;i<=j;i++)
 {
   mul=mul*i;
 }
 System.out.println("factorial="+mul);
}
}

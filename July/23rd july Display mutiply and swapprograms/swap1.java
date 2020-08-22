class swap1{
 public static void main(String args[])

{
int a,b;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
System.out.println("a="+a);
System.out.println("b="+b);
int temp;


temp=b;

b=a;
a=temp;


System.out.println("a="+a);
System.out.println("b="+b);

}

}
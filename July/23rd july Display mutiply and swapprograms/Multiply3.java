class Multiply3{
 public static void main(String args[])

{

int i,j,mul;
j=Integer.parseInt(args[0]);
System.out.println("Multiplication of "+j);

for(i=1;i<=10;i++)
   {
     mul=i*j;
     System.out.println(+i+"*"+j+"="+mul);
    }

}
}

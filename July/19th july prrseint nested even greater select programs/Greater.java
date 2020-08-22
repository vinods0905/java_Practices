class Greater{

public static void main(String args[])

{

int i,j,k;
i=Integer.parseInt(args[0]);
j=Integer.parseInt(args[1]);
k=Integer.parseInt(args[2]);
if(i>j&& i>k)
{

  System.out.println("i is the greatest");

}

if(j>i&&j>k)
 {
System.out.println("j is the greatest");

}

if(k>j&&k>i)
{
System.out.println("k is the greatest");
}


}


}
 
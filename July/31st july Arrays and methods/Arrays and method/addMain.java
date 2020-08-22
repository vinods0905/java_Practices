class addToNumber
{
int a,b,c;
int sum()
	{
	a=8;
	b=0;
	c=a+b;
	return c;
	//System.out.println(c);	
	}
}

class addMain
{
public static void main(String args[])
{
addToNumber n=new addToNumber();
int i=n.sum();
System.out.println(i);
}
}

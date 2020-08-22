class boxing3{
static void m(Integer i)
{
 System.out.println("integer");
}

static void m(Integer...i)
{
System.out.println("integer...");
}

public static void main(String args[])
{
int a=30;
m(a);
}
}
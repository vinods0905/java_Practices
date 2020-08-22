class a{
void m()
{
System.out.println("hello m");
}
@Deprecated
void n()
{
System.out.println("hello n");
}
}

class testannotations3{
public static void main(String args[])
{
a obj=new a();
obj.n();
}
}
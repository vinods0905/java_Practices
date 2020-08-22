class testmultinaming1 extends Thread{
public void run()
{
System.out.println("running:");
}
public static void main(String args[])
{
testmultinaming1 t1=new testmultinaming1();
testmultinaming1 t2=new testmultinaming1();

System.out.println("name of t1:"+t1.getName());
System.out.println("name of t2:"+t2.getName());

System.out.println("id of t1:"+t1.getId());
System.out.println("id of t2:"+t2.getId());

t1.start();
t2.start();

t1.setName("vin");
t2.setName("an");

System.out.println("after changing name of t1"+t1.getName());
System.out.println("after changig name of t2"+t2.getName());
}
}

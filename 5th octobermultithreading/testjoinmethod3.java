class testjoinmethod3 extends Thread{
public void run()
{
System.out.println("running");
}
public static void main(String args[])
{
testjoinmethod3 t1=new testjoinmethod3();
testjoinmethod3 t2=new testjoinmethod3();

System.out.println("name of t1:"+t1.getName());
System.out.println("name of t2:"+t2.getName());
System.out.println("id of t1:"+t1.getId());

t1.start();
t2.start();

t1.setName("vin");
System.out.println("after changing name of t1:"+t1.getName());
}
}
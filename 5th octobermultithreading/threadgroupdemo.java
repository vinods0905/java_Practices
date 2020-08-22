class threadgroupdemo implements Runnable{
public void run()
{
System.out.println(Thread.currentThread().getName());
}
public static void main(String args[])
{

threadgroupdemo runnable=new threadgroupdemo();
ThreadGroup tg1=new ThreadGroup("parentthreadgroup");

Thread t1=new Thread(tg1,runnable,"one");
t1.start();

Thread t2=new Thread(tg1,runnable,"two");
t2.start();

Thread t3=new Thread(tg1,runnable,"three");
t3.start();

System.out.println("thread group name"+tg1.getName());
tg1.list();
}
}

class testdaemonthread1 extends Thread{

public void run()
{
if(Thread.currentThread().isDaemon())
 {
  System.out.println("daemon thread works:");
 }
else
{
System.out.println("user thread works:");
}

}

public static void main(String args[])
{

testdaemonthread1 t1=new testdaemonthread1();
testdaemonthread1 t2=new testdaemonthread1();
testdaemonthread1 t3=new testdaemonthread1();

t1.setDaemon(true);

t1.start();
t2.start();
t3.start();

}
}
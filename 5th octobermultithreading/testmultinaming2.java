class testmultinaming2 extends Thread{
public void run()
 {
   System.out.println(Thread.currentThread().getName());
}
public static void main(String args[])
{
testmultinaming2 t1=new testmultinaming2();
testmultinaming2 t2=new testmultinaming2();

t1.start();
t2.start();
}
}
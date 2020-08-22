class testsleepmethod1 extends Thread {

public void run()
{
for(int i=1;i<5;i++) 
{
 try{
     Thread.sleep(500);
    }
  catch(InterruptedException e){System.out.println(e);}
                             
     
    
 System.out.println(i);
}
}
public static void main(String args[]) throws Exception
{

testsleepmethod1 t1=new testsleepmethod1();
testsleepmethod1 t2=new testsleepmethod1();
t1.start();
t2.start();
}
}

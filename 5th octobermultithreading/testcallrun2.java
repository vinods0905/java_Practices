class testcallrun2 extends Thread{
public void run()
{
  for(int i=1;i<5;i++)
  {
   try{
      Thread.sleep(500);
      }
    catch(InterruptedException e)
      {
       System.out.println(e);
      }
    System.out.println(i);
  }
}
public static void main(String args[])
{
testcallrun2 t1=new testcallrun2();
testcallrun2 t2=new testcallrun2();
 t1.run();
 t2.run();
}
}
 

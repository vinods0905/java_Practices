import java.io.*;

class Bufferedreader1{
  public static void main(String args[])
      {
try{

    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    int s=b.read();
    System.out.println((char)s);
}catch(Exception e)
{
}
   }
}

   

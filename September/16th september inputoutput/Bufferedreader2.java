import java.io.*;
class Bufferedreader2{
 public static void main(String args[]) throws Exception
    {

      BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
      String s=b.readLine();
      System.out.println(s);
    }
}
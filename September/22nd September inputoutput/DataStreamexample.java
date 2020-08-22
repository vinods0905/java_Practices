import java.io.*;

class DataStreamexample{
public static void main(String args[]) throws Exception
 {

  FileInputStream fin=new FileInputStream("testoutput.txt");
  int i=fin.read();
  System.out.print((char)i);
  fin.close();
 }
}

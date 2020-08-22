import java.io.*;
class bufferedstreamexample{
public static void main(String args[])throws Exception
 {
  FileOutputStream fout=new FileOutputStream("testoutput.txt");
  BufferedOutputStream bout=new BufferedOutputStream(fout);
  String s="welcome to java t point";
  byte b[]=s.getBytes();
  bout.write(b);
  bout.flush();
  bout.close();
  fout.close();
  System.out.println("success");
 }
}
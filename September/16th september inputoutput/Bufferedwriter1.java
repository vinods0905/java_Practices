import java.io.*;
class Bufferedwriter1{
 public static void main(String args[])throws Exception
  {
    FileWriter fw=new FileWriter("vinod1.txt");
    BufferedWriter pw=new BufferedWriter(fw);
    pw.write("Hello");
	pw.flush();
	pw.close();
  }
 }
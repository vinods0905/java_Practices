import java.io.*;
class fileoutputstreamexample2{
 public static void main(String args[]) throws Exception
   {
    FileOutputStream fout=new FileOutputStream("testoutput.txt");
    String s="welcome to java point";
    byte b[]=s.getBytes();
    fout.write(b);
    fout.close();
    System.out.println("success");
    }
}


 
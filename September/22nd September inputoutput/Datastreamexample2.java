import java.io.*;
class Datastreamexample2{
 public static void main(String args[])throws Exception
  {
   FileInputStream fin=new FileInputStream("testoutput.txt");
   int i=0;
   while((i=fin.read())!=-1)
    {
     System.out.print((char)i);
    }
  fin.close();
  }
}
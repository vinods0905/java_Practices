import java.io.*;
class BufferedInputStream example2{
public static void main(String args[])throws Exception
{
  FileInputStream fin=new FileInputStream("testoutput.txt");
  BufferedInputStream bin=new BufferedInputStream(fin);
  int i;
  while((i=bin.read())!=-1)
    {
      System.out.print((char)i);
    }
  bin.close();
  fin.close();
}
} 
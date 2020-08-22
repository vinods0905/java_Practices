import java.io.*;

class sequenceinputstream2{
public static void main(String args[])throws Exception
 {
  FileInputStream fin1=new FileInputStream("testinput1.txt");
  FileInputStream fin2=new FileInputStream("testinput2.txt");
  FileOutputStream fout=new FileOutputStream("testoutput.txt");
  SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
  int i;
  while((i=sis.read())!=-1)
   {
    fout.write(i);
   }
   sis.close();
   fout.close();
   fin2.close();
   fin1.close();
   System.out.println("success");
  }
}
  
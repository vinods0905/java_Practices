import java.io.*;
class copystreamexample{
public static void main(String args[])throws Exception{
FileInputStream fin1=new FileInputStream("testinput.txt");
FileOutputStream fout=new FileOutputStream("testoutput.txt");
int i;
while((i=fin1.read())!=-1)
  {
   char ch=((char)i);
   System.out.print(ch);
   fout.write(ch);
  }
 
 fout.flush();
}
}


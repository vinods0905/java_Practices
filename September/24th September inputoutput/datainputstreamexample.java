import java.io.*;

class datainputstreamexample{

public static void main(String args[])throws Exception{

FileInputStream file=new FileInputStream("testinput.txt");
DataInputStream data=new DataInputStream(file);
int i;

while((i=data.read())!=-1)
 {
 System.out.print(i);
  }
}
}




import java.io.*;
class Outputstreamreaderexample{
public static void main(String args[])throws Exception
{
OutputStream stream=new FileOutputStream("output1.txt");
Reader reader=new InputStreamReader(stream);
int i=reader.read();
 

  System.out.print(i);
  
 
  

}
}

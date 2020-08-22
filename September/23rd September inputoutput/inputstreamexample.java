import java.io.*;
class inputstreamexample{
public static void main(String args[]) throws Exception
{
  InputStream stream=new FileInputStream("input.txt");  
  Reader reader=new InputStreamReader(stream);
  int i;
    while((i=reader.read())!=-1)
     {
       System.out.print((char)i);
      
     }
  
}
}
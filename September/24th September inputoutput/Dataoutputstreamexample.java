import java.io.*;

class Dataoutputstreamexample{

public static void main(String args[])throws Exception

{
  FileOutputStream file=new FileOutputStream("testoutput.txt");
  DataOutputStream data= new DataOutputStream(file);
  data.writeInt(65);
  data.flush();
  data.close();
  System.out.println("done");
}
}
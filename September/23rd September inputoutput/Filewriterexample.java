import java.io.*;

class Filewriterexample{
public static void main(String args[]) throws Exception
 {
  FileWriter fw=new FileWriter("testoutput.txt");
  fw.write("write into the file");
  fw.close();
  System.out.println("done");
}
}

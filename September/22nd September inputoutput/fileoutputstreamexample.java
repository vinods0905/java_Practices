import java.io.*;
class fileoutputstreamexample{
       public static void main(String args[]) throws Exception
    {
      FileOutputStream fout=new FileOutputStream("testoutput.txt");
       fout.write(65);
       fout.close();
        System.out.println("success");
      }
}

       
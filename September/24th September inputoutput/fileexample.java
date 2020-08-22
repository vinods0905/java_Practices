import java.io.*;

class fileexample{

 public static void main(String args[]) throws Exception{

 File f=new File("filetext.text");
  if(f.createNewFile())
    {
     System.out.println("new file created");
    }
 else
    {
     System.out.println("file already exists");
    }
}
}


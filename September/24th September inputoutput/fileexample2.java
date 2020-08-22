import java.io.*;
class fileexample2{
public static void main(String args[])throws Exception{
File f=new File("/java/23rd September");
 if(f.isFile())
   {
     System.out.println("is a file");
   }
else
  {
     System.out.println("is not afile");
  }

}
}

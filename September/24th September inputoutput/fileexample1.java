import java.io.*;
class fileexample1{
public static void main(String args[])throws Exception{
File f=new File("/java/23rd September");
String filenames[]=f.list();
for(String filename:filenames)
 {
  System.out.println(filename);
 }
}
}
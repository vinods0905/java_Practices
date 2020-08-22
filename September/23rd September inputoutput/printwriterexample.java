import java.io.*;
class printwriterexample{
public static void main(String args[])throws Exception{

PrintWriter writer=new PrintWriter(System.out);
writer.write("my name is vinod");
writer.flush();
writer.close();
FileWriter fw=new FileWriter("testprinter.txt"); 
PrintWriter writer1=new PrintWriter(fw);
writer1.write("java is a beautiful language");
writer1.flush();
writer1.close();
}
}

import java.io.*;
class writerexample1{
public static void main(String args[])throws Exception{
Writer w=new FileWriter("writer1.txt");
String s="i love java";
w.write(s);
w.close();
System.out.print("done");

}
}


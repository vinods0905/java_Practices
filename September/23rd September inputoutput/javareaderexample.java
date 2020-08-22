import java.io.*;
class javareaderexample{
public static void main(String args[])throws Exception{

Reader reader=new FileReader("javareader.txt");
int i;
while((i=reader.read())!=-1)
 {
   System.out.print((char)i);
 }
reader.close();

}
}

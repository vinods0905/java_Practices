import java.io.*;
class Filereaderexample{
public static void main(String args[])throws Exception
{
 FileReader fr=new FileReader("testoutput.txt");
 int i;
 while((i=fr.read())!=-1)
 System.out.print((char)i);
 fr.close();
}
}

import java.io.*;
import java.net.*;
class myservertoclientstop{
public static void main(String args[])throws Exception{
ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();


DataInputStream dis=new DataInputStream(s.getInputStream());
FileOutputStream fout=new FileOutputStream("testoutputsto.txt");


String st="";
byte[] b;
while(!st.equals("stop"))
{
 st=dis.readUTF();
 System.out.println("message="+st);
 //str=br.readLine();
 b=st.getBytes();
 fout.write(b);
 fout.flush();
}
dis.close();
s.close();
ss.close();
}
}

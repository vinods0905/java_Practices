import java.io.*;
import java.net.*;
class myserverstop{
public static void main(String args[])throws Exception{

ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();
DataInputStream dis=new DataInputStream(s.getInputStream());
String st="";
while(!st.equals("stop"))
 {
  st=dis.readUTF();
  System.out.println("message="+st);
 }
dis.close();
s.close();
ss.close();
}
}


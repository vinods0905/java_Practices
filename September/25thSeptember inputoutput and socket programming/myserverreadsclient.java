import java.net.*;
import java.io.*;

class myserverreadsclient{

public static void main(String args[])throws Exception{

ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept(); //server accepts the request of the client for establishing connection
DataInputStream dis=new DataInputStream(s.getInputStream());
String str=(String)dis.readUTF();
System.out.println("message="+str);
ss.close();
}
}



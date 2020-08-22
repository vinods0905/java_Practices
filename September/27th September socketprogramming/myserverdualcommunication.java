import java.io.*;
import java.net.*;
class myserverdualcommunication{

public static void main(String args[])throws Exception{

ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();

InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
DataInputStream din=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
String str="",str1="";
while(!str.equals("stop"))
 {
   //str=din.readUTF();
   //System.out.println("client:"+str);
   str1=br.readLine();
   dout.writeUTF(str1);
   dout.flush();
}
din.close();
br.close();
ss.close();
s.close();
}
}




import java.io.*;
import java.net.*;
class myclientdulcommunication{
public static void main(String args[])throws Exception{

Socket s=new Socket("localhost",6666);
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
DataInputStream din=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
String str="",str1="";
while(!str.equals("stop"))
{
 str=din.readUTF();
 System.out.println("server="+str);
 str1=br.readLine();
 dout.writeUTF(str1);
 dout.flush();
}
din.close();
br.close();

s.close();
}
}
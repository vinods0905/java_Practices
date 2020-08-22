import java.io.*;
import java.net.*;
class myclientstop{
public static void main(String args[])throws Exception{

Socket s=new Socket("localhost",6666);
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(r);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
String st="";
while(!st.equals("stop"))
 {
  st=b.readLine();
  System.out.println(st);
  dout.writeUTF(st);
  dout.flush();
 }
dout.close();
s.close();
}
}

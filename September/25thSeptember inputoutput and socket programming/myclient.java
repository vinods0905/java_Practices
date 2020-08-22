import java.io.*;
import java.net.*;

class myclient{
public static void main(String args[])throws Exception{

Socket s=new Socket("localhost",6666);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
dout.writeUTF("hello server");
dout.flush();
dout.close();
s.close();
}
}

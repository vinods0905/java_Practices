import java.io.*;
import java.net.*;

class myclientwritesserver{
public static void main(String args[])throws Exception{

Socket s=new Socket("localhost",6666);


 InputStreamReader r=new InputStreamReader(System.in);
  BufferedReader b=new BufferedReader(r);  
      String st=b.readLine();
  DataOutputStream dout=new DataOutputStream(s.getOutputStream());
  dout.writeUTF(st);
  dout.flush();
  dout.close();
  s.close();


}
}

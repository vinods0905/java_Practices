import java.io.*;
import java.net.*;

class urlconnectionexample{

public static void main(String args[]) throws Exception{

URL url=new URL("https://www.javatpoint.com/java-tutorial");

URLConnection urlcon=url.openConnection();
InputStream stream=urlcon.getInputStream();
int i;

while((i=stream.read())!=-1)
{
System.out.print((char)i);
}

}
}
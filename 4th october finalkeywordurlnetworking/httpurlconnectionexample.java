	import java.io.*;
import java.net.*;

class httpurlconnectionexample{

public static void main(String args[]) throws Exception{

URL url=new URL("http://www.javatpoint.com/java-tutorial");

HttpURLConnection huc=(HttpURLConnection)url.openConnection();

for(int i=1;i<=8;i++)
{
System.out.println(huc.getHeaderFieldKey(i)+"="+huc.getHeaderField(i));
}
huc.disconnect();
}
}
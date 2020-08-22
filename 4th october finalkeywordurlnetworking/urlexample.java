import java.net.*;

class urlexample{
public static void main(String args[]) throws Exception{

URL url=new URL("https://www.javatpoint.com/java-tutorial");

System.out.println("protocol:"+url.getProtocol());
System.out.println("host name:"+url.getHost());
System.out.println("portnumber:"+url.getPort());
System.out.println("filename:"+url.getFile());

}
}

import java.net.*;

class urlexample2{

public static void main(String args[])throws Exception{

URL url=new URL("https://www.google.com/search?sxsrf=ACYBGNQwobh0THUZq_fRziNKejTb9ircRg%3A1570183589020&source=hp&ei=pBmXXZPpOpn6rQH7n4_IBg&q=javatpoint&oq=javatpoint&gs_l=psy-ab.3..0l10.922.5064..5786...0.0..0.108.951.9j1......0....1..gws-wiz.......35i39j0i131j0i67.Y6NMc-Rnxz4&ved=0ahUKEwiTy7XYrYLlAhUZfSsKHfvPA2kQ4dUDCAY&uact=5");

System.out.println("protocol:"+url.getProtocol());
System.out.println("hostname:"+url.getHost());
System.out.println("portnumber:"+url.getPort());
System.out.println("defaultportnumber:"+url.getDefaultPort());
System.out.println("query string:"+url.getQuery());
System.out.println("path:"+url.getPath());
System.out.println("file:"+url.getFile());

}
}
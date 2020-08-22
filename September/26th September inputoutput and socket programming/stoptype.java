import java.io.*;

class stoptype{
 public static void main(String args[])throws Exception{
 InputStreamReader r=new InputStreamReader(System.in);
 BufferedReader b=new BufferedReader(r);
 String st="";
  while(!st.equals("stop"))
   {
  st=b.readLine();
 System.out.println(st);
  }
  
}
}
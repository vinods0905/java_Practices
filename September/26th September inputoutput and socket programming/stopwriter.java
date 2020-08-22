import java.io.*;

class stopwriter{
public static void main(String args[])throws Exception{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(r);
FileWriter fw=new FileWriter("teststop.txt");
String st="";
while(!st.equals("stop"))
 {
    st=b.readLine();
   System.out.println(st);
   fw.write(st);
   fw.flush();
 }
}
}

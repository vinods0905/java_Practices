import java.io.*;
class ReadExample{
public static void main(String args[])throws Exception
{
byte buf[]={35,36,37,38};
ByteArrayInputStream byt=new ByteArrayInputStream(buf);
int k;
while((k=byt.read())!=-1)
 {
   char ch=(char)k;
   System.out.println("Ascci value of character is"+k+"special character is"+ch);
 }
}
}

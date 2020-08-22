import java.util.*;
import java.io.*;

class test{
 public static void main(String args[])throws Exception{

 FileReader reader=new FileReader("db.properties");
 properties p=new properties();
 p.load(reader);
 System.out.println(p.getProperty("user"));
 System.out.println(p.getproperty("password"));
}
}
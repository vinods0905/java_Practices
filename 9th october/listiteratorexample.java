import java.util.*;

class listiteratorexample{

public static void main(String args[])
 {

 List<String> al=new ArrayList<String>();
 
 al.add("amit");
 al.add("vijay");
 al.add("kumar");
 al.add(1,"vinod");

 ListIterator<String> itr=al.listIterator();

 System.out.println("traversing element in forward direction:");

while(itr.hasNext())
 {

  System.out.println("index:"+itr.nextIndex()+"value:"+itr.next());
 }
System.out.println("traversing elements in backward direction:");
while(itr.hasPrevious())
 {
  System.out.println("index:"+itr.previousIndex()+"value:"+itr.previous());
 }
}
}

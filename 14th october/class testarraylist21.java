import java.util.*;

class testarraylist21{

 public static void main(String args[])
 {

  List<String> al=new ArrayList<String>();

  al.add("sonoo");
  al.add("Michael");
  al.add("james");
  al.add("andy");

Iterator itr=al.iterator();

while(itr.hasnext())
 {
  System.out.println(itr.next());

 
  }
}

}
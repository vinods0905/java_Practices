import java.util.*;

class treesetexample{

public static void main(String args[]){

TreeSet<String> ts1=new TreeSet<String>();
	

TreeSet<String> ts2=new TreeSet<String>();

ts2.add("sanjay");
ts2.add("praveen");
ts2.add("vijay");

System.out.println(ts2);

System.out.println("Traversing element through iterator in descending order");

Iterator i=ts2.descendingIterator();
while(i.hasNext())
{
System.out.println(i.next());
}
System.out.println(ts2);

TreeSet<String> ts3=new TreeSet<String>();
ts3.add("A");
ts3.add("B");
ts3.add("C");
ts3.add("D");
ts3.add("E");

System.out.println(ts3);

//descending set

ts3.descendingSet();
System.out.println(ts3.descendingSet());

//head set

ts3.headSet("D",false);
System.out.println(ts3.headSet("D",false));

//subset

ts3.subSet("A",false,"E",true);
System.out.println(ts3.subSet("A",false,"E",true));

//tailset
ts3.tailSet("C",false);
System.out.println(ts3.tailSet("C",false));





}
}




 


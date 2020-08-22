import java.util.*;

class linkedlistexample{

public static void main(String args[])
{

LinkedList<String> list=new LinkedList<String>();

//adding element to the list

list.add("santhosh");
list.add("venu");
list.add("karun");
list.add("anu");
System.out.println(list);

//creating another list
LinkedList<String> list2=new LinkedList<String>();
list2.add("akhil");
list2.add("sanjeev");
list2.add("sravan");
System.out.println(list2);

//adding one element of the secondlist  to the firstlist

list.add(1,"akhil");
System.out.println(list);

//adding all elements of the secondlist to the first list

list.addAll(list2);
System.out.println(list);

//adding element to the specified index

list.add(1,"praveen");
System.out.println(list);

// adding element to the begiing

list.addFirst("viji");
System.out.println(list);

//adding an element to the last
list.addLast("poom");
System.out.println(list);

//removing first element and last element
list.removeFirst();
list.removeLast();
System.out.println(list);

//getting first element from the list

Object var=list.getFirst();
System.out.println(var);

//getting last element from the list

Object var1=list.getLast();
System.out.println(var1);

//getting element from the index

Object var2=list.get(2);
System.out.println(var2);

//to find the given object at is present or not

boolean var3=list.contains("sravan");

System.out.println(var3);

// to find the index of sarvan

int var4=list.indexOf("sravan");
System.out.println(var4);


// removes the value at index

list.remove(7);
System.out.println(list);

//removing all elements of the list
System.out.println(list2);
list2.clear();
System.out.println(list2);









 

}
}


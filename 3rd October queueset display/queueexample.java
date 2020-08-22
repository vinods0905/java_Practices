import java.util.*;

class queueexample{

public static void main(String args[])

{
 Queue<Integer> q=new LinkedList<>(); // creating object for the linkedlist

 for(int i=0;i<5;i++) 
 q.add(i);
 System.out.println(q);

// to remove head of the queue
 int var=q.remove();
 System.out.println("removed element:"+var);
 System.out.println(q);

// to view head of the queue

 int head=q.peek();
 System.out.println("head:"+head);

// to view the number of elemnts in the que
int var2=q.size();
System.out.println("size:"+var2);

}
}
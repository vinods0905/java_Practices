import java.util.*;
class dequeueexample{

Deque<String> deque=new ArrayDeque<String>();

deque.offer("aravind");
deque.offer("vimal");
deque.add("mukul");
deque.offerFirst("jai");
System.out.println("after fist offer traversl:");
for(String s:deque)
 {
   System.out.println(s);
 }
}

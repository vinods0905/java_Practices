import java.util.*;
class mapexample3{

public static void main(String args[]){

HashMap<Integer,String> map=new HashMap<Integer,String>();

map.put(100,"amit");
map.put(101,"vijay");
map.put(102,"rah");

System.out.println(map);

map.putIfAbsent(103,"gauvaruv");
System.out.println(map);

}
}
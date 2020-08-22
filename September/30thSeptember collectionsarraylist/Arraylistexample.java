import java.util.*;
class Arraylistexample{
 public static void main(String args[])
  {
   ArrayList<String> alist=new ArrayList<String>();
   alist.add("vinod");
   alist.add("santhosh");
   alist.add("akhil");
   alist.add("venu");
   System.out.println(alist);

  //remove an element

   alist.remove("venu");
   System.out.println(alist);

  //updating an element
   alist.set(1,"anu");
    System.out.println(alist);

  // index of an element
    int pos=alist.indexOf("anu");
    System.out.println("index="+pos); 

  // remove an element from index
     alist.remove(2);
     System.out.println(alist);

 // adding an objet in the index
     alist.add(2,"venu");
     System.out.println(alist);

     alist.add(2,"santhosh");
     System.out.println(alist);

 // retruning string at that index
  String st=alist.get(2);
  System.out.println("element at index 2="+st);

 //number of array in arraylist
    int numberofitems=alist.size();
    System.out.println(alist);
    System.out.println("number of elements in the array:"+numberofitems);

//checking of object in an array

    alist.contains("anu");
    alist.contains("steve");
    System.out.println(alist.contains("anu"));
    System.out.println(alist.contains("steve"));
    System.out.println(alist);
    System.out.println(alist.indexOf("anu"));
  
  
  

//sorting

  Collections.sort(alist);
  System.out.println(alist);
  

 
    

   
 
  
  }
}
class comparison1{
 public static void main(String args[])

 {
   String s1="hello";
   String s2="world";
   String s3="hello";
  String s4="World";
System.out.println(s2.equals(s4));
System.out.println(s2.equalsIgnoreCase(s4)); // method to check whether equal irrespective of the case

//for reference comparison

String s5="hello";

if(s1==s5)
     {
       System.out.println("both equal");
      }

String s6=new String("hello");
if(s5==s6)
    {
      System.out.println("both equal");
 
     }
    else
         {
           
         System.out.println("not equal");
         }
     // compare initial character print the difference of the character position value

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.charAt(0));
        System.out.println(s1.length());

   //upper case or lower case

       System.out.println(s1.toUpperCase());
       System.out.println(s4.toLowerCase());
// contains checks character or combined letter is there in the character
       System.out.println(s1.contains("h"));
       System.out.println(s1.contains("ll"));
       System.out.println(s1.contains("hl"));
//substring
  //   String s7=s1.SubString(1);
   //  String s8=s1.SubString(1,4);
   //    System.out.println(s7);
   //    System.out.println(s8); //

// to join the delimeters to the string (delimiters are _,/\)

 String date=String.join("_","12","6","2019");
 System.out.println(date);

// starts with and ends with 
 String s9="print";
 String s10="jan@gmail.com";
System.out.println(s9.startsWith("pr"));
System.out.println(s10.endsWith(".com"));
System.out.println(s9.startsWith("ti"));

// trim a string in the begin and end

String s11=" my name is ja  ";
System.out.println(s11);
System.out.println(s11.trim());


// verify the string is empty

String s12="";
String s13="jam";
System.out.println(s12.isEmpty());
System.out.println(s13.isEmpty());

// replace the string
String s14="apple";
String s15=s14.replace("a","b");
System.out.println(s15);


}
}
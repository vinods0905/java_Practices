class comparison2{

   public static void main(String args[])

{

	String s1="hello";
	String s2="world";
	String s3="hello";
	String s4="World";
	
		System.out.println(s1.equals(s3));		
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s4));


		System.out.println(s2.equalsIgnoreCase(s4));
	//comparing the reference	

	String s5="hello";
	String s6=new String("hello");
    		if(s1==s5)
                    {
                        System.out.println("both are equal");
		     }
                    else
                       {
                         System.out.println("not equal");	
                       }
                if(s5==s6)
                      {
			System.out.println("both equal");
		      }
		else
                      {
                        System.out.println("not equal");
			}
		System.out.println(s1.compareTo(s2));//compares the intial character value difference
		System.out.println(s3.compareTo(s1));
		System.out.println(s2.compareTo(s4));
		System.out.println(s3.compareTo(s1));
		System.out.println(s4.compareTo(s3));
		System.out.println(s1.compareTo(s3));


		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(4));

		System.out.println(s1.length());
		System.out.println(s2.length());

		System.out.println(s1.contains("hll"));
		System.out.println(s4.contains("w"));


		System.out.println(s1.substring(2));
		System.out.println(s1.substring(1,3));
		System.out.println(s1.substring(3,4));
		System.out.println(s1.substring(4,5));

	String date=String.join("/","24","06","2018");
		
		System.out.println(s1.concat(date));
		System.out.println(date);
	
	String s7="jan@gmail.com";
		
		System.out.println(s7.endsWith(".com"));
		System.out.println(s7.startsWith("an"));
		System.out.println(s7.startsWith("j"));
 
	String s8="    my name is jan    ";
		System.out.println(s8);
		System.out.println(s8.trim());

	String s9="";
	String s10="bun";
		System.out.println(s9.isEmpty());
		System.out.println(s10.isEmpty());
	String s11="apple";
		System.out.println(s11.replace("a","b"));

         			

		


}
}
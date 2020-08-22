class countchar1{

 public static void main(String args[])

{
 
  String s1="welcome to home";
  int count=0;
  int i;
  for(i=0;i<s1.length();i++)
     {

       if(s1.charAt(i)=='e')

         {
           count++;
          }
       
     }
System.out.println("count="+count);
}
}
  
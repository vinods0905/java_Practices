class variable1{

   static int i=1;

  variable1()
    {
     
     i++;
     System.out.println(i);
    }
}
  class variableincrement{
        public static void main(String args[])
         {
          
           variable1 obj1=new variable1();
           variable1 obj2=new variable1();
	   variable1 obj3=new variable1();
         }
 }



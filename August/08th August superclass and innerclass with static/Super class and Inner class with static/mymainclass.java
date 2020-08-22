class outerclass{

    int x=10;
    int y=5;
    int sum,sub;

 void sum()
    {
      x=20;
      y=10;
      sum=x+y;
      System.out.println("sum="+sum);
     }
   class innerclass{
            int i=30;
            int j=20;
   void sub()
       {
         i=40;
         j=15;
         sub=i-j;
         System.out.println("sub="+sub);
        }
   }
}
  class mymainclass{

    public static void main(String args[])
      {
        outerclass myouter=new outerclass();
        outerclass.innerclass myinner=myouter.new innerclass();

        System.out.println("variable="+myouter.x);
        System.out.println("variable="+myouter.y); 

        

        System.out.println("variable="+myinner.i);
        System.out.println("variable="+myinner.j);

          myouter.sum();
         
          myinner.sub();
      }
}


         


       
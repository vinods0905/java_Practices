class leapyear{

 public static void main(String args[])
    {
      int i;
      i=Integer.parseInt(args[0]);
      System.out.println(i);

        if(i%4==0)
            {
           System.out.println(+i +"is a leap year");

             }
           else
            {
            
             System.out.println(+i +"is not a leap year");
            }
    }
}
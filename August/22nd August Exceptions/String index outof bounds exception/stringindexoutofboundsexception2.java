class stringindexoutofboundsexception2{
                    public static void main(String args[])
          {            
                     try {
                          String s="hello";
                          System.out.println(s.charAt(5));
                        }
                      catch(StringIndexOutOfBoundsException e)
                       {
                         System.out.println(e);
                       }
                 System.out.println("start the program");
     }
  }
class Base{

 public void show() 
   {
     System.out.println("Base::show() called");
   }
 }

class Derived extends Base{
       public void show()
        {
         System.out.println("Derived::show() called");
        }
 }
public class Basederivedsub{
      public static void main(String args[])
        {
         // Base b=new Derived(); //derived class method overrides the baseclass method
          //  Base b=new Base();    // base class method is shown
            //  Derived b=new Derived();  //derived class method is shown
                Derived b=new Base(); // base class method cannot override the derived class since
                                        base class is not derived from derived class so an error will come
        }
}
class animal{

void eatsomething()
 {
  System.out.println("eatingsomething");
 }
}
class dog extends animal{

@Override
void eatsomething()
{
System.out.println("eating foods");
}
}

class testannotations1{
 public static void main(String args[])
 {

 animal a=new dog();

 
 a.eatsomething();
}
}
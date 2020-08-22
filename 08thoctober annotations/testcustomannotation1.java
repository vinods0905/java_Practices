// creating annotations

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@inteface MyAnnotation{

int value();
}

//applying the annotation

class Hello{

@MyAnnotation(vlaue=10)

public void sayhello()
{
System.out.println("hello annotation:");
}

class testcustomannotation1{

public static void main(String args[])throws Exception{

Hello h=new Hello();

Method m=h.getclass().getmethod("sayhello");

MyAnnotation manno=m.getAnnotation(MyAnnotation.class);
System.out.println("value is:"+manno.value());
}
}




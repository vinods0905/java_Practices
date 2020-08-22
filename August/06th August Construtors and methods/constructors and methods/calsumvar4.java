class calsum1{
 	int a,b;
 	float c,d;
 	int e;
 	float f;
  calsum1(int x,int y)
   {
    a=x;
    b=y;
    System.out.println("a="+a);
    System.out.println("b="+b);
   }
  calsum1(float i,float j)
   {
     c=i;
     d=j;
     System.out.println("c="+c);
     System.out.println("d="+d);
   }
  calsum1(float i,int x)
   {
     f=i;
     e=x;
     System.out.println("f="+f);
     System.out.println("e="+e);
   }

 void sum1()
   {
     int l=a+b;
     
     System.out.println("sum of integer and integer:"+l);
   }
 void sum2()
   {
    float m=c+d;
    
    System.out.println("sum of float and float:"+m);
   }
void sum3()
   {
    float n=f+e;
     
    System.out.println("sum of float and integer:"+n);
   }
 }
class calsumvar4{
     public static void main(String args[])
      {
        calsum1 obj1=new calsum1(2,3);
        calsum1 obj2=new calsum1(2.5f,3.5f);
        calsum1 obj3=new calsum1(2.5f,3);
        obj1.sum1();
        obj2.sum2();
        obj3.sum3();
      }
}

      

 
 
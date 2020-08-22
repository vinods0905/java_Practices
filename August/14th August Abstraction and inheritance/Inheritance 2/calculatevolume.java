

class getdimension
{
            int length,breadth,width;
   void get(int l,int b,int w)
       {
        length=l;
        breadth=b;
        width=w;
        }

    void dimension(int len)

        {
         length=breadth=width=len;


         }
   int volume()
        {
         return length*breadth*width;
         
        }
       
}
class cuboid extends getdimension{

       
        cuboid(int l,int b,int w)
           {
             length=l;
             breadth=b;
             width=w;
             
           }
   }

class cube extends getdimension{
          
         cube(int len)
           {
            length=breadth=width=len;
              	
            }  

          
  }
class calculatevolume
{
           public static void main(String args[])
         {

           cuboid obj1=new cuboid(2,3,4);

           int vol;
           vol=obj1.volume();
           System.out.println("volume="+vol);


           cube obj2=new cube(2);
           vol=obj2.volume();
           System.out.println("volume="+vol);
           
           
         }
}
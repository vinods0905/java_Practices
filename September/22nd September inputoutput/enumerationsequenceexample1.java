class enumerationsequenceexample1{
 public static void main(String args[])throws Exception
  {
   FileInputStream fin=new FileInputStream("a.txt");
   FileInputStream fin2=new FileInputStream("b.txt");
   FileInputStream fin3=new FileInputStream("c.txt");
   FileInputStream fin4=new FileInputStream("d.txt");
   
   Vector v=new Vector();
   v.add(fin);
   v.add(fin2);
   v.add(fin3);
   v.add(fin4);

   Enumeration e=v.elements();
   SequenceInputStream bin=new SequenceInputStream(e);
   int i=0;
   while((i=bin.read())!=-1)
    {
     System.out.print((char)i);
    }
bin.close();
fin.close();
fin2.close();

}
}
interface Employee{

                  void employeedetails();
            }

class Driver implements Employee{

          String name;
          int empid;
          int salary;
          

          Driver(String n,int eid,int s)
               {
                 name=n;
                 empid=eid;
                 salary=s;
                 
                }
          public void employeedetails()
                 {
                    System.out.println("desination=Driver");
                    System.out.println("name="+name);
                    System.out.println("employee id="+empid);
                    System.out.println("salary="+salary);
                    
                 }

}

class Manager implements Employee{

          String name;
          int empid;
          int salary;
          

          Manager(String n,int eid,int s)
               {
                 name=n;
                 empid=eid;
                 salary=s;
                 
                }
        public  void employeedetails()
                 {
                    System.out.println("desination=Manager");
                    System.out.println("name="+name);
                    System.out.println("employee id="+empid);
                    System.out.println("salary="+salary);
                    
                 }

}

class Employedetails{
            public static void main(String args[])
             {
               Driver obj1=new Driver("ram",123,2000);
               Manager obj2=new Manager("vino",456,15000);
               obj1.employeedetails();
               obj2.employeedetails();
              }
}


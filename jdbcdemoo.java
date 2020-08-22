
import java.sql.*;

class jdbcdemoo{
   
    public static void main(String args[])
     {
      Connection conn=null;
        Statement stmt=null;
String sql;
    try{
         Class.forName("com.mysql.jdbc.Driver");
        
         System.out.println("connecting to a selected database:");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");

        System.out.println("inserting records into the table:");
        stmt=conn.createStatement();

        sql="insert into employeedetails values(6,'maku','tester',5500,36)";
        stmt.executeUpdate(sql);

     
        sql="insert into employeedetails values(7,'pack','developer',6500,38)";
        stmt.executeUpdate(sql);

     
        sql="insert into employeedetails values(8,'wack','sales',7500,38)";
        stmt.executeUpdate(sql);

        sql="insert into employeedetails values(9,'lack','qa',8500,38)";
        stmt.executeUpdate(sql);

        System.out.println("inserted records into the table:");
       }
	catch(Exception se){
                            se.printStackTrace();
                           }
          
           finally{
                    try{
                         if(stmt!=null)
                         conn.close();
                        }
                       catch(Exception se)             
                         {
                          }
                     try{
                         if(conn!=null)
                         conn.close();
                       }
                       catch(Exception se)
                       {
                         se.printStackTrace();
                       }
                  }
             System.out.println("goodbye");
        }
     }


        
         
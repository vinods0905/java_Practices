
import java.sql.*;

class jdbcdelete1{
        public static void main(String args[])
           {
            Connection conn=null;
            Statement stmt=null;
            String sql;
        try{
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("connecting to a selected database:");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");

            System.out.println("deleting records into the table:");
            stmt=conn.createStatement();

            sql="delete from employeedetails where employee_id=6";
            stmt.executeUpdate(sql);
        
            System.out.println("deleted records into the table:");
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


        
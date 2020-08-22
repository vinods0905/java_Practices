import java.sql.*;

class jdbcupdate1{
       public static void main(String args[])
         {
           Connection conn=null;
           Statement stmt=null;
           String sql;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           
           System.out.println("connecting to a selected database:");
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");

            System.out.println("updating records into the table:");
            stmt=conn.createStatement();

            sql="update employeedetails set employee_salary=7000,employee_name='sand' where employee_id=4";
            stmt.executeUpdate(sql);
            
            System.out.println("updated records into the table:");
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

import java.sql.*;

class jdbcselect1{
          public static void main(String args[])
 {
   Connection conn=null;
   Statement stmt=null;
   String sql;
 try{
     Class.forName("com.mysql.jdbc.Driver");
     System.out.println("connecting to a selected database:");
     conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root"); 
     System.out.println("connected database successfully:");
 
     System.out.println("creating statement:");
     stmt=conn.createStatement();

     sql="select employee_id,employee_name,employee_designation from employeedetails";
     ResultSet rs=stmt.executeQuery(sql);

     while(rs.next())
       {
         int employee_id=rs.getInt("employee_id");
         String employee_name=rs.getString("employee_name");
         String employee_designation=rs.getString("employee_designation");

         //Display values

       System.out.println("employee id"+employee_id);
       System.out.println(",employeename"+employee_name);
       System.out.println(",employeedesignation"+employee_designation);
      }
 	
      rs.close();
        }
         catch(Exception se)
            {
              se.printStackTrace();
            }
         
         finally{
                     try{
                          if(stmt !=null)
                             conn.close();
                        }catch(Exception se){
                            
                                }
                          try{
                               if(conn!=null)
                                 conn.close();
                              }catch(Exception se)
                                {
                                  se.printStackTrace();
                                 }
                }

                    System.out.println("goodbye");
          }
}
















 
 
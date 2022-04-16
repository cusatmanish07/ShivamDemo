package order;
import java.sql.*;


public class JDBCDemo {
	
	   static final String DB_URL = "jdbc:mysql://localhost:3306/manish?useSSL=false";
	   static final String USER = "shivam";
	   static final String PASS = "shivam";
	   
	   public void connectdb(String sql){
		   
		   String sql1 =sql;
		   
		   
		   try{  
			   System.out.println("Inside try block ");
			   Class.forName("com.mysql.cj.jdbc.Driver");  
			   
			   System.out.println("class.forname successful ");
			   
			   Connection con=DriverManager.getConnection(  
					   DB_URL,USER,PASS); 
			   //here sonoo is database name, root is username and password  
			   Statement stmt=con.createStatement(); 
			   stmt.executeUpdate(sql1);
			   ResultSet rs=stmt.executeQuery("select * from Orders"); 
			  
			   while(rs.next())  
			   System.out.println(rs.getInt(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3));  
			   con.close();  
			   }catch(Exception e){ System.out.println(e);}  
		   
		   
	   }

}

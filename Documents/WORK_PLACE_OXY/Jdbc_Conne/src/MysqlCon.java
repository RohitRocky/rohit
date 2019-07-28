import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","rohit");  
			//here sonoo is database name, root is username and rohit is password  
			Statement stmt=con.createStatement();  
			System.out.println("Connection established");
			ResultSet rs=stmt.executeQuery("Select * from customers order by city asc;");  
			//ResultSet R1;
		while(rs.next()) 
			{
			System.out.println(rs.getInt(1)+" \t "+rs.getString(2)+" \t "+rs.getString(3)+"\t "+rs.getString(4)+"\t "+rs.getString(5)+"\t "+rs.getInt(6)+"\t"+rs.getString(7));  
	
			}
			/*	
		ResultSet R1=stmt.executeQuery("SELECT id,name from emp where emp.age >= 27");
			
		while(R1.next())
			{
				System.out.println(R1.getInt(1)+" "+R1.getString(2));  
			}*/
		
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
	
}


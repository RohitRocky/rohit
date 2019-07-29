import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	String url="jdbc:mysql://localhost:3306/sonoo";
	String username="root";
String password="rohit";

Connection con=null;
public Connection getConn()
{
	try
	{
		con=DriverManager.getConnection(url,username,password);
		System.out.println("connection establish");
				
	}catch(Exception e)
	{
		e.printStackTrace();
	}return con;
}
	 public static void main(String args[])
	 {
		 ConnectionFactory s1=new ConnectionFactory();
		 s1.getConn();
	 }
}




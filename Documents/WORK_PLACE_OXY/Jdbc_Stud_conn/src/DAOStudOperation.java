import java.sql.ResultSet;
import java.sql.Statement;

public class DAOStudOperation {

	ConnectionFactory sf=null;
	void insertRecord(int id,String name,String age)
	{
		sf=new ConnectionFactory();
		try
		{
			
		
	String query="insert into emp values("+id+",'"+name+"','"+age+"')";
		Statement st=sf.getConn().createStatement()	;
		st.executeUpdate(query);
	
		System.out.println(" Record Save");
		
	}catch(Exception e){
		e.printStackTrace();
	}
}
	
	
	void updateRecord(int id,String age){
		
		sf=new ConnectionFactory();
		try
		{
			
		
	String query="update emp set age='"+age+"'where id="+id+"";
		Statement st=sf.getConn().createStatement()	;
		st.executeUpdate(query);
	
		System.out.println(" Record Updated");
		
	}catch(Exception e){
		e.printStackTrace();
	}
		
	}
void deleteRecord(int id){
		
		sf=new ConnectionFactory();
		try
		{
			
		
	String query="delete from emp where id="+id+"";
		Statement st=sf.getConn().createStatement()	;
		st.executeUpdate(query);
	
		System.out.println(" Record Deleted");
		
	}catch(Exception e){
		e.printStackTrace();
	}
}
		void display()
		{
			sf=new ConnectionFactory();
			try
			{
				
				String query="select * from emp";
				Statement st=sf.getConn().createStatement()	;
			
			ResultSet rs=st.executeQuery(query);  
			//ResultSet R1;
			while(rs.next()) 
			{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
	
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
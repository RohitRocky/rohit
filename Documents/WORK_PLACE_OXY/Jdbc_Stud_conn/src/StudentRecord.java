import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentRecord {
       public static void main(String args[] )
              {
    	   DAOStudOperation stud1=new DAOStudOperation();
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        int ch,id;
	        String name,agel;
	        try
	        {
	        	
	        	do
	        	{
	        		System.out.println("1.Insert Record");
	        		System.out.println("2.Update Record");
	        		System.out.println("3.Delete Record");
	        		System.out.println("4.Display Record");
	        		System.out.println(".Enter ur choice");
	                ch=Integer.parseInt(br.readLine());
	        	String age;
				switch (ch) {
				
	        		
	        			case 1: System.out.println("Enter id");
	        			id=Integer.parseInt(br.readLine());
	        			System.out.println("enter name");
	        			name=br.readLine();
	        			System.out.println("Enter age");
	        			age=br.readLine();
					
					stud1.insertRecord(id,name,age);
	        			break;
	        			case 2:System.out.println("Enter id");
	        			id=Integer.parseInt(br.readLine());
	        			System.out.println("Enter age");
	        			age=br.readLine();
	        			stud1.updateRecord(id,age);
	        			break;
	        			case 3:System.out.println("Enter id");
	        			id=Integer.parseInt(br.readLine());
	        			stud1.deleteRecord(id);
	        			break;
	        			case 4:stud1.display();break;
	        		}
	        		
	        	}while(ch!=5);
	        	
	        }catch(Exception e)
	        {
	        	e.printStackTrace();
	        }
    	   
    	   
    	   
    	   
              }

}

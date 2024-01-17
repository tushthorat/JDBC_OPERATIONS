import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBC_Using_Statement {
	public static void main(String[] args) throws Exception{
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	System.out.println("Tushar driver load");
	
    	Connection cc=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch140","root","Tushar@12345");
    	System.out.println("Tushar connection works");

    	Statement st=cc.createStatement();
    	
             String insert="insert into student values(111,'Gopal')";
    	     st.execute(insert);
    	     System.out.println("record inserted");
    	
    	    
    	     st.execute("update student set name='tushar' where id=111");
    	     System.out.println("record updated");
    	     
    	        
    	      st.execute("delete from student where id=112");
  		      System.out.println("record deleted"); 
  		      
  		         
  		      st.execute("select * from student");
 		      System.out.println("record select");  
 		      
 		      
 		      
    	       ResultSet rs=st.executeQuery("select * from student");
    	       System.out.println("student table...");
    	       while(rs.next()) {
    	    	   System.out.println(rs.getInt(1) + " " + rs.getString(2));
    	    	   
    	       }
    }
}

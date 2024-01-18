import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Using_Preparedstatement {
	 public static void main(String[] args) throws Exception{
	    	//First step
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	System.out.println("Tushar driver load");

	    	//second step
	    	Connection cc=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch140","root","Tushar@12345");
	    	System.out.println("Tushar connection works");

	    	
	    	//third step
	    	PreparedStatement ps=cc.prepareStatement("insert into student values(?,?)");
	    	
	    	   ps.setInt(1,115);
	    	   ps.setString(2, "xyz");
	    	   ps.executeUpdate();
	    	   
	    	   ps.setInt(1,116);
	    	   ps.setString(2, "ABC");
	    	   ps.executeUpdate();
	 		     System.out.println("records inserted");
	 		      
	 		      
	    }
}

// Step 1: Importing Package
import java.sql.*;

// --------------- JDBC -----------------

// Follow these 7 steps to work with JDBC:
    // 1. import Package ---_> java.sql
    // 2. Load and Register the Driver -----> com.mysql.jdbc.Driver
    // 3. Create a Connection --> Connection
    // 4. Create a Statement
    // 5. Execute the Query
    // 6. Process the Result
    // 7. Close 

class JdbcConnectivity
{
	public static void main(String args[]) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String uName = "root";
		String pass = "";
		String query = "SELECT * FROM Persons";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uName,pass);
		Statement st = con.createStatement();
		
		//Executing Query
		ResultSet rs = st.executeQuery(query);
		rs.next();
		
//		String userData = rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : ";
//		System.out.println(userData);
		
		// RETRIEVING VALUES FROM SQL DATABASE
		String userData = "";
		while(rs.next())
		{
			userData = rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : ";
			System.out.println(userData);
		}
		
		// INSERTING INTO TABLE
		String q2 = "insert into Persons(PersonID, LastName,FirstName,Address,City) values(2, 'Mishra', 'Vaibhav', 'Kanpur', 'Kanpur')";
		int count = st.executeUpdate(q2);
		System.out.println(count+ " Row(s) Affected");
				
		st.close();
		con.close();
	}

}

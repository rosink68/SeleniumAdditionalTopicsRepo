package databaseResting;

import java.sql.*;

public class JDBCDemo {

	/**
	 * Diese jave-Programm funktioniert nicht, da ich aus Sicherheitsgründen die
	 * XAMPP nicht installiert habe.
	 * 
	 * Code ist von Arun Motoori
	 * 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SQLException 
	 */
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "qafox";
		String dbURL = url + dbName;
		String username = "root";
		String password = "root;";
		
		Connection connection = null;
		
		try {

			//Create an object for Driver Class
			String driver = "com.mysql.cj.jdbc.Driver";
			
			// ??????????? Ich weiß nicht, ob für das deprecated newIstance weggelassen werden kann
			Class.forName(driver).newInstance(); 
			Class.forName(driver);
			
			//Connect to qafox Database
			connection = DriverManager.getConnection(dbURL, username, password);
			
			//Verify the connection and execute SQL Statements
			if(!connection.isClosed()) {
				
				System.out.println("Successfully connected to qafox Database");
				
				//Fire SQL Selection Statements
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from Employee");
				
				while(resultSet.next()) {
					
					System.out.println(resultSet.getString("Name")+"--"+resultSet.getString("Location")+"--"+resultSet.getInt("Experience"));
									
				}

				//Execute prepared statements to retrieved the filtered records from the Employee table records
				
				System.out.println("-------------------------------------------");
				
				PreparedStatement prepareStatement = connection.prepareStatement("select * from Employee where Name=? and Experience=?");
				prepareStatement.setString(1,"Gopal"); //first ? after where-clause
				prepareStatement.setInt(2,8); //second ? after where-clause
				ResultSet pResultSet = prepareStatement.executeQuery();
				
				while(pResultSet.next()) {
					
					System.out.println(pResultSet.getString("Name")+"--"+pResultSet.getString("Location")+"--"+pResultSet.getInt("Experience"));
					
				}
			}

		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
		
			try {
				if(!connection.isClosed()) {
					
					//Close the connection
					connection.close();
					
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
}

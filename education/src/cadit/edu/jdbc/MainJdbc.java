package cadit.edu.jdbc;

import java.sql.*;

public class MainJdbc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			//Load JDBC Driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			//Open connection
			Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;instanceName=sqlexpress;databaseName=Edu","edu","edu");
			checkForWarning (con.getWarnings());


			//Create statement object and execute it
			Statement stmt=con.createStatement();
			String sel = "SELECT a 'First',b,c FROM table1";
			ResultSet rs = stmt.executeQuery(sel);
			
			//Use ResultSetMetaData
			ResultSetMetaData md = rs.getMetaData();

			//Get number of column
			int nc = md.getColumnCount();

			//Get column name
			for (int j=1;j<=nc;j++) {
				System.out.printf("%-11s",md.getColumnName(j));
			}	
			System.out.println();

			//Looping on rows
			while (rs.next()) {
				int a = rs.getInt("First");		// By Alias
				float b = rs.getFloat("b");		// By Name
				String c = rs.getString(3);		// By Index
				
				System.out.printf("%-10d %-10f %s\r\n", a, b, c);
			}
		
			rs.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("\r\nSQLException\r\n");
			while ( e != null ) {
				System.out.println("SQLState : " + e.getSQLState());
				System.out.println("Messagge : " + e.getMessage());
				System.out.println("Error : " + e.getErrorCode());
				// Loop on exceptions
				e = e.getNextException();
				System.out.println();
			}
		} catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	private static boolean checkForWarning(SQLWarning warn)  throws SQLException {
		          
		boolean rc = false;

		if (warn != null) {
			System.out.println("\n**Warning**\n");
			rc = true;
			while (warn != null ) {
				System.out.println("SQLState : " + warn.getSQLState());
				System.out.println("Message : " + warn.getMessage());
				System.out.println("Error : " + warn.getErrorCode());
				System.out.println("");

				warn = warn.getNextWarning();
			}
		}
		return rc;
	}
	

}

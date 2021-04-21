package project;

import java.sql.*;


public class sql 
{
public static final String CONN_STRING="jdbc:sqlserver://localhost;databaseName=project;integratedSecurity=true;";

 // connection to database
 public static Connection getConnection() 
 {
     Connection conn = null;
     try {
    	//DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        conn = DriverManager.getConnection(CONN_STRING);

        } catch (SQLException e) {
           e.printStackTrace();
        }
     return conn;
  }
 
/* String str = "insert into groups(groupName) values (?);";
 
    try {
       PreparedStatement stmt = sql.getConnection().prepareStatement(str);
       stmt.setString(1, name);
       stmt.executeUpdate();
        } catch (SQLException e) {
           System.out.println(e.getMessage());
        }‏
 */
 public static final String SELECT_SONG = "SELECT songName FROM songs";
 
 public static final String TADDAM = "SELECT SUM(songName) FROM songs";

 //הכנסה לטבלה
 public static final String INSERT_SUBJECT = "INSERT INTO songs VALUES(?,?,?,?,?,?,?,?,?);";

 

}

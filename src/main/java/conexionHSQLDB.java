import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexionHSQLDB {

	public static void main(String[] args) throws ClassNotFoundException  {
		
		Class.forName("org.hsqldb.jdbcDriver");
		try (Connection con = DriverManager.getConnection("jdbc:hsqldb:file:test")) {
            System.out.println("Connection: " + con.isValid(0));
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
		
	}
}

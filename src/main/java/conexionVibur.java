import org.vibur.dbcp.ViburDBCPDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class conexionVibur {
	 public static void main(String[] args)   {
		 
		// Load and register the HSQLDB driver
		ViburDBCPDataSource ds = new ViburDBCPDataSource();
		 
		ds.setJdbcUrl("jdbc:hsqldb:mem:sakila;shutdown=false");
	    ds.setUsername("sa");
	    ds.setPassword("");

    	ds.start();
		
		 try (Connection connection = ds.getConnection()) {
	         System.out.println("Conexion exitosa");
	     } catch (SQLException e) {
	         e.printStackTrace();
	     }
		 
	 }
}

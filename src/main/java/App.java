import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class App {

	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                LoginView view = new LoginView();
//                LoginController controller = new LoginController(view);
//                controller.showLoginView();
//            }
//        });
		
		Connection conn = null;
		 
        try {

        	DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=StudentManagermentDatabase;integratedSecurity=true";
            String user = "DESKTOP-CM7QGNO/lekhanhduylam";
            String pass = "";
            conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
//                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
//                System.out.println("Driver name: " + dm.getDriverName());
//                System.out.println("Driver version: " + dm.getDriverVersion());
//                System.out.println("Product name: " + dm.getDatabaseProductName());
//                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            	System.out.println("connected");
            }
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

	}

}

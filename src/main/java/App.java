import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import controller.LoginController;
import view.LoginView;

public class App {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				LoginView view = new LoginView();
				LoginController controller = new LoginController(view);
				controller.showLoginView();
			}
		});
	}
}

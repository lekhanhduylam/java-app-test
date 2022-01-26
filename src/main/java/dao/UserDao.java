package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.User;
import utils.DatabaseService;

public class UserDao {
	public boolean checkUser(User user) {
		if (user != null) {
			if ("admin".equals(user.getUserName()) && "admin".equals(user.getPassword())) {
				return true;
			}
		}
		return false;
	}

	public boolean checkUserInDB(User user) {
		DatabaseService dbService = new DatabaseService();
		Connection conn = dbService.getConnection();
		if (conn != null) {
			PreparedStatement ps;
			try {
				ps = conn.prepareStatement("SELECT * FROM Users WHERE UserName = ? AND PassWords = ?");
				ps.setString(1, user.getUserName());
				ps.setString(2, user.getPassword());
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					return true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
}

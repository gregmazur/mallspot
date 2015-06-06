package mallspot.persistance.repository.sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import mallspot.model.entity.User;
import mallspot.model.entity.UserType;
import mallspot.persistance.repository.UserRepository;

public class UserRepositorySQL extends DBHelper implements UserRepository{

	@Override
	public User getUserByLogin(String email) {
		if (startConection()) {
			try {
				try (PreparedStatement ps = getConnection().prepareStatement(
						"SELECT * FROM " + USERS_TABLE
								+ "WHERE " + "email = ?")) {
					ps.setString(1, email);
					try(ResultSet rs = ps.executeQuery()){
						User user = new User();
						user.setId(rs.getInt(1));
						user.setFirstName(rs.getString(2));
						user.setLastName(rs.getString(3));
						user.setEmail(rs.getString(4));
						user.setUserType(UserType.USER);
						return user;
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			} finally {
				closeConection();
			}
		}
		return null;
	}

	@Override
	public User getUser(String email, String password) {
		if (startConection()) {
			try {
				try (PreparedStatement ps = getConnection().prepareStatement(
						"SELECT * FROM " + USERS_TABLE
								+ "WHERE " + "email = ? and password = ? ")) {
					ps.setString(1, email);
					ps.setString(2, password);
					try(ResultSet rs = ps.executeQuery()){
						User user = new User();
						user.setId(rs.getInt(1));
						user.setFirstName(rs.getString(2));
						user.setLastName(rs.getString(3));
						user.setEmail(rs.getString(4));
						user.setUserType(UserType.USER);
						return user;
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			} finally {
				closeConection();
			}
		}
		return null;
	}

	@Override
	public boolean addUser(User user) {
		if (startConection()) {
			try {
				try (PreparedStatement ps = getConnection().prepareStatement(
						"INSERT INTO " + USERS_TABLE
								+ " (first_name, last_name, email, password" 
								+", "+ COLUMN_CREATED_AT+ " )" + " VALUES(?,?,?,?,?)")) {
					ps.setString(1, user.getFirstName());
					ps.setString(2, user.getLastName());
					ps.setString(3, user.getEmail());
					ps.setString(4, user.getPassword());
					DateFormat dateFormat = new SimpleDateFormat(
							"yyyy/MM/dd HH:mm:ss");
					Date date = new Date();
					ps.setString(5, dateFormat.format(date));
					ps.executeUpdate();
					return true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			} finally {
				closeConection();
			}
		}
		return false;
	}
	

	@Override
	public boolean updateUser(User user, String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeUser(String login, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}

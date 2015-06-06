package mallspot.persistance.repository.sql;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import mallspot.model.entity.Mall;
import mallspot.model.entity.User;
import mallspot.persistance.repository.MallRepository;

public class MallRepositorySQL extends DBHelper implements MallRepository {
	

	@Override
	public synchronized boolean addMall(Mall mall, User user) {
		if (startConection()) {
			try {
				try (PreparedStatement ps = getConnection().prepareStatement(
						"INSERT INTO " + MALLS_TABLE
								+ " (NAME, DESCRIPTION, "+ COLUMN_CREATED_BY +", "+ COLUMN_CREATED_AT+ " )"
								+ " VALUES(?,?,?,?)")) {
					ps.setString(1, mall.getName());
					ps.setString(2, mall.getDescription());
					ps.setInt(3, user.getId());
					DateFormat dateFormat = new SimpleDateFormat(
							"yyyy/MM/dd HH:mm:ss");
					Date date = new Date();
					ps.setString(4, dateFormat.format(date));
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
	public synchronized boolean remove(Mall mall) {
		if (startConection()) {
			try {
				try (PreparedStatement ps = getConnection().prepareStatement("DELETE FROM "
						+ MALLS_TABLE + " WHERE ID = ?")){
				ps.setInt(1, mall.getId());
				ps.executeUpdate();	
				return true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}finally{
				closeConection();
			}

		}
		
		return false;
	}

	@Override
	public synchronized boolean updateMall(Mall mall) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public synchronized List<Mall> getAllMalls() {
		// TODO Auto-generated method stub
		return null;
	}

}

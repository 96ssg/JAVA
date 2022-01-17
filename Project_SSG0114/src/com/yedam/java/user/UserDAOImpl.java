package com.yedam.java.user;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.java.book.Book;
import com.yedam.java.common.DAO;

public class UserDAOImpl extends DAO implements UserDAO {
	// 싱글톤

	private static UserDAO instance = new UserDAOImpl();

	private UserDAOImpl() {
	}

	public static UserDAO getInstance() {
		return instance;
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		try {
			connect();
			String insert = "INSERT INTO user VALUES (?,?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getUserId());
			pstmt.setInt(3, user.getUserPassword());
			pstmt.setInt(4, user.getUserRun());
			pstmt.setInt(5, user.getUserRoll());

			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("정상 등록되었습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public void delete(String userName) {
		// TODO Auto-generated method stub
		try {
			connect();
			String delete = "DELETE FROM user WHERE user_name = ? ";
			pstmt = conn.prepareStatement(delete);
			pstmt.setString(1, userName);

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 삭제되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public User selectUserInfo(String userId, int userPassword) {
		User user = null;
		try {
			connect();
			String select = "SELECT * FROM user WHERE user_id = ? AND user_password = ? ";
			pstmt = conn.prepareStatement(select);
			pstmt.setString(1, userId);
			pstmt.setInt(2, userPassword);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				user = new User();
				user.setUserName(rs.getString("user_name"));
				user.setUserId(rs.getString("user_id"));
				user.setUserPassword(rs.getInt("user_password"));
				user.setUserRun(rs.getInt("user_run"));

				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return user;
	}

	@Override
	public void update(User user) {
		
		try {
			connect();
			String update = "UPDATE user SET user_roll = user_roll +1 WHERE user_name = ?";
			pstmt = conn.prepareStatement(update);
			//pstmt.setInt(1, book.getBookRental());
			pstmt.setString(1, user.getUserName());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				
			}else {
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public User selectUser(String userName) {
		User user = null;
		try {
			connect();
			String select = "SELECT * FROM user WHERE user_name = ? ";
			pstmt = conn.prepareStatement(select);
			pstmt.setString(1, userName);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				user = new User();
				user.setUserName(rs.getString("user_name"));
				user.setUserId(rs.getString("user_id"));
				user.setUserPassword(rs.getInt("user_password"));
				user.setUserRun(rs.getInt("user_run"));
				user.setUserRoll(rs.getInt("user_roll"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return user;
	}

	@Override
	public List<User> selectAll() {
		List<User> list = new ArrayList<>();
		try {
			connect();
			String select = "SELECT * FROM user ORDER BY user_roll DESC";
			pstmt = conn.prepareStatement(select);

			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				User user = new User();
				user.setUserName(rs.getString("user_name"));
				user.setUserId(rs.getString("user_id"));
				user.setUserPassword(rs.getInt("user_password"));
				user.setUserRun(rs.getInt("user_run"));
				user.setUserRoll(rs.getInt("user_roll"));
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
}

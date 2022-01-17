package com.yedam.java.notice;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.java.common.DAO;

public class NoticeDAOImpl extends DAO implements NoticeDAO {
	//싱글톤
	private static NoticeDAO instance = new NoticeDAOImpl();
	
	private NoticeDAOImpl() {}
	
	public static NoticeDAO getInstance() {
		return instance;
	}
	@Override
	public void insert(Notice notice) {
		try {
			connect();
			String insert = "INSERT INTO notice VALUES (?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, notice.getStory());
			pstmt.setString(2, notice.getTime());
			

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
	public List<Notice> select() {
		List<Notice> list = new ArrayList<>();
		try {
			connect();
			String select = "SELECT * FROM notice ORDER BY story";
			pstmt = conn.prepareStatement(select);

			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Notice notice = new Notice();
				notice.setStory(rs.getString("story"));
				notice.setTime(rs.getString("time"));
				list.add(notice);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

}

package com.yedam.java.book;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.java.common.DAO;

public class BookDAOImpl extends DAO implements BookDAO {
	//싱글톤
	
	private static BookDAO instance = new BookDAOImpl();
	
	private BookDAOImpl() {}
	
	public static BookDAO getInstance() {
		return instance;
	}
	
	@Override
	public void insertbook(Book bk) {
		// TODO Auto-generated method stub
		try {
			connect();
			String insert = "INSERT INTO book VALUES (?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, bk.getBookName());
			pstmt.setString(2, bk.getBookWriter());
			pstmt.setString(3, bk.getBookContent());
			pstmt.setInt(4, bk.getBookRental());
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 등록되었습니다.");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}

	@Override
	public List<Book> selectAll() {
		List<Book> list = new ArrayList<>();
		try {
			connect();
			String select = "SELECT * FROM book ORDER BY book_name";
			pstmt = conn.prepareStatement(select);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Book bk = new Book();
				bk.setBookName(rs.getString("book_name"));
				bk.setBookWriter(rs.getString("book_writer"));
				bk.setBookContent(rs.getString("book_content"));
				//bk.setBookRental(rs.getInt("book_rental"));

				list.add(bk);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Book selectbook(String bookName) {
		Book bk = null;
		try {
			connect();
			String select = "SELECT * FROM book WHERE book_name = ? ";
			pstmt = conn.prepareStatement(select);
			pstmt.setString(1, bookName);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				bk = new Book();
				
				bk.setBookName(rs.getString("book_name"));
				bk.setBookWriter(rs.getString("book_writer"));
				bk.setBookContent(rs.getString("book_content"));
				//bk.setBookRental(rs.getInt("book_rental"));
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return bk;
	}

	

	@Override
	public Book selectbookInfo(String bookName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book rentalbook(int rental) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}

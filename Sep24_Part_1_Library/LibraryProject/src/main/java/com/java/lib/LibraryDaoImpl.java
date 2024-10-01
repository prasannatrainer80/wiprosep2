package com.java.lib;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;



public class LibraryDaoImpl implements LibraryDao {

	Connection connection;
	PreparedStatement pst;
	
	@Override
	public String createUser(LibUsers libUsers) throws ClassNotFoundException, SQLException  {
		connection = ConnectionHelper.getConnection();
		String encPwd = EncryptPassword.getCode(libUsers.getPassWord());
		String cmd = "Insert into LibUsers(UserName,Password) "
				+ " values(?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, libUsers.getUserName());
		pst.setString(2, encPwd);
		pst.executeUpdate();
		return "User Account Created...";

	}

	@Override
	public int authenticate(LibUsers libUsers) throws SQLException, ClassNotFoundException {
		connection = ConnectionHelper.getConnection();
		String encr=EncryptPassword.getCode(libUsers.getPassWord());
		String cmd = "select count(*) cnt from LibUsers where userName=? AND Password=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, libUsers.getUserName());
		pst.setString(2, encr.trim());
		ResultSet rs = pst.executeQuery();
		rs.next();
		int count = rs.getInt("cnt");
		return count;

	}

	@Override
	public List<Books> searchBooks(String searchType, String searchValue) throws ClassNotFoundException, SQLException {
		String sql;
		boolean isValid=true;
		if(searchType.equals("id")) {
			sql = " SELECT * FROM Books WHERE Id = ? " ;
		} else if(searchType.equals("bookname")) {
			sql = " SELECT * FROM Books WHERE Name = ? " ;
		} else if(searchType.equals("authorname")) {
			sql = " SELECT * FROM Books WHERE Author = ? " ;
		} else if(searchType.equals("dept")) {
			sql = " SELECT * FROM Books WHERE Dept = ? " ;
		}
		else {
			isValid=false;
			sql = " SELECT * FROM Books" ;
		}
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(sql);
		if (isValid==true) {
			pst.setString(1, searchValue);
		} 
		ResultSet rs = pst.executeQuery();
		Books books = null;
		List<Books> booksList = new ArrayList<Books>();
		while(rs.next()) {
			books = new Books();
			books.setId(rs.getInt("id"));
			books.setName(rs.getString("name"));
			books.setAuthor(rs.getString("author"));
			books.setEdition(rs.getString("edition"));
			books.setDept(rs.getString("dept"));
			books.setNoOfBooks(rs.getInt("TotalBooks"));
			booksList.add(books);
		}
		return booksList;

	}

	@Override
	public String issueBook(String bookId,String user) throws ClassNotFoundException, SQLException {
		Date utilDate = new Date();
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into TranBook(UserName,BookId,FromDate) values(?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setInt(2, Integer.parseInt(bookId));
		pst.setDate(3, sqlDate);
		pst.executeUpdate();
		cmd = "Update Books set totalBooks = totalBooks -1 where id = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, Integer.parseInt(bookId));
		pst.executeUpdate();
		return "Book With Id " +bookId + " Issued Successfully...";
	}

	@Override
	public List<TranBook> accountDetails(String user) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd =  "select * from TranBook where UserName = ?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		ResultSet rs = pst.executeQuery();
		TranBook book = null;
		List<TranBook> transList = new ArrayList<TranBook>();
		while(rs.next()) {
			book = new TranBook();
			book.setBookId(rs.getInt("bookID"));
			book.setUserName(rs.getString("UserName"));
			book.setFromDate(rs.getDate("FromDate"));
			transList.add(book);
		}
		return transList;
	}

	public TranBook searchById(String bookId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from TranBook Where  Bookid = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, Integer.parseInt(bookId));
		ResultSet rs = pst.executeQuery();
		TranBook tranBook = null;
		if (rs.next()) {
			tranBook = new TranBook();
			tranBook.setBookId(Integer.parseInt(bookId));
			tranBook.setUserName(rs.getString("userName"));
			tranBook.setFromDate(rs.getDate("FromDate"));
		}
		return tranBook;
	}
	@Override
	public String returnBook(String user, String bookId) throws ClassNotFoundException, SQLException {
		TranBook tbook = searchById(bookId);
		connection = ConnectionHelper.getConnection();
		String cmd = "Update Books set totalBooks = totalBooks +1 where id = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, Integer.parseInt(bookId));
		pst.executeUpdate();
		Date today = new Date();
		java.sql.Date sqlDate = new java.sql.Date(today.getTime());
		cmd = "Insert into TransReturn(UserName,BookId,FromDate,Todate) values(?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setInt(2, Integer.parseInt(bookId));
		pst.setDate(3, tbook.getFromDate());
		pst.setDate(4, sqlDate);
		pst.executeUpdate();
		cmd = "Delete from TranBook where BookId = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, Integer.parseInt(bookId));
		pst.executeUpdate();
		return "Book with Id " +bookId + " Returned Successfully...";
	}

	@Override
	public List<TransReturn> showHistory(String user) throws ClassNotFoundException, SQLException {
		String cmd = "select * from TransReturn Where UserName = ?";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		ResultSet rs = pst.executeQuery();
		TransReturn transReturn = null;
		List<TransReturn> transList = new ArrayList<TransReturn>();
		while(rs.next()) {
			transReturn = new TransReturn();
			transReturn.setBookId(rs.getInt("BookId"));
			transReturn.setUserName(user);
			transReturn.setFromDate(rs.getDate("fromDate"));
			transReturn.setToDate(rs.getDate("toDate"));
			transList.add(transReturn);
		}
		return transList;
	}

}

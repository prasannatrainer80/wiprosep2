package com.java.lib;

import java.sql.SQLException;
import java.util.List;

public interface LibraryDao {
	String createUser(LibUsers libUsers) throws ClassNotFoundException, SQLException;
	int authenticate(LibUsers libUsers) throws SQLException, ClassNotFoundException;
	List<Books> searchBooks(String searchType, String searchValue) throws ClassNotFoundException, SQLException;
	String issueBook(String bookId,String user) throws ClassNotFoundException, SQLException;
	List<TranBook> accountDetails(String user) throws ClassNotFoundException, SQLException;
	String returnBook(String user, String bookId) throws ClassNotFoundException, SQLException;
	List<TransReturn> showHistory(String user) throws ClassNotFoundException, SQLException;
}

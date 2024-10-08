package com.wipro.jsp;

import java.sql.SQLException;

public interface BankDao {

	String createAccount(Bank bank) throws ClassNotFoundException, SQLException;
	Bank searchAccount(int accountNo) throws ClassNotFoundException, SQLException;
	String closeAccount(int accountNo) throws ClassNotFoundException, SQLException;
	String depositAccount(int accountNo, double depositAmount) throws ClassNotFoundException, SQLException;
	String withdrawAccount(int accountNo, double withdrawAmount) throws ClassNotFoundException, SQLException;
}

package com.wipro.jsp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BankDaoImpl implements BankDao {

	PreparedStatement pst;
	Connection connection;
	
	public int generateAccountNo() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select case when max(accountNo) IS NULL THEN 1 "
				+ "else max(accountNo)+1 end accno from bank";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int accno = rs.getInt("accno");
		return accno;
	}
	@Override
	public String createAccount(Bank bank) throws ClassNotFoundException, SQLException {
		int accno = generateAccountNo();
		bank.setAccountNo(accno);
		String cmd = "Insert into Bank(AccountNo, FirstName, LastName, City, State, Amount, CheqFacil,"
				+ "AccountType) values(?,?,?,?,?,?,?,?)";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accno);
		pst.setString(2, bank.getFirstName());
		pst.setString(3, bank.getLastName());
		pst.setString(4, bank.getCity());
		pst.setString(5, bank.getState());
		pst.setDouble(6, bank.getAmount());
		pst.setString(7, bank.getCheqFacil());
		pst.setString(8, bank.getAccountType());
		pst.executeUpdate();
		return "Account Created...";
	}
	@Override
	public Bank searchAccount(int accountNo) throws ClassNotFoundException, SQLException {
		String cmd = "select * from Bank where AccountNo = ?";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		ResultSet rs = pst.executeQuery();
		Bank bank = null;
		if (rs.next()) {
			bank = new Bank();
			bank.setAccountNo(rs.getInt("accountNo"));
			bank.setFirstName(rs.getString("firstName"));
			bank.setLastName(rs.getString("lastName"));
			bank.setCity(rs.getString("city"));
			bank.setState(rs.getString("state"));
			bank.setAmount(rs.getDouble("amount"));
			bank.setCheqFacil(rs.getString("cheqFacil"));
			bank.setAccountType(rs.getString("accountType"));
		}
		return bank;
	}
	@Override
	public String closeAccount(int accountNo) throws ClassNotFoundException, SQLException {
		Bank bank = searchAccount(accountNo);
		if (bank!=null) {
			String cmd = "Update Bank set Status = 'inactive' Where AccountNo = ?";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.executeUpdate();
			return "Account Closed...";
		}
		return "Account No Not Found...";
	}
	@Override
	public String depositAccount(int accountNo, double depositAmount) throws ClassNotFoundException, SQLException {
		Bank bank = searchAccount(accountNo);
		if (bank!=null) {
			String cmd = "Update Bank set Amount = Amount + ? Where AccountNo = ?";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setDouble(1, depositAmount);
			pst.setInt(2, accountNo);
			pst.executeUpdate();
			cmd = "Insert into Trans(AccountNo, TransAmount, TransType) values(?,?,?)";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.setDouble(2, depositAmount);
			pst.setString(3, "C");
			pst.executeUpdate();
			return "Amount Credited To Your Account...";
		}
		return "Account No Not Found...";
	}
	@Override
	public String withdrawAccount(int accountNo, double withdrawAmount) throws ClassNotFoundException, SQLException {
		Bank bank = searchAccount(accountNo);
		if (bank != null) {
			double balance = bank.getAmount();
			if (balance - withdrawAmount > 0) {
				String cmd = "Update Bank set Amount = Amount - ? Where AccountNo = ?";
				connection = ConnectionHelper.getConnection();
				pst = connection.prepareStatement(cmd);
				pst.setDouble(1, withdrawAmount);
				pst.setInt(2, accountNo);
				pst.executeUpdate();
				cmd = "Insert into Trans(AccountNo, TransAmount, TransType) values(?,?,?)";
				pst = connection.prepareStatement(cmd);
				pst.setInt(1, accountNo);
				pst.setDouble(2, withdrawAmount);
				pst.setString(3, "D");
				pst.executeUpdate();
				return "Amount Debited From Your Account...";
			} else {
				return "Insufficient Funds...";
			}
		} else {
			return "Account No Does not Exist...";
		}
	}

}

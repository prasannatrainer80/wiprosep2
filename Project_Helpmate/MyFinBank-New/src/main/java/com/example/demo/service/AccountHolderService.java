package com.example.demo.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.demo.model.AccountHolder;
import com.example.demo.repository.AccountHolderRepository;

@Service
public class AccountHolderService {

	@Autowired
	private AccountHolderRepository accountHolderRepository;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<AccountHolder> showAllAccountDetails() {
		return accountHolderRepository.findAll();
	}
	
	public void saveAccountHolder(AccountHolder accountHolder) throws MessagingException {
		String pwd = accountHolder.getPassWord();
		String encr = EncryptPassword.getCode(pwd);
		accountHolder.setPassWord(encr);
		int accno = generateAccountNo();
		accountHolder.setAccountNo(accno);
		accountHolderRepository.save(accountHolder);
		String body = "Mr/Mrs/Miss " +accountHolder.getLastName() + " Your Account Created and "
				+ " Account No is " +accno;
		MailSend.sendMail(accountHolder.getEmail(), "Your Account Created", body);
	}
	
	public int generateAccountNo() {
		String cmd = "select case when max(Account_No) IS NULL THEN 1 else "
				+ "Max(account_No)+1 end accno from Account_Holder";
	List<Object> list=jdbcTemplate.query(cmd, new RowMapper<Object>() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Object ob = rs.getInt("accno");
				return ob;
			}
		});
	int x = (Integer)list.get(0);
	return x;
	}
}

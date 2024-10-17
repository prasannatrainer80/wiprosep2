package com.example.service;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.model.Users;
import com.example.repo.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository userRepository;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int userLoginCheck(String user, String pwd) {
		String encr= EncryptPassword.getCode(pwd);
		String cmd = "select count(*) cnt from Users where UserName = ? AND Password = ?";
		List<Object> list = jdbcTemplate.query(cmd, new Object[] {user, encr}, new RowMapper<Object>() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Object ob = rs.getInt("cnt");
				return ob;
			}
		});
		int count = (Integer)list.get(0);
		return count;
	}
	
	public String addUser(Users users) throws MessagingException {
		users.setPassword(EncryptPassword.getCode(users.getPassword()));
		userRepository.save(users);
		String body = "Hi Mr/Ms/MRS " +users.getLastName() + " Your Account Created...";
		MailSend.sendMail(users.getEmail(), "Your Account Created....", body);
		return "Mail Send Successfully...";
	}
}


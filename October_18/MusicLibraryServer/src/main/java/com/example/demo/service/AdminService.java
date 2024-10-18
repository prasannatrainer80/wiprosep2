package com.example.demo.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.demo.repo.EncryptPassword;

@Service
public class AdminService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public long count(String adminUser, String adminPassword) {
		String encr = EncryptPassword.getCode(adminPassword);
		String cmd = "select count(*) cnt from admins where admin_username=? AND admin_password=?";
		List<Object> list = jdbcTemplate.query(cmd, new Object[] {adminUser, encr}, new RowMapper<Object>() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Object ob = rs.getObject("cnt");
				return ob;
			}
		});
		Long count = (Long)list.get(0);
		return count;
	}
}

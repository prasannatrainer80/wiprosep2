package com.example.demo.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Customer> showCustomer() {
		return repo.findAll();
	}
	
	public int login(String user, String pwd) {
		String cmd = "select count(*) cnt from Customer WHERE "
				+ " CUS_USERNAME = ? AND CUS_PASSWORD = ?";
		List<Object> cout = jdbcTemplate.query(cmd, new Object[] {user, pwd}, 
				new RowMapper<Object>() {

					@Override
					public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
						int count= rs.getInt("cnt");
						return count;
					}
				});
		int cnt = (Integer)cout.get(0);
		return cnt;
	}
}

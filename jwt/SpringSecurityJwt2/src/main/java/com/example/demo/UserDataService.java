package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDataService implements UserDetailsService {

	
	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private UserDataRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		   Optional<UserData> userDetail = repository.findByName(username);

	        // Converting userDetail to UserDetails
	        return userDetail.map(UserDataDetails::new)
	                .orElseThrow(() -> new UsernameNotFoundException("User not found " + username));
      
	}
	
	public String addUser(UserData userData) {
		userData.setPassword(encoder.encode(userData.getPassword()));
		repository.save(userData);
		return "User Added Successfully...";
	}

}

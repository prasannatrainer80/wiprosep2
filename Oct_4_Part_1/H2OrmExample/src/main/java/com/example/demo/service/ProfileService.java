package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Profile;
import com.example.demo.repo.ProfileRepository;

@Service
public class ProfileService {

	@Autowired
	private ProfileRepository profileRepo;
	
	public List<Profile> getAllProfiles() {
		return profileRepo.findAll();
	}
	
	public Profile getProfileById(Long id) {
		return profileRepo.findById(id).get();
	}
}

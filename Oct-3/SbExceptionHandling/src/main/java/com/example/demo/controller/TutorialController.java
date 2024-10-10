package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Tutorial;
import com.example.demo.repo.TutorialRepository;

@RestController
@RequestMapping("/api")
public class TutorialController {

	@Autowired
	private TutorialRepository tutorialRepository;
	
	 @GetMapping("/tutorials")
	  public List<Tutorial> getAllTutorials() {
		 return  tutorialRepository.findAll();
	 }
	 
	 @GetMapping("/tutorials/{id}")
	  public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") long id) {
	    Tutorial tutorial = tutorialRepository.findById(id)
	        .orElseThrow(() -> new ResourceNotFoundException("Not found Tutorial with id = " + id));

	    return new ResponseEntity<>(tutorial, HttpStatus.OK);
	  }
}

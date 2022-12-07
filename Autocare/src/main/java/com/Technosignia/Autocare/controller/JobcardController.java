package com.Technosignia.Autocare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.Autocare.entity.Jobcard;
import com.Technosignia.Autocare.service.JobcardService;

@RestController
public class JobcardController {
	
	@Autowired
	JobcardService jobcardService;
	
	@PostMapping("/jobcard")
	public Jobcard createJobcard(@RequestBody Jobcard jobcard) {
		return jobcardService.createJobcard(jobcard);
	}
	@GetMapping("/jobcard")
	List<Job>

}

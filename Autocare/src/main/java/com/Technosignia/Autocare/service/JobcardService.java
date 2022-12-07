package com.Technosignia.Autocare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.Autocare.dao.JobcardRepository;
import com.Technosignia.Autocare.entity.Jobcard;

@Service
public class JobcardService {
	
	@Autowired
	JobcardRepository jobcardRepository;
	
	public Jobcard createJobcard(Jobcard jobcard) {
		return jobcardRepository.save(jobcard);
	}

}

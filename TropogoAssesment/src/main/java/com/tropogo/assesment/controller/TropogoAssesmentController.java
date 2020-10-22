package com.tropogo.assesment.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tropogo.assesment.model.Job;
import com.tropogo.assesment.service.JobService;

@RestController
@RequestMapping("/job")
public class TropogoAssesmentController {
	
	@Autowired
	JobService jobService;
	
	@GetMapping("/getAll")
	public List<Job> getAllJobs() {
		return jobService.getAll();
	}

	@PostMapping("/save")
	public @ResponseBody Job saveJob(@RequestBody @Valid Job job) {
		return jobService.save(job);
	}

}

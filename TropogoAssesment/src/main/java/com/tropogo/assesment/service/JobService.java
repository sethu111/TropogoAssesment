package com.tropogo.assesment.service;

import java.util.List;

import com.tropogo.assesment.model.Job;

public interface JobService {

	List<Job> getAll();

	Job save(Job job);

}

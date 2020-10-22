package com.tropogo.assesment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tropogo.assesment.dao.JobDao;
import com.tropogo.assesment.model.Job;

@Service
public class JobServiceImpl implements JobService {
	
	@Autowired
	JobDao jobDao;

	@Override
	public List<Job> getAll() {
		return jobDao.findAll();
	}

	@Override
	public Job save(Job job) {
		return jobDao.save(job);
	}


}

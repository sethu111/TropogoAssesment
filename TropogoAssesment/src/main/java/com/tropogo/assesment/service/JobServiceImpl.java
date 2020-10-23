package com.tropogo.assesment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tropogo.assesment.dao.JobDao;
import com.tropogo.assesment.dao.UserDao;
import com.tropogo.assesment.model.Job;
import com.tropogo.assesment.model.User;

@Service
public class JobServiceImpl implements JobService {
	
	@Autowired
	JobDao jobDao;
	
	@Autowired
	UserDao userDao;

	@Override
	public List<Job> getAll() {
		return jobDao.findAll();
	}

	@Override
	public Job save(Job job) {
		User user = userDao.findById(job.getUser().getUserId()).orElse(null);
		if (user == null) {
			user = userDao.save(job.getUser());
			job.setUser(user);
		}
		return jobDao.save(job);
	}
}

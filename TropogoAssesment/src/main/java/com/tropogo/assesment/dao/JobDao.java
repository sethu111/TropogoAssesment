package com.tropogo.assesment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tropogo.assesment.model.Job;

@Repository
public interface JobDao extends JpaRepository<Job, Long> {

}

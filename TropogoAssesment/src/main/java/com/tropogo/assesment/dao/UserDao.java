package com.tropogo.assesment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tropogo.assesment.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

}

package com.eventease.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventease.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	User findByName(String name);
}

package com.example.User.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.User.domain.User;
@Repository
public interface UsertRepository extends JpaRepository<User, Long> {
	 
}

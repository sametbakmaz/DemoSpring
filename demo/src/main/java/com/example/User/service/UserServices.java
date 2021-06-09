package com.example.User.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.User.domain.User;
import com.example.User.repository.UsertRepository;

@Service
public class UserServices {
	@Autowired
    private UsertRepository repo;
	
	public List<User> listAll() {
        return repo.findAll();
    }
     
    public void save(User std) {
        repo.save(std);
    }
     
    public User get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}

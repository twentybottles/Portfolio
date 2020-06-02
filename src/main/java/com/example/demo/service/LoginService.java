package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

@Service
public class LoginService {

    @Autowired
    private UserRepository repository;

    @Transactional
    public Optional<UserEntity> searchUserInfo(long id) {
		
		return repository.findById(id);
		
	}

    @Transactional
	public UserEntity authentication(String email) {
						
		return repository.findByUsername(email);
	
	}
	
}
package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SignupEntity;
import com.example.demo.repository.SignupRepository;

@Service
public class SignupRegisterService {

    @Autowired
    private SignupRepository repository;
    
    public boolean save(SignupEntity entity) {
        
    	 this.repository.save(entity);
        
        // 登録成功したらtrue or false
        
        return true;
    }
}
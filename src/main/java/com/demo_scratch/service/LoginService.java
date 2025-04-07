package com.demo_scratch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo_scratch.domain.Login;
import com.demo_scratch.repository.LoginRepo;

@Service
public class LoginService {


   @Autowired
   private LoginRepo rep;


   public Login log(String username, String password) {
       Login user = rep.findByUsernameAndPassword(username, password);
       return user;
   }
}

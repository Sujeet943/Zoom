package com.example.bootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootdemo.dto.Account;
import com.example.bootdemo.reposetory.AccountRepository;

@RestController
public class AccountController {
  
	@Autowired
	AccountRepository ar;
	
	
	@PostMapping("/saveaccount")
	
	public String saveAccount(@RequestBody Account a) {
		
		ar.save(a);
		
		return "save ";
	}
	
	@GetMapping("/loginvalid")
	
	public String loginValidation(@RequestBody Account a) {
		
		Account acc=ar.findByEmailAndPassword(a.getEmail(),a.getPassword());
		
		if(acc!=null) {
			
			return "Login Successfully";
		}
		else {
			
			return "Invalid Credentials";
		}
	}
}

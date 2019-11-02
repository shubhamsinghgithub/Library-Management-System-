package com.capgemini.librarymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.librarymanagementsystem.beans.Users;
import com.capgemini.librarymanagementsystem.exceptions.CustomException;
import com.capgemini.librarymanagementsystem.service.LoginService;
import com.capgemini.librarymanagementsystem.service.LoginServiceImpl;

@RestController
@CrossOrigin(origins="*", allowedHeaders = "*")
public class LoginController {
	
	@Autowired
	LoginService service = new LoginServiceImpl();
	
	@PostMapping("/library/login/")
	public Users login(@RequestBody Users users) {
		 Users user = null;
		try {
			user = service.login(users);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return user;
	}// end of login()

}

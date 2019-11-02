package com.capgemini.librarymanagementsystem.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.librarymanagementsystem.beans.Users;
import com.capgemini.librarymanagementsystem.dao.LoginDAO;
import com.capgemini.librarymanagementsystem.exceptions.CustomException;
import com.capgemini.librarymanagementsystem.validation.Validation;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO dao;

	Validation validation = new Validation();

	@Override
	public Users login(Users users) throws CustomException {
		return dao.login(users);

	}// end of login()

}

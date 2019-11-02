package com.capgemini.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.librarymanagementsystem.beans.Users;
import com.capgemini.librarymanagementsystem.dao.AdminDAO;
import com.capgemini.librarymanagementsystem.exceptions.CustomException;
import com.capgemini.librarymanagementsystem.validation.Validation;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDAO dao;
	
	Validation validation = new Validation();
	
	@Override
	public Users addLibrarian(Users users) throws CustomException {
			return dao.addLibrarian(users);
	}// end of addLibrarian()

	@Override
	public Boolean deleteLibrarian(int id) throws CustomException {
		return dao.deleteLibrarian(id);
	}// end of deleteLibrarian()

	@Override
	public List<Users> displayLibrarian() throws CustomException {
		return dao.displayLibrarian();
	}// end of displayLibrarian()

}

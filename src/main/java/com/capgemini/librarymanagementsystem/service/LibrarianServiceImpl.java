package com.capgemini.librarymanagementsystem.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.librarymanagementsystem.beans.BooksInventory;
import com.capgemini.librarymanagementsystem.beans.BooksRegistration;
import com.capgemini.librarymanagementsystem.beans.BooksTransaction;
import com.capgemini.librarymanagementsystem.beans.Users;
import com.capgemini.librarymanagementsystem.dao.LibrarianDAO;
import com.capgemini.librarymanagementsystem.exceptions.CustomException;
import com.capgemini.librarymanagementsystem.validation.Validation;

@Service
public class LibrarianServiceImpl implements LibrarianService {

	@Autowired
	private LibrarianDAO dao ;
	
	Validation validation = new Validation();
	
	@Override
	public Boolean addBooks(BooksInventory booksInventory) throws CustomException {
		return dao.addBooks(booksInventory);
	}// end of addBooks() 

	@Override
	public Boolean deleteBook(int bookId) throws CustomException {
		return dao.deleteBook(bookId);
	}// end of deleteBooks()

	@Override
	public Users registerStudent(Users user) throws CustomException {
			return dao.registerStudent(user);	
	}// end of registerStudent()

	@Override
	public List<BooksInventory> showAllBooks() throws CustomException {
		return dao.showAllBooks();
	}// end of showAllBooks()

	@Override
	public Users getStudentInfo(int id) throws CustomException {
		return dao.getStudentInfo(id);
	}// end of getStudentInfo()

	@Override
	public Boolean deleteStudent(int id) throws CustomException {
		return dao.deleteStudent(id);
	}// end of deleteStudent()

	@Override
	public List<BooksRegistration> viewRequest() throws CustomException {
		return dao.viewRequest();
	}

	@Override
	public Boolean denyRequest(int registrationId) throws CustomException {
		return dao.denyRequest(registrationId);
	}

	@Override
	public BooksTransaction acceptRequest(int registrationId) throws CustomException {
		return dao.acceptRequest(registrationId);
	}

}

package com.capgemini.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.librarymanagementsystem.beans.BooksInventory;
import com.capgemini.librarymanagementsystem.dao.StudentDAO;
import com.capgemini.librarymanagementsystem.dao.StudentDAOImpl;
import com.capgemini.librarymanagementsystem.exceptions.CustomException;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO dao = new StudentDAOImpl();
	
	@Override
	public List<BooksInventory> searchBook(BooksInventory booksInventory) throws CustomException {
		return dao.searchBook(booksInventory);
	}// end of searchBook()
	
	@Override
	public Boolean requestBook(int bookId) throws CustomException {
		return dao.requestBook(bookId);
	}// end of requestBook() 

}

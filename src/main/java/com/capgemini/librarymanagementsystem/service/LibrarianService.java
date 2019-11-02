package com.capgemini.librarymanagementsystem.service;

import java.util.List;

import com.capgemini.librarymanagementsystem.beans.BooksInventory;
import com.capgemini.librarymanagementsystem.beans.BooksRegistration;
import com.capgemini.librarymanagementsystem.beans.BooksTransaction;
import com.capgemini.librarymanagementsystem.beans.Users;
import com.capgemini.librarymanagementsystem.exceptions.CustomException;

public interface LibrarianService {
	
	public Users registerStudent(Users user)throws CustomException;
	public Boolean addBooks(BooksInventory booksInventory) throws CustomException;
	public Boolean deleteBook(int bookId) throws CustomException;
	public List<BooksInventory> showAllBooks() throws CustomException;
	public Users getStudentInfo(int id) throws CustomException;
	public List<BooksRegistration> viewRequest() throws CustomException;
	public Boolean deleteStudent(int id) throws CustomException;
	public BooksTransaction acceptRequest(int registrationId) throws CustomException;
	public Boolean denyRequest(int registrationId) throws CustomException;

}

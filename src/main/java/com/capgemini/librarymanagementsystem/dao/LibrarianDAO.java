package com.capgemini.librarymanagementsystem.dao;

import java.util.List;

import com.capgemini.librarymanagementsystem.beans.BooksInventory;
import com.capgemini.librarymanagementsystem.beans.BooksRegistration;
import com.capgemini.librarymanagementsystem.beans.BooksTransaction;
import com.capgemini.librarymanagementsystem.beans.Users;
import com.capgemini.librarymanagementsystem.exceptions.CustomException;

public interface LibrarianDAO {

	public Users registerStudent(Users user)throws CustomException;
	public Boolean deleteStudent(int id) throws CustomException;
	public Boolean addBooks(BooksInventory booksInventory) throws CustomException;
	public Boolean deleteBook(int bookId) throws CustomException;
	public Users getStudentInfo(int id) throws CustomException;
	public List<BooksRegistration> viewRequest() throws CustomException;
	public BooksTransaction acceptRequest(int registrationId) throws CustomException;
	public Boolean denyRequest(int registrationId) throws CustomException;
//	public BooksTransaction getIssuedBookInfo(int id) throws CustomException;
//	public Boolean returnBook(int id) throws CustomException;
//	public List<BooksTransaction> issuedBooks() throws CustomException;
	public List<BooksInventory> showAllBooks() throws CustomException;

	

	
	
}

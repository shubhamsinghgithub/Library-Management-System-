package com.capgemini.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.librarymanagementsystem.beans.BooksInventory;
import com.capgemini.librarymanagementsystem.beans.BooksRegistration;
import com.capgemini.librarymanagementsystem.beans.BooksTransaction;
import com.capgemini.librarymanagementsystem.beans.Users;
import com.capgemini.librarymanagementsystem.exceptions.CustomException;
import com.capgemini.librarymanagementsystem.service.LibrarianService;
import com.capgemini.librarymanagementsystem.service.LibrarianServiceImpl;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LibrarianController {

	@Autowired
	LibrarianService service = new LibrarianServiceImpl();

	@PostMapping("/library/librarian/user")
	public Users addStudent(@RequestBody Users users) {
		try {
			users = service.registerStudent(users);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return users;
	}// end of addStudent()

	@PostMapping("/library/librarian/create")
	public Boolean addBooks(@RequestBody BooksInventory booksInventory) {
		boolean isAdded = false;
		try {
			service.addBooks(booksInventory);
			isAdded = true;
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return isAdded;
	}// end of addBooks()

	@DeleteMapping("/library/librarian/{bookId}")
	public Boolean deleteBook(@PathVariable("bookId") int bookId) {
		boolean isDeleted = false;
		try {
			service.deleteBook(bookId);
			isDeleted = true;
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return isDeleted;
	}// end of deleteBook()

	@GetMapping("/library/librarian/getBooks")
	public List<BooksInventory> showAllBook() {
		List<BooksInventory> bookList = null;
		try {
			bookList = service.showAllBooks();
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return bookList;
	}// end of showAllBooks()
	
	@GetMapping("/library/librarian/acceptRequest/{id}")
	public BooksTransaction acceptRequest(@PathVariable("id") int registrationId) {
		BooksTransaction bookList =null;
		try {
			bookList = service.acceptRequest(registrationId);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return bookList;
	}// end of acceptRequest()
	
	@GetMapping("/library/librarian/getStudent/{id}")
	public Users getStuentInfo(@PathVariable("id")int id) {
		Users users = null;
		try {
			users = service.getStudentInfo(id);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return users;
	}// end of getStudentInfo()
	
	@DeleteMapping("/library/librarian/denyRequest/{id}")
	public Boolean rejectBook(@PathVariable("id") int id) {
		boolean isDeleted = false;
		try {
			isDeleted = service.denyRequest(id);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return isDeleted;
	}
	
	@DeleteMapping("/library/librarian/deleteStudent/{id}")
	public Boolean deleteStudent(@PathVariable("id") int id) {
		boolean isDeleted = false;
		try {
			isDeleted = service.deleteStudent(id);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return isDeleted;
	}// end of deleteStudent()

	@GetMapping("/library/librarian/viewRequest")
	public List<BooksRegistration> viewRequests() {
		List<BooksRegistration> booksRegistrations = null;
		try {
			booksRegistrations = service.viewRequest();
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return booksRegistrations;
	}// end of viewRequest()
}


//package com.capgemini.librarymanagementsystem;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//
//import com.capgemini.librarymanagementsystem.beans.BooksInventory;
//import com.capgemini.librarymanagementsystem.dao.AdminDaoImpl;
//import com.capgemini.librarymanagementsystem.dao.LibrarianDAOImpl;
//import com.capgemini.librarymanagementsystem.dao.StudentDAOImpl;
//import com.capgemini.librarymanagementsystem.exceptions.CustomException;
//
//public class TestClass {
//	
//	@Test
//	public void deleteLibrarianPass() throws CustomException {
//		AdminDaoImpl adminDaoImplementation = new AdminDaoImpl();
//		boolean expected = adminDaoImplementation.deleteLibrarian(102);
//		assertEquals(expected, true);
//	}
//	
//	@Test
//	public void addBooksPass() throws CustomException {
//		LibrarianDAOImpl librarianDaoImplementation = new LibrarianDAOImpl();
//		BooksInventory booksInventoryBean = new BooksInventory();
//		booksInventoryBean.setBookId(101);
//		booksInventoryBean.setAuthor1("Aisha Choudhury");
//		booksInventoryBean.setAuthor2("Niel Choudhury");
//		booksInventoryBean.setBookName("My Little Epiphanies");
//		booksInventoryBean.setPublisher("T.Deb");
//		booksInventoryBean.setYearOfPublication("2012");
//		boolean isAdded = librarianDaoImplementation.addBooks(booksInventoryBean);
//		assertEquals(isAdded, true);
//		}
//	
//	@Test
//	public void deleteBooksPass() throws CustomException {
//		LibrarianDAOImpl librarianDaoImplementation = new LibrarianDAOImpl();
//		boolean expected = librarianDaoImplementation.deleteBook(4360);
//		assertEquals(expected, true);
//	}
//	
//	@Test
//	public void deleteStudentPass() throws CustomException {
//		LibrarianDAOImpl librarianDaoImplementation = new LibrarianDAOImpl();
//		boolean expected = librarianDaoImplementation.deleteStudent(8856);
//		assertEquals(expected, true);
//	}
//	
//	@Test
//	public void requestBookPass() throws CustomException {
//		StudentDAOImpl studentDaoImplementation = new StudentDAOImpl();
//		boolean expected = studentDaoImplementation.requestBook(101);
//		assertEquals(expected, true);
//	}
//
//}
//

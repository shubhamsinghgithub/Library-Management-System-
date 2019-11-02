package com.capgemini.librarymanagementsystem.service;

import java.util.List;

import com.capgemini.librarymanagementsystem.beans.BooksInventory;
import com.capgemini.librarymanagementsystem.exceptions.CustomException;

public interface StudentService {
	
	public List<BooksInventory> searchBook(BooksInventory booksInventory) throws CustomException;
	public Boolean requestBook(int bookId) throws CustomException;
}

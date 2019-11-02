package com.capgemini.librarymanagementsystem.dao;

import java.util.List;

import com.capgemini.librarymanagementsystem.beans.BooksInventory;
import com.capgemini.librarymanagementsystem.exceptions.CustomException;

public interface StudentDAO {

	public List<BooksInventory> searchBook(BooksInventory booksInventory) throws CustomException;
	public Boolean requestBook(int bookId) throws CustomException;
}

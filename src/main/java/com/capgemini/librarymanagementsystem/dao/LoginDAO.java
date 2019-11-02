package com.capgemini.librarymanagementsystem.dao;

import com.capgemini.librarymanagementsystem.beans.Users;
import com.capgemini.librarymanagementsystem.exceptions.CustomException;

public interface LoginDAO {

	public Users login(Users users) throws CustomException ;
}

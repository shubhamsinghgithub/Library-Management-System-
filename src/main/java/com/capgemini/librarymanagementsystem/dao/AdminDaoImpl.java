package com.capgemini.librarymanagementsystem.dao;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.librarymanagementsystem.beans.Users;
import com.capgemini.librarymanagementsystem.exceptions.CustomException;

@Repository
public class AdminDaoImpl implements AdminDAO {
	
	static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("TestPersistence");
	
	//ADD LIBRARIAN
	@Override
	public Users addLibrarian(Users users) throws CustomException {
		users.setType("Librarian");
		Random random = new Random();
		users.setId(random.nextInt(10000));
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(users);
			manager.getTransaction().commit();
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to Add Librarin");
		}
		return users;
	}// end of addLibrarian()

	//DELETE LIBRARIAN
	@Override
	public Boolean deleteLibrarian(int id) throws CustomException {
		boolean isDeleted = false;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			Users user = manager.find(Users.class, id);
			manager.getTransaction().begin();
			manager.remove(user);
			manager.getTransaction().commit();
			isDeleted = true;
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to Delete Librarin");
		}
		return isDeleted;
	}// end of deleteLibrarian()

	//DISPLAY LIBRARIAN
	@Override
	public List<Users> displayLibrarian() throws CustomException {
		List<Users> userList = null;
		 try {
			 EntityManager manager = FACTORY.createEntityManager();
			TypedQuery<Users> typedQuery = manager.createQuery("FROM Users WHERE type = 'Librarian'", Users.class);
			 userList = typedQuery.getResultList();
		} catch (Exception e) {
			throw new CustomException("No Data Found");
		}
		return userList;
	}// end of displayLibrarian()

}

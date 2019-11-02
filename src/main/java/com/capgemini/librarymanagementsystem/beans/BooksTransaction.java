package com.capgemini.librarymanagementsystem.beans;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books_transaction")
public class BooksTransaction {
	
	@Id
	@Column
	private int transactionId;
	@Column
	private int registrationId;
	@Column
	private LocalDate issueDate;
	@Column
	private LocalDate returnDate;
	@Column
	private double fine;

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}

	@Override
	public String toString() {
		return "BooksTransaction [transactionId=" + transactionId + ", registrationId=" + registrationId
				+ ", issueDate=" + issueDate + ", returnDate=" + returnDate + ", fine=" + fine + "]";
	}
	
	

}

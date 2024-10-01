package com.java.lib;

import java.sql.Date;

public class TransReturn {

	private String userName;
	private int bookId;
	private Date fromDate;
	private Date toDate;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public TransReturn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransReturn(String userName, int bookId, Date fromDate, Date toDate) {
		super();
		this.userName = userName;
		this.bookId = bookId;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}
	
	
}

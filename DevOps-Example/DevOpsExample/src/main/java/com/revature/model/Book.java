package com.revature.model;

public class Book {
	
	private String title;
	private String author;
	private String pubYear;
	
	public Book(String title, String author, String pubYear) {
		super();
		this.title = title;
		this.author = author;
		this.pubYear = pubYear;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubYear() {
		return pubYear;
	}

	public void setPubYear(String pubYear) {
		this.pubYear = pubYear;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pubYear=" + pubYear + "]";
	}
	
	
	

}

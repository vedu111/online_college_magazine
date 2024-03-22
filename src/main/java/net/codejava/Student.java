package net.codejava;



import java.util.Date;

import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;

@Entity
public class Student {
	
	@javax.persistence.Id
	private Integer Id;
	private String author;
	private String mail;
	private String article;
	private String title;
	
	
	public Student() {
		
	}
	public Student(Integer id, String author, String mail, String article, 
			String title) {
		super();
		Id = id;
		this.author = author;
		this.mail = mail;
		this.article = article;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", author=" + author + ", mail=" + mail + ", "
				+ "article=" + article + ", title=" + title + "]";
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String department) {
		this.mail = department;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}



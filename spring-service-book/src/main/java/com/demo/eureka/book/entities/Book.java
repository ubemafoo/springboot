package com.demo.eureka.book.entities;

import java.io.Serializable;

import lombok.Data;

@Data
public class Book{

	private int id;
	private String name;
	private String url;
	
	public Book(int id, String name, String url) {
		this.id = id;
		this.name = name;
		this.url = url;
	}
	
}

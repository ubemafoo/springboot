package com.demo.eureka.bookshelf.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.eureka.bookshelf.entities.Bookshelf;

@RestController
@RequestMapping("/")
public class BookshelfController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment env;
	
	@RequestMapping("/")
	public String home() {
		
		return "Hello from Bookshelf Service at port: " + env.getProperty("local.server.port");
	}
  
	@RequestMapping("/{id}")
	public Bookshelf getBookshelf(@PathVariable final int id) {

		Bookshelf bookshelf = new Bookshelf();
		bookshelf.setId(id);
		
		List<Object> books = restTemplate.getForObject("http://localhost:8200/images/", List.class);
		bookshelf.setImages(books);
	
		return bookshelf;
	}
	

	@RequestMapping("/admin")
	public String homeAdmin() {
		return "Hello from the admin area of Bookshelf service running at port: " + env.getProperty("local.server.port");
	}

}

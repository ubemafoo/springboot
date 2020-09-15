package com.demo.eureka.book.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.eureka.book.entities.Book;


@RestController
@RequestMapping("/")
public class BookController {
	@Autowired
	private Environment env;

	@RequestMapping("/images")
	public List<Book> getImages() {
		
		List<Book> images = Arrays.asList(
				new Book(1, "Treehouse of Horror V", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
				new Book(2, "The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"),
				new Book(3, "The Last Traction Hero", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112"));
		
		return images;
	}

}

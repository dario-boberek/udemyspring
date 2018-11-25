package com.in28minutes.springboot.basics.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//i21c: nowa klasa (nie wygenerowana z https://start.spring.io/)
@RestController
public class BooksController {
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		Book ranga_karanam = new Book(1l, "Mastering Spring 5.2", "Ranga Karanam");
		ranga_karanam.getAuthor(); //i21c: lombok works after addinm maven dependancy.
		return Arrays.asList(ranga_karanam);
	}
}
package com.in28minutes.springboot.basics.springbootin10steps;

import lombok.Getter;

//i21c: nowa klasa (nie wygenerowana z https://start.spring.io/)
@Getter
public class Book {
	long id;
	String name;
	String author;

	public Book(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return String.format("Book [id=%s, name=%s, author=%s]", id, name, author);
	}

}

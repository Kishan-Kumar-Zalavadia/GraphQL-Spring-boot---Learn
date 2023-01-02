package com.graphql.learn;

import com.graphql.learn.Entities.Book;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlSpringProjectApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;
	public static void main(String[] args) {
		SpringApplication.run(GraphqlSpringProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setTitle("Ramayan");
		b1.setDesc("This is Ramayan");
		b1.setPages(2000);
		b1.setPrice(5000);
		b1.setAuthor("Valmiki");

		Book b2 = new Book();
		b2.setTitle("Mahabharat");
		b2.setDesc("This is Mahabharat");
		b2.setPages(2100);
		b2.setPrice(6000);
		b2.setAuthor("Vyasa");

		this.bookService.create(b1);
		this.bookService.create(b2);
	}
}
package com.springboot.Fourth.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Fourth.Entities.Book;
import com.springboot.Fourth.Services.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	/*
	 * public List<Book> getBooks() { return this.bookService.getAllBooks(); }
	 */
	public ResponseEntity<List<Book>> getBooks() {
		List<Book> list = bookService.getAllBooks();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}

	@GetMapping("/books/{id}")
	/*
	 * public Book getBook(@PathVariable("id") int id) { return
	 * bookService.getBookById(id); }
	 */
	public ResponseEntity<Book> getBook(@PathVariable("id") int id) {
		Book book = bookService.getBookById(id);
		if (book == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(book));
	}

	@PostMapping("/books")
	/*
	 * public Book addBook(@RequestBody Book book) { Book b =
	 * this.bookService.addBook(book); return b; }
	 */
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		Book b = null;
		try {
			b = this.bookService.addBook(book);
			System.out.println(book);
			return ResponseEntity.of(Optional.of(b));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DeleteMapping("/books/{bookId}")
	/*
	 * public void deleteBook(@PathVariable("bookId") int bookId) {
	 * this.bookService.deleteBookById(bookId); }
	 */
	public ResponseEntity<Void> deleteBook(@PathVariable("bookId") int bookId) {
		try {
			this.bookService.deleteBookById(bookId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@PutMapping("/books/{bookId}")
	/*
	 * public Book updateBook( @RequestBody Book book, @PathVariable("bookId") int
	 * bookId) { this.bookService.updateBook(book,bookId); return book; }
	 */
	public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable("bookId") int bookId) {
		try {
			this.bookService.updateBook(book, bookId);
			return ResponseEntity.ok().body(book);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}

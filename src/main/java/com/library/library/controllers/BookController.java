package com.library.library.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.library.library.models.Book;
import com.library.library.services.BookService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class BookController {
    
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @PostMapping("/books")
    public ResponseEntity<Object> addBook(@RequestBody Book book){
       return bookService.addBook(book); 
    }


}

package com.library.library.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.library.library.models.Book;
import com.library.library.repositories.BookRepository;

@Service
public class BookService {
    
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public ResponseEntity<Object> addBook(Book book){
        bookRepository.save(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

}

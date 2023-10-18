package com.BookPro2.BookProProject2.controllers;

import com.BookPro2.BookProProject2.models.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookpro")
public class BookController {

//    @GetMapping("/books")
//    public ResponseEntity<List<Book>> getBooks(){
//
//    }

//    @GetMapping
//    @PathVariable("/books/{id}")
//    public Book bookDetail(@PathVariable int id){
//
//    }

    @PostMapping("/books/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getDescription());
        System.out.println(book.getIsbn());
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

}
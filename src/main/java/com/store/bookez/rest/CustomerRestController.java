package com.store.bookez.rest;

import com.store.bookez.domain.Book;
import com.store.bookez.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by deretayl1 on 5/4/2016.
 */
@RestController
public class CustomerRestController {

    private BookRepository bookRepository;

    @Autowired
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @RequestMapping (value = "/book/info/{id}")
    public Book getBookInfo(@PathVariable Integer id){
        return bookRepository.findOne(id);
    }
}

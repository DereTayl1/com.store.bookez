package com.store.bookez.bootstrap;

import com.store.bookez.domain.Book;
import com.store.bookez.domain.enums.BookRating;
import com.store.bookez.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by deretayl1 on 5/3/2016.
 */
@Component
public class SeedData implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private BookService bookService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

    }


}
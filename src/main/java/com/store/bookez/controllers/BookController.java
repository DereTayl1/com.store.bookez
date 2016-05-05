package com.store.bookez.controllers;

import com.store.bookez.domain.Book;
import com.store.bookez.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by deretayl1 on 5/3/2016.
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/customer")
    public String getCustomerHome() {
        return "customer/customerHome";
    }

    @RequestMapping(value = "/customer/books")
    public String getCustomerBooks(Model model) {
        model.addAttribute("bookList", bookService.BookListAll());
        return "customer/customer_books";
    }

    @RequestMapping(value = "/customer/pages/{pageNumber}", method = RequestMethod.GET)
    public String getRunbookPage(@PathVariable Integer pageNumber, Model model) {
        Page<Book> page = bookService.getBookPages(pageNumber);

        int current = page.getNumber() + 1;
        int begin = Math.max(1, current - 5);
        int end = Math.min(begin + 10, page.getTotalPages());

        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("bookList", page.getContent());
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);

        return "customer/customer_books";
    }
}

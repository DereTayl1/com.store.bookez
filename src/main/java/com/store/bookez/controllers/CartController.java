package com.store.bookez.controllers;

import com.store.bookez.common.LoginHelper;
import com.store.bookez.domain.Book;
import com.store.bookez.domain.BookOrder;
import com.store.bookez.domain.Cart;
import com.store.bookez.domain.Customer;
import com.store.bookez.services.BookService;
import com.store.bookez.services.CartService;
import com.store.bookez.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deretayl1 on 5/10/2016.
 */
@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private BookService bookService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "customer/addtocart/{id}", method = RequestMethod.POST)
    public String addToCart(@RequestParam Integer id, Model model) {
        //// TODO: 5/11/2016 Create a find Cart by customer.
        //LOOKUP CART BY CUSTOMER
        //IF CART IS NOT EQUAL TO NULL
        //ADD THE BOOK TO THE CART BY GETTING BOOK BY ID AND ADDING IT TO CART
        //ELSE CREATE A NEW CART AND ADD THE BOOK

//        //CREATE BOOK ORDER
//        Customer bookOrder = new BookOrder();
//
//        String username = LoginHelper.getUserName(model);
//
//        bookOrder.setCustomer(customerService.findByUserName(username));
//
//        //CREATE A BOOK LIST
//        List<Book> books = new ArrayList<>();
//        //GET BOOK BY ID
//        //SET THAT BOOK INTO THE BOOK LIST
//        //SET IT AS THE BOOK LIST FOR THE BOOK ORDER
//        Book book = bookService.getBookById(id);
//        books.add(book);
//        bookOrder.setBooks(books);
//
//        //CREATE A NEW CART
//        //SAVE THE BOOK ORDER INTO THE CART
//        Cart cart = new Cart();
//        cart.setCustomer(bookOrder);
//
//        cartService.saveCart(cart);
//
//        model.addAttribute("cart", cart);
        return "/customer/customer_books";
    }

}

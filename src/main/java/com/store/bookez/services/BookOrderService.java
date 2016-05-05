package com.store.bookez.services;

import com.store.bookez.domain.BookOrder;
import org.springframework.stereotype.Service;

/**
 * Created by deretayl1 on 5/2/2016.
 */
@Service
public interface BookOrderService {
    Iterable<BookOrder> BookOrderListAll();
    BookOrder getBookOrderById(Integer id);
    BookOrder saveBookOrder(BookOrder bookOrder);
    Iterable<BookOrder> saveBookOrderList(Iterable<BookOrder> bookOrderIterable);
    void deleteBookOrder(Integer id);
}

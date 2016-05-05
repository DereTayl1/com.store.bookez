package com.store.bookez.repositories;

import com.store.bookez.domain.BookOrder;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by deretayl1 on 5/2/2016.
 */
public interface BookOrderRepository extends CrudRepository<BookOrder, Integer> {
}

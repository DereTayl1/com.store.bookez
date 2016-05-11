package com.store.bookez.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by deretayl1 on 5/10/2016.
 */
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CartId")
    private Integer id;

    @Version
    private Integer version;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Customer customer;

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private List<Book> books;

    private Integer totalBooks;


    // region GET & SET
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Integer getTotalBooks() {
        return totalBooks;
    }

    public void setTotalBooks(Integer totalBooks) {
        this.totalBooks = totalBooks;
    }
    // endregion


}

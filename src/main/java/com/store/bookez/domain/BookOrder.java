package com.store.bookez.domain;

import com.store.bookez.domain.enums.OrderStatus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by deretayl1 on 5/2/2016.
 */
@Entity
public class BookOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OrderId")
    private Integer id;

    @Version
    private Integer version;

    private Date orderDate;
    private Date shipDate;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Customer> customerList;

    @ManyToMany
    private List<Book> books;

    private String orderStatus;
//    private BigDecimal totalPrice;
//    private boolean shipOnline;

    public BookOrder() {}
//    public Order(Date orderDate, Date shipDate, String orderStatus, BigDecimal totalPrice, boolean shipOnline) {
//        this.orderDate = orderDate;
//        this.shipDate = shipDate;
//        this.orderStatus = orderStatus;
////        this.totalPrice = totalPrice;
////        this.shipOnline = shipOnline;
//    }

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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

//    public BigDecimal getTotalPrice() {
//        return totalPrice;
//    }
//
//    public void setTotalPrice(BigDecimal totalPrice) {
//        this.totalPrice = totalPrice;
//    }
//
//    public boolean isShipOnline() {
//        return shipOnline;
//    }
//
//    public void setShipOnline(boolean shipOnline) {
//        this.shipOnline = shipOnline;
//    }
    // endregion

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", version=" + version +
                ", orderDate=" + orderDate +
                ", shipDate=" + shipDate +
                ", customerList=" + customerList +
                ", books=" + books +
                ", orderStatus=" + orderStatus +
//                ", totalPrice=" + totalPrice +
                '}';
    }
}

package model;

import java.util.*;

public class Order {

    private int order_id;
    private Restaurant restaurant;
    private List<MenuItem> ordered_item;
    private Customer customer;
    private double total_amount;
    private OrderStatus status;


    public Order(int order_id, Restaurant restaurant, List<MenuItem> ordered_item, Customer customer, double total_amount, OrderStatus status) {
        this.order_id = order_id;
        this.restaurant = restaurant;
        this.ordered_item = ordered_item;
        this.customer = customer;
        this.total_amount = total_amount;
        this.status = status;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<MenuItem> getOrdered_item() {
        return ordered_item;
    }

    public void setOrdered_item(List<MenuItem> ordered_item) {
        this.ordered_item = ordered_item;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }


    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String toString(){
        return this.order_id+ " " + this.restaurant + " " + this.ordered_item + " " + this.customer + " " + this.total_amount+ " " + this.status;
    }
}

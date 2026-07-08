package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class FoodDeliveryService {

    private List<Customer> customers;
    private List<Restaurant> restaurants;
    private List<MenuItem> menuItems;
    private List<Order> orders;

    public FoodDeliveryService() {
        this.customers = new ArrayList<>();
        this.restaurants = new ArrayList<>();;
        this.menuItems = new ArrayList<>();;
        this.orders = new ArrayList<>();;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
        System.out.println("Customer Added Successfully");
    }

    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }

    public void addMenuItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public Customer findCustomerById(int id){
        for (Customer x : customers) {
            if(x.getId() == id){
                return x;
            }
        }
        return null;
    }

    public Restaurant findRestaurantById(int id){
        for (Restaurant x : restaurants) {
            if(x.getRest_id()==id){
                return x;
            }
        }
        return null;
    }

    public MenuItem findMenuItemById(int id){
        for (MenuItem x : menuItems) {
            if (x.getMenu_id()==id){
                return x;
            }
        }
        return null;
    }

    public Order findOrderById(int orderId) {

        for (Order order : orders) {
            if (order.getOrder_id() == orderId) {
                return order;
            }
        }

        return null;
    }

    public void updateOrderStatus(int orderId, OrderStatus status) {

        Order order = findOrderById(orderId);

        if (order == null) {
            System.out.println("Order Not Found.");
            return;
        }

        order.setStatus(status);

        System.out.println("Order Status Updated Successfully.");
    }



}

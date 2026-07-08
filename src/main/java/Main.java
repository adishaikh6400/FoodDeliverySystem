import model.Customer;
import model.MenuItem;
import model.Order;
import model.Restaurant;
import service.FoodDeliveryService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{

    //*
    static Scanner sc = new Scanner(System.in);
    static FoodDeliveryService service = new FoodDeliveryService();

    public static void display() {
        System.out.println("=================== Food Delivey System ===================");
        System.out.println("1. Add Customer");
        System.out.println("2. Add Restaurant");
        System.out.println("3. Add Menu Items");
        System.out.println("4. place Order");
        System.out.println("5. View Order");
        System.out.println("6. Exit");
    }

    public static void addCustomer(){
        System.out.println("Enter Customer Id:");
        int id = sc.nextInt();
        System.out.println("Enter Customer Name:");
        String name = sc.next();
        System.out.println("Enter Customer phone:");
        String phone = sc.next();
        System.out.println("Enter Customer address:");
        String address = sc.next();

        Customer customer = new Customer(id, name, phone, address);
        service.addCustomer(customer);
    }

    public static void addRestaurant(){
        System.out.println("Enter Restaurant Id:");
        int id = sc.nextInt();
        System.out.println("Enter Restaurant Name:");
        String name = sc.next();
        System.out.println("Enter Restaurant address:");
        String address = sc.next();

        Restaurant restaurant = new Restaurant(id, name, address);
        service.addRestaurant(restaurant);
    }

    public static void addMenuItem(){
        System.out.println("Enter Menu Item Id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Menu Item Name:");
        String name = sc.nextLine();
        System.out.println("Enter Menu Item price:");
        double price = sc.nextDouble();
        System.out.println("Enter Menu Item quantity:");
        int quantity = sc.nextInt();
        MenuItem menuItem = new MenuItem(id, name, price, quantity);
        service.addMenuItem(menuItem);
    }

    public static void placeOrder() {

        System.out.println("Enter Order Id:");
        int orderId = sc.nextInt();

        System.out.println("Enter Customer Id:");
        int customerId = sc.nextInt();

        Customer customer = service.findCustomerById(customerId);

        if (customer == null) {
            System.out.println("Customer Not Found.");
            return;
        }

        System.out.println("Enter Restaurant Id:");
        int restaurantId = sc.nextInt();

        Restaurant restaurant = service.findRestaurantById(restaurantId);

        if (restaurant == null) {
            System.out.println("Restaurant Not Found.");
            return;
        }

        System.out.println("Enter Menu Item Id:");
        int menuItemId = sc.nextInt();

        MenuItem menuItem = service.findMenuItemById(menuItemId);

        if (menuItem == null) {
            System.out.println("Menu Item Not Found.");
            return;
        }

        List<MenuItem> orderedItems = new ArrayList<>();
        orderedItems.add(menuItem);

        double totalAmount = menuItem.getPrice() * menuItem.getQuantity();

        Order order = new Order(
                orderId,
                restaurant,
                orderedItems,
                customer,
                totalAmount
        );

        service.addOrder(order);

        System.out.println("Order Placed Successfully.");
    }

    public static void viewOrder() {

        System.out.println("Enter Order Id:");
        int orderId = sc.nextInt();

        Order order = service.findOrderById(orderId);

        if (order == null) {
            System.out.println("Order Not Found.");
            return;
        }

        System.out.println(order);
    }







    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            display();

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    addRestaurant();
                    break;
                case 3:
                    addMenuItem();
                    break;
                case 4:
                    placeOrder();
                    break;
                case 5:
                    viewOrder();
                    break;
                case 6:
                    running = false;
                    System.out.println("Thank You for using Food Delivery System!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        }


    }

}
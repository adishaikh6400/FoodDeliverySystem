package model;

public class MenuItem {

    private int menu_id;
    private String dish_name;
    private double price;
    private int quantity;

    public MenuItem(int menu_id, String dish_name, double price, int quantity) {
        this.menu_id = menu_id;
        this.dish_name = dish_name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }

    public String getDish_name() {
        return dish_name;
    }

    public void setDish_name(String dish_name) {
        this.dish_name = dish_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return this.menu_id+" "+this.dish_name+" "+this.price+" "+this.quantity;
    }
}

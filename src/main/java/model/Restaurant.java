package model;

public class Restaurant {
    private int rest_id;
    private String rest_name;
    private String address;

    public Restaurant(int rest_id, String rest_name, String address) {
        this.rest_id = rest_id;
        this.rest_name = rest_name;
        this.address = address;
    }

    public int getRest_id() {
        return rest_id;
    }

    public void setRest_id(int rest_id) {
        this.rest_id = rest_id;
    }

    public String getRest_name() {
        return rest_name;
    }

    public void setRest_name(String rest_name) {
        this.rest_name = rest_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.rest_id + " " + this.rest_name + " " + this.address;
    }
}

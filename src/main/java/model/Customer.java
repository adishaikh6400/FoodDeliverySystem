package model;

public class Customer {

    private int cust_id;
    private String cust_name;
    private String cust_phone;
    private String cust_address;

    public Customer(int cust_id, String cust_name, String cust_phone, String cust_address){
        this.cust_id = cust_id;
        this.cust_name = cust_name;
        this.cust_phone = cust_phone;
        this.cust_address = cust_address;
    }

    public int getId(){
        return this.cust_id;
    }

    public void setId(int cust_id){
        this.cust_id = cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_phone() {
        return cust_phone;
    }

    public void setCust_phone(String cust_phone) {
        this.cust_phone = cust_phone;
    }

    public String getCust_address() {
        return cust_address;
    }

    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
    }

    @Override
    public String toString(){
        return this.cust_id+" "+this.cust_name+" "+this.cust_phone+" "+this.cust_address;
    }
}

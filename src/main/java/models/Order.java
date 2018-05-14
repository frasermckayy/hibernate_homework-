package models;

public class Order {

    private double price;
    private String description;
    private int id;

    public Order(double price, String description) {
        this.price = price;
        this.description = description;

    }

    public Order(){

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

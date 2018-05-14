package models;

public class Customer {

    private String firstName;
    private String lastName;
    private int orderNo;
    private int id;

    public Customer(String firstName, String lastName, int orderNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.orderNo = orderNo;
    }

    public Customer(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}




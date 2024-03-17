package com.timbuchalka;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Default name",40000, "default mail");
        System.out.println("empty constructor called");
    }
    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditLimit ){
        this(name, creditLimit, "mymail@gmail.com");
    }

    public String name() {
        return this.name;
    }
    public double creditLimit() {
        return this.creditLimit;
    }
    public String emailAddress() {
        return this.emailAddress;
    }
}

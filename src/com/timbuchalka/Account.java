package com.timbuchalka;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(String number,double balance, String customerName,
                   String customerEmailAddress,String customerPhoneNumber){
    this.number = number;
    this.balance = balance;
    this.customerName = customerName;
    this.customerEmailAddress = customerEmailAddress;
    this.customerPhoneNumber = customerPhoneNumber;
    }
    public Account(String customerName, String customerEmailAddress,String customerPhoneNumber){
        this("889997", 46.4, customerName, customerEmailAddress,customerPhoneNumber);
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of #"+ depositAmount + " made. New balance is #" + this.balance);
    }

    public void withdraw(double withdrawAmount){
        if (this.balance - withdrawAmount < 0){
            System.out.println("Only " + this.balance + " available. Withdraw not processed");
        }else {
            this.balance-= withdrawAmount;
            System.out.println("Withdraw of #" + withdrawAmount + " processed. Remaining balance = #" + this.balance);
        }
    }


    public void setNumber(String number){
        this.number = number;
    }
    public void setBalance(double balance){
        this.balance = balance;

    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setCustomerEmailAddress(String customerEmailAddress){
        this.customerEmailAddress = customerEmailAddress;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public String getNumber(){
        return this.number;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getCustomerEmailAddress() {
        return this.customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

}


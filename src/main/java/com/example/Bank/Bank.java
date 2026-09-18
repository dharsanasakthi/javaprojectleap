package com.example.Bank;

public class Bank {

    private int id;
    private String name;
    private String accountNumber;

    public Bank() {
    }

    public Bank(int id, String name, String accountNumber) {
        this.id = id;
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
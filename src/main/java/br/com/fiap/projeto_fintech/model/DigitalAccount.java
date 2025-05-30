package br.com.fiap.projeto_fintech.model;

public class DigitalAccount {
    private int id;
    private int userId;
    private String name;
    private double balance;

    public DigitalAccount() {
    }

    public DigitalAccount(int userId, String name, double balance) {
        this.userId = userId;
        this.name = name;
        this.balance = balance;
    }

    public DigitalAccount(int id, int userId, String name, double balance) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

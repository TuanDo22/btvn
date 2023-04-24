/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bài3;

/**
 *
 * @author TDZ
 */
public class Account {
    private String username;
    private String password;
    private double amount;

    public Account(String username, String password, double amount) {
        this.username = username;
        this.password = password;
        this.amount = amount;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getAmount() {
        return amount;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" + "username=" + username + ", password=" + password + ", amount=" + amount + '}';
    }
    // ham con lai 
    void withdraw(double withdrawAmount) {
        this.amount = this.amount - withdrawAmount;
        }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;


/**
 *
 * @author andre
 */

public class Transaction implements Serializable{

    private int transaction_id;
    private String type; // deposit, withdrawal, transfer
    private double amount;
    private Date timestamp; 

    private Account account;
      
    private Set<Employee> employees;

    private Admins admin;

    public Transaction() {
    }

    public Transaction(int transaction_id) {
        this.transaction_id = transaction_id;
    }
    
    

    public Transaction(int transaction_id, String type, double amount, Date timestamp, Account account, Set<Employee> employees, Admins admin) {
        this.transaction_id = transaction_id;
        this.type = type;
        this.amount = amount;
        this.timestamp = timestamp;
        this.account = account;
        this.employees = employees;
        this.admin = admin;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Admins getAdmin() {
        return admin;
    }

    public void setAdmin(Admins admin) {
        this.admin = admin;
    }

    
    
}

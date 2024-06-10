/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.Model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author andre
 */

public class Employee implements Serializable{
   

    private int employee_id;
    private String first_name;
    private String last_name;
    private String position;
    private String email;
    private String phone_number;
    
    private Set<Account> accounts = new HashSet<>();
  
    private Set<Transaction> transaction = new HashSet<>();
   
    private Admins admin;

    public Employee() {
    }

    public Employee(int employee_id) {
        this.employee_id = employee_id;
    }
    
    

    public Employee(int employee_id, String first_name, String last_name, String position, String email, String phone_number, Admins admin) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.admin = admin;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public Set<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(Set<Transaction> transaction) {
        this.transaction = transaction;
    }

    public Admins getAdmin() {
        return admin;
    }

    public void setAdmin(Admins admin) {
        this.admin = admin;
    }
    
    
    
}

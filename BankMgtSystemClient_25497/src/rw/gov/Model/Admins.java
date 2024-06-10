/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */

public class Admins implements Serializable{

   private int adm_id; 
   private String username;
   private String password;
   private String role;

   private List<Account> account = new ArrayList<>();
   private List<Transaction> transaction = new ArrayList<>();
   

   private List<Employee> employee = new ArrayList<>();

    public Admins() {
    }

    public Admins(int adm_id) {
        this.adm_id = adm_id;
    }
    

    public Admins(int adm_id, String username, String password, String role) {
        this.adm_id = adm_id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getAdm_id() {
        return adm_id;
    }

    public void setAdm_id(int adm_id) {
        this.adm_id = adm_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
   
   
   
   
}

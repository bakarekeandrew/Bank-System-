/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.Model;

import javax.persistence.*;

/**
 *
 * @author andre
 */
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = customerId);
    private int customer_id;
    private String f_name;
    private String l_name;
    private String email;
    private String phone_number;
    private String address;
    private String gender;
    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;
}

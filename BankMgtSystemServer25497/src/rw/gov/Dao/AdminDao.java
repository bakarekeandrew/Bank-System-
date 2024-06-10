/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.Dao;

import java.util.List;
import rw.gov.Model.Admins;
import org.hibernate.Session;
import rw.gov.Model.Transaction;

/**
 *
 * @author andre
 */
public class AdminDao {
   
    
     public String registerAdmin(Admins admins){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(admins);
            ss.beginTransaction().commit();
            ss.close();
            return "Admin Registered Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
      }
     
      public List<Admins> allTransaction(){
      Session ss = HibernateUtil.getSessionFactory().openSession();
      List<Admins> adminList =ss.createQuery("select adi from Admins adi").list();
      ss.close();
      return adminList;
    }
    
     public String deleteAdmin(Admins admin){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(admin);
            ss.beginTransaction().commit();
            ss.close();
            return "Admin delete Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
       
}
}

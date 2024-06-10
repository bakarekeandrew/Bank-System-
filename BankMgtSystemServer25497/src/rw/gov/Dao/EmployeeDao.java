/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.Dao;

import rw.gov.Model.Account;
import rw.gov.Model.Employee;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author andre
 */
public class EmployeeDao {
     public String registerEmployee(Employee employee){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(employee);
            ss.beginTransaction().commit();
            ss.close();
            return "Employee Registered Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
      }
     
    public String updateEmployee(Employee employee){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(employee);
            ss.beginTransaction().commit();
            ss.close();
            return "Employee update Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
      }
     public String deletemployee(Employee employee){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(employee);
            ss.beginTransaction().commit();
            ss.close();
            return "Employee deleted Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
      }
     
     public List<Employee> allEmployee(){
      Session ss = HibernateUtil.getSessionFactory().openSession();
      List<Employee> employeeList =ss.createQuery("select emp from Employee emp").list();
      ss.close();
      return employeeList;
    }
    
    public Employee getEmployee(Employee employee){
      Session ss = HibernateUtil.getSessionFactory().openSession();
      Employee emp = (Employee)ss.get(Employee.class, employee.getEmployee_id());
      ss.close();
      return emp;
    }
     
}

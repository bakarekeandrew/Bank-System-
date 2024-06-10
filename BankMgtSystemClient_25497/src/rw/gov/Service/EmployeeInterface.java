/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.Service;

import rw.gov.Model.Employee;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author andre
 */
public interface EmployeeInterface extends Remote{
    String registerEmployee(Employee employee) throws RemoteException;
    String updateEmployee(Employee employee) throws RemoteException;
    String deletemployee(Employee employee) throws RemoteException;
    List<Employee> allEmployee() throws RemoteException;
    Employee getEmployee(Employee employee) throws RemoteException;
    
    
}

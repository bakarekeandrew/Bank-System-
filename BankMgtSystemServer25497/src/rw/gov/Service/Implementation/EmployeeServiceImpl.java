/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.Service.Implementation;

import rw.gov.Dao.EmployeeDao;
import rw.gov.Model.Employee;
import rw.gov.Service.EmployeeInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author andre
 */
public class EmployeeServiceImpl extends UnicastRemoteObject implements EmployeeInterface{

    public EmployeeServiceImpl() throws RemoteException{
    }
    EmployeeDao dao = new EmployeeDao();

    @Override
    public String registerEmployee(Employee employee) throws RemoteException {
        return dao.registerEmployee(employee);
    }

    @Override
    public String updateEmployee(Employee employee) throws RemoteException {
        return dao.updateEmployee(employee);
    }

    @Override
    public String deletemployee(Employee employee) throws RemoteException {
        return dao.deletemployee(employee);
    }

    @Override
    public List<Employee> allEmployee() throws RemoteException {
        return dao.allEmployee();
    }

    @Override
    public Employee getEmployee(Employee employee) throws RemoteException {
        return dao.getEmployee(employee);
    }
    
}

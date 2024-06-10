/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.Service.Implementation;

import rw.gov.Dao.AdminDao;
import rw.gov.Model.Admins;
import rw.gov.Service.AdminInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author andre
 */
public class AdminServiceImpl extends UnicastRemoteObject implements AdminInterface{

    public AdminServiceImpl() throws RemoteException{
    }
    AdminDao dao = new AdminDao();

    @Override
    public String registerAdmin(Admins admins) throws RemoteException {
        return dao.registerAdmin(admins);
    }

    @Override
    public List<Admins> allTransaction() throws RemoteException {
       return dao.allTransaction();
    }

    @Override
    public String deleteAdmin(Admins admin) throws RemoteException {
        return dao.deleteAdmin(admin);
    }
    
}

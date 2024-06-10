/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.Service;

import rw.gov.Model.Admins;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author andre
 */
public interface AdminInterface extends Remote{
    
    String registerAdmin(Admins admins) throws RemoteException;
    List<Admins> allTransaction()throws RemoteException;
    String deleteAdmin(Admins admin) throws RemoteException;
}

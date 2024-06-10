/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.Controller;

import rw.gov.Service.Implementation.AccountServiceImpl;
import rw.gov.Service.Implementation.AdminServiceImpl;
import rw.gov.Service.Implementation.EmployeeServiceImpl;
import rw.gov.Service.Implementation.TransactionServiceImpl;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author andre
 */
public class Server extends UnicastRemoteObject {
    
    public Server() throws RemoteException {

    }
    
    public static void main(String[] args) {
      try{  
//          System.setProperty("java.security.policy", "C:\\Users\\andre\\Desktop\\Java.policy.txt");
//          if (System.getSecurityManager() == null) {
//                System.setSecurityManager(new SecurityManager());
//            }
          System.setProperty("java.rmi.server.hostname", "127.0.0.1");
          Registry registry = LocateRegistry.createRegistry(6000);
          registry.rebind("admin", new AdminServiceImpl());
          registry.rebind("account", new AccountServiceImpl());
          registry.rebind("transaction", new TransactionServiceImpl());
          registry.rebind("employee", new EmployeeServiceImpl());

          System.out.println("Server is running on port 6000");
          Thread.currentThread().join();
      }catch(Exception ex){
            ex.printStackTrace();
            
        }
    }
}

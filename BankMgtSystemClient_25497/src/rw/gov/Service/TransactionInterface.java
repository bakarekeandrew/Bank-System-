/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.Service;

import rw.gov.Model.Transaction;    
import rw.gov.Model.Account;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author andre
 */
public interface TransactionInterface  extends Remote{
    String registerTransaction(Transaction transaction) throws RemoteException;
    String updateransaction(Transaction transaction) throws RemoteException;
    String deleteTransaction(Transaction transaction) throws RemoteException;
    List<Transaction> allTransaction() throws RemoteException;
    Transaction getTransaction(Transaction transaction) throws RemoteException;
    List<Transaction> getTransactionsByAccountNumber(int accountNumber) throws RemoteException;
    void deleteTransactionsByAccountNumber(int accountNumber) throws RemoteException;

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.Service;

import rw.gov.Model.Account;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import rw.gov.Model.Transaction;

/**
 *
 * @author andre
 */
public interface AccountInterface extends Remote{
   String autoGenerateAccountId() throws RemoteException;
   String registerAccount(Account account) throws RemoteException;
   String updateAccountAmount(Account account) throws RemoteException;
//   String saveTransaction(Transaction transaction, int accountNumber);
   String deleteAccount(int account) throws RemoteException;
   List<Account> allAccount() throws RemoteException;
   Account getAccount(Account account) throws RemoteException;
   Account getAccountByNumber(int accountNumber) throws RemoteException;
   String deleteAccountByAccountNumber(int accountNumber)throws RemoteException; 
    
}

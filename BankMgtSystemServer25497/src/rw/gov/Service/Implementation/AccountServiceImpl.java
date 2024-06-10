/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.Service.Implementation;

import rw.gov.Dao.AccountDao;
import rw.gov.Model.Account;
import rw.gov.Service.AccountInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import rw.gov.Model.Transaction;

/**
 *
 * @author andre
 */
public class AccountServiceImpl extends UnicastRemoteObject implements AccountInterface{

    public AccountServiceImpl() throws RemoteException{
    }
    
    AccountDao dao = new AccountDao();

    @Override
    public String autoGenerateAccountId() throws RemoteException {
        return dao.autoGenerateAccountId();
    }

    @Override
    public String registerAccount(Account account) throws RemoteException {
        return dao.registerAccount(account);
    }

    @Override
    public String updateAccountAmount(Account account) throws RemoteException {
//        return dao.updateAccount(account);
//            System.out.println("Updating account: " + account.getAccount_nbr());
//            String result = dao.updateAccount(account);
//            System.out.println("Update result: " + result);
//            return result;
              int accountId = account.getAccount_nbr();
              Double newAmount = account.getAmount(); 

              dao.updateAccountAmount(accountId, newAmount); 
              return "Amount Updated successfully.";
    }


    @Override
    public String deleteAccount(String account) throws RemoteException {
        return dao.deleteAccount(account);
    }

    @Override
    public List<Account> allAccount() throws RemoteException {
        return dao.allAccount();
                
    }

    @Override
    public Account getAccount(Account account) throws RemoteException {
        return dao.getAccount(account);
    }
    @Override
    public Account getAccountByNumber(int accountNumber) throws RemoteException {
        return dao.getAccountByNumber(accountNumber);
    }

//    @Override
//    public String saveTransaction(Transaction transaction, int accountNumber) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public String deleteAccountByAccountNumber(int accountNumber) throws RemoteException {
        return dao.deleteAccountByAccountNumber(accountNumber);

    }
    
}

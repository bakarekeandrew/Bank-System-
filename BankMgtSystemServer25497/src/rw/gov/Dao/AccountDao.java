/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.Dao;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.Date;
import rw.gov.Model.Account;
import rw.gov.Model.Transaction;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import rw.gov.Service.Implementation.TransactionServiceImpl;
import rw.gov.Service.TransactionInterface;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;


/**
 *
 * @author andre
 */
//@Service
public class AccountDao {
    
    public String autoGenerateAccountId() {
      try  {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "select max(a.account_nbr) from Account a";
        String maxAccountId =(String) session.createQuery(hql).uniqueResult();
        session.close();

        if (maxAccountId == null) {
            return "AC001";
        }

        Integer id = Integer.parseInt(maxAccountId.substring(2));
        id++;
        maxAccountId = String.format("AC%03d", id);

        return maxAccountId;
    } catch (Exception e) {
        e.printStackTrace();
        return "Server Error";
    }
}
    
    public String registerAccount(Account account){
      try{
        Session ss = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction tr = ss.beginTransaction();
    
        ss.save(account);
        tr.commit();
        ss.close();    
        
    }catch(Exception ex){
        ex.printStackTrace();
    
    }
    
        return "Data Registered Successfully";
        
    }
    
//     public String updateAccount(Account account){
//      try{
//        Session ss = HibernateUtil.getSessionFactory().openSession();
//        org.hibernate.Transaction tr = ss.beginTransaction();
//        ss.update(account);
//        tr.commit();
//        ss.close(); 
//        
//      }catch(Exception ex){
//        ex.printStackTrace();
//    
//    }
//    return "Data Updated Successfully";
//        
//    }
//    
//     @Autowired
//    private SessionFactory sessionFactory;

public void updateAccountAmount(int accountId, Double newAmount) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction transaction = session.beginTransaction();

        Account accountToUpdate = (Account) session.get(Account.class, accountId);

        
        accountToUpdate.setAmount(newAmount); 

        session.update(accountToUpdate);

        transaction.commit();
        session.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

    public String deleteAccount(String account){
      try{
        Session ss = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction tr = ss.beginTransaction();
        ss.delete(account);
        tr.commit();
        ss.close();   
      
      }catch(Exception ex){
        ex.printStackTrace();
    
    }
    
          return "Data Deleted Successfully";
    }
    
    public List<Account> allAccount(){
      Session ss = HibernateUtil.getSessionFactory().openSession();
      List<Account> accountList =ss.createQuery("select acc from Account acc").list();
      ss.close();
      return accountList;
    }
    
    public Account getAccount(Account account){
      Session ss = HibernateUtil.getSessionFactory().openSession();
      Account acc = (Account)ss.get(Account.class, account.getAccount_nbr());
      ss.close();
      return acc;
    }
  public Account getAccountByNumber(int accountNumber) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    String hql = "FROM Account WHERE account_nbr = :accountNumber";
    Query query = session.createQuery(hql);
    query.setParameter("accountNumber", accountNumber);
    Object result = query.uniqueResult();
    Account account = (Account) result; 
    session.close();
    return account;
}
  
  

    // Method to delete account by account number
    private TransactionInterface transactionService;

    public AccountDao() throws RemoteException {
        this.transactionService = new TransactionServiceImpl();
    }
    public String deleteAccountByAccountNumber(int accountNumber) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction transactionHibernate = session.beginTransaction();

        try {
            // Delete associated transactions first
            transactionService.deleteTransactionsByAccountNumber(accountNumber);

            String hql = "DELETE FROM Account WHERE account_nbr = :accountNumber";
            int result = session.createQuery(hql)
                               .setParameter("accountNumber", accountNumber)
                               .executeUpdate();
            
            transactionHibernate.commit();

            if (result > 0) {
                return "Data Deleted Successfully";
            } else {
                return "Account not found";
            }
        } catch (Exception e) {
            if (transactionHibernate != null) {
                transactionHibernate.rollback();
            }
            e.printStackTrace();
            return "Error deleting account: " + e.getMessage();
        } finally {
            session.close();
        }
    }


}

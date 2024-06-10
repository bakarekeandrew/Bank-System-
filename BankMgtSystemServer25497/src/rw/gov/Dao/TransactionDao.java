/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.Dao;

import rw.gov.Model.Account;
import rw.gov.Model.Transaction;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author andre
 */
public class TransactionDao {
    
     public String registerTransaction(Transaction transaction){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(transaction);
            ss.beginTransaction().commit();
            ss.close();
            return "Transaction Registered Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
      }
     public String updateransaction(Transaction transaction){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(transaction);
            ss.beginTransaction().commit();
            ss.close();
            return "Transaction updated Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
      }

         
     public String deleteTransaction(Transaction transaction){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(transaction);
            ss.beginTransaction().commit();
            ss.close();
            return "Transaction delete Successifully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Server Error";
      }

     public List<Transaction> allTransaction(){
      Session ss = HibernateUtil.getSessionFactory().openSession();
      List<Transaction> transactionList =ss.createQuery("select trans from Transaction trans").list();
      ss.close();
      return transactionList;
    }
    
    public Transaction getTransaction(Transaction transaction){
      Session ss = HibernateUtil.getSessionFactory().openSession();
      Transaction trans = (Transaction)ss.get(Transaction.class, transaction.getTransaction_id());
      ss.close();
      return trans;
    }
    
   public List<Transaction> getTransactionsByAccountNumber(int accountNumber) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM Transaction WHERE account_id = :accountNumber";
        List<Transaction> transactionList = session.createQuery(hql)
                .setParameter("accountNumber", accountNumber)
                .list();
        return transactionList;

}
//   public void deleteTransactionsByAccountNumber(int accountNumber) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//
//        String hql = "DELETE FROM Transaction WHERE account_id = :accountNumber";
//        int deletedCount = session.createQuery(hql)
//                .setParameter("accountNumber", accountNumber)
//                .executeUpdate();
//
//        session.getTransaction().commit();
//    
//   }
   public void deleteTransactionsByAccountNumber(int accountNumber) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction transaction = null;  // Use Hibernate's Transaction type
    
    try {
//        Transaction transaction = session.beginTransaction(); 

        String hql = "DELETE FROM Transaction WHERE account_id = :accountNumber";
        int deletedCount = session.createQuery(hql)
                                  .setParameter("accountNumber", accountNumber)
                                  .executeUpdate();
//        
//        transaction.commit(); 
    } catch (Exception e) {
        
        e.printStackTrace();  
    } finally {
        session.close();  
    }
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.Service.Implementation;

import rw.gov.Dao.TransactionDao;
import rw.gov.Model.Transaction;
import rw.gov.Service.TransactionInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import org.hibernate.Session;
import rw.gov.Dao.HibernateUtil;
//import org.hibernate.Transaction;

/**
 *
 * @author andre
 */
public class TransactionServiceImpl extends UnicastRemoteObject implements TransactionInterface{

    public TransactionServiceImpl() throws RemoteException{
    }
     
    TransactionDao dao = new TransactionDao();
    
    @Override
    public String registerTransaction(Transaction transaction) throws RemoteException {
        return dao.registerTransaction(transaction);
    }

    @Override
    public String updateransaction(Transaction transaction) throws RemoteException {
        return dao.updateransaction(transaction);
    }

    @Override
    public String deleteTransaction(Transaction transaction) throws RemoteException {
        return dao.deleteTransaction(transaction);
    }

    @Override
    public List<Transaction> allTransaction() throws RemoteException {
        return dao.allTransaction();
    }

    @Override
    public Transaction getTransaction(Transaction transaction) throws RemoteException {
        return dao.getTransaction(transaction);
    }

    @Override
    public List<Transaction> getTransactionsByAccountNumber(int accountNumber) throws RemoteException {
       return dao.getTransactionsByAccountNumber(accountNumber);
    }

//    @Override
//    public void deleteTransactionsByAccountNumber(int accountNumber) throws RemoteException {
//       return dao.deleteTransactionsByAccountNumber(accountNumber);
//
//    }

    @Override
    public void deleteTransactionsByAccountNumber(int accountNumber) throws RemoteException {
         Session session = HibernateUtil.getSessionFactory().openSession();

        try {
//            transaction = (Transaction) session.beginTransaction();
            org.hibernate.Transaction transactionHibernate = session.beginTransaction();

            String hql = "DELETE FROM rw.gov.Model.Transaction WHERE account_id = :accountNumber";
            int deletedCount = session.createQuery(hql)
                                      .setParameter("accountNumber", accountNumber)
                                      .executeUpdate();

            transactionHibernate.commit();
        } catch (Exception e) {
             Object transactionHibernate = null;
            if (transactionHibernate != null) {
//                transactionHibernate.rollback();
            }
            e.printStackTrace();
            throw new RemoteException("Error deleting transactions: " + e.getMessage(), e);
        } finally {
            session.close();
        }

    
    }
    
}

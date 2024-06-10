/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.View;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import rw.gov.Model.Account;
import rw.gov.Model.Transaction;
import rw.gov.Service.AccountInterface;
import rw.gov.Service.TransactionInterface;

/**
 *
 * @author andre
 */
public class AdminTransfer extends javax.swing.JInternalFrame {

    /**
     * Creates new form UserHome
     */
    private Timer timer;
    
    public AdminTransfer() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date  = new Date();
        String today = sdf.format(date);
        DateText.setText(today);
        DateText.setEditable(false);
        
        
         receiver.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                startUpdateTimer(); // Changed method name
            }

            public void removeUpdate(DocumentEvent e) {
                startUpdateTimer(); 
            }

            public void changedUpdate(DocumentEvent e) {
               
            }
        });

         
    timer = new Timer(1500, e -> updateReceiverAccount());
        timer.setRepeats(false); 
        timer.setCoalesce(true);
    }
    
    private void startUpdateTimer() { 
        timer.restart(); 
    }
    
    private void updateReceiverAccount() {


    try {
        String receiverAccountNumber = receiver.getText();

        if (receiverAccountNumber.isEmpty()) {
            System.out.println("Woooowww you're Incredible");

            return; 
        }

        int accountNumber = Integer.parseInt(receiverAccountNumber);

        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            AccountInterface intrf = (AccountInterface) registry.lookup("account");

            Account searchUser = intrf.getAccountByNumber(accountNumber);
            if (searchUser != null) {
                receiverAmount.setText(String.valueOf(searchUser.getAmount()));
            } else {
                JOptionPane.showMessageDialog(this, "Account not found", "Error", JOptionPane.ERROR_MESSAGE);
//                JOptionPane.showMessageDialog(this, "yolaa my guy check from here", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error accessing the registry", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Invalid account number format", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        names1Text = new javax.swing.JTextField();
        user1Text = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        DateText = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        acc1Text = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        balance1Text = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        amount1 = new javax.swing.JTextField();
        amount2 = new javax.swing.JTextField();
        totalBtn = new javax.swing.JButton();
        Show = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        receiver = new javax.swing.JTextField();
        receiverAmount = new javax.swing.JTextField();
        showText = new javax.swing.JTextField();
        transferBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setPreferredSize(new java.awt.Dimension(610, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cash Transfer");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 25));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("User :");

        jLabel6.setText("Names :");

        names1Text.setEditable(false);
        names1Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                names1TextActionPerformed(evt);
            }
        });

        jLabel8.setText("Date :");

        DateText.setEditable(false);

        searchBtn.setBackground(new java.awt.Color(102, 0, 102));
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel9.setText("Account No :");

        acc1Text.setEditable(false);

        jLabel10.setText("Available Balance ;");

        balance1Text.setEditable(false);

        jLabel11.setText("Transfer");

        amount2.setEditable(false);

        totalBtn.setText("Total");
        totalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBtnActionPerformed(evt);
            }
        });

        Show.setText("Show");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });

        jLabel7.setText("Credit Account:");

        transferBtn.setBackground(new java.awt.Color(102, 0, 102));
        transferBtn.setForeground(new java.awt.Color(255, 255, 255));
        transferBtn.setText("Transfer");
        transferBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(user1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acc1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(names1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(balance1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(receiver, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amount1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Show))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(amount2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(transferBtn)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(receiverAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(showText, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(DateText, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(245, 245, 245)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalBtn)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtn))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user1Text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(names1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(acc1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(balance1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalBtn)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(receiver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receiverAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Show)
                    .addComponent(transferBtn))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 410, 410));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rw/gov/View/bankbg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 660, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
         try {
        int accountNumber;
        try {
          accountNumber = Integer.parseInt(user1Text.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid account number format.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
        AccountInterface intrf = (AccountInterface) registry.lookup("account");
        

        Account searchUser = intrf.getAccountByNumber(accountNumber);
        if (searchUser != null) {
            names1Text.setText(searchUser.getFirst_name() + " " + searchUser.getLast_name());
            acc1Text.setText(String.valueOf(searchUser.getAccount_nbr()));
            balance1Text.setText(String.valueOf(searchUser.getAmount()));

        } else {
            JOptionPane.showMessageDialog(this, "Account not found", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    }//GEN-LAST:event_searchBtnActionPerformed

    private void totalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBtnActionPerformed
        // TODO add your handling code here:
         try {

            int accountNbr = Integer.parseInt(user1Text.getText());
            Double secondAmount = Double.parseDouble(amount1.getText());
            Double currentAmount = Double.parseDouble(balance1Text.getText());
    
            Double newAmount = currentAmount - secondAmount;
            
            amount2.setText(newAmount.toString());

            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input format", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_totalBtnActionPerformed

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
        // TODO add your handling code here:
        Double transferAmount = Double.parseDouble(receiverAmount.getText());
        Double newAmount = Double.parseDouble(amount1.getText());
        
        Double cal = transferAmount + newAmount;
        showText.setText(String.valueOf(cal));
   
    }//GEN-LAST:event_ShowActionPerformed

    private void names1TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_names1TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_names1TextActionPerformed

    private void transferBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferBtnActionPerformed
        // TODO add your handling code here:
      try {
    
        Double transferAmount = Double.parseDouble(amount1.getText());
        int senderAccountNumber = Integer.parseInt(acc1Text.getText());
        int receiverAccountNumber = Integer.parseInt(receiver.getText());
        
        
         Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
         AccountInterface acc = (AccountInterface) reg.lookup("account");
         TransactionInterface tx = (TransactionInterface) reg.lookup("transaction");

         
         
         //this is for the user of account
         Account searchUser = acc.getAccountByNumber(senderAccountNumber);
         int userAccount = searchUser.getAccount_nbr();
         Double userAmount = searchUser.getAmount();
         Double userRemainingAmount = userAmount - transferAmount;
         
         //set it in the database now
         
         Account account = new Account();
         account.setAccount_nbr(userAccount);
         account.setAmount(userRemainingAmount);
         
         
         //this is for reciever of the amount
         
         Account searchReciever= acc.getAccountByNumber(receiverAccountNumber);

         if(searchReciever != null){
             int recieverAccount = searchReciever.getAccount_nbr();
             Double recieverAmount = searchReciever.getAmount();   
             Double recieverRemainingAmount = recieverAmount + transferAmount;

             //set it in the database now

             Account theAccount = new Account();
             theAccount.setAccount_nbr(recieverAccount);
             theAccount.setAmount(recieverRemainingAmount);



             String feedback = acc.updateAccountAmount(theAccount);
             String feedback2 = acc.updateAccountAmount(account);
             
             Account accountt = acc.getAccountByNumber(senderAccountNumber); 
             
             Transaction transaction = new Transaction();
             transaction.setAccount(accountt); 
             transaction.setAmount(transferAmount);
             transaction.setType("Transfer");
             transaction.setTimestamp(new Date());
             String txFeedback = tx.registerTransaction(transaction);
             
             //also message for receiver account
             
             Account receiverAccount = acc.getAccountByNumber(receiverAccountNumber); 
             
             Transaction recieverTransaction = new Transaction();
             recieverTransaction.setAccount(receiverAccount); 
             recieverTransaction.setAmount(transferAmount);
             recieverTransaction.setType("recieved");
             recieverTransaction.setTimestamp(new Date());
             String recieverFeedback = tx.registerTransaction(recieverTransaction);
      
             clearFields();  
//                 
             if (feedback.equalsIgnoreCase("Amount Updated successfully.")){
                   JOptionPane.showMessageDialog(this, "Transfer successful!!", "Feedback", JOptionPane.INFORMATION_MESSAGE);
                   clearFields();  
                 
             }else{
                   JOptionPane.showMessageDialog(this, feedback, "Error", JOptionPane.ERROR_MESSAGE);
                 }
        }else{
            JOptionPane.showMessageDialog(this, "Account does not exist", "Feedback", JOptionPane.INFORMATION_MESSAGE);
         }
      }catch(Exception e){
        e.printStackTrace();
      } 
            
       

    }//GEN-LAST:event_transferBtnActionPerformed

       private void clearFields() {
        amount1.setText("");
        amount2.setText("");
        acc1Text.setText("");
        receiver.setText("");
        user1Text.setText("");
        balance1Text.setText("");
        receiverAmount.setText("");
        names1Text.setText("");
        showText.setText("");
    }
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DateText;
    private javax.swing.JButton Show;
    private javax.swing.JTextField acc1Text;
    private javax.swing.JTextField amount1;
    private javax.swing.JTextField amount2;
    private javax.swing.JTextField balance1Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField names1Text;
    private javax.swing.JTextField receiver;
    private javax.swing.JTextField receiverAmount;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField showText;
    private javax.swing.JButton totalBtn;
    private javax.swing.JButton transferBtn;
    private javax.swing.JTextField user1Text;
    // End of variables declaration//GEN-END:variables
}

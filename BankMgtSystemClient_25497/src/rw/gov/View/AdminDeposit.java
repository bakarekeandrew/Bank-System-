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
import javax.swing.plaf.basic.BasicInternalFrameUI;
import rw.gov.Model.Account;
import rw.gov.Model.Transaction;
import rw.gov.Service.AccountInterface;
import rw.gov.Service.TransactionInterface;

/**
 *
 * @author andre
 */
public class AdminDeposit extends javax.swing.JInternalFrame {

    /**
     * Creates new form UserHome
     */
    
    public AdminDeposit() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date  = new Date();
        String today = sdf.format(date);
        DateText.setText(today);
        DateText.setEditable(false);
        
//        this.accountNumber = accountNumber;
//        
//        youraccount.setText(String.valueOf(accountNumber));

        
        
    }

//    AdminDeposit() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

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
        namesText = new javax.swing.JTextField();
        userText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        DateText = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        accText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        balanceText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        amount1 = new javax.swing.JTextField();
        amount2 = new javax.swing.JTextField();
        totalBtn = new javax.swing.JButton();
        depositText = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setPreferredSize(new java.awt.Dimension(610, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cash Deposit");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 25));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("User :");

        jLabel6.setText("Names :");

        namesText.setEditable(false);

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

        accText.setEditable(false);

        jLabel10.setText("Available Balance ;");

        balanceText.setEditable(false);

        jLabel11.setText("Deposit :");

        amount2.setEditable(false);

        totalBtn.setText("Total");
        totalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBtnActionPerformed(evt);
            }
        });

        depositText.setBackground(new java.awt.Color(102, 0, 102));
        depositText.setForeground(new java.awt.Color(255, 255, 255));
        depositText.setText("Deposit");
        depositText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(DateText, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(193, 193, 193)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(accText)
                                            .addComponent(namesText))
                                        .addGap(144, 144, 144))))
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(amount1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(amount2))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(balanceText, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(depositText, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalBtn)
                                    .addComponent(searchBtn))))))
                .addContainerGap(10, Short.MAX_VALUE))
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
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(accText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(balanceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(amount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(depositText)
                .addGap(29, 29, 29))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 360, 380));

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
            accountNumber = Integer.parseInt(userText.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid account number format.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
        AccountInterface intrf = (AccountInterface) registry.lookup("account");
        

        Account searchUser = intrf.getAccountByNumber(accountNumber);
        if (searchUser != null) {
            namesText.setText(searchUser.getFirst_name() + " " + searchUser.getLast_name());
            accText.setText(String.valueOf(searchUser.getAccount_nbr()));
            balanceText.setText(String.valueOf(searchUser.getAmount()));

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

//            int accountNbr = Integer.parseInt(userText.getText());
            Double currentAmount = Double.parseDouble(balanceText.getText());
            Double secondAmount = Double.parseDouble(amount1.getText());
            
            if(secondAmount != null){
                Double totalAmount = currentAmount + secondAmount;
                amount2.setText(String.valueOf(totalAmount));
            } else {
                JOptionPane.showMessageDialog(this, "Input Amount to deposit", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input format", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_totalBtnActionPerformed

    private void depositTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositTextActionPerformed
        // TODO add your handling code here

        int id = Integer.parseInt(accText.getText());
        Double newAmount = Double.parseDouble(amount2.getText());
        Account theAccount = new Account();
        theAccount.setAccount_nbr(id);
        theAccount.setAmount(newAmount);

        try {
            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
            AccountInterface acc = (AccountInterface) reg.lookup("account");
            TransactionInterface tx = (TransactionInterface) reg.lookup("transaction");

            String feedback = acc.updateAccountAmount(theAccount);
            Double depositAmount = Double.parseDouble(amount1.getText());
            
            Account account = acc.getAccountByNumber(id);
            
            Transaction transaction = new Transaction();
            transaction.setAccount(account); 
            transaction.setAmount(depositAmount);
            transaction.setType("Deposit");
            transaction.setTimestamp(new Date());
            String txFeedback = tx.registerTransaction(transaction);

            if (feedback.equalsIgnoreCase("Amount Updated successfully.")){
                   JOptionPane.showMessageDialog(this, "deposited successful!!", "Feedback", JOptionPane.INFORMATION_MESSAGE);
                   System.out.println("don't know if they are saved in transaction check for your self");
                   clearFields();
                 }
            else{
                   JOptionPane.showMessageDialog(this, feedback, "Error", JOptionPane.ERROR_MESSAGE);
                 }
     
        } catch (Exception e) {
            e.printStackTrace();
        }       
    }//GEN-LAST:event_depositTextActionPerformed

    private void clearFields() {
    userText.setText("");
    amount2.setText("");
    amount1.setText("");
    namesText.setText("");
    balanceText.setText("");
    accText.setText("");
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DateText;
    private javax.swing.JTextField accText;
    private javax.swing.JTextField amount1;
    private javax.swing.JTextField amount2;
    private javax.swing.JTextField balanceText;
    private javax.swing.JButton depositText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField namesText;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton totalBtn;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}

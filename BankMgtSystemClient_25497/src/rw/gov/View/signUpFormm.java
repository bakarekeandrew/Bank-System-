/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.View;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;
import rw.gov.Model.Account;
import rw.gov.Service.AccountInterface;
//sending email
//import java.util.Random;
//import java.util.Properties;
//import javax.mail.*;
//import javax.mail.internet.*;


/**
 *
 * @author andre
 */
public class signUpFormm extends javax.swing.JDialog {

    /**
     * Creates new form LoginForm
     */
    public signUpFormm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
         maleText.setActionCommand("Male");
        femaleText.setActionCommand("Female");
    }
//
//    LoginForm() {
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        maleText = new javax.swing.JRadioButton();
        femaleText = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        telText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        accountTypeText = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        newAccount = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        pinText1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(670, 390));

        jLabel6.setText("First Name :");

        firstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextActionPerformed(evt);
            }
        });

        jLabel7.setText("Last Name :");

        lastNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextActionPerformed(evt);
            }
        });

        jLabel8.setText("Password:");

        confirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordActionPerformed(evt);
            }
        });

        jLabel9.setText("Gender :");

        buttonGroup2.add(maleText);
        maleText.setText("Male");
        maleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleTextActionPerformed(evt);
            }
        });

        buttonGroup2.add(femaleText);
        femaleText.setText("Female");
        femaleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleTextActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(134, 68, 162));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 390));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rw/gov/View/newBankIcon.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BANK MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        jLabel15.setText("Email :");

        jLabel10.setText("Tel No. :");

        telText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telTextActionPerformed(evt);
            }
        });

        jLabel11.setText("Account Type :");

        accountTypeText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Saving", "Checking", " " }));

        jLabel12.setText("Address :");

        newAccount.setBackground(new java.awt.Color(102, 0, 102));
        newAccount.setForeground(new java.awt.Color(255, 255, 255));
        newAccount.setText("Register");
        newAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAccountActionPerformed(evt);
            }
        });

        jLabel14.setText("Confirm Password:");

        pinText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinText1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("SignUp Form");

        jLabel2.setText("Already have an account?");

        login.setForeground(new java.awt.Color(102, 0, 102));
        login.setText("login");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });

        exit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 0, 102));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(82, 82, 82)
                                        .addComponent(pinText1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(firstNameText)
                                            .addComponent(lastNameText)
                                            .addComponent(emailText)
                                            .addComponent(confirmPassword)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(maleText)
                                                .addGap(28, 28, 28)
                                                .addComponent(femaleText))
                                            .addComponent(telText)
                                            .addComponent(accountTypeText, 0, 200, Short.MAX_VALUE)
                                            .addComponent(addressText)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(newAccount)
                                        .addGap(146, 146, 146)))
                                .addGap(43, 43, 43))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(login)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(exit))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(pinText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(femaleText)
                                    .addComponent(maleText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(accountTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(login))
                        .addGap(18, 18, 18)
                        .addComponent(newAccount)
                        .addGap(14, 14, 14))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 710, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextActionPerformed

    private void newAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAccountActionPerformed
        // TODO add your handling code here:
        String firstName = firstNameText.getText();
        String lastName = lastNameText.getText();
        String telNo = telText.getText();
        char[] password1 = pinText1.getPassword();
        char[] password2 = confirmPassword.getPassword();
        String gender = buttonGroup2.getSelection() != null ? buttonGroup2.getSelection().getActionCommand() : null;
        String address = addressText.getText();
        String accountType = accountTypeText.getSelectedItem() != null ? accountTypeText.getSelectedItem().toString() : null;
//        Date openDate = OpenDateText.getDate();
        String email = emailText.getText();

        if (firstName.isEmpty() || lastName.isEmpty() || telNo.isEmpty() || String.valueOf(password1).isEmpty()
            || String.valueOf(password2).isEmpty() || gender == null || address.isEmpty() || accountType.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required", "Error Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate name fields
        if (firstName.matches("\\d+") || lastName.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "PLEASE don't use numbers, use characters", "Error Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate email
        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$")) {
            JOptionPane.showMessageDialog(null, "PLEASE use appropriate form of email, ex: example@example.com", "Error Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate phone number
        if (!telNo.matches("^\\d{10}$")) {
            JOptionPane.showMessageDialog(null, "PLEASE use appropriate form of number", "Error Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
//        if (!password1.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^\\da-zA-Z]).{8,}$")) {
//            JOptionPane.showMessageDialog(null, "Password must contain lowercase, uppercase, number, and special character", "Error Input", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
        // Check password length

        if (password1.length < 8) {
            JOptionPane.showMessageDialog(null, "Password must be 8 characters or more", "Error Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if passwords match
        
        if (!Arrays.equals(password1, password2)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
         // Generate and send OTP
        send_and_generate otpService = new send_and_generate();
        String generatedOtp = otpService.generateOtp();
        String userEmail = emailText.getText();
        otpService.sendOtp(userEmail, generatedOtp);
        
        // Prompt the user to enter the OTP
        String enteredOtp = JOptionPane.showInputDialog(this, "Enter the OTP sent to your email:", "OTP Verification", JOptionPane.PLAIN_MESSAGE);
        
        // Validate the OTP
        if (!generatedOtp.equals(enteredOtp)) {
            JOptionPane.showMessageDialog(this, "Invalid OTP", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        

        
        try {

            Registry reg=LocateRegistry.getRegistry("127.0.0.1", 6000);
            AccountInterface intrf =  (AccountInterface) reg.lookup("account");
            Account theAccount = new Account();

            
            theAccount.setPin(new String(password1));
            theAccount.setFirst_name(firstName);
            theAccount.setLast_name(lastName);
            theAccount.setGender(gender);
            theAccount.setTelno(telNo);
            theAccount.setAddress(address);
            theAccount.setAccount_type(accountType);
            theAccount.setAmount(Double.parseDouble("0.0"));
            theAccount.setEmail(email);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String today = sdf.format(date);
            java.sql.Date sqlDate = java.sql.Date.valueOf(today);
            theAccount.setOpen_date(sqlDate);
            
            String feedback = intrf.registerAccount(theAccount);

            if(feedback.equalsIgnoreCase("Data Registered Successfully")){
                JOptionPane.showMessageDialog(this, feedback);
                this.dispose();
                openDialog();
            }
            else{
                JOptionPane.showMessageDialog(this, feedback,"Feedback",JOptionPane.ERROR_MESSAGE);
            }

        }catch(Exception ex){
            ex.printStackTrace();

            setVisible(false);
    }//GEN-LAST:event_newAccountActionPerformed
    }
    private void confirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_confirmPasswordActionPerformed

    private void pinText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinText1ActionPerformed

    private void femaleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleTextActionPerformed

    private void maleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleTextActionPerformed

    private void lastNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextActionPerformed

    private void telTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telTextActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        // TODO add your handling code here:
        this.dispose();
        openLoginDialog();
    }//GEN-LAST:event_loginMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(null, "Do you really want to Logout?", "Select", JOptionPane.YES_NO_OPTION); 
        if (confirmation == JOptionPane.YES_OPTION) {
            this.dispose();
                
    }      
    }//GEN-LAST:event_exitMouseClicked

//    private void openAdminDialog(String username, int accountNumber) {
//        AdminPage adminDialog = new AdminPage(new javax.swing.JFrame(), true, username, accountNumber);
//        adminDialog.setVisible(true);
//
//        this.dispose();
//    }
    
//     private void openHomeDialog(String username, int accountNumber) {
//         // Remove all content from the Login_Apps frame
//    
//        Home homeDialog = new Home(new javax.swing.JFrame(), true, username, accountNumber);
//        homeDialog.setVisible(true);
//
//        this.dispose();
    //} 
    private void openDialog() {
         // Remove all content from the Login_Apps frame
    
        LoginPage homeDialog = new LoginPage(new javax.swing.JFrame(), true);
        homeDialog.setVisible(true);

        this.dispose();
    } 
    private void openLoginDialog() {
         // Remove all content from the Login_Apps frame
    
        LoginPage homeDialog = new LoginPage(new javax.swing.JFrame(), true);
        homeDialog.setVisible(true);

        this.dispose();
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signUpFormm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUpFormm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUpFormm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUpFormm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                signUpFormm dialog = new signUpFormm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accountTypeText;
    private javax.swing.JTextField addressText;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel exit;
    private javax.swing.JRadioButton femaleText;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel login;
    private javax.swing.JRadioButton maleText;
    private javax.swing.JButton newAccount;
    private javax.swing.JPasswordField pinText1;
    private javax.swing.JTextField telText;
    // End of variables declaration//GEN-END:variables
}


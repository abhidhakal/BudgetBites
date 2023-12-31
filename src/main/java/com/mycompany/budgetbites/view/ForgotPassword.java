/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.budgetbites.view;

/**
 *
 * @author mohandhakal
 */
public class ForgotPassword extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        forgotPwPanel = new javax.swing.JPanel();
        emailLabel1 = new javax.swing.JLabel();
        oldPwLabel = new javax.swing.JLabel();
        newPwLabel = new javax.swing.JLabel();
        confirmPwLabel = new javax.swing.JLabel();
        emailField1 = new javax.swing.JTextField();
        oldPwField1 = new javax.swing.JPasswordField();
        newPwField1 = new javax.swing.JPasswordField();
        confirmPwField1 = new javax.swing.JPasswordField();
        clearBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        newPwCheckbox = new javax.swing.JCheckBox();
        confirmPwCheckbox = new javax.swing.JCheckBox();
        oldPwCheckbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        forgotPwPanel.setBackground(new java.awt.Color(199, 201, 120));
        forgotPwPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        forgotPwPanel.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        emailLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        emailLabel1.setForeground(new java.awt.Color(90, 0, 0));
        emailLabel1.setText("Your email: ");

        oldPwLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        oldPwLabel.setForeground(new java.awt.Color(90, 0, 0));
        oldPwLabel.setText("Old Password:");

        newPwLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        newPwLabel.setForeground(new java.awt.Color(90, 0, 0));
        newPwLabel.setText("New Password: ");

        confirmPwLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        confirmPwLabel.setForeground(new java.awt.Color(90, 0, 0));
        confirmPwLabel.setText("Confirm Password: ");

        emailField1.setBackground(new java.awt.Color(227, 235, 219));
        emailField1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        emailField1.setForeground(new java.awt.Color(102, 102, 102));
        emailField1.setText("johndoe@gmail.com");
        emailField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        emailField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailField1MouseClicked(evt);
            }
        });

        oldPwField1.setBackground(new java.awt.Color(227, 235, 219));
        oldPwField1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        oldPwField1.setForeground(new java.awt.Color(102, 102, 102));
        oldPwField1.setText("x27M4/q]x\"e6");
        oldPwField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        oldPwField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oldPwField1MouseClicked(evt);
            }
        });

        newPwField1.setBackground(new java.awt.Color(227, 235, 219));
        newPwField1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        newPwField1.setForeground(new java.awt.Color(102, 102, 102));
        newPwField1.setText("x27M4/q]x\"e6");
        newPwField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        newPwField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newPwField1MouseClicked(evt);
            }
        });

        confirmPwField1.setBackground(new java.awt.Color(227, 235, 219));
        confirmPwField1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        confirmPwField1.setForeground(new java.awt.Color(102, 102, 102));
        confirmPwField1.setText("x27M4/q]x\"e6");
        confirmPwField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        confirmPwField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmPwField1MouseClicked(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(255, 107, 0));
        clearBtn.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("CLEAR");
        clearBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBtnMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 107, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CONFIRM");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        newPwCheckbox.setText("See Password");
        newPwCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPwCheckboxActionPerformed(evt);
            }
        });

        confirmPwCheckbox.setText("See Password");
        confirmPwCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPwCheckboxActionPerformed(evt);
            }
        });

        oldPwCheckbox.setText("See Password");
        oldPwCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldPwCheckboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout forgotPwPanelLayout = new javax.swing.GroupLayout(forgotPwPanel);
        forgotPwPanel.setLayout(forgotPwPanelLayout);
        forgotPwPanelLayout.setHorizontalGroup(
            forgotPwPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forgotPwPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(forgotPwPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oldPwLabel)
                    .addComponent(emailLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(forgotPwPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(forgotPwPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(emailField1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                        .addComponent(oldPwField1))
                    .addComponent(oldPwCheckbox))
                .addGap(33, 33, 33)
                .addGroup(forgotPwPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(forgotPwPanelLayout.createSequentialGroup()
                        .addComponent(newPwLabel)
                        .addGap(32, 32, 32)
                        .addGroup(forgotPwPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newPwCheckbox)
                            .addComponent(newPwField1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(forgotPwPanelLayout.createSequentialGroup()
                        .addComponent(confirmPwLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(forgotPwPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmPwCheckbox)
                            .addComponent(confirmPwField1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(forgotPwPanelLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        forgotPwPanelLayout.setVerticalGroup(
            forgotPwPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forgotPwPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(forgotPwPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPwLabel)
                    .addComponent(emailLabel1)
                    .addComponent(emailField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPwField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPwCheckbox)
                .addGap(67, 67, 67)
                .addGroup(forgotPwPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldPwLabel)
                    .addComponent(oldPwField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPwLabel)
                    .addComponent(confirmPwField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(forgotPwPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPwCheckbox)
                    .addComponent(oldPwCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(forgotPwPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(forgotPwPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(forgotPwPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newPwCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPwCheckboxActionPerformed
        if(newPwCheckbox.isSelected()){
            newPwField1.setEchoChar((char)0);
        }
        else{
            newPwField1.setEchoChar('*');
        }
    }//GEN-LAST:event_newPwCheckboxActionPerformed

    private void confirmPwCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPwCheckboxActionPerformed
        if(confirmPwCheckbox.isSelected()){
            confirmPwField1.setEchoChar((char)0);
        }
        else{
            confirmPwField1.setEchoChar('*');
        }
    }//GEN-LAST:event_confirmPwCheckboxActionPerformed

    private void oldPwCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldPwCheckboxActionPerformed
        if(oldPwCheckbox.isSelected()){
            oldPwField1.setEchoChar((char)0);
        }
        else{
            oldPwField1.setEchoChar('*');
        }
    }//GEN-LAST:event_oldPwCheckboxActionPerformed

    private void emailField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailField1MouseClicked
        emailField1.setText("");
    }//GEN-LAST:event_emailField1MouseClicked

    private void newPwField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newPwField1MouseClicked
        newPwField1.setText("");
    }//GEN-LAST:event_newPwField1MouseClicked

    private void confirmPwField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmPwField1MouseClicked
        confirmPwField1.setText("");
    }//GEN-LAST:event_confirmPwField1MouseClicked

    private void oldPwField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oldPwField1MouseClicked
        oldPwField1.setText("");
    }//GEN-LAST:event_oldPwField1MouseClicked

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        emailField1.setText("");
        newPwField1.setText("");
        oldPwField1.setText("");
        confirmPwField1.setText("");
    }//GEN-LAST:event_clearBtnMouseClicked
    
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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JCheckBox confirmPwCheckbox;
    private javax.swing.JPasswordField confirmPwField1;
    private javax.swing.JLabel confirmPwLabel;
    private javax.swing.JTextField emailField1;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JPanel forgotPwPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox newPwCheckbox;
    private javax.swing.JPasswordField newPwField1;
    private javax.swing.JLabel newPwLabel;
    private javax.swing.JCheckBox oldPwCheckbox;
    private javax.swing.JPasswordField oldPwField1;
    private javax.swing.JLabel oldPwLabel;
    // End of variables declaration//GEN-END:variables
}

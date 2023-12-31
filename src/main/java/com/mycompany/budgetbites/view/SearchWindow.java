/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.budgetbites.view;

/**
 *
 * @author mohandhakal
 */
public class SearchWindow extends javax.swing.JFrame {

    /**
     * Creates new form SearchWindow
     */
    public SearchWindow() {
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

        searchMenuNepal = new javax.swing.JPanel();
        dashboardPanel = new javax.swing.JPanel();
        appNameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        profileIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchBarIcon = new javax.swing.JLabel();
        searchIcon = new javax.swing.JLabel();
        searchField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchMenuNepal.setBackground(new java.awt.Color(255, 211, 147));

        dashboardPanel.setBackground(new java.awt.Color(46, 34, 34));

        appNameLabel.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        appNameLabel.setForeground(new java.awt.Color(255, 107, 0));
        appNameLabel.setText("BudgetBites");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Recipes & Menus");

        profileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/budgetbites/profile.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("My Saved Recipes");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Uploaded Recipes");

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(appNameLabel)
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 616, Short.MAX_VALUE)
                .addComponent(profileIcon)
                .addGap(25, 25, 25))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appNameLabel)
                    .addComponent(jLabel1)
                    .addComponent(profileIcon)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        searchBarIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/budgetbites/line.png"))); // NOI18N

        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/budgetbites/search.png"))); // NOI18N

        searchField1.setBackground(new java.awt.Color(255, 211, 147));
        searchField1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        searchField1.setBorder(null);
        searchField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout searchMenuNepalLayout = new javax.swing.GroupLayout(searchMenuNepal);
        searchMenuNepal.setLayout(searchMenuNepalLayout);
        searchMenuNepalLayout.setHorizontalGroup(
            searchMenuNepalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchMenuNepalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(dashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchMenuNepalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchMenuNepalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(searchMenuNepalLayout.createSequentialGroup()
                        .addComponent(searchIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField1))
                    .addComponent(searchBarIcon))
                .addGap(339, 339, 339))
        );
        searchMenuNepalLayout.setVerticalGroup(
            searchMenuNepalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchMenuNepalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(dashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275)
                .addGroup(searchMenuNepalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBarIcon)
                .addContainerGap(369, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchMenuNepal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchMenuNepal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appNameLabel;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel profileIcon;
    private javax.swing.JLabel searchBarIcon;
    private javax.swing.JTextField searchField1;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JPanel searchMenuNepal;
    // End of variables declaration//GEN-END:variables
}

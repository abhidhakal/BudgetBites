/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.budgetbites.view;

import recipes.Breakfast.BreakfastBoard;
import recipes.DessertnSnacks.DessertSnacksBoard;
import recipes.Dinner.DinnerBoard;
import recipes.Lunch.LunchBoard;

/**
 *
 * @author mohandhakal
 */
public class RecipesMenu extends javax.swing.JFrame {

    /**
     * Creates new form RecipesMenu
     */
    public RecipesMenu() {
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

        MenuPanel = new javax.swing.JPanel();
        dashboardSmall = new javax.swing.JPanel();
        appNameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        line2 = new javax.swing.JLabel();
        lunchGo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        brekfastGo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dinnerGo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dessrtSnacksGo = new javax.swing.JPanel();
        snacksGo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        snacksGo1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MenuPanel.setBackground(new java.awt.Color(255, 211, 147));
        MenuPanel.setMaximumSize(new java.awt.Dimension(1250, 725));
        MenuPanel.setMinimumSize(new java.awt.Dimension(1250, 725));

        dashboardSmall.setBackground(new java.awt.Color(46, 34, 34));

        appNameLabel.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        appNameLabel.setForeground(new java.awt.Color(255, 107, 0));
        appNameLabel.setText("BudgetBites");
        appNameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        appNameLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appNameLabelMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 107, 0));
        jLabel2.setText("Recipes & Menus");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("My Saved Recipes");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Uploaded Recipes");

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/search.png"))); // NOI18N
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dashboardSmallLayout = new javax.swing.GroupLayout(dashboardSmall);
        dashboardSmall.setLayout(dashboardSmallLayout);
        dashboardSmallLayout.setHorizontalGroup(
            dashboardSmallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardSmallLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(appNameLabel)
                .addGap(119, 119, 119)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchBtn)
                .addContainerGap())
        );
        dashboardSmallLayout.setVerticalGroup(
            dashboardSmallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardSmallLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dashboardSmallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appNameLabel)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(searchBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("QUICK & EASY RECIPES");

        line2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/budgetbites/line.png"))); // NOI18N

        lunchGo.setBackground(new java.awt.Color(255, 255, 255));
        lunchGo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lunchGo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lunchGoMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Avenir Next", 1, 40)); // NOI18N
        jLabel6.setText("Lunch");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/salad.png"))); // NOI18N

        javax.swing.GroupLayout lunchGoLayout = new javax.swing.GroupLayout(lunchGo);
        lunchGo.setLayout(lunchGoLayout);
        lunchGoLayout.setHorizontalGroup(
            lunchGoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lunchGoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(47, 47, 47)
                .addComponent(jLabel6)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        lunchGoLayout.setVerticalGroup(
            lunchGoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lunchGoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lunchGoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(72, 72, 72))
        );

        brekfastGo.setBackground(new java.awt.Color(255, 255, 255));
        brekfastGo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brekfastGo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brekfastGoMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Avenir Next", 1, 40)); // NOI18N
        jLabel7.setText("Breakfast");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pancake.png"))); // NOI18N

        javax.swing.GroupLayout brekfastGoLayout = new javax.swing.GroupLayout(brekfastGo);
        brekfastGo.setLayout(brekfastGoLayout);
        brekfastGoLayout.setHorizontalGroup(
            brekfastGoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brekfastGoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(47, 47, 47)
                .addComponent(jLabel7)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        brekfastGoLayout.setVerticalGroup(
            brekfastGoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brekfastGoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, brekfastGoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(72, 72, 72))
        );

        dinnerGo.setBackground(new java.awt.Color(255, 255, 255));
        dinnerGo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dinnerGo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dinnerGoMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Avenir Next", 1, 40)); // NOI18N
        jLabel9.setText("Dinner");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btrchicken.png"))); // NOI18N

        javax.swing.GroupLayout dinnerGoLayout = new javax.swing.GroupLayout(dinnerGo);
        dinnerGo.setLayout(dinnerGoLayout);
        dinnerGoLayout.setHorizontalGroup(
            dinnerGoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dinnerGoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(47, 47, 47)
                .addComponent(jLabel9)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        dinnerGoLayout.setVerticalGroup(
            dinnerGoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dinnerGoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dinnerGoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(72, 72, 72))
        );

        dessrtSnacksGo.setBackground(new java.awt.Color(255, 255, 255));
        dessrtSnacksGo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dessrtSnacksGo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dessrtSnacksGoMouseClicked(evt);
            }
        });

        snacksGo.setFont(new java.awt.Font("Avenir Next", 1, 40)); // NOI18N
        snacksGo.setText("Desserts &");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/hotchocolate.png"))); // NOI18N

        snacksGo1.setFont(new java.awt.Font("Avenir Next", 1, 40)); // NOI18N
        snacksGo1.setText("Snacks");

        javax.swing.GroupLayout dessrtSnacksGoLayout = new javax.swing.GroupLayout(dessrtSnacksGo);
        dessrtSnacksGo.setLayout(dessrtSnacksGoLayout);
        dessrtSnacksGoLayout.setHorizontalGroup(
            dessrtSnacksGoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dessrtSnacksGoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(55, 55, 55)
                .addGroup(dessrtSnacksGoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(snacksGo)
                    .addComponent(snacksGo1))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        dessrtSnacksGoLayout.setVerticalGroup(
            dessrtSnacksGoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dessrtSnacksGoLayout.createSequentialGroup()
                .addGroup(dessrtSnacksGoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dessrtSnacksGoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(dessrtSnacksGoLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(snacksGo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(snacksGo1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/line.png"))); // NOI18N

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addComponent(dashboardSmall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(line2)
                        .addGap(261, 261, 261))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(477, 477, 477))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(dinnerGo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dessrtSnacksGo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lunchGo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121))
            .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenuPanelLayout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(brekfastGo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(678, Short.MAX_VALUE)))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(dashboardSmall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(line2)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(lunchGo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dinnerGo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dessrtSnacksGo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
            .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenuPanelLayout.createSequentialGroup()
                    .addGap(195, 195, 195)
                    .addComponent(brekfastGo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(318, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1230, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        SearchWindow go = new SearchWindow();
        go.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_searchBtnMouseClicked

    private void lunchGoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lunchGoMouseClicked
        LunchBoard lb = new LunchBoard();
        lb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lunchGoMouseClicked

    private void brekfastGoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brekfastGoMouseClicked
        BreakfastBoard bb = new BreakfastBoard();
        bb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_brekfastGoMouseClicked

    private void dinnerGoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dinnerGoMouseClicked
        DinnerBoard dnb = new DinnerBoard();
        dnb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dinnerGoMouseClicked

    private void dessrtSnacksGoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dessrtSnacksGoMouseClicked
        DessertSnacksBoard dsb = new DessertSnacksBoard();
        dsb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dessrtSnacksGoMouseClicked

    private void appNameLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appNameLabelMouseClicked
        Dashboard db = new Dashboard();
        db.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_appNameLabelMouseClicked

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
            java.util.logging.Logger.getLogger(RecipesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecipesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecipesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecipesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecipesMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JLabel appNameLabel;
    private javax.swing.JPanel brekfastGo;
    private javax.swing.JPanel dashboardSmall;
    private javax.swing.JPanel dessrtSnacksGo;
    private javax.swing.JPanel dinnerGo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel line2;
    private javax.swing.JPanel lunchGo;
    private javax.swing.JLabel searchBtn;
    private javax.swing.JLabel snacksGo;
    private javax.swing.JLabel snacksGo1;
    // End of variables declaration//GEN-END:variables
}

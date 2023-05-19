/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoframes;


import dashinternal.accountpage;
import dashinternal.customerpage;
import dashinternal.dashboardpage;
import dashinternal.reservepage;
import dashinternal.userpage;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ellan
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
    }
    
        Color enter  = new Color(157, 1, 27);
        Color exit = new Color(255, 173, 32);
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nav = new javax.swing.JPanel();
        account = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        customer = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        reserve = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        reports = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        minimize = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        close = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        dashboardpane = new javax.swing.JDesktopPane();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(255, 173, 32));
        nav.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        account.setBackground(new java.awt.Color(255, 173, 32));
        account.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountMouseExited(evt);
            }
        });
        account.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Account");
        account.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        nav.add(account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 90, 40));

        dashboard.setBackground(new java.awt.Color(255, 173, 32));
        dashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMouseExited(evt);
            }
        });
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dashboard");
        dashboard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        nav.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 90, 40));

        customer.setBackground(new java.awt.Color(255, 173, 32));
        customer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerMouseExited(evt);
            }
        });
        customer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Customer");
        customer.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        nav.add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 90, 40));

        user.setBackground(new java.awt.Color(255, 173, 32));
        user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userMouseExited(evt);
            }
        });
        user.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Users");
        user.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        nav.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 90, 40));

        reserve.setBackground(new java.awt.Color(255, 173, 32));
        reserve.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        reserve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reserveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reserveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reserveMouseExited(evt);
            }
        });
        reserve.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Reservation");
        reserve.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        nav.add(reserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 90, 40));

        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("logout");
        logout.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, 28));

        nav.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 70, 50));

        reports.setBackground(new java.awt.Color(255, 173, 32));
        reports.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsMouseExited(evt);
            }
        });
        reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Reports");
        reports.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        nav.add(reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 90, 40));

        getContentPane().add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 440));

        header.setBackground(new java.awt.Color(255, 173, 32));
        header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setBackground(new java.awt.Color(255, 173, 32));
        minimize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        minimize.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("—");
        minimize.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        header.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, -1, 29));

        close.setBackground(new java.awt.Color(255, 173, 32));
        close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        close.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        close.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        header.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, 29));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 750, 30));

        dashboardpane.setBackground(new java.awt.Color(0, 204, 0));
        dashboardpane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mafiaduck-removebg-preview.png"))); // NOI18N

        dashboardpane.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dashboardpaneLayout = new javax.swing.GroupLayout(dashboardpane);
        dashboardpane.setLayout(dashboardpaneLayout);
        dashboardpaneLayout.setHorizontalGroup(
            dashboardpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardpaneLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        dashboardpaneLayout.setVerticalGroup(
            dashboardpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 404, Short.MAX_VALUE)
        );

        getContentPane().add(dashboardpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 750, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered
        dashboard.setBackground(enter);
    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
        dashboard.setBackground(exit);
    }//GEN-LAST:event_dashboardMouseExited

    private void customerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerMouseEntered
        customer.setBackground(enter);
    }//GEN-LAST:event_customerMouseEntered

    private void customerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerMouseExited
        customer.setBackground(exit);
    }//GEN-LAST:event_customerMouseExited

    private void accountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseEntered
        account.setBackground(enter);
    }//GEN-LAST:event_accountMouseEntered

    private void accountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseExited
       account.setBackground(exit);
    }//GEN-LAST:event_accountMouseExited

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        dashboardpage db = new dashboardpage();
        dashboardpane.add(db).setVisible(true);
    }//GEN-LAST:event_dashboardMouseClicked

    private void customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerMouseClicked
        customerpage cus = new customerpage();
        dashboardpane.add(cus).setVisible(true);
    }//GEN-LAST:event_customerMouseClicked

    private void accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseClicked
        accountpage db = new accountpage();
        dashboardpane.add(db).setVisible(true);
    }//GEN-LAST:event_accountMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
         int x = JOptionPane.showConfirmDialog(null, "Confirm Exit");
        if(x== JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(enter);
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(exit);
    }//GEN-LAST:event_minimizeMouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(enter);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(exit);
    }//GEN-LAST:event_closeMouseExited

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        userpage up = new userpage();
        dashboardpane.add(up).setVisible(true);
    }//GEN-LAST:event_userMouseClicked

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
        user.setBackground(enter);
    }//GEN-LAST:event_userMouseEntered

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
        user.setBackground(exit);
    }//GEN-LAST:event_userMouseExited

    private void reserveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reserveMouseClicked
        reservepage rp = new reservepage();
        dashboardpane.add(rp).setVisible(true);
    }//GEN-LAST:event_reserveMouseClicked

    private void reserveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reserveMouseEntered
        reserve.setBackground(enter);
    }//GEN-LAST:event_reserveMouseEntered

    private void reserveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reserveMouseExited
        reserve.setBackground(exit);
    }//GEN-LAST:event_reserveMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        loginform rf = new loginform();
        this.dispose();
        rf.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void reportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reportsMouseClicked

    private void reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseEntered
        reports.setBackground(enter);
    }//GEN-LAST:event_reportsMouseEntered

    private void reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseExited
        reports.setBackground(exit);
    }//GEN-LAST:event_reportsMouseExited

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel account;
    private javax.swing.JPanel close;
    private javax.swing.JPanel customer;
    private javax.swing.JPanel dashboard;
    public javax.swing.JDesktopPane dashboardpane;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel minimize;
    private javax.swing.JPanel nav;
    private javax.swing.JPanel reports;
    private javax.swing.JPanel reserve;
    private javax.swing.JPanel user;
    // End of variables declaration//GEN-END:variables
}

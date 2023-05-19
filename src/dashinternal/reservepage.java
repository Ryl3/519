package dashinternal;

import config.dbconnector;
import crudInfo.reservationInfo;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ellan
 */
public class reservepage extends javax.swing.JInternalFrame {

    /**
     * Creates new form customerpage
     */
    public reservepage() {
        initComponents();

        displaydata();

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bif = (BasicInternalFrameUI) this.getUI();
        bif.setNorthPane(null);
    }

    public void displaydata() {
        try {
            dbconnector dbc = new dbconnector();
            ResultSet rs = dbc.getdata("SELECT res_id, tbl_reserve.customer_id, tbl_reserve.res_status, tbl_reserve.res_userstatus "
                    + "FROM `tbl_reserve` LEFT JOIN tbl_customer ON tbl_reserve.customer_id = tbl_customer.cus_id");
            reservetable.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Errors" + e.getMessage());
        }
    }

    Color enter = new Color(136, 1, 17);
    Color exit = new Color(157, 1, 27);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        load = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        searchbar = new javax.swing.JTextField();
        find = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservetable = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(157, 1, 27));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        load.setBackground(new java.awt.Color(157, 1, 27));
        load.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 2));
        load.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loadMouseExited(evt);
            }
        });
        load.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Load");
        load.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 30));

        jPanel1.add(load, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 80, 30));

        add.setBackground(new java.awt.Color(157, 1, 27));
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 2));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add");
        add.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 30));

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, 30));

        edit.setBackground(new java.awt.Color(157, 1, 27));
        edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 2));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Edit");
        edit.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 30));

        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 80, 30));

        delete.setBackground(new java.awt.Color(157, 1, 27));
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 2));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Delete");
        delete.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 30));

        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 80, 30));

        searchbar.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jPanel1.add(searchbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 200, 30));

        find.setBackground(new java.awt.Color(157, 1, 27));
        find.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 2));
        find.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                findMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                findMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                findMouseExited(evt);
            }
        });
        find.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Find");
        find.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 30));

        jPanel1.add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 80, 30));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Reservation Page");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 30));

        reservetable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane1.setViewportView(reservetable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 710, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadMouseEntered
        load.setBackground(enter);
    }//GEN-LAST:event_loadMouseEntered

    private void loadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadMouseExited
        load.setBackground(exit);
    }//GEN-LAST:event_loadMouseExited

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(enter);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(exit);
    }//GEN-LAST:event_addMouseExited

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setBackground(enter);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(exit);
    }//GEN-LAST:event_editMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(enter);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(exit);
    }//GEN-LAST:event_deleteMouseExited

    private void findMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findMouseEntered
        find.setBackground(enter);
    }//GEN-LAST:event_findMouseEntered

    private void findMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findMouseExited
        find.setBackground(exit);
    }//GEN-LAST:event_findMouseExited

    private void loadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadMouseClicked
        displaydata();
    }//GEN-LAST:event_loadMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
        reservationInfo ri = new reservationInfo();
        ri.setVisible(true);
        ri.action = "Add";
        ri.Azzaz.setText("Save");
    }//GEN-LAST:event_addMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        int rowindex = reservetable.getSelectedRow();
        if (rowindex < 0) {
            JOptionPane.showMessageDialog(null, "Please Select an Item!");
        } else {
            TableModel model = reservetable.getModel();
            reservationInfo ri = new reservationInfo();
            ri.resid.setText("" + model.getValueAt(rowindex, 0));
            ri.cusid.setText("" + model.getValueAt(rowindex, 1));
            ri.status.setText("" + model.getValueAt(rowindex, 2));
            ri.type.setSelectedItem("" + model.getValueAt(rowindex, 3));
            ri.setVisible(true);
            ri.action = "Edit";
            ri.Azzaz.setText("Update");
            JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            mainFrame.dispose();
        }
    }//GEN-LAST:event_editMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int rowindex = reservetable.getSelectedRow();
        if (rowindex < 0) {
            JOptionPane.showMessageDialog(null, "Please select data first from the table.");
        } else {
            TableModel model = reservetable.getModel();
            Object value = model.getValueAt(rowindex, 0);
            String id = value.toString();
            int a = JOptionPane.showConfirmDialog(null, "Are you sure to Delete ID: " + id);
            if (a == JOptionPane.YES_OPTION) {
                dbconnector dbc = new dbconnector();
                int r_id = Integer.parseInt(id);
                dbc.deletedata(r_id, "tbl_reserve", "res_id");
                displaydata();
            }
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void findMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_findMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JPanel find;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel load;
    private javax.swing.JTable reservetable;
    private javax.swing.JTextField searchbar;
    // End of variables declaration//GEN-END:variables
}

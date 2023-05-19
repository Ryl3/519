package restoframes;

import config.dbconnector;
import config.passhash;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class registrationform extends javax.swing.JFrame {

    public registrationform() {
        initComponents();
    }

    public byte[] imageBytes;
    String path;
    String filename = null;
    String imgPath = null;
    byte[] person_image = null;

    public ImageIcon ResizeImage(String ImagePath, byte[] pic) {
        ImageIcon MyImage = null;
        if (ImagePath != null) {
            MyImage = new ImageIcon(ImagePath);
        } else {
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(imageDisplay.getWidth(), imageDisplay.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    public void displayPicture() {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        chooser.addChoosableFileFilter(filter);
        int result = chooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            imageDisplay.setIcon(ResizeImage(path, null));
            imgPath = path;
            File f = chooser.getSelectedFile();
            filename = selectedFile.getAbsolutePath();
        } else {
            JOptionPane.showMessageDialog(null, "Canceled !");
        }

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image = bos.toByteArray();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    Color enter = new Color(157, 1, 27);
    Color exit = new Color(136, 1, 17);
    Color orange = new Color(255, 105, 0);

    int validation() {
        int result;
        if (regfname.getText().isEmpty() || reglname.getText().isEmpty() || regemail.getText().isEmpty()
                || regusername.getText().isEmpty() || regpassword.getText().isEmpty()) {

            result = 0;
        } else {
            result = 1;
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        regemail = new javax.swing.JTextField();
        regfname = new javax.swing.JTextField();
        regpassword = new javax.swing.JPasswordField();
        signup = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        regusername = new javax.swing.JTextField();
        reglname = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        minimize = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        close = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        imageDisplay = new javax.swing.JLabel();
        avatar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(136, 1, 17));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regemail.setBackground(new java.awt.Color(136, 1, 17));
        regemail.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        regemail.setForeground(new java.awt.Color(240, 240, 240));
        regemail.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 12), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel1.add(regemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 300, -1));

        regfname.setBackground(new java.awt.Color(136, 1, 17));
        regfname.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        regfname.setForeground(new java.awt.Color(240, 240, 240));
        regfname.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 12), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel1.add(regfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, -1));

        regpassword.setBackground(new java.awt.Color(136, 1, 17));
        regpassword.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        regpassword.setForeground(new java.awt.Color(240, 240, 240));
        regpassword.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 12), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel1.add(regpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 300, 40));

        signup.setBackground(new java.awt.Color(157, 1, 27));
        signup.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240)));
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupMouseExited(evt);
            }
        });
        signup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rumehistro");
        signup.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 20));

        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 130, 40));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Sign up.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 30));

        regusername.setBackground(new java.awt.Color(136, 1, 17));
        regusername.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        regusername.setForeground(new java.awt.Color(240, 240, 240));
        regusername.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 12), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel1.add(regusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 300, -1));

        reglname.setBackground(new java.awt.Color(136, 1, 17));
        reglname.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        reglname.setForeground(new java.awt.Color(240, 240, 240));
        reglname.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 12), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel1.add(reglname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 150, -1));

        jPanel2.setBackground(new java.awt.Color(255, 105, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setBackground(new java.awt.Color(255, 105, 0));
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
        minimize.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 20));

        jPanel2.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, 40));

        close.setBackground(new java.awt.Color(255, 105, 0));
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
        close.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 20));

        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, 40));

        imageDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoMakr-4jxK6P.png"))); // NOI18N
        imageDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageDisplayMouseClicked(evt);
            }
        });
        jPanel2.add(imageDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        avatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avatarMouseClicked(evt);
            }
        });
        avatar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Upload Avatar");
        avatar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 280, 30));

        jPanel2.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 280, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 360, 500));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/150cat-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 370, 120, -1));

        jPanel3.setBackground(new java.awt.Color(136, 1, 17));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Already have an account? Pislita ko!");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 300, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseEntered
        signup.setBackground(orange);
    }//GEN-LAST:event_signupMouseEntered

    private void signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseExited
        signup.setBackground(exit);
    }//GEN-LAST:event_signupMouseExited

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked

        String hashedpass = null;
        int check = validation();
        if (check == 1) {
            String pass;
            try {
                MessageDigest md = MessageDigest.getInstance("SHA-256");
                md.update(regpassword.getText().getBytes());
                byte[] byteData = md.digest();
                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < byteData.length; i++) {
                    sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
                }
                hashedpass = sb.toString();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }

            dbconnector dbc = new dbconnector();
            dbc.insertdata("INSERT INTO tbl_user (user_fname, user_lname, user_email, user_username, password, u_image) "
                    + "VALUES ('" + regfname.getText() + "', '" + reglname.getText() + "','" + regemail.getText() + "',"
                    + "'" + regusername.getText() + "','" + hashedpass + "','" + imageDisplay + "')");

            JOptionPane.showMessageDialog(null, "Successfully Registered",
                    "MESSAGE!", JOptionPane.INFORMATION_MESSAGE);
            loginform L = new loginform();
            L.setVisible(true);
            this.dispose();
            
        }
    }//GEN-LAST:event_signupMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(enter);
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(orange);
    }//GEN-LAST:event_minimizeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int x = JOptionPane.showConfirmDialog(null, "Confirm Exit");
        if (x == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(enter);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(orange);
    }//GEN-LAST:event_closeMouseExited

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        loginform lg = new loginform();
        this.dispose();
        lg.setVisible(true);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        jPanel3.setBackground(enter);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(exit);
    }//GEN-LAST:event_jPanel3MouseExited

    private void avatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avatarMouseClicked
        displayPicture();
    }//GEN-LAST:event_avatarMouseClicked

    private void imageDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageDisplayMouseClicked

    }//GEN-LAST:event_imageDisplayMouseClicked

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
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel avatar;
    private javax.swing.JPanel close;
    public javax.swing.JLabel imageDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel minimize;
    private javax.swing.JTextField regemail;
    public javax.swing.JTextField regfname;
    private javax.swing.JTextField reglname;
    private javax.swing.JPasswordField regpassword;
    private javax.swing.JTextField regusername;
    private javax.swing.JPanel signup;
    // End of variables declaration//GEN-END:variables
}

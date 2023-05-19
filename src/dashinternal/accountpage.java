package dashinternal;

import config.dbconnector;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author ellan
 */
public class accountpage extends javax.swing.JInternalFrame {

    /**
     * Creates new form accountpage
     */
    public accountpage() {
        initComponents();

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bif = (BasicInternalFrameUI) this.getUI();
        bif.setNorthPane(null);
    }

    public void displayImage() {

        try {
            dbconnector dbc = new dbconnector();
            ResultSet rst = dbc.getdata("SELECT *  FROM tbl_user WHERE u_image = '" + imageDisplay + "'");
            if (rst.next()) {
                imageDisplay.setIcon(ResizeImage(null, rst.getBytes("u_image")));
                fname.setText(rst.getString("user_fname"));
                lname.setText(rst.getString("user_lname"));
                email.setText(rst.getString("user_email"));
                username.setText(rst.getString("user_username"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "FAILED !");
        }
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

    Color enter = new Color(136, 8, 8);
    Color exit = new Color(74, 4, 4);
    Color plate = new Color(100, 4, 4);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changepp = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        imageDisplay = new javax.swing.JLabel();
        avatar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        updateuser = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        changepp.setBackground(new java.awt.Color(157, 1, 27));
        changepp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        changepp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Account Settings");
        changepp.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ID");
        changepp.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Last Name:");
        changepp.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 100, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Email:");
        changepp.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Username:");
        changepp.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        imageDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/150duckwp.png"))); // NOI18N
        imageDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageDisplayMouseClicked(evt);
            }
        });
        imageDisplay.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                imageDisplayComponentShown(evt);
            }
        });
        changepp.add(imageDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        avatar.setBackground(new java.awt.Color(255, 204, 51));
        avatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avatarMouseClicked(evt);
            }
        });
        avatar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Change Avatar");
        avatar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 30));

        changepp.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 110, 30));

        fname.setBackground(new java.awt.Color(255, 102, 102));
        fname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 255));
        changepp.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 30));

        lname.setEditable(false);
        lname.setBackground(new java.awt.Color(255, 102, 102));
        lname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lname.setForeground(new java.awt.Color(255, 255, 255));
        changepp.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 150, 30));

        email.setBackground(new java.awt.Color(255, 102, 102));
        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        changepp.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 310, 30));

        username.setBackground(new java.awt.Color(255, 102, 102));
        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        changepp.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 310, 30));

        updateuser.setBackground(new java.awt.Color(255, 204, 51));
        updateuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateuserMouseClicked(evt);
            }
        });
        updateuser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Update User Info");
        updateuser.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 30));

        changepp.add(updateuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 130, 30));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("First Name: ");
        changepp.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        id.setEditable(false);
        id.setBackground(new java.awt.Color(255, 102, 102));
        id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        changepp.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 150, 30));

        getContentPane().add(changepp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avatarMouseClicked
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
    }//GEN-LAST:event_avatarMouseClicked

    private void updateuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateuserMouseClicked

    }//GEN-LAST:event_updateuserMouseClicked

    private void imageDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageDisplayMouseClicked
       
      if(){
          
      }  
        
        try {
            dbconnector dbc = new dbconnector();
            ResultSet rst = dbc.getdata("SELECT user_id, u_image, user_fname, user_lname, user_email,  user_username FROM tbl_user");
            if (rst.next()) {
                id.setText(rst.getString("user_id"));
                imageDisplay.setIcon(ResizeImage(null, rst.getBytes("u_image")));
                fname.setText(rst.getString("user_fname"));
                lname.setText(rst.getString("user_lname"));
                email.setText(rst.getString("user_email"));
                username.setText(rst.getString("user_username"));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_imageDisplayMouseClicked

    private void imageDisplayComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_imageDisplayComponentShown

    }//GEN-LAST:event_imageDisplayComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel avatar;
    private javax.swing.JPanel changepp;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField id;
    public javax.swing.JLabel imageDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lname;
    private javax.swing.JPanel updateuser;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}

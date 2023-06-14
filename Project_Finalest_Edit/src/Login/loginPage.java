/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import Admin.AdminPanel;
import javax.swing.ButtonGroup;
import Doctors.connect;
import Doctors.DoctorPanel;
import Doctors.DoctorsCP;
import Receptionist.Appointements;
import Receptionist.ReceptionistCP;
import Receptionist.ReceptionistPanel;
import com.mysql.jdbc.Connection;
import java.beans.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author GaXown
 */
public class loginPage extends javax.swing.JFrame {

    /**
     * Creates new form loginPage
     */
    public loginPage() {
        initComponents();
        //ButtonGroup bg = new ButtonGroup();
        //bg.add(admin_cb);
        //bg.add(doctor_cb);
        //bg.add(recep_cb);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        signInBtn = new javax.swing.JButton();
        usernameField = new textfield.TextField();
        passwordField = new textfield.PasswordField();
        combobox1 = new combobox.Combobox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Welcome.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 370, 150));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/loginpage.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 680, 470));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        signInBtn.setBackground(new java.awt.Color(255, 255, 255));
        signInBtn.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        signInBtn.setForeground(new java.awt.Color(108, 99, 255));
        signInBtn.setText("Sign In");
        signInBtn.setBorder(null);
        signInBtn.setBorderPainted(false);
        signInBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInBtnActionPerformed(evt);
            }
        });

        usernameField.setLabelText("User Name");

        passwordField.setLabelText("Password");

        combobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Doctor", "Receptionist" }));
        combobox1.setLabeText("Login Mode");
        combobox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(signInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(signInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 340, 310));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean isEmpty(String uname, String pass) {
        boolean isempty = false;
        if (uname.equals("") || pass.equals("")) {
            return true;
        }
        return isempty;
    }
    private void signInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInBtnActionPerformed
        // TODO add your handling code here:

        /*AdminPanel obj = new AdminPanel();
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        if (isEmpty(username, password)) {
            JOptionPane.showMessageDialog(null, "Please Fill out all the fields !!!");
        } else {
            Object selected = combobox1.getSelectedItem();
            if (selected.toString().equals("Admin")) {
                System.out.println("heeeeey admin");
                try {
                    
                    Connection c;
                    c = (Connection) connect.connectdb();
                    String querry = "select username,password from admin_info";
                    java.sql.Statement st = c.createStatement();
                    ResultSet rs = st.executeQuery(querry);
                    boolean signup=true;
                    while (rs.next()) {
                        if (username.equals(rs.getString("username")) && password.equals(rs.getString("password")) ) {
                            new AdminPanel().setVisible(true);
                            obj.setResizable(false);
                            dispose();
                            signup = false;
                            break;
                            
                            
                        }
                    }
                    if(signup){
                        JOptionPane.showMessageDialog(null, "username or password incorrect ");
                    }  
                } catch (ClassNotFoundException ex) {
                    System.out.println("class error");
                } catch (SQLException ex) {
                    System.out.println("sql error");
                }
            }
            ////////////////////////////////////////////////////////////////////////////////////////////////////
             if (selected.toString().equals("Doctor")) {
                System.out.println("heeeeey Doctor");
                try {
                    
                    Connection c;
                    c = (Connection) connect.connectdb();
                    String querry = "select username,password from doctor_info";
                    java.sql.Statement st = c.createStatement();
                    ResultSet rs = st.executeQuery(querry);
                    boolean signup=true;
                    while (rs.next()) {
                        if (username.equals(rs.getString("username")) && password.equals(rs.getString("password")) ) {
                            new DoctorPanel().setVisible(true);
                            obj.setResizable(false);
                            dispose();
                            signup=false;
                            break;
                        }
                    }
                    if(signup){
                        JOptionPane.showMessageDialog(null, "username or password incorrect ");
                    }  
                } catch (ClassNotFoundException ex) {
                    System.out.println("class error");
                } catch (SQLException ex) {
                    System.out.println("sql error");
                } 
            }
             /////////////////////////////////////////////////////////////////////////////////////////////////
             
             if (selected.toString().equals("Receptionist")) {
                System.out.println("heeeeey Receptionist");
                try {
                    
                    Connection c;
                    c = (Connection) connect.connectdb();
                    String querry = "select username,password from receptionist_info";
                    java.sql.Statement st = c.createStatement();
                    ResultSet rs = st.executeQuery(querry);
                    boolean signup=true;
                    while (rs.next()) {
                        if (username.equals(rs.getString("username")) && password.equals(rs.getString("password")) ) {
                            new ReceptionistCP().setVisible(true);
                            obj.setResizable(false);
                            dispose();
                            signup=false;
                            break;
                        }
                    }
                    if(signup){
                        JOptionPane.showMessageDialog(null, "username or password incorrect ");
                    }  
                } catch (ClassNotFoundException ex) {
                    System.out.println("class error");
                } catch (SQLException ex) {
                    System.out.println("sql error");
                } 
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }*/
        AdminPanel obj = new AdminPanel();
        System.out.println("SignInBtn Clicked !!!");
        String username = usernameField.getText();
        String password = passwordField.getText();
        if (isEmpty(username, password)) {
            JOptionPane.showMessageDialog(null, "Please Fill out all the fields");
            usernameField.setText("");
            passwordField.setText("");
        } else {
            boolean usernameFound = false;
                boolean passwordVerified = false;
                //boolean emptySelection = true;
            try (
                     Connection c = (Connection) connect.connectdb();  java.sql.Statement st = c.createStatement();) {
                Object selected = combobox1.getSelectedItem();
                if (selected == null) {
                    JOptionPane.showMessageDialog(null, "username or password incorrect ");
                    throw new NullPointerException("Empty Selection !!!");
                }
                String loginMode = (selected != null) ? selected.toString() : "" ;
                String dbTableName = loginMode.equals("Admin") ? "admin_info" : (loginMode.equals("Doctor") ? "doctor_info" : "receptionist_info");
                String querry = "select username,password from " + dbTableName + "; ";
                ResultSet rs = st.executeQuery(querry);
                if (!loginMode.equals("")) {
                    while (rs.next()) {
                        if (username.equals(rs.getString("username"))) {
                            usernameFound = true;
                            if (password.equals(rs.getString("password"))) {
                                passwordVerified = true;
                            }
                        }
                    }
                }
                System.out.println("login Mode: " + loginMode);
                if (usernameFound) {
                    if (passwordVerified) {
                        switch (loginMode) {
                            case "Admin" -> {
                                AdminPanel adminP = new AdminPanel();
                                adminP.setVisible(true);
                                adminP.setResizable(false);
                            }
                            case "Doctor" -> {
                                DoctorPanel doctorP = new DoctorPanel();
                                doctorP.setVisible(true);
                                doctorP.setResizable(false);
                            }
                            default -> {
                                ReceptionistCP receptionistP = new ReceptionistCP();
                                receptionistP.setVisible(true);
                                receptionistP.setResizable(false);
                            }
                        }
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Password");

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Ivalid Username");
                }
            } catch (ClassNotFoundException ex) {
                System.out.println("class error");
            } catch (SQLException ex) {
                System.out.println("sql error");
            }
        }

        //obj.setVisible(true);
        //obj.setResizable(false);
        //dispose();
    }//GEN-LAST:event_signInBtnActionPerformed

    private void combobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private combobox.Combobox combobox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private textfield.PasswordField passwordField;
    private javax.swing.JButton signInBtn;
    private textfield.TextField usernameField;
    // End of variables declaration//GEN-END:variables
}

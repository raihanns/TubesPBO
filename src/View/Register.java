package View;


import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }
    
    public JButton getBtnback() {
        return btnbacksignin;
    }
    public JButton getBtnSubmit() {
        return btnsign;
    }

    public JTextField getTfNIK() {
        return tfnik;
    }

    public JTextField getTfName() {
        return tfnama;
    }

    public JPasswordField getTfPassword() {
        return tfspassword;
    }
    public JPasswordField getTfconfirm() {
        return tfconfirm;
    }

    public JTextField getTfUsername() {
        return tfsusername;
    }
    public void setTfNik (String s) {
        this.tfnik.setText(s);
    }

    public void setTfName(String s) {
        this.tfnama.setText(s);
    }

    public void setTfPassword(String s) {
        this.tfspassword.setText(s);
    }

    public void setTfUsernameSignUp(String s) {
        this.tfsusername.setText(s);
    }

    public void setTfconfirm(String s) {
        this.tfconfirm.setText(s);
    }
    
    public void addActionListener(ActionListener a) {
        btnsign.addActionListener(a);
        btnbacksignin.addActionListener(a);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblusername = new javax.swing.JLabel();
        tfsusername = new javax.swing.JTextField();
        lblpass = new javax.swing.JLabel();
        tfconfirm = new javax.swing.JPasswordField();
        tfnama = new javax.swing.JTextField();
        tfnik = new javax.swing.JTextField();
        btnbacksignin = new javax.swing.JButton();
        btnsign = new javax.swing.JButton();
        lblusername1 = new javax.swing.JLabel();
        lblusername4 = new javax.swing.JLabel();
        lblpass1 = new javax.swing.JLabel();
        tfspassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("hooge 05_53", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SIGN UP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel2)
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 640, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/adult-bar-cafe-business-cinema-375885 (2).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -100, 640, 390));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        lblusername.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblusername.setForeground(new java.awt.Color(255, 255, 255));
        lblusername.setText("Username");

        tfsusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfsusernameActionPerformed(evt);
            }
        });

        lblpass.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblpass.setForeground(new java.awt.Color(255, 255, 255));
        lblpass.setText("Password");

        tfnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnamaActionPerformed(evt);
            }
        });

        tfnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnikActionPerformed(evt);
            }
        });

        btnbacksignin.setText("BACK");

        btnsign.setText("SIGN IN");

        lblusername1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblusername1.setForeground(new java.awt.Color(255, 255, 255));
        lblusername1.setText("Nik");

        lblusername4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblusername4.setForeground(new java.awt.Color(255, 255, 255));
        lblusername4.setText("Nama");

        lblpass1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblpass1.setForeground(new java.awt.Color(255, 255, 255));
        lblpass1.setText("Verify Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btnbacksignin)
                .addGap(122, 122, 122)
                .addComponent(btnsign)
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblpass1)
                        .addGap(40, 40, 40)
                        .addComponent(tfconfirm))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblusername)
                        .addGap(92, 92, 92)
                        .addComponent(tfsusername))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpass)
                            .addComponent(lblusername1)
                            .addComponent(lblusername4))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfnama)
                            .addComponent(tfnik)
                            .addComponent(tfspassword))))
                .addGap(81, 81, 81))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusername, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfsusername, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpass)
                    .addComponent(tfspassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpass1)
                    .addComponent(tfconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusername1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfnik, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusername4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbacksignin)
                    .addComponent(btnsign))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 640, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnamaActionPerformed

    private void tfsusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsusernameActionPerformed

    private void tfnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnikActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbacksignin;
    private javax.swing.JButton btnsign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lblpass1;
    private javax.swing.JLabel lblusername;
    private javax.swing.JLabel lblusername1;
    private javax.swing.JLabel lblusername4;
    private javax.swing.JPasswordField tfconfirm;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tfnik;
    private javax.swing.JPasswordField tfspassword;
    private javax.swing.JTextField tfsusername;
    // End of variables declaration//GEN-END:variables
}

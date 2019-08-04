/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionutilisateur;

import static gestionutilisateur.Connexion.*;
import javax.swing.*;

/**
 *
 * @author tapam
 */
public class Ajouter extends javax.swing.JFrame {
    
    private String [] listeRole = {"Admin", "Editeur", "Utilisateur"}; 

    /**
     * Creates new form Ajouter
     */
    public Ajouter() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.remplirCombo();
        jLabelNomU.setText("Nom: "+NOM);
        jLabelPrenomU.setText("Prenom: "+PRENOM);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelNomU = new javax.swing.JLabel();
        jLabelPrenomU = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPrenom = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBoxRole = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ajouter");
        setUndecorated(true);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jLabelClose.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel2);
        jPanel2.setBounds(580, 0, 40, 45);

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconAdmin.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Bienvenue");

        jLabelNomU.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabelNomU.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomU.setText("Nom:");

        jLabelPrenomU.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabelPrenomU.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrenomU.setText("Prenom: ");

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Deconnexion");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPrenomU, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomU, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(37, 37, 37)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNomU)
                .addGap(18, 18, 18)
                .addComponent(jLabelPrenomU)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5);
        jPanel5.setBounds(0, 0, 321, 457);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ajouter Utilisateur");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(320, 50, 293, 58);

        jTextFieldNom.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldNom.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextFieldNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomActionPerformed(evt);
            }
        });
        jPanel4.add(jTextFieldNom);
        jTextFieldNom.setBounds(410, 120, 200, 30);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Nom");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(340, 120, 40, 20);

        jTextFieldPrenom.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldPrenom.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldPrenom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextFieldPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrenomActionPerformed(evt);
            }
        });
        jPanel4.add(jTextFieldPrenom);
        jTextFieldPrenom.setBounds(410, 160, 200, 30);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Prenom");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(340, 170, 50, 20);

        jTextFieldEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanel4.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(410, 200, 200, 30);

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Email");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(340, 210, 40, 20);

        jTextFieldLogin.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldLogin.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginActionPerformed(evt);
            }
        });
        jPanel4.add(jTextFieldLogin);
        jTextFieldLogin.setBounds(410, 250, 200, 30);

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Login");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(340, 250, 40, 20);

        jPasswordField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(51, 51, 51));
        jPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel4.add(jPasswordField);
        jPasswordField.setBounds(410, 300, 200, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Role");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(340, 340, 60, 20);

        jButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Enregistrer");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(440, 400, 110, 40);

        jPanel4.add(jComboBoxRole);
        jComboBoxRole.setBounds(410, 340, 200, 30);

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Password");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(340, 300, 60, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(617, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void remplirCombo() {
        for(int i=0; i<listeRole.length; i++){
            jComboBoxRole.addItem(listeRole[i]);
        }
    }
    
    private void jTextFieldNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomActionPerformed

    private void jTextFieldPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrenomActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nom = jTextFieldNom.getText();
        String prenom = jTextFieldPrenom.getText();
        String email = jTextFieldEmail.getText();
        String username = jTextFieldLogin.getText();
        char[] pwd = jPasswordField.getPassword();
        String role = jComboBoxRole.getSelectedItem().toString();
        if(nom !=null && prenom !=null && email !=null && username !=null && pwd.length!=0) {
            ws.Utilisateur u = new ws.Utilisateur();
            u.setNom(nom);
            u.setPrenom(prenom);
            u.setEmail(email);
            u.setUsername(username);
            u.setPassword(new String(pwd));
            u.setRole(role);
            u.setToken(null);
            boolean b = ajouterUtilisateur(u);
            if(b) {
                JOptionPane.showMessageDialog(rootPane, "Ajouter avec succee");
                jTextFieldNom.setText("");
                jTextFieldPrenom.setText("");
                jTextFieldEmail.setText("");
                jTextFieldLogin.setText("");
                jPasswordField.setText("");
            }else {
                JOptionPane.showMessageDialog(rootPane, "Echec lors de l'ajout");
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Vueillez remplir tous les champs");  
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        boolean b = modifierToken(ID, null);
        if(b) {
            JOptionPane.showMessageDialog(rootPane, "Vous etes bien deconnecte");
            System.exit(0);
        }else {
            JOptionPane.showMessageDialog(rootPane, "Echec ");            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ajouter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBoxRole;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelNomU;
    private javax.swing.JLabel jLabelPrenomU;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    // End of variables declaration//GEN-END:variables

    private static boolean ajouterUtilisateur(ws.Utilisateur arg0) {
        ws.UtilisateurWSService service = new ws.UtilisateurWSService();
        ws.UtilisateurWS port = service.getUtilisateurWSPort();
        return port.ajouterUtilisateur(arg0);
    }

    private static boolean modifierToken(int arg0, java.lang.String arg1) {
        ws.UtilisateurWSService service = new ws.UtilisateurWSService();
        ws.UtilisateurWS port = service.getUtilisateurWSPort();
        return port.modifierToken(arg0, arg1);
    }


}

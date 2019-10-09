/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.Interface;

/**
 *
 * @author Laboratorio
 */
public class Agencia extends javax.swing.JFrame {

    /**
     * Creates new form Agencia
     */
    public Agencia() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtRazaoSocial = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        labelRazaoSocial = new javax.swing.JTextField();
        labelEmail = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        txtServico = new javax.swing.JLabel();
        labelServico = new javax.swing.JTextField();
        btGravar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CADASTRO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        txtRazaoSocial.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtRazaoSocial.setForeground(new java.awt.Color(255, 255, 255));
        txtRazaoSocial.setText("Razão Social");

        txtEmail.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setText("E-mail:");

        txtTelefone.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefone.setText("Telefone");

        lblCpf.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(255, 255, 255));
        lblCpf.setText("CNPJ");

        labelRazaoSocial.setName(""); // NOI18N
        labelRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelRazaoSocialActionPerformed(evt);
            }
        });

        labelEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelEmailActionPerformed(evt);
            }
        });

        labelTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                labelTelefoneKeyReleased(evt);
            }
        });

        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCpfKeyReleased(evt);
            }
        });

        btVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Robot/Interface/resposta (2).png"))); // NOI18N
        btVoltar.setText("Gravar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        txtServico.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtServico.setForeground(new java.awt.Color(255, 255, 255));
        txtServico.setText("Serviço");

        labelServico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                labelServicoKeyReleased(evt);
            }
        });

        btGravar.setBackground(new java.awt.Color(255, 255, 255));
        btGravar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btGravar.setForeground(new java.awt.Color(255, 255, 255));
        btGravar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Laboratorio\\Desktop\\emblemdefault_103756 (1).png")); // NOI18N
        btGravar.setText("Gravar");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRazaoSocial)
                    .addComponent(txtServico, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelefone)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelRazaoSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(labelTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(labelServico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addComponent(lblCpf))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(txtCpf)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRazaoSocial)
                            .addComponent(labelRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefone)
                        .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtServico)
                            .addComponent(labelServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelTelefoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelTelefoneKeyReleased

    }//GEN-LAST:event_labelTelefoneKeyReleased

    private void txtCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyReleased

    }//GEN-LAST:event_txtCpfKeyReleased

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        new Inicio().setVisible(true);
        this.dispose();      
    }//GEN-LAST:event_btVoltarActionPerformed

    private void labelServicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelServicoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_labelServicoKeyReleased

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btGravarActionPerformed

    private void labelRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelRazaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelRazaoSocialActionPerformed

    private void labelEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelEmailActionPerformed

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
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField labelEmail;
    private javax.swing.JTextField labelRazaoSocial;
    private javax.swing.JTextField labelServico;
    private javax.swing.JTextField labelTelefone;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtRazaoSocial;
    private javax.swing.JLabel txtServico;
    private javax.swing.JLabel txtTelefone;
    // End of variables declaration//GEN-END:variables
}
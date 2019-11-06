/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.Interface;

import Robot.Classes.Controle;
import Robot.DAO.UsuarioDAO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Murakami
 */
public class Inicio extends JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        pnlLogin = new javax.swing.JPanel();
        pnlUsuario = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        pnlSenha = new javax.swing.JPanel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnEsqueci = new javax.swing.JButton();
        btnEsqueci1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Robot Advisor");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlLogin.setBackground(new java.awt.Color(128, 128, 128));
        pnlLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", 2, 0, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(240, 240, 240))); // NOI18N

        pnlUsuario.setBackground(new java.awt.Color(128, 128, 128));
        pnlUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuário", 1, 0, new java.awt.Font("Arial", 1, 18), new java.awt.Color(240, 240, 240))); // NOI18N

        txtUsuario.setBackground(new java.awt.Color(230, 230, 230));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUsuarioLayout = new javax.swing.GroupLayout(pnlUsuario);
        pnlUsuario.setLayout(pnlUsuarioLayout);
        pnlUsuarioLayout.setHorizontalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addComponent(txtUsuario)
                .addGap(0, 0, 0))
        );
        pnlUsuarioLayout.setVerticalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pnlSenha.setBackground(new java.awt.Color(128, 128, 128));
        pnlSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", 1, 0, new java.awt.Font("Arial", 1, 18), new java.awt.Color(240, 240, 240))); // NOI18N

        javax.swing.GroupLayout pnlSenhaLayout = new javax.swing.GroupLayout(pnlSenha);
        pnlSenha.setLayout(pnlSenhaLayout);
        pnlSenhaLayout.setHorizontalGroup(
            pnlSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSenha)
        );
        pnlSenhaLayout.setVerticalGroup(
            pnlSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSenhaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnEntrar.setBackground(new java.awt.Color(0, 51, 255));
        btnEntrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnEsqueci.setBackground(new java.awt.Color(50, 50, 50));
        btnEsqueci.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEsqueci.setForeground(new java.awt.Color(240, 240, 240));
        btnEsqueci.setText("Cadastrar");
        btnEsqueci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsqueciActionPerformed(evt);
            }
        });

        btnEsqueci1.setBackground(new java.awt.Color(50, 50, 50));
        btnEsqueci1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEsqueci1.setForeground(new java.awt.Color(240, 240, 240));
        btnEsqueci1.setText("Esqueci a senha");
        btnEsqueci1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsqueci1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Robot/Imagem/iconUser.png"))); // NOI18N

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlLoginLayout.createSequentialGroup()
                        .addComponent(btnEsqueci, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btnEsqueci1))
                    .addComponent(pnlSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(pnlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEsqueci)
                    .addComponent(btnEsqueci1))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEsqueci1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqueci1ActionPerformed
        new RecuperSenha().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEsqueci1ActionPerformed

    private void btnEsqueciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqueciActionPerformed
        new Cadastro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEsqueciActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        if (txtUsuario.getText().equals("") || txtSenha.getText().equals(""))
            JOptionPane.showMessageDialog(null,"Preencha todos os campos!","ERRO", JOptionPane.OK_OPTION);
        else
        {
            try
            {
                UsuarioDAO ud = new UsuarioDAO();
                
                if (ud.getLogin(txtUsuario.getText()) == true)
                {
                    if (ud.getSenha(txtSenha.getText()) == true)
                    {  
                        Controle.getInstancia().setUser(ud.getByLoginSenha(txtUsuario.getText(), txtSenha.getText()));
                        new Principal().setVisible(true);
                        this.dispose();
                    }
                    else
                        throw new Exception();
                }
                else
                    throw new Exception();
            } 
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,"Tem algo de errado nas suas informações","ERRO", JOptionPane.OK_OPTION);
                System.out.printf("Erro ao logar!");
            }
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    private Object getContentPanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEsqueci;
    private javax.swing.JButton btnEsqueci1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlSenha;
    private javax.swing.JPanel pnlUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private Object getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

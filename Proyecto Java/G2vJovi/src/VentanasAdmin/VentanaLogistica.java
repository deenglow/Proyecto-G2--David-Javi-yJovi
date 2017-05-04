/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasAdmin;

import g2vjovi.G2vJovi;

public class VentanaLogistica extends javax.swing.JFrame {

    /**
     * Creates new form VentanaLogistica
     */
    public VentanaLogistica() {
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

        jLabel1 = new javax.swing.JLabel();
        jLfondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mPerfil = new javax.swing.JMenu();
        mVerPerfil = new javax.swing.JMenuItem();
        mModificarPerfil = new javax.swing.JMenuItem();
        mParte = new javax.swing.JMenu();
        mNuevoParte = new javax.swing.JMenuItem();
        mModificarParte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Himevico.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/business.jpg"))); // NOI18N
        getContentPane().add(jLfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mPerfil.setText("Perfil");

        mVerPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/newIcon.png"))); // NOI18N
        mVerPerfil.setText("Ver Perfil");
        mPerfil.add(mVerPerfil);

        mModificarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/modifyIcon.png"))); // NOI18N
        mModificarPerfil.setText("Modificar Perfil");
        mPerfil.add(mModificarPerfil);

        jMenuBar1.add(mPerfil);

        mParte.setText("Parte");

        mNuevoParte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/newIcon.png"))); // NOI18N
        mNuevoParte.setText("Nuevo Parte");
        mNuevoParte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNuevoParteActionPerformed(evt);
            }
        });
        mParte.add(mNuevoParte);

        mModificarParte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/modifyIcon.png"))); // NOI18N
        mModificarParte.setText("Modificar Parte");
        mParte.add(mModificarParte);

        jMenuBar1.add(mParte);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mNuevoParteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNuevoParteActionPerformed
        // BOTON PARA ABRIR LA VENTANA DE CREACION DE LOS PARTES:
        
        G2vJovi.abrirVentanaCreacionPartes();

    }//GEN-LAST:event_mNuevoParteActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaLogistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogistica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLfondo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mModificarParte;
    private javax.swing.JMenuItem mModificarPerfil;
    private javax.swing.JMenuItem mNuevoParte;
    private javax.swing.JMenu mParte;
    private javax.swing.JMenu mPerfil;
    private javax.swing.JMenuItem mVerPerfil;
    // End of variables declaration//GEN-END:variables
}

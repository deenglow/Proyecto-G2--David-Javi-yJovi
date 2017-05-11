package VentanasAdmin;
import ModeloUML.*;
import g2vjovi.*;
import java.util.ArrayList;
/**
 *
 * @author 1gbd02
 */
public class BuscarCentro extends javax.swing.JDialog {
    private G2vJovi main = new G2vJovi();
    private Centro cCentro;
    /**
     *crea el form de la ventana
     */
    public BuscarCentro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     *codigo autogenerado no borrar.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbBuscarNombre = new javax.swing.JCheckBox();
        cbBuscarTodo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre:");

        tfNombre.setEnabled(false);

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Himevico2.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Centros.png"))); // NOI18N

        buttonGroup1.add(cbBuscarNombre);
        cbBuscarNombre.setText("Buscar por nombre");
        cbBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarNombreActionPerformed(evt);
            }
        });

        buttonGroup1.add(cbBuscarTodo);
        cbBuscarTodo.setSelected(true);
        cbBuscarTodo.setText("Buscar todos los centros");
        cbBuscarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bBuscar)
                                .addGap(30, 30, 30)
                                .addComponent(bSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbBuscarNombre)
                                .addComponent(cbBuscarTodo)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addComponent(cbBuscarNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbBuscarTodo)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBuscar)
                    .addComponent(bSalir))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        G2vJovi.cerrarVentanaBuscarCentro();
    }//GEN-LAST:event_bSalirActionPerformed
/**
 * funcion que una pulsado el boton buscar comprueba el tipo de busqueda y llegara a la consulta correspondiente 
 */
    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        ArrayList <Centro> listaCentro;
        if (cbBuscarTodo.isSelected()){
            String cadenaSalida="";
            listaCentro=main.procConsultaCentro();
            if(listaCentro.size()>0){
            for(int x=0;x<listaCentro.size();x++){
                cadenaSalida+="Nombre: "+listaCentro.get(x).getNombre()+"\nDirección (calle,numero,codigo postal, ciudad, provincia) : "+listaCentro.get(x).getCalle()+", "+listaCentro.get(x).getNumero()+", "+listaCentro.get(x).getCodigoPostal()+", "+listaCentro.get(x).getCiudad()+", "+listaCentro.get(x).getProvincia()+"\nTelefono: "+listaCentro.get(x).getTelefono()+"\n---------------------------\n";
            }}
            else cadenaSalida="No hay centros";
            javax.swing.JOptionPane.showMessageDialog(null, cadenaSalida);
        }
        if (cbBuscarNombre.isSelected()){
            String cadenaSalida="";
            listaCentro=main.procConsultaCentroNombre(tfNombre.getText().toUpperCase());
            if(listaCentro.size()>0){
                for(int x=0;x<listaCentro.size();x++){
                    cadenaSalida+="Nombre: "+listaCentro.get(x).getNombre()+"\nDirección (calle,numero,codigo postal, ciudad, provincia) : "+listaCentro.get(x).getCalle()+", "+listaCentro.get(x).getNumero()+", "+listaCentro.get(x).getCodigoPostal()+", "+listaCentro.get(x).getCiudad()+", "+listaCentro.get(x).getProvincia()+"\nTelefono: "+listaCentro.get(x).getTelefono()+"\n---------------------------\n";
                }
            }
            else{ cadenaSalida="No hay centros";}
            javax.swing.JOptionPane.showMessageDialog(null, cadenaSalida);
        }
    }//GEN-LAST:event_bBuscarActionPerformed
/**
 * si esta seleccionado buscar todo habilitara el campo de nombre
 */
    private void cbBuscarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarTodoActionPerformed
        if (cbBuscarTodo.isSelected()){
            tfNombre.setEnabled(false);
        }
    }//GEN-LAST:event_cbBuscarTodoActionPerformed
/**
 * si esta seleccionado buscar por nombre todo habilitara el campo de nombre
 */
    private void cbBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarNombreActionPerformed
        if (cbBuscarNombre.isSelected()){
            tfNombre.setEnabled(true);
        }
    }//GEN-LAST:event_cbBuscarNombreActionPerformed

    /**
     *main de la ventana
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
            java.util.logging.Logger.getLogger(BuscarCentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarCentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarCentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarCentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarCentro dialog = new BuscarCentro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbBuscarNombre;
    private javax.swing.JCheckBox cbBuscarTodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
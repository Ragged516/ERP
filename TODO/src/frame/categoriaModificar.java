/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import frame.connection;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 72724
 */
public class categoriaModificar extends javax.swing.JFrame {

    connection con;

    public categoriaModificar() {
        initComponents();
        con = new connection();
        con.abreConexion();
        this.setLocationRelativeTo(null);
        con.consultaCatTo1(tablaCategorias);
    }
    Object datos[];
    String x;
    DefaultTableModel m, n;

    private void limpiarCampos() {
        txtIDCategoria.setText("");
        txtNombreCategoria.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpcionesStatus = new javax.swing.ButtonGroup();
        jButton4 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCategorias = new javax.swing.JTable();
        txtNombreCategoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtIDCategoria = new javax.swing.JTextField();
        btnActualizarCat = new javax.swing.JButton();
        btnCancelarCategoria = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rdbActivo = new javax.swing.JRadioButton();
        rdbInactivo = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();

        jButton4.setText("Cancelar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar categoria");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "NOMBRE", "ESTATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCategorias.setOpaque(false);
        tablaCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCategorias);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 12, 269, 204));

        txtNombreCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));
        txtNombreCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 111, 198, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NOMBRE :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 113, -1, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 76, 24, -1));

        txtIDCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));
        txtIDCategoria.setEnabled(false);
        getContentPane().add(txtIDCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 74, 198, -1));

        btnActualizarCat.setText("Actualizar");
        btnActualizarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCatActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 191, -1, -1));

        btnCancelarCategoria.setText("Cancelar");
        btnCancelarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 191, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Modificar categoria");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 15, 250, 41));

        buttonGroup1.add(rdbActivo);
        rdbActivo.setForeground(new java.awt.Color(0, 0, 0));
        rdbActivo.setText("Activo");
        getContentPane().add(rdbActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 156, -1, -1));

        buttonGroup1.add(rdbInactivo);
        rdbInactivo.setForeground(new java.awt.Color(0, 0, 0));
        rdbInactivo.setText("Inactivo");
        getContentPane().add(rdbInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 156, 70, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Estatus :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 156, 49, 23));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/26204c8c-443a-4511-adca-0574146f51b9image22.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 230));

        jMenu1.setText("Opciones");
        jMenu1.setToolTipText("Opciones");
        jMenu1.add(jSeparator1);
        jMenu1.add(jSeparator2);

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator3);
        jMenu1.add(jSeparator4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCategoriaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Menu M=new Menu();
        M.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnActualizarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCatActionPerformed
        int v=Integer.parseInt(txtIDCategoria.getText());
        String y=txtNombreCategoria.getText();
        String u="";
        if(rdbActivo.isSelected()){
            u="A";
        }else if(rdbInactivo.isSelected()){
            u="I";
        }
        con.modificaCategoria(y,v,u,tablaCategorias);
    }//GEN-LAST:event_btnActualizarCatActionPerformed

    private void btnCancelarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCategoriaActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarCategoriaActionPerformed

    private void tablaCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCategoriasMouseClicked
        traerDatoTextfield(tablaCategorias);
    }//GEN-LAST:event_tablaCategoriasMouseClicked
    public void traerDatoTextfield(JTable tabla) {
        rdbActivo.setSelected(false);
        rdbInactivo.setSelected(false);
        int fsel = tabla.getSelectedRow();
        try {
            String nombreCat, estatus;
            int ID;

            m = (DefaultTableModel) tabla.getModel();
            ID = Integer.parseInt((String.valueOf(tabla.getValueAt(fsel, 0))));
            nombreCat = tabla.getValueAt(fsel, 1).toString();
            estatus = tabla.getValueAt(fsel, 2).toString();

            txtIDCategoria.setText(String.valueOf(ID));
            txtNombreCategoria.setText(nombreCat);
            if(estatus.equals("A")){
                rdbActivo.setSelected(true);
            }else{
                rdbInactivo.setSelected(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verificar seleccion de producto", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

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
            java.util.logging.Logger.getLogger(categoriaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(categoriaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(categoriaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(categoriaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new categoriaModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup OpcionesStatus;
    private javax.swing.JButton btnActualizarCat;
    private javax.swing.JButton btnCancelarCategoria;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JRadioButton rdbActivo;
    private javax.swing.JRadioButton rdbInactivo;
    private javax.swing.JTable tablaCategorias;
    private javax.swing.JTextField txtIDCategoria;
    private javax.swing.JTextField txtNombreCategoria;
    // End of variables declaration//GEN-END:variables
}

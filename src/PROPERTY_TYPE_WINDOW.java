
import Datos.Conexion;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.sql.Connection;
import java.sql.*;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fantoli
 */
public class PROPERTY_TYPE_WINDOW extends javax.swing.JFrame {

    //instanciamos la clase de la conexion
    Conexion conection = new Conexion();
    Connection CIN = conection.getConexion();
    //
    PreparedStatement ps;
    
    ButtonGroup btnGr;
    
    public PROPERTY_TYPE_WINDOW() {
        initComponents();
        jTextField_Id.setVisible(false);
        btnGr = new ButtonGroup();
        cargarTabla();
        
        //[153,153,153]
        
        Border jPanelTitle_border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(125,125,125));
        jPanel_Title.setBorder(jPanelTitle_border);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jTextField_Name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPropertyType = new javax.swing.JTable();
        jButton_Add = new javax.swing.JButton();
        jButton_Refresh = new javax.swing.JButton();
        jButton_Edit = new javax.swing.JButton();
        jButton_Remove = new javax.swing.JButton();
        jButton_Limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel_Title.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 33)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Property Type");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Description:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Name:");

        jTextField_Id.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_Id.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_Name.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Name.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_Name.setForeground(new java.awt.Color(0, 0, 0));

        jTextArea_Description.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea_Description.setColumns(20);
        jTextArea_Description.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea_Description.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea_Description.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Description);

        tblPropertyType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPropertyType);

        jButton_Add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add.setText("Add");
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jButton_Refresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Refresh.setText("Refresh");

        jButton_Edit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Edit.setText("Edit");
        jButton_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditActionPerformed(evt);
            }
        });

        jButton_Remove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Remove.setText("Remove");

        jButton_Limpiar.setText("Clean");
        jButton_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Limpiar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton_Limpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
       String name = jTextField_Name.getText();
       String description = jTextArea_Description.getText();
       
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO property_type (name, description) VALUES (?,?)");
            ps.setString(1, name);
            ps.setString(2, description);
            ps.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "Registro guardado");
            limpiar();
            cargarTabla();
            
        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, e.toString());
        }
       
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void limpiar(){
    
        jTextField_Id.setText("");
        jTextField_Name.setText("");
        jTextArea_Description.setText("");
        btnGr.clearSelection();
    }
    
    private void cargarTabla(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tblPropertyType.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT id, name, description FROM property_type");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            
            while(rs.next()){
                Object[] fila = new Object[columnas];
                for(int indice=0; indice<columnas; indice++)
                {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    
    
    
    
    }
    
    private void jButton_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditActionPerformed
        
    }//GEN-LAST:event_jButton_EditActionPerformed

    private void jButton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimpiarActionPerformed
        
    }//GEN-LAST:event_jButton_LimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROPERTY_TYPE_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Edit;
    private javax.swing.JButton jButton_Limpiar;
    private javax.swing.JButton jButton_Refresh;
    private javax.swing.JButton jButton_Remove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_Description;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTable tblPropertyType;
    // End of variables declaration//GEN-END:variables
}

package real_app;


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
        this.setLocationRelativeTo(null);
        
        jTextField_Id.setVisible(false);
        btnGr = new ButtonGroup();
        cargarTabla();
        
        //[153,153,153]
        
        Border jPanelTitle_border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(125,125,125));
        jPanel_Title.setBorder(jPanelTitle_border);
        
        Border button_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255,255,255));
        jButton_Add.setBorder(button_border);
        jButton_Edit.setBorder(button_border);
        jButton_Remove.setBorder(button_border);
        jButton_Limpiar.setBorder(button_border);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblClosePropertyType = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jTextField_Name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPropertyType = new javax.swing.JTable();
        jButton_Add = new javax.swing.JButton();
        jButton_Edit = new javax.swing.JButton();
        jButton_Remove = new javax.swing.JButton();
        jButton_Limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel_Title.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 33)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Property Type");

        lblClosePropertyType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1487086362-cancel_81578.png"))); // NOI18N
        lblClosePropertyType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClosePropertyType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClosePropertyTypeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblClosePropertyType, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGroup(jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_TitleLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_TitleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblClosePropertyType, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Description:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
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

        tblPropertyType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPropertyType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPropertyTypeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPropertyType);
        if (tblPropertyType.getColumnModel().getColumnCount() > 0) {
            tblPropertyType.getColumnModel().getColumn(0).setMinWidth(30);
            tblPropertyType.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblPropertyType.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        jButton_Add.setBackground(new java.awt.Color(0, 153, 51));
        jButton_Add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add.setText("Add");
        jButton_Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jButton_Edit.setBackground(new java.awt.Color(51, 153, 255));
        jButton_Edit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Edit.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Edit.setText("Edit");
        jButton_Edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditActionPerformed(evt);
            }
        });

        jButton_Remove.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Remove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Remove.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Remove.setText("Remove");
        jButton_Remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RemoveActionPerformed(evt);
            }
        });

        jButton_Limpiar.setBackground(new java.awt.Color(255, 255, 0));
        jButton_Limpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Limpiar.setText("Clean");
        jButton_Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addGap(47, 47, 47)
                .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        
        int[] anchos = {10, 50, 100};
        for(int i = 0; i < tblPropertyType.getColumnCount(); i++)
        {
            tblPropertyType.getColumnModel().getColumn(i).setPreferredWidth(i);
        }
        
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
        int id = Integer.parseInt(jTextField_Id.getText());
        String name = jTextField_Name.getText();
        String description = jTextArea_Description.getText();
        
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE property_type SET name=?, description=? WHERE id=?");
            ps.setString(1, name);
            ps.setString(2, description);
            ps.setInt(3, id);
            ps.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "Registro modificado");
            limpiar();
            cargarTabla();
            
        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jButton_EditActionPerformed

    private void jButton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton_LimpiarActionPerformed

    private void tblPropertyTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPropertyTypeMouseClicked
        try {
            int fila = tblPropertyType.getSelectedRow();
            int id = Integer.parseInt(tblPropertyType.getValueAt(fila, 0).toString());
            
            PreparedStatement ps;
            ResultSet rs;
            
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT name, description FROM property_type WHERE id=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while(rs.next()){
            jTextField_Id.setText(String.valueOf(id));
            jTextField_Name.setText(rs.getString("name"));
            jTextArea_Description.setText(rs.getString("description"));
            
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_tblPropertyTypeMouseClicked

    private void jButton_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RemoveActionPerformed
        int id = Integer.parseInt(jTextField_Id.getText());
        
        
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM property_type WHERE id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "Registro Eliminado");
            limpiar();
            cargarTabla();
            
        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jButton_RemoveActionPerformed

    private void lblClosePropertyTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClosePropertyTypeMouseClicked
        dispose();
    }//GEN-LAST:event_lblClosePropertyTypeMouseClicked

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
    private javax.swing.JLabel lblClosePropertyType;
    private javax.swing.JTable tblPropertyType;
    // End of variables declaration//GEN-END:variables
}

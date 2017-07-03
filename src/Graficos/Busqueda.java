/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;
import Interfaces.*;
import Exceptions.*;
import javax.swing.table.DefaultTableModel;
import ucupharma.*;

/**
 *
 * @author UCU
 */
public class Busqueda extends javax.swing.JFrame {

    public Farmacia ucus;
    /**
     * Creates new form Busqueda
     */
    public Busqueda() {
        initComponents();
    }
    
    public Busqueda(Farmacia farm) {
        this.ucus = farm;
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

        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(720, 460));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripcion", "Cantidad", "Precio", "Categoría", "Vencimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setToolTipText("");

        jRadioButton1.setText("Por Código");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Por Descripcion Corta");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("Por Área");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Listar Todo");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Por Descripcion Larga");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton6.setText("Vencen en");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)
                        .addGap(31, 31, 31)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jRadioButton6)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jTextPane1);

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese lo que desea buscar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        if(jRadioButton1.isSelected()){
            String[] header = new String[] {"Código", "Descripción", "Cantidad", "Precio","Área de aplicación", "Vencimiento"};
            model.setColumnIdentifiers(header);
            int cantRows = model.getRowCount();
            if(cantRows > 0){
                int i;
                for(i = 0; i < cantRows; i++){
                    model.removeRow(i);
                }
            }
            
            try{
                IProducto resultado = ucus.buscarPorCodigo(Integer.parseInt(jTextPane1.getText())).getDatos();
                if(resultado != null){
                String codigo = String.valueOf(resultado.getCodigo());
                String desc = resultado.getDescripcionCorta();
                String cantidad = String.valueOf(resultado.getCantidad());
                String precio = String.valueOf(resultado.getPrecio());
                String area = resultado.getAreaAplicacion();
                String vencimiento = String.valueOf(resultado.getVencimiento());
                Object[] row = {codigo, desc, cantidad, precio, area, vencimiento};
                model.addRow(row);
                }
                else{
                    throw new NullNodeException("No se ha encontrado producto con ese código.");
                    
                }
            }
            catch(NullNodeException ex){
                Alerta cartel = new Alerta(ex.getMessage());
                cartel.setSize(300, 200);
                cartel.setVisible(true);
            }
            
            
        }
        
        if(jRadioButton2.isSelected()){
            String[] header = new String[] {"Código", "Descripción", "Cantidad", "Precio","Área de aplicación", "Vencimiento"};
            model.setColumnIdentifiers(header);
            int cantRows = model.getRowCount();
            if(cantRows > 0){
                for(int i = 0; i < cantRows; i++){
                    model.removeRow(i);
                }
            }
            
            ILista<IProducto> resultado = ucus.buscarPorDescCorta(jTextPane1.getText());
            
            INodo<IProducto> prodAct = resultado.getPrimero();
            while(prodAct != null){
                String codigo = String.valueOf(prodAct.getEtiqueta());
                String desc = prodAct.getDato().getDescripcionCorta();
                String cantidad = String.valueOf(prodAct.getDato().getCantidad());
                String precio = String.valueOf(prodAct.getDato().getPrecio());
                String area = prodAct.getDato().getAreaAplicacion();
                String vencimiento = String.valueOf(prodAct.getDato().getVencimiento());
                
                Object[] row = {codigo, desc, cantidad, precio, area, vencimiento};
                model.addRow(row);
                
                prodAct = prodAct.getSiguiente();
            }
            
        }
        
        if(jRadioButton3.isSelected()){
            String[] header = new String[] {"Código", "Descripción Larga", "Cantidad", "Precio", "Área de aplicación", "Vencimiento"};
            model.setColumnIdentifiers(header);
            int cantRows = model.getRowCount();
            if(cantRows > 0){
                for(int i = 0; i < cantRows; i++){
                    model.removeRow(i);
                }
            }
            
            ILista<IProducto> resultado = ucus.buscarPorDescLarga(jTextPane1.getText());
            
            INodo<IProducto> prodAct = resultado.getPrimero();
            while(prodAct != null){
                String codigo = String.valueOf(prodAct.getEtiqueta());
                String desc = prodAct.getDato().getDescripcionLarga();
                String cantidad = String.valueOf(prodAct.getDato().getCantidad());
                String precio = String.valueOf(prodAct.getDato().getPrecio());
                String area = prodAct.getDato().getAreaAplicacion();
                String vencimiento = String.valueOf(prodAct.getDato().getVencimiento());
                
                Object[] row = {codigo, desc, cantidad, precio, area, vencimiento};
                model.addRow(row);
                
                prodAct = prodAct.getSiguiente();
            }
            
        }
        
        if(jRadioButton4.isSelected()){
            String[] header = new String[] {"Código", "Descripción", "Cantidad", "Precio","Área de aplicación", "Vencimiento"};
            model.setColumnIdentifiers(header);
            int cantRows = model.getRowCount();
            if(cantRows > 0){
                for(int i = 0; i < cantRows; i++){
                    model.removeRow(i);
                }
            }
            
            ILista<IProducto> resultado = ucus.listarProductos();
            
            INodo<IProducto> prodAct = resultado.getPrimero();
            while(prodAct != null){
                String codigo = String.valueOf(prodAct.getEtiqueta());
                String desc = prodAct.getDato().getDescripcionCorta();
                String cantidad = String.valueOf(prodAct.getDato().getCantidad());
                String precio = String.valueOf(prodAct.getDato().getPrecio());
                String area = prodAct.getDato().getAreaAplicacion();
                String vencimiento = String.valueOf(prodAct.getDato().getVencimiento());
                
                Object[] row = {codigo, desc, cantidad, precio, area, vencimiento};
                model.addRow(row);
                
                prodAct = prodAct.getSiguiente();
            }
            
        }
       
        
        if(jRadioButton5.isSelected()){
            String[] header = new String[] {"Área de aplicación", "Código", "Descripción", "Cantidad", "Precio", "Vencimiento"};
            model.setColumnIdentifiers(header);
            int cantRows = model.getRowCount();
            if(cantRows > 0){
                for(int i = 0; i < cantRows; i++){
                    model.removeRow(i);
                }
            }
            
            ILista<ILista<IProducto>> resultado = ucus.listarAreas();
            
            INodo<ILista<IProducto>> areaAct = resultado.getPrimero();
            
            while(areaAct != null){
                ILista<IProducto> listaProd = areaAct.getDato();
                INodo<IProducto> nodoProdAct = listaProd.getPrimero();
                while(nodoProdAct != null){
                    String codigo = String.valueOf(nodoProdAct.getDato().getCodigo());
                    String desc = nodoProdAct.getDato().getDescripcionCorta();
                    String cantidad = String.valueOf(nodoProdAct.getDato().getCantidad());
                    String precio = String.valueOf(nodoProdAct.getDato().getPrecio());
                    String area = nodoProdAct.getDato().getAreaAplicacion();
                    String vencimiento = String.valueOf(nodoProdAct.getDato().getVencimiento());

                    Object[] row = {area, codigo, desc, cantidad, precio, vencimiento};
                    model.addRow(row);

                    nodoProdAct = nodoProdAct.getSiguiente();
                }
                
                areaAct = areaAct.getSiguiente();
            }
        }
        
            if(jRadioButton6.isSelected()){
            String[] header = new String[] {"Código", "Descripción", "Cantidad", "Precio","Área de aplicación", "Vencimiento"};
            model.setColumnIdentifiers(header);
            int cantRows = model.getRowCount();
            if(cantRows > 0){
                for(int i = 0; i < cantRows; i++){
                    model.removeRow(i);
                }
            }
            
            ILista<IProducto> resultado = ucus.buscarVencimientos(jTextPane1.getText());
            
            INodo<IProducto> prodAct = resultado.getPrimero();
            while(prodAct != null){
                String codigo = String.valueOf(prodAct.getEtiqueta());
                String desc = prodAct.getDato().getDescripcionCorta();
                String cantidad = String.valueOf(prodAct.getDato().getCantidad());
                String precio = String.valueOf(prodAct.getDato().getPrecio());
                String area = prodAct.getDato().getAreaAplicacion();
                String vencimiento = String.valueOf(prodAct.getDato().getVencimiento());
                
                Object[] row = {codigo, desc, cantidad, precio, area, vencimiento};
                model.addRow(row);
                
                prodAct = prodAct.getSiguiente();
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jRadioButton6.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected() || jRadioButton4.isSelected() || jRadioButton5.isSelected()){
            jRadioButton6.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if(jRadioButton1.isSelected() || jRadioButton3.isSelected() || jRadioButton4.isSelected() || jRadioButton5.isSelected() || jRadioButton5.isSelected()){
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton5.setSelected(false);
            jRadioButton6.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        if(jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected() || jRadioButton4.isSelected() || jRadioButton5.isSelected()){
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        if(jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected() || jRadioButton4.isSelected() || jRadioButton6.isSelected()){
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton6.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        if(jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected() || jRadioButton6.isSelected() || jRadioButton5.isSelected()){
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton6.setSelected(false);
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        if(jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton6.isSelected() || jRadioButton4.isSelected() || jRadioButton5.isSelected()){
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton6.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}

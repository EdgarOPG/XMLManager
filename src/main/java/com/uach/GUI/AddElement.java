/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uach.GUI;

import java.util.ArrayList;
import java.util.List;
import org.jdom.Element;

/**
 *
 * @author edgar
 */
public class AddElement extends javax.swing.JFrame {

    /**
     * Creates new form AddElement
     */
    PyJDom p = new PyJDom();
    MainMenu mM;
    public List<Element> elements = new ArrayList<Element>();

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public AddElement(List<Element> elements) {
        initComponents();
        setElements(elements);
        if (!elements.isEmpty()) {
            for (Element element : elements) {
                cmbElementoPadre.addItem(element.toString());
            }
        }
        this.setLocationRelativeTo(null);
    }

    public AddElement() {
        initComponents();
        cmbElementoPadre.setEnabled(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        cmbElementoPadre = new javax.swing.JComboBox<>();
        lblPadre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        bntOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblNombre.setText("Nombre del elemento");

        cmbElementoPadre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-" }));
        cmbElementoPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbElementoPadreActionPerformed(evt);
            }
        });

        lblPadre.setText("Padre");

        bntOk.setText("Aceptar");
        bntOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lblPadre)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(cmbElementoPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bntOk))
                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPadre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbElementoPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntOk))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbElementoPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbElementoPadreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbElementoPadreActionPerformed

    private void bntOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntOkActionPerformed
        if (p.getDocXML().hasRootElement()) {
            Integer cmbIndex = cmbElementoPadre.getSelectedIndex();
            if (cmbIndex == 0) {
                p.setNodoHijo(p.crearNodo(txtNombre.getText()));
                p.getRaiz().addContent(p.getNodoHijo());
            } else {
                String nombre = cmbElementoPadre.getSelectedItem().toString();
//                elements
//                p.getNodoPadre() = p.crearNodo(nombre);
                
                p.getRaiz().getChildren();
                Element nodoHijo = p.crearNodo(txtNombre.getText());
//                nodoPadre.addContent(nodoHijo);
            }
        } else {
            p.setRaiz(p.crearNodo(txtNombre.getText()));
            p.getDocXML().addContent(p.getRaiz());
        }
        this.dispose();
    }//GEN-LAST:event_bntOkActionPerformed

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
            java.util.logging.Logger.getLogger(AddElement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddElement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddElement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddElement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddElement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntOk;
    private javax.swing.JComboBox<String> cmbElementoPadre;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPadre;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

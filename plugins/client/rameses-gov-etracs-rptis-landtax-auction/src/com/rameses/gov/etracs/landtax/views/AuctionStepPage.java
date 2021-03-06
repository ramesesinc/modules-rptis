/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.gov.etracs.landtax.views;

import com.rameses.rcp.ui.annotations.Template;
import com.rameses.seti2.views.CrudFormPage;

@Template(CrudFormPage.class)
public class AuctionStepPage extends javax.swing.JPanel {

    /**
     * Creates new form AuctionStep
     */
    public AuctionStepPage() {
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

        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xIntegerField1 = new com.rameses.rcp.control.XIntegerField();
        xCheckBox1 = new com.rameses.rcp.control.XCheckBox();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setPadding(new java.awt.Insets(30, 10, 5, 10));
        xTitledBorder1.setTitle("General Information");
        xFormPanel1.setBorder(xTitledBorder1);

        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel1.setCaption("Sequence");
        xLabel1.setExpression("#{entity.seqno}");
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel1.add(xLabel1);

        xLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel2.setCaption("Title");
        xLabel2.setExpression("#{entity.name}");
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel1.add(xLabel2);

        xIntegerField1.setCaption("Duration");
        xIntegerField1.setName("entity.duration"); // NOI18N
        xFormPanel1.add(xIntegerField1);

        xCheckBox1.setCellPadding(new java.awt.Insets(10, 0, 0, 0));
        xCheckBox1.setName("entity.applicable"); // NOI18N
        xCheckBox1.setShowCaption(false);
        xCheckBox1.setText("Is Applicable?");
        xFormPanel1.add(xCheckBox1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XCheckBox xCheckBox1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XIntegerField xIntegerField1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    // End of variables declaration//GEN-END:variables
}

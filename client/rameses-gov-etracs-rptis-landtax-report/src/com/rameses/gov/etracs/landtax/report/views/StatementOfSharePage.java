/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.gov.etracs.landtax.report.views;

import com.rameses.gov.etracs.landtax.report.*;
import com.rameses.gov.etracs.landtax.report.abstractofcollection.*;
import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

@Template(FormPage.class)
@StyleSheet
public class StatementOfSharePage extends javax.swing.JPanel {

    /**
     * Creates new form AbstractRPTCollectionPage
     */
    public StatementOfSharePage() {
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
        xComboBox6 = new com.rameses.rcp.control.XComboBox();

        xFormPanel1.setCaptionWidth(110);

        xComboBox6.setCaption("Report Type");
        xComboBox6.setDepends(new String[] {"entity.reporttype"});
        xComboBox6.setExpression("#{item.caption}");
        xComboBox6.setItems("reports");
        xComboBox6.setName("report"); // NOI18N
        xComboBox6.setAllowNull(false);
        xComboBox6.setImmediate(true);
        xComboBox6.setPreferredSize(new java.awt.Dimension(0, 20));
        xComboBox6.setRequired(true);
        xFormPanel1.add(xComboBox6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XComboBox xComboBox6;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * RPTDelinquencyBuildPage.java
 *
 * Created on March 19, 2014, 9:30 PM
 */

package com.rameses.gov.etracs.landtax.report.views;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.Template;

@Template(FormPage.class)
public class BuildRPTDelinquencyInitPage extends javax.swing.JPanel {
    
    /** Creates new form RPTDelinquencyBuildPage */
    public BuildRPTDelinquencyInitPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xButton2 = new com.rameses.rcp.control.XButton();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xDateField1 = new com.rameses.rcp.control.XDateField();

        xButton2.setText("xButton2");

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setPadding(new java.awt.Insets(25, 10, 10, 10));
        xTitledBorder1.setTitle("Initial Information");
        xFormPanel1.setBorder(xTitledBorder1);
        xFormPanel1.setCaptionBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xFormPanel1.setCaptionVAlignment(com.rameses.rcp.constant.UIConstants.CENTER);
        xFormPanel1.setCaptionWidth(110);

        xDateField1.setCaption("Date Computed");
        xDateField1.setCellPadding(new java.awt.Insets(5, 0, 0, 0));
        xDateField1.setName("entity.dtcomputed"); // NOI18N
        xDateField1.setRequired(true);
        xFormPanel1.add(xDateField1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XButton xButton2;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    // End of variables declaration//GEN-END:variables
    
}

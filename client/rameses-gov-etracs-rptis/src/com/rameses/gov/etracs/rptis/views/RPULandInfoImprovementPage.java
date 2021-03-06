/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.gov.etracs.rptis.views;

import com.rameses.rcp.ui.annotations.StyleSheet;

@StyleSheet()
public class RPULandInfoImprovementPage extends javax.swing.JPanel {

    /**
     * Creates new form RpuLandImprovementPage
     */
    public RPULandInfoImprovementPage() {
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

        xDataTable4 = new com.rameses.rcp.control.XDataTable();
        jPanel10 = new javax.swing.JPanel();
        formPanel19 = new com.rameses.rcp.util.FormPanel();
        xDecimalField11 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField12 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField13 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField14 = new com.rameses.rcp.control.XDecimalField();

        xDataTable4.setDynamic(true);
        xDataTable4.setHandler("planttreeListHandler");
        xDataTable4.setName("selectedPlantTree"); // NOI18N

        jPanel10.setLayout(new java.awt.BorderLayout());

        formPanel19.setCaptionBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        formPanel19.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel19.setPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel19.setPreferredSize(new java.awt.Dimension(255, 23));
        formPanel19.setShowCaption(false);

        xDecimalField11.setCaption("B.M.V");
        xDecimalField11.setCaptionWidth(50);
        xDecimalField11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        xDecimalField11.setName("entity.rpu.totalplanttreebmv"); // NOI18N
        xDecimalField11.setPreferredSize(new java.awt.Dimension(100, 19));
        xDecimalField11.setReadonly(true);
        formPanel19.add(xDecimalField11);

        xDecimalField12.setCaption("Adjustment");
        xDecimalField12.setCaptionWidth(80);
        xDecimalField12.setCellPadding(new java.awt.Insets(0, 30, 0, 0));
        xDecimalField12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        xDecimalField12.setName("entity.rpu.totalplanttreeadjustment"); // NOI18N
        xDecimalField12.setPreferredSize(new java.awt.Dimension(100, 19));
        xDecimalField12.setReadonly(true);
        formPanel19.add(xDecimalField12);

        xDecimalField13.setCaption("M.V.");
        xDecimalField13.setCaptionWidth(50);
        xDecimalField13.setCellPadding(new java.awt.Insets(0, 30, 0, 0));
        xDecimalField13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        xDecimalField13.setName("entity.rpu.totalplanttreemv"); // NOI18N
        xDecimalField13.setPreferredSize(new java.awt.Dimension(100, 19));
        xDecimalField13.setReadonly(true);
        formPanel19.add(xDecimalField13);

        xDecimalField14.setCaption("A.V.");
        xDecimalField14.setCaptionWidth(50);
        xDecimalField14.setCellPadding(new java.awt.Insets(0, 30, 0, 0));
        xDecimalField14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        xDecimalField14.setName("entity.rpu.totalplanttreeav"); // NOI18N
        xDecimalField14.setPreferredSize(new java.awt.Dimension(100, 19));
        xDecimalField14.setReadonly(true);
        formPanel19.add(xDecimalField14);

        jPanel10.add(formPanel19, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(xDataTable4, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(xDataTable4, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addGap(29, 29, 29)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 254, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel19;
    private javax.swing.JPanel jPanel10;
    private com.rameses.rcp.control.XDataTable xDataTable4;
    private com.rameses.rcp.control.XDecimalField xDecimalField11;
    private com.rameses.rcp.control.XDecimalField xDecimalField12;
    private com.rameses.rcp.control.XDecimalField xDecimalField13;
    private com.rameses.rcp.control.XDecimalField xDecimalField14;
    // End of variables declaration//GEN-END:variables
}

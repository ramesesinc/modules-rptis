/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.gov.etracs.rpt.faas.change.ui;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.Template;

@Template(ChangeInfoPage.class)
public class ChangePropertyInfoPage extends javax.swing.JPanel {

    /**
     * Creates new form ChangeBoundaryPage
     */
    public ChangePropertyInfoPage() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        formPanel5 = new com.rameses.rcp.util.FormPanel();
        xTextField17 = new com.rameses.rcp.control.XTextField();
        xTextField18 = new com.rameses.rcp.control.XTextField();
        xTextField19 = new com.rameses.rcp.control.XTextField();
        xTextField21 = new com.rameses.rcp.control.XTextField();
        xTextField22 = new com.rameses.rcp.control.XTextField();
        formPanel6 = new com.rameses.rcp.util.FormPanel();
        xTextField9 = new com.rameses.rcp.control.XTextField();
        xTextField11 = new com.rameses.rcp.control.XTextField();
        xTextField10 = new com.rameses.rcp.control.XTextField();
        xTextField12 = new com.rameses.rcp.control.XTextField();
        jPanel2 = new javax.swing.JPanel();
        formPanel7 = new com.rameses.rcp.util.FormPanel();
        xTextField23 = new com.rameses.rcp.control.XTextField();
        xTextField24 = new com.rameses.rcp.control.XTextField();
        xTextField25 = new com.rameses.rcp.control.XTextField();
        xTextField27 = new com.rameses.rcp.control.XTextField();
        xTextField28 = new com.rameses.rcp.control.XTextField();
        formPanel8 = new com.rameses.rcp.util.FormPanel();
        xTextField13 = new com.rameses.rcp.control.XTextField();
        xTextField14 = new com.rameses.rcp.control.XTextField();
        xTextField15 = new com.rameses.rcp.control.XTextField();
        xTextField16 = new com.rameses.rcp.control.XTextField();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Lot No. and Survey Information");
        formPanel5.setBorder(xTitledBorder1);
        formPanel5.setCaptionWidth(105);

        xTextField17.setCaption("Cadastral Lot No.");
        xTextField17.setCaptionWidth(120);
        xTextField17.setName("changeinfo.newinfo.cadastrallotno"); // NOI18N
        xTextField17.setPreferredSize(new java.awt.Dimension(0, 20));
        xTextField17.setRequired(true);
        formPanel5.add(xTextField17);

        xTextField18.setCaption("Survey No.");
        xTextField18.setCaptionWidth(120);
        xTextField18.setName("changeinfo.newinfo.surveyno"); // NOI18N
        xTextField18.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel5.add(xTextField18);

        xTextField19.setCaption("Block No.");
        xTextField19.setCaptionWidth(120);
        xTextField19.setName("changeinfo.newinfo.blockno"); // NOI18N
        xTextField19.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel5.add(xTextField19);

        xTextField21.setCaption("Street");
        xTextField21.setCaptionWidth(120);
        xTextField21.setName("changeinfo.newinfo.street"); // NOI18N
        xTextField21.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel5.add(xTextField21);

        xTextField22.setCaption("Purok/Zone");
        xTextField22.setCaptionWidth(120);
        xTextField22.setName("changeinfo.newinfo.purok"); // NOI18N
        xTextField22.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel5.add(xTextField22);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Boundary Details");
        formPanel6.setBorder(xTitledBorder2);

        xTextField9.setCaption("North");
        xTextField9.setCaptionWidth(60);
        xTextField9.setIndex(100);
        xTextField9.setName("changeinfo.newinfo.north"); // NOI18N
        xTextField9.setPreferredSize(new java.awt.Dimension(0, 20));
        xTextField9.setRequired(true);
        formPanel6.add(xTextField9);

        xTextField11.setCaption("East");
        xTextField11.setCaptionWidth(60);
        xTextField11.setIndex(100);
        xTextField11.setName("changeinfo.newinfo.east"); // NOI18N
        xTextField11.setPreferredSize(new java.awt.Dimension(0, 20));
        xTextField11.setRequired(true);
        formPanel6.add(xTextField11);

        xTextField10.setCaption("South");
        xTextField10.setCaptionWidth(60);
        xTextField10.setIndex(100);
        xTextField10.setName("changeinfo.newinfo.south"); // NOI18N
        xTextField10.setPreferredSize(new java.awt.Dimension(0, 20));
        xTextField10.setRequired(true);
        formPanel6.add(xTextField10);

        xTextField12.setCaption("West");
        xTextField12.setCaptionWidth(60);
        xTextField12.setIndex(100);
        xTextField12.setName("changeinfo.newinfo.west"); // NOI18N
        xTextField12.setPreferredSize(new java.awt.Dimension(0, 20));
        xTextField12.setRequired(true);
        formPanel6.add(xTextField12);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                    .addComponent(formPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Modified Information", jPanel1);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setTitle("Lot No. and Survey Information");
        formPanel7.setBorder(xTitledBorder3);
        formPanel7.setCaptionWidth(105);

        xTextField23.setCaption("Cadastral Lot No.");
        xTextField23.setCaptionWidth(120);
        xTextField23.setEnabled(false);
        xTextField23.setName("changeinfo.previnfo.cadastrallotno"); // NOI18N
        xTextField23.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel7.add(xTextField23);

        xTextField24.setCaption("Survey No.");
        xTextField24.setCaptionWidth(120);
        xTextField24.setEnabled(false);
        xTextField24.setName("changeinfo.previnfo.surveyno"); // NOI18N
        xTextField24.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel7.add(xTextField24);

        xTextField25.setCaption("Block No.");
        xTextField25.setCaptionWidth(120);
        xTextField25.setEnabled(false);
        xTextField25.setName("changeinfo.previnfo.blockno"); // NOI18N
        xTextField25.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel7.add(xTextField25);

        xTextField27.setCaption("Street");
        xTextField27.setCaptionWidth(120);
        xTextField27.setEnabled(false);
        xTextField27.setName("changeinfo.previnfo.street"); // NOI18N
        xTextField27.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel7.add(xTextField27);

        xTextField28.setCaption("Purok/Zone");
        xTextField28.setCaptionWidth(120);
        xTextField28.setEnabled(false);
        xTextField28.setName("changeinfo.previnfo.purok"); // NOI18N
        xTextField28.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel7.add(xTextField28);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder4 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder4.setTitle("Boundary Details");
        formPanel8.setBorder(xTitledBorder4);

        xTextField13.setCaption("North");
        xTextField13.setCaptionWidth(60);
        xTextField13.setEnabled(false);
        xTextField13.setIndex(100);
        xTextField13.setName("changeinfo.previnfo.north"); // NOI18N
        xTextField13.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel8.add(xTextField13);

        xTextField14.setCaption("East");
        xTextField14.setCaptionWidth(60);
        xTextField14.setEnabled(false);
        xTextField14.setIndex(100);
        xTextField14.setName("changeinfo.previnfo.east"); // NOI18N
        xTextField14.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel8.add(xTextField14);

        xTextField15.setCaption("South");
        xTextField15.setCaptionWidth(60);
        xTextField15.setEnabled(false);
        xTextField15.setIndex(100);
        xTextField15.setName("changeinfo.previnfo.south"); // NOI18N
        xTextField15.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel8.add(xTextField15);

        xTextField16.setCaption("West");
        xTextField16.setCaptionWidth(60);
        xTextField16.setEnabled(false);
        xTextField16.setIndex(100);
        xTextField16.setName("changeinfo.previnfo.west"); // NOI18N
        xTextField16.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel8.add(xTextField16);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                    .addComponent(formPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Previous Information", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel5;
    private com.rameses.rcp.util.FormPanel formPanel6;
    private com.rameses.rcp.util.FormPanel formPanel7;
    private com.rameses.rcp.util.FormPanel formPanel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.rameses.rcp.control.XTextField xTextField10;
    private com.rameses.rcp.control.XTextField xTextField11;
    private com.rameses.rcp.control.XTextField xTextField12;
    private com.rameses.rcp.control.XTextField xTextField13;
    private com.rameses.rcp.control.XTextField xTextField14;
    private com.rameses.rcp.control.XTextField xTextField15;
    private com.rameses.rcp.control.XTextField xTextField16;
    private com.rameses.rcp.control.XTextField xTextField17;
    private com.rameses.rcp.control.XTextField xTextField18;
    private com.rameses.rcp.control.XTextField xTextField19;
    private com.rameses.rcp.control.XTextField xTextField21;
    private com.rameses.rcp.control.XTextField xTextField22;
    private com.rameses.rcp.control.XTextField xTextField23;
    private com.rameses.rcp.control.XTextField xTextField24;
    private com.rameses.rcp.control.XTextField xTextField25;
    private com.rameses.rcp.control.XTextField xTextField27;
    private com.rameses.rcp.control.XTextField xTextField28;
    private com.rameses.rcp.control.XTextField xTextField9;
    // End of variables declaration//GEN-END:variables
}

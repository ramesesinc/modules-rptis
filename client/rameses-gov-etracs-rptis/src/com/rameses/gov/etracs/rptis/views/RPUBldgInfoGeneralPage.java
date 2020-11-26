/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.gov.etracs.rptis.views;

import com.rameses.rcp.ui.annotations.StyleSheet;

@StyleSheet()
public class RPUBldgInfoGeneralPage extends javax.swing.JPanel {

    /**
     * Creates new form BldgRpuInfoGeneralPage
     */
    public RPUBldgInfoGeneralPage() {
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

        jPanel3 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xComboBox4 = new com.rameses.rcp.control.XComboBox();
        xComboBox3 = new com.rameses.rcp.control.XComboBox();
        xIntegerField2 = new com.rameses.rcp.control.XIntegerField();
        xDateField2 = new com.rameses.rcp.control.XDateField();
        xDateField5 = new com.rameses.rcp.control.XDateField();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xTextField12 = new com.rameses.rcp.control.XTextField();
        xDateField10 = new com.rameses.rcp.control.XDateField();
        xFormPanel2 = new com.rameses.rcp.control.XFormPanel();
        xTextField13 = new com.rameses.rcp.control.XTextField();
        xDateField11 = new com.rameses.rcp.control.XDateField();
        xSeparator1 = new com.rameses.rcp.control.XSeparator();
        xTextField8 = new com.rameses.rcp.control.XTextField();
        xDateField7 = new com.rameses.rcp.control.XDateField();
        jScrollPane2 = new javax.swing.JScrollPane();
        xTextArea2 = new com.rameses.rcp.control.XTextArea();
        formPanel12 = new com.rameses.rcp.util.FormPanel();
        xIntegerField1 = new com.rameses.rcp.control.XIntegerField();
        xIntegerField3 = new com.rameses.rcp.control.XIntegerField();
        xComboBox5 = new com.rameses.rcp.control.XComboBox();
        xNumberField12 = new com.rameses.rcp.control.XNumberField();
        xNumberField13 = new com.rameses.rcp.control.XNumberField();
        xNumberField15 = new com.rameses.rcp.control.XNumberField();
        formPanel15 = new com.rameses.rcp.util.FormPanel();
        xCheckBox5 = new com.rameses.rcp.control.XCheckBox();
        xDecimalField1 = new com.rameses.rcp.control.XDecimalField();
        xCheckBox4 = new com.rameses.rcp.control.XCheckBox();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(702, 300));

        formPanel1.setCaptionWidth(125);
        formPanel1.setOpaque(true);

        xComboBox4.setAllowNull(false);
        xComboBox4.setCaption("Classification");
        xComboBox4.setExpression("#{item.name}");
        xComboBox4.setIndex(-4);
        xComboBox4.setItems("classifications");
        xComboBox4.setName("entity.rpu.classification"); // NOI18N
        xComboBox4.setPreferredSize(new java.awt.Dimension(0, 22));
        xComboBox4.setRequired(true);
        formPanel1.add(xComboBox4);

        xComboBox3.setCaption("Building Class");
        xComboBox3.setDynamic(true);
        xComboBox3.setEmptyText("- NA -");
        xComboBox3.setImmediate(true);
        xComboBox3.setIndex(-8);
        xComboBox3.setItems("classList");
        xComboBox3.setName("entity.rpu.bldgclass"); // NOI18N
        xComboBox3.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel1.add(xComboBox3);

        xIntegerField2.setCaption("Percent Completed");
        xIntegerField2.setIndex(-7);
        xIntegerField2.setName("entity.rpu.percentcompleted"); // NOI18N
        xIntegerField2.setPreferredSize(new java.awt.Dimension(0, 19));
        xIntegerField2.setRequired(true);
        formPanel1.add(xIntegerField2);

        xDateField2.setCaption("Date Constructed");
        xDateField2.setName("entity.rpu.dtconstructed"); // NOI18N
        xDateField2.setCaptionWidth(125);
        xDateField2.setIndex(-5);
        xDateField2.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xDateField2);

        xDateField5.setCaption("Date Completed");
        xDateField5.setCaptionWidth(125);
        xDateField5.setIndex(-6);
        xDateField5.setName("entity.rpu.dtcompleted"); // NOI18N
        xDateField5.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xDateField5);

        xDateField1.setCaption("Date Occupied");
        xDateField1.setName("entity.rpu.dtoccupied"); // NOI18N
        xDateField1.setCaptionWidth(125);
        xDateField1.setIndex(-5);
        xDateField1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xDateField1);

        xFormPanel1.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        xFormPanel1.setPadding(new java.awt.Insets(0, 0, 0, 0));
        xFormPanel1.setPreferredSize(new java.awt.Dimension(0, 21));
        xFormPanel1.setShowCaption(false);

        xTextField12.setCaption("Bldg Permit No.");
        xTextField12.setName("entity.rpu.permitno"); // NOI18N
        xTextField12.setCaptionWidth(125);
        xTextField12.setPreferredSize(new java.awt.Dimension(112, 20));
        xFormPanel1.add(xTextField12);

        xDateField10.setCaption("Date Issued");
        xDateField10.setName("entity.rpu.permitdate"); // NOI18N
        xDateField10.setCaptionWidth(80);
        xDateField10.setCellPadding(new java.awt.Insets(0, 5, 0, 0));
        xDateField10.setIndex(-6);
        xDateField10.setPreferredSize(new java.awt.Dimension(70, 20));
        xFormPanel1.add(xDateField10);

        formPanel1.add(xFormPanel1);

        xFormPanel2.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        xFormPanel2.setPadding(new java.awt.Insets(0, 0, 0, 0));
        xFormPanel2.setPreferredSize(new java.awt.Dimension(0, 21));
        xFormPanel2.setShowCaption(false);

        xTextField13.setCaption("Occupancy Permit No.");
        xTextField13.setName("entity.rpu.occpermitno"); // NOI18N
        xTextField13.setCaptionWidth(125);
        xTextField13.setPreferredSize(new java.awt.Dimension(112, 20));
        xFormPanel2.add(xTextField13);

        xDateField11.setCaption("Date Issued");
        xDateField11.setName("entity.rpu.dtcertoccupancy"); // NOI18N
        xDateField11.setCaptionWidth(80);
        xDateField11.setCellPadding(new java.awt.Insets(0, 5, 0, 0));
        xDateField11.setIndex(-6);
        xDateField11.setPreferredSize(new java.awt.Dimension(70, 20));
        xFormPanel2.add(xDateField11);

        formPanel1.add(xFormPanel2);

        xSeparator1.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout xSeparator1Layout = new javax.swing.GroupLayout(xSeparator1);
        xSeparator1.setLayout(xSeparator1Layout);
        xSeparator1Layout.setHorizontalGroup(
            xSeparator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        xSeparator1Layout.setVerticalGroup(
            xSeparator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        formPanel1.add(xSeparator1);

        xTextField8.setCaption("Condominium Certificate of Title");
        xTextField8.setName("entity.rpu.condocerttitle"); // NOI18N
        xTextField8.setCaptionWidth(200);
        xTextField8.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel1.add(xTextField8);

        xDateField7.setCaption("Certificate of Completion Issuance");
        xDateField7.setName("entity.rpu.dtcertcompletion"); // NOI18N
        xDateField7.setCaptionWidth(200);
        xDateField7.setIndex(-6);
        xDateField7.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel1.add(xDateField7);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(0, 60));

        xTextArea2.setCaption("Additional Information");
        xTextArea2.setLineWrap(true);
        xTextArea2.setName("entity.rpu.additionalinfo"); // NOI18N
        xTextArea2.setWrapStyleWord(true);
        xTextArea2.setCaptionWidth(125);
        xTextArea2.setPreferredSize(new java.awt.Dimension(164, 30));
        jScrollPane2.setViewportView(xTextArea2);

        formPanel1.add(jScrollPane2);

        formPanel12.setCaptionWidth(125);
        formPanel12.setOpaque(true);
        formPanel12.setPreferredSize(new java.awt.Dimension(450, 200));

        xIntegerField1.setCaption("Building Age");
        xIntegerField1.setDepends(new String[] {"entity.rpu.dtcompleted", "entity.rpu.dtoccupied"});
        xIntegerField1.setEnabled(false);
        xIntegerField1.setName("entity.rpu.bldgage"); // NOI18N
        xIntegerField1.setPreferredSize(new java.awt.Dimension(0, 19));
        xIntegerField1.setRequired(true);
        formPanel12.add(xIntegerField1);

        xIntegerField3.setCaption("Effective Age");
        xIntegerField3.setDepends(new String[] {"entity.rpu.dtcompleted", "entity.rpu.dtoccupied"});
        xIntegerField3.setName("entity.rpu.effectiveage"); // NOI18N
        xIntegerField3.setPreferredSize(new java.awt.Dimension(0, 19));
        xIntegerField3.setRequired(true);
        formPanel12.add(xIntegerField3);

        xComboBox5.setCaption("CDU Rating");
        xComboBox5.setDynamic(true);
        xComboBox5.setImmediate(true);
        xComboBox5.setIndex(-8);
        xComboBox5.setItems("cduRatings");
        xComboBox5.setName("entity.rpu.cdurating"); // NOI18N
        xComboBox5.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel12.add(xComboBox5);

        xNumberField12.setCaption("Depreciation ( % )");
        xNumberField12.setName("entity.rpu.depreciation"); // NOI18N
        xNumberField12.setDepends(new String[] {"dtcompleted", "dtoccupied"});
        xNumberField12.setFieldType(java.math.BigDecimal.class);
        xNumberField12.setPattern("#,##0.00");
        xNumberField12.setPreferredSize(new java.awt.Dimension(0, 19));
        xNumberField12.setRequired(true);
        formPanel12.add(xNumberField12);

        xNumberField13.setCaption("Depreciation Value");
        xNumberField13.setName("entity.rpu.depreciationvalue"); // NOI18N
        xNumberField13.setDepends(new String[] {"entity.rpu.dtcompleted", "entity.rpu.dtoccupied"});
        xNumberField13.setEnabled(false);
        xNumberField13.setFieldType(java.math.BigDecimal.class);
        xNumberField13.setPattern("#,##0.00");
        xNumberField13.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel12.add(xNumberField13);

        xNumberField15.setCaption("Floor Count");
        xNumberField15.setFieldType(Integer.class);
        xNumberField15.setName("entity.rpu.floorcount"); // NOI18N
        xNumberField15.setPreferredSize(new java.awt.Dimension(50, 19));
        xNumberField15.setRequired(true);
        formPanel12.add(xNumberField15);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setPadding(new java.awt.Insets(25, 10, 10, 0));
        xTitledBorder1.setTitle("Sworn Statement Information");
        formPanel15.setBorder(xTitledBorder1);
        formPanel15.setShowCaption(false);

        xCheckBox5.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xCheckBox5.setCaption("");
        xCheckBox5.setMargin(new java.awt.Insets(0, 0, 10, 0));
        xCheckBox5.setName("entity.rpu.hasswornamount"); // NOI18N
        xCheckBox5.setShowCaption(false);
        xCheckBox5.setText("Sworn Statement");
        formPanel15.add(xCheckBox5);

        xDecimalField1.setCaption("Sworn Amount");
        xDecimalField1.setCaptionWidth(100);
        xDecimalField1.setCellPadding(new java.awt.Insets(10, 20, 0, 20));
        xDecimalField1.setName("entity.rpu.swornamount"); // NOI18N
        xDecimalField1.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel15.add(xDecimalField1);

        xCheckBox4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xCheckBox4.setCaption("");
        xCheckBox4.setCellPadding(new java.awt.Insets(0, 20, 0, 0));
        xCheckBox4.setDepends(new String[] {"rpu.hasswornstatement"});
        xCheckBox4.setName("entity.rpu.useswornamount"); // NOI18N
        xCheckBox4.setPreferredSize(new java.awt.Dimension(200, 19));
        xCheckBox4.setShowCaption(false);
        xCheckBox4.setText("Use Sworn Amount?");
        formPanel15.add(xCheckBox4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(formPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(formPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(formPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel12;
    private com.rameses.rcp.util.FormPanel formPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private com.rameses.rcp.control.XCheckBox xCheckBox4;
    private com.rameses.rcp.control.XCheckBox xCheckBox5;
    private com.rameses.rcp.control.XComboBox xComboBox3;
    private com.rameses.rcp.control.XComboBox xComboBox4;
    private com.rameses.rcp.control.XComboBox xComboBox5;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XDateField xDateField10;
    private com.rameses.rcp.control.XDateField xDateField11;
    private com.rameses.rcp.control.XDateField xDateField2;
    private com.rameses.rcp.control.XDateField xDateField5;
    private com.rameses.rcp.control.XDateField xDateField7;
    private com.rameses.rcp.control.XDecimalField xDecimalField1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XFormPanel xFormPanel2;
    private com.rameses.rcp.control.XIntegerField xIntegerField1;
    private com.rameses.rcp.control.XIntegerField xIntegerField2;
    private com.rameses.rcp.control.XIntegerField xIntegerField3;
    private com.rameses.rcp.control.XNumberField xNumberField12;
    private com.rameses.rcp.control.XNumberField xNumberField13;
    private com.rameses.rcp.control.XNumberField xNumberField15;
    private com.rameses.rcp.control.XSeparator xSeparator1;
    private com.rameses.rcp.control.XTextArea xTextArea2;
    private com.rameses.rcp.control.XTextField xTextField12;
    private com.rameses.rcp.control.XTextField xTextField13;
    private com.rameses.rcp.control.XTextField xTextField8;
    // End of variables declaration//GEN-END:variables
}

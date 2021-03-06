/*
 * BldgRYSettingPage.java
 *
 * Created on June 21, 2011, 4:23 PM
 */

package com.rameses.gov.etracs.rptis.rysetting.views;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

@Template(FormPage.class)
@StyleSheet
public class BldgTypeInfoPage extends javax.swing.JPanel {
    
    /** Creates new form BldgRYSettingPage */
    public BldgTypeInfoPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        xDataTable3 = new com.rameses.rcp.control.XDataTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xActionTextField1 = new com.rameses.rcp.control.XActionTextField();
        xSubFormPanel1 = new com.rameses.rcp.control.XSubFormPanel();
        jPanel8 = new javax.swing.JPanel();
        formPanel3 = new com.rameses.rcp.util.FormPanel();
        xNumberField2 = new com.rameses.rcp.control.XNumberField();
        xCheckBox1 = new com.rameses.rcp.control.XCheckBox();
        xSubFormPanel2 = new com.rameses.rcp.control.XSubFormPanel();

        setLayout(new java.awt.BorderLayout());

        xDataTable3.setHandler("bldgTypeListHandler");
        xDataTable3.setName("selectedBldgType"); // NOI18N
        xDataTable3.setImmediate(true);

        formPanel2.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);

        xComboBox1.setAllowNull(false);
        xComboBox1.setCaption("Base Value Type");
        xComboBox1.setCaptionWidth(110);
        xComboBox1.setDepends(new String[] {"selectedBldgType"});
        xComboBox1.setDynamic(true);
        xComboBox1.setImmediate(true);
        xComboBox1.setItems("baseValueTypes");
        xComboBox1.setName("baseValueType"); // NOI18N
        xComboBox1.setPreferredSize(new java.awt.Dimension(150, 22));
        xComboBox1.setRequired(true);
        formPanel2.add(xComboBox1);

        xActionTextField1.setActionCommand("search");
        xActionTextField1.setCaption("Search");
        xActionTextField1.setCaptionWidth(60);
        xActionTextField1.setCellPadding(new java.awt.Insets(0, 10, 0, 0));
        xActionTextField1.setHint("Search");
        xActionTextField1.setName("searchtext"); // NOI18N
        xActionTextField1.setPreferredSize(new java.awt.Dimension(120, 20));
        xActionTextField1.setShowCaption(false);
        xActionTextField1.setToolTipText("Search");
        formPanel2.add(xActionTextField1);

        xSubFormPanel1.setDepends(new String[] {"selectedBldgType", "baseValueType"});
        xSubFormPanel1.setHandler("baseValueHandler");
        xSubFormPanel1.setDynamic(true);

        org.jdesktop.layout.GroupLayout xSubFormPanel1Layout = new org.jdesktop.layout.GroupLayout(xSubFormPanel1);
        xSubFormPanel1.setLayout(xSubFormPanel1Layout);
        xSubFormPanel1Layout.setHorizontalGroup(
            xSubFormPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 536, Short.MAX_VALUE)
        );
        xSubFormPanel1Layout.setVerticalGroup(
            xSubFormPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 325, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, formPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, xSubFormPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xSubFormPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Kind of Buildings and Unit Value", jPanel4);

        formPanel3.setCaptionWidth(130);

        xNumberField2.setCaption("Residual Rate (%)");
        xNumberField2.setName("selectedBldgType.residualrate"); // NOI18N
        xNumberField2.setDepends(new String[] {"selectedBldgType"});
        xNumberField2.setPreferredSize(new java.awt.Dimension(100, 19));
        xNumberField2.setRequired(true);
        formPanel3.add(xNumberField2);

        xCheckBox1.setDepends(new String[] {"selectedBldgType"});
        xCheckBox1.setName("selectedBldgType.usecdu"); // NOI18N
        xCheckBox1.setShowCaption(false);
        xCheckBox1.setText(" Use CDU Depreciation Rating?");
        formPanel3.add(xCheckBox1);

        xSubFormPanel2.setDepends(new String[] {"selectedBldgType", "selectedBldgType.usecdu"});
        xSubFormPanel2.setHandler("depreciationHandler");
        xSubFormPanel2.setDynamic(true);

        org.jdesktop.layout.GroupLayout xSubFormPanel2Layout = new org.jdesktop.layout.GroupLayout(xSubFormPanel2);
        xSubFormPanel2.setLayout(xSubFormPanel2Layout);
        xSubFormPanel2Layout.setHorizontalGroup(
            xSubFormPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 536, Short.MAX_VALUE)
        );
        xSubFormPanel2Layout.setVerticalGroup(
            xSubFormPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 293, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jPanel8Layout = new org.jdesktop.layout.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(formPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .add(xSubFormPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xSubFormPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Depreciation Schedule", jPanel8);

        org.jdesktop.layout.GroupLayout jPanel7Layout = new org.jdesktop.layout.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .add(xDataTable3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 293, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTabbedPane2)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jTabbedPane2)
                    .add(xDataTable3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(jPanel7, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel2;
    private com.rameses.rcp.util.FormPanel formPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane2;
    private com.rameses.rcp.control.XActionTextField xActionTextField1;
    private com.rameses.rcp.control.XCheckBox xCheckBox1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XDataTable xDataTable3;
    private com.rameses.rcp.control.XNumberField xNumberField2;
    private com.rameses.rcp.control.XSubFormPanel xSubFormPanel1;
    private com.rameses.rcp.control.XSubFormPanel xSubFormPanel2;
    // End of variables declaration//GEN-END:variables
    
}

/*
 * AbstractOfCollectionInitPage.java
 *
 * Created on June 3, 2011, 1:35 PM
 */

package com.rameses.gov.etracs.rpt.landtax.billing.ui;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;


@StyleSheet()
@Template(FormPage.class)
public class RPTBillingBatchReportPage extends javax.swing.JPanel {
    
    /**
     * Creates new form AbstractOfCollectionInitPage
     */
    public RPTBillingBatchReportPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xComboBox5 = new com.rameses.rcp.control.XComboBox();
        xComboBox3 = new com.rameses.rcp.control.XComboBox();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xSeparator1 = new com.rameses.rcp.control.XSeparator();
        xCheckBox3 = new com.rameses.rcp.control.XCheckBox();
        xDateField2 = new com.rameses.rcp.control.XDateField();
        xSeparator2 = new com.rameses.rcp.control.XSeparator();
        xIntegerField2 = new com.rameses.rcp.control.XIntegerField();
        xIntegerField1 = new com.rameses.rcp.control.XIntegerField();
        xCheckBox1 = new com.rameses.rcp.control.XCheckBox();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xPanel2 = new com.rameses.rcp.control.XPanel();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        xLabel4 = new com.rameses.rcp.control.XLabel();

        setPreferredSize(new java.awt.Dimension(603, 291));

        formPanel1.setCaptionWidth(120);
        formPanel1.setPadding(new java.awt.Insets(5, 10, 5, 25));

        xComboBox5.setCaption("LGU");
        xComboBox5.setDepends(new String[] {"params.selectiontype"});
        xComboBox5.setExpression("#{item.name}");
        xComboBox5.setIndex(2);
        xComboBox5.setItems("lgus");
        xComboBox5.setName("params.lgu"); // NOI18N
        xComboBox5.setPreferredSize(new java.awt.Dimension(0, 21));
        xComboBox5.setRequired(true);
        formPanel1.add(xComboBox5);

        xComboBox3.setCaption("Barangay");
        xComboBox3.setDepends(new String[] {"params.selectiontype", "params.lgu"});
        xComboBox3.setDynamic(true);
        xComboBox3.setExpression("#{item.name}");
        xComboBox3.setIndex(2);
        xComboBox3.setItems("barangays");
        xComboBox3.setName("params.barangay"); // NOI18N
        xComboBox3.setPreferredSize(new java.awt.Dimension(0, 21));
        xComboBox3.setRequired(true);
        formPanel1.add(xComboBox3);

        xTextField1.setCaption("Section");
        xTextField1.setName("params.section"); // NOI18N
        formPanel1.add(xTextField1);

        xSeparator1.setCellPadding(new java.awt.Insets(10, 0, 0, 0));
        xSeparator1.setPreferredSize(new java.awt.Dimension(0, 20));

        org.jdesktop.layout.GroupLayout xSeparator1Layout = new org.jdesktop.layout.GroupLayout(xSeparator1);
        xSeparator1.setLayout(xSeparator1Layout);
        xSeparator1Layout.setHorizontalGroup(
            xSeparator1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 371, Short.MAX_VALUE)
        );
        xSeparator1Layout.setVerticalGroup(
            xSeparator1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );

        formPanel1.add(xSeparator1);

        xCheckBox3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xCheckBox3.setCaption("");
        xCheckBox3.setCaptionWidth(90);
        xCheckBox3.setCellPadding(new java.awt.Insets(5, 0, 0, 0));
        xCheckBox3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        xCheckBox3.setName("params.advancebill"); // NOI18N
        xCheckBox3.setShowCaption(false);
        xCheckBox3.setText("Is Advance Billing?");
        formPanel1.add(xCheckBox3);

        xDateField2.setCaption("Advance Billing Date");
        xDateField2.setCaptionWidth(120);
        xDateField2.setCellPadding(new java.awt.Insets(0, 40, 0, 0));
        xDateField2.setDepends(new String[] {"params.advancebill"});
        xDateField2.setName("params.billdate"); // NOI18N
        xDateField2.setPreferredSize(new java.awt.Dimension(100, 19));
        formPanel1.add(xDateField2);

        xSeparator2.setCellPadding(new java.awt.Insets(10, 0, 0, 0));
        xSeparator2.setPreferredSize(new java.awt.Dimension(0, 20));

        org.jdesktop.layout.GroupLayout xSeparator2Layout = new org.jdesktop.layout.GroupLayout(xSeparator2);
        xSeparator2.setLayout(xSeparator2Layout);
        xSeparator2Layout.setHorizontalGroup(
            xSeparator2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 371, Short.MAX_VALUE)
        );
        xSeparator2Layout.setVerticalGroup(
            xSeparator2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );

        formPanel1.add(xSeparator2);

        xIntegerField2.setCaption("No. of Copies");
        xIntegerField2.setName("params.copies"); // NOI18N
        xIntegerField2.setPreferredSize(new java.awt.Dimension(50, 20));
        xIntegerField2.setRequired(true);
        formPanel1.add(xIntegerField2);

        xIntegerField1.setCaption("Print Interval (sec)");
        xIntegerField1.setName("params.printinterval"); // NOI18N
        xIntegerField1.setPreferredSize(new java.awt.Dimension(50, 20));
        xIntegerField1.setRequired(true);
        formPanel1.add(xIntegerField1);

        xCheckBox1.setName("params.showprinterdialog"); // NOI18N
        xCheckBox1.setShowCaption(false);
        xCheckBox1.setText("Show Printer Dialog?");
        formPanel1.add(xCheckBox1);

        xLabel1.setExpression("#{msg}");
        xLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        xLabel1.setForeground(new java.awt.Color(153, 0, 0));
        xLabel1.setName("msg"); // NOI18N

        xPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 10, 0));
        xPanel2.setVisibleWhen("#{mode == 'processing'}");
        xPanel2.setLayout(new java.awt.BorderLayout());

        xLabel3.setFontStyle("font-weight:bold;font-size:12;");
        xLabel3.setForeground(new java.awt.Color(51, 51, 51));
        xLabel3.setPadding(new java.awt.Insets(1, 5, 1, 1));
        xLabel3.setPreferredSize(new java.awt.Dimension(150, 20));
        xLabel3.setText("Processing request please wait...");
        xPanel2.add(xLabel3, java.awt.BorderLayout.CENTER);

        xLabel4.setIconResource("com/rameses/rcp/icons/loading16.gif");
        xPanel2.add(xLabel4, java.awt.BorderLayout.WEST);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(xLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 406, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(xPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 436, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 147, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(xPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 259, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.control.XCheckBox xCheckBox1;
    private com.rameses.rcp.control.XCheckBox xCheckBox3;
    private com.rameses.rcp.control.XComboBox xComboBox3;
    private com.rameses.rcp.control.XComboBox xComboBox5;
    private com.rameses.rcp.control.XDateField xDateField2;
    private com.rameses.rcp.control.XIntegerField xIntegerField1;
    private com.rameses.rcp.control.XIntegerField xIntegerField2;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XPanel xPanel2;
    private com.rameses.rcp.control.XSeparator xSeparator1;
    private com.rameses.rcp.control.XSeparator xSeparator2;
    private com.rameses.rcp.control.XTextField xTextField1;
    // End of variables declaration//GEN-END:variables
    
}

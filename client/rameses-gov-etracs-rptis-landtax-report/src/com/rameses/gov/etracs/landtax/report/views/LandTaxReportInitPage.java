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
public class LandTaxReportInitPage extends javax.swing.JPanel {

    /**
     * Creates new form AbstractRPTCollectionPage
     */
    public LandTaxReportInitPage() {
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

        xPanel1 = new com.rameses.rcp.control.XPanel();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xComboBox4 = new com.rameses.rcp.control.XComboBox();
        xComboBox5 = new com.rameses.rcp.control.XComboBox();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        xDateField2 = new com.rameses.rcp.control.XDateField();
        xDateField3 = new com.rameses.rcp.control.XDateField();
        xComboBox3 = new com.rameses.rcp.control.XComboBox();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Initial Information");
        xPanel1.setBorder(xTitledBorder1);

        xFormPanel1.setCaptionWidth(110);

        xComboBox4.setCaption("Posting Type");
        xComboBox4.setExpression("#{item.caption}");
        xComboBox4.setItems("postingtypes");
        xComboBox4.setName("entity.postingtype"); // NOI18N
        xComboBox4.setAllowNull(false);
        xComboBox4.setPreferredSize(new java.awt.Dimension(0, 20));
        xComboBox4.setRequired(true);
        xFormPanel1.add(xComboBox4);

        xComboBox5.setCaption("Report Type");
        xComboBox5.setExpression("#{item.caption}");
        xComboBox5.setItems("reporttypes");
        xComboBox5.setName("entity.reporttype"); // NOI18N
        xComboBox5.setAllowNull(false);
        xComboBox5.setPreferredSize(new java.awt.Dimension(0, 20));
        xComboBox5.setRequired(true);
        xFormPanel1.add(xComboBox5);

        xComboBox1.setCaption("Period");
        xComboBox1.setItems("periods");
        xComboBox1.setName("entity.period"); // NOI18N
        xComboBox1.setAllowNull(false);
        xComboBox1.setPreferredSize(new java.awt.Dimension(125, 20));
        xComboBox1.setRequired(true);
        xFormPanel1.add(xComboBox1);

        xNumberField1.setCaption("Year");
        xNumberField1.setName("entity.year"); // NOI18N
        xNumberField1.setPattern("#0000");
        xNumberField1.setPreferredSize(new java.awt.Dimension(125, 20));
        xFormPanel1.add(xNumberField1);

        xDateField1.setCaption("Date");
        xDateField1.setName("entity.date"); // NOI18N
        xDateField1.setPreferredSize(new java.awt.Dimension(125, 20));
        xFormPanel1.add(xDateField1);

        xComboBox2.setCaption("Month");
        xComboBox2.setExpression("#{item.caption}");
        xComboBox2.setItems("txnMonths");
        xComboBox2.setName("entity.month"); // NOI18N
        xComboBox2.setPreferredSize(new java.awt.Dimension(125, 20));
        xFormPanel1.add(xComboBox2);

        xDateField2.setCaption("From");
        xDateField2.setName("entity.startdate"); // NOI18N
        xDateField2.setPreferredSize(new java.awt.Dimension(125, 20));
        xFormPanel1.add(xDateField2);

        xDateField3.setCaption("To");
        xDateField3.setName("entity.enddate"); // NOI18N
        xDateField3.setPreferredSize(new java.awt.Dimension(125, 20));
        xFormPanel1.add(xDateField3);

        xComboBox3.setCaption("Collector");
        xComboBox3.setExpression("#{item.lastname+\", \"+item.firstname}");
        xComboBox3.setItems("collectors");
        xComboBox3.setName("entity.collector"); // NOI18N
        xComboBox3.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xComboBox3);

        javax.swing.GroupLayout xPanel1Layout = new javax.swing.GroupLayout(xPanel1);
        xPanel1.setLayout(xPanel1Layout);
        xPanel1Layout.setHorizontalGroup(
            xPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addContainerGap())
        );
        xPanel1Layout.setVerticalGroup(
            xPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XComboBox xComboBox3;
    private com.rameses.rcp.control.XComboBox xComboBox4;
    private com.rameses.rcp.control.XComboBox xComboBox5;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XDateField xDateField2;
    private com.rameses.rcp.control.XDateField xDateField3;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XNumberField xNumberField1;
    private com.rameses.rcp.control.XPanel xPanel1;
    // End of variables declaration//GEN-END:variables
}

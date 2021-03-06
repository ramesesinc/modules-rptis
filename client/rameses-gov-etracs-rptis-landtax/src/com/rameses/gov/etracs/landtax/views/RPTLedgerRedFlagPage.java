/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.gov.etracs.landtax.views;

import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;
import com.rameses.seti2.views.CrudFormPage;

@Template(CrudFormPage.class)
public class RPTLedgerRedFlagPage extends javax.swing.JPanel {

    /**
     * Creates new form RPTLedgerRedFlagPage
     */
    public RPTLedgerRedFlagPage() {
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
        xDateField1 = new com.rameses.rcp.control.XDateField();
        xLookupField1 = new com.rameses.rcp.control.XLookupField();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        xLabel5 = new com.rameses.rcp.control.XLabel();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        xTextArea1 = new com.rameses.rcp.control.XTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        xTextArea2 = new com.rameses.rcp.control.XTextArea();
        xLabel6 = new com.rameses.rcp.control.XLabel();
        xLabel7 = new com.rameses.rcp.control.XLabel();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setPadding(new java.awt.Insets(25, 10, 10, 10));
        xTitledBorder1.setTitle("Red Flag Infrormation");
        xFormPanel1.setBorder(xTitledBorder1);
        xFormPanel1.setCaptionWidth(100);

        xLabel1.setCaption("State");
        xLabel1.setExpression("#{entity.state}");
        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel1.setFontStyle("font-weight:bold");
        xLabel1.setForeground(new java.awt.Color(204, 0, 0));
        xLabel1.setPreferredSize(new java.awt.Dimension(200, 20));
        xFormPanel1.add(xLabel1);

        xLabel2.setCaption("Case No.");
        xLabel2.setExpression("#{entity.caseno}");
        xLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel2.setPreferredSize(new java.awt.Dimension(200, 20));
        xFormPanel1.add(xLabel2);

        xDateField1.setCaption("Date Filed");
        xDateField1.setDisableWhen("#{true}");
        xDateField1.setEditable(false);
        xDateField1.setName("entity.dtfiled"); // NOI18N
        xDateField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDateField1.setPreferredSize(new java.awt.Dimension(200, 20));
        xFormPanel1.add(xDateField1);

        xLookupField1.setCaption("Ledger");
        xLookupField1.setExpression("#{item.tdno}");
        xLookupField1.setHandler("lookupLedger");
        xLookupField1.setName("entity.rptledger"); // NOI18N
        xLookupField1.setVisibleWhen("#{fromLedger == false}");
        xLookupField1.setCellPadding(new java.awt.Insets(10, 0, 0, 0));
        xLookupField1.setPreferredSize(new java.awt.Dimension(0, 20));
        xLookupField1.setRequired(true);
        xFormPanel1.add(xLookupField1);

        xLabel3.setCaption("Ledger ");
        xLabel3.setExpression("#{entity.rptledger.tdno}");
        xLabel3.setVisibleWhen("#{fromLedger == true}");
        xLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel3.setCellPadding(new java.awt.Insets(10, 0, 0, 0));
        xLabel3.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xLabel3);

        xLabel4.setCaption("PIN");
        xLabel4.setDepends(new String[] {"entity.rptledger"});
        xLabel4.setExpression("#{entity.rptledger.fullpin}");
        xLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel4.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xLabel4);

        xLabel5.setCaption("Owner Name");
        xLabel5.setDepends(new String[] {"entity.rptledger"});
        xLabel5.setExpression("#{entity.rptledger.owner.name}");
        xLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel5.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xLabel5);

        xComboBox1.setCaption("Type");
        xComboBox1.setItems("redFlagTypes");
        xComboBox1.setName("entity.type"); // NOI18N
        xComboBox1.setCellPadding(new java.awt.Insets(10, 0, 0, 0));
        xComboBox1.setPreferredSize(new java.awt.Dimension(0, 20));
        xComboBox1.setRequired(true);
        xFormPanel1.add(xComboBox1);

        xComboBox2.setCaption("Action");
        xComboBox2.setItems("blockActions");
        xComboBox2.setName("entity.blockaction"); // NOI18N
        xComboBox2.setPreferredSize(new java.awt.Dimension(0, 20));
        xComboBox2.setRequired(true);
        xFormPanel1.add(xComboBox2);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(0, 80));

        xTextArea1.setCaption("Finding");
        xTextArea1.setLineWrap(true);
        xTextArea1.setName("entity.finding"); // NOI18N
        xTextArea1.setWrapStyleWord(true);
        xTextArea1.setRequired(true);
        xTextArea1.setTextCase(com.rameses.rcp.constant.TextCase.UPPER);
        jScrollPane1.setViewportView(xTextArea1);

        xFormPanel1.add(jScrollPane1);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(0, 70));

        xTextArea2.setCaption("Remarks");
        xTextArea2.setLineWrap(true);
        xTextArea2.setName("entity.remarks"); // NOI18N
        xTextArea2.setWrapStyleWord(true);
        xTextArea2.setTextCase(com.rameses.rcp.constant.TextCase.UPPER);
        jScrollPane2.setViewportView(xTextArea2);

        xFormPanel1.add(jScrollPane2);

        xLabel6.setCaption("Filed By");
        xLabel6.setExpression("#{entity.filedby.name}");
        xLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel6.setCellPadding(new java.awt.Insets(10, 0, 0, 0));
        xLabel6.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xLabel6);

        xLabel7.setCaption("Resolved By");
        xLabel7.setExpression("#{entity.resolvedby.name}");
        xLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel7.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xLabel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XLabel xLabel5;
    private com.rameses.rcp.control.XLabel xLabel6;
    private com.rameses.rcp.control.XLabel xLabel7;
    private com.rameses.rcp.control.XLookupField xLookupField1;
    private com.rameses.rcp.control.XTextArea xTextArea1;
    private com.rameses.rcp.control.XTextArea xTextArea2;
    // End of variables declaration//GEN-END:variables
}

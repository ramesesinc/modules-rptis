/*
 * RPTCollectionInitPage.java
 *
 * Created on July 27, 2011, 3:53 PM
 */

package com.rameses.gov.etracs.landtax.views;

import com.rameses.enterprise.treasury.cashreceipt.SerialCashReceiptPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

@Template(value=SerialCashReceiptPage.class, target="content")
@StyleSheet()
public class CashReceiptInitPage extends javax.swing.JPanel {
    
    /** Creates new form RPTCollectionInitPage */
    public CashReceiptInitPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xIntegerField2 = new com.rameses.rcp.control.XIntegerField();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xSeparator2 = new com.rameses.rcp.control.XSeparator();
        xRadio1 = new com.rameses.rcp.control.XRadio();
        xRadio2 = new com.rameses.rcp.control.XRadio();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xRadio3 = new com.rameses.rcp.control.XRadio();
        xIntegerField1 = new com.rameses.rcp.control.XIntegerField();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xSeparator1 = new com.rameses.rcp.control.XSeparator();
        xButton1 = new com.rameses.rcp.control.XButton();
        xPanel1 = new com.rameses.rcp.control.XPanel();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Payment Options");
        formPanel2.setBorder(xTitledBorder1);
        formPanel2.setPreferredSize(new java.awt.Dimension(5200, 210));
        formPanel2.setShowCaption(false);

        xIntegerField2.setCaption("Year to Pay");
        xIntegerField2.setCaptionWidth(100);
        xIntegerField2.setCellPadding(new java.awt.Insets(10, 10, 0, 0));
        xIntegerField2.setName("bill.billtoyear"); // NOI18N
        xIntegerField2.setPreferredSize(new java.awt.Dimension(80, 20));
        xIntegerField2.setRequired(true);
        formPanel2.add(xIntegerField2);

        xComboBox1.setCaption("Qtr to Pay");
        xComboBox1.setCaptionWidth(100);
        xComboBox1.setCellPadding(new java.awt.Insets(0, 10, 0, 0));
        xComboBox1.setItems("quarters");
        xComboBox1.setName("bill.billtoqtr"); // NOI18N
        xComboBox1.setPreferredSize(new java.awt.Dimension(80, 20));
        xComboBox1.setRequired(true);
        formPanel2.add(xComboBox1);

        xSeparator2.setCellPadding(new java.awt.Insets(10, 0, 0, 0));
        xSeparator2.setPreferredSize(new java.awt.Dimension(0, 20));

        org.jdesktop.layout.GroupLayout xSeparator2Layout = new org.jdesktop.layout.GroupLayout(xSeparator2);
        xSeparator2.setLayout(xSeparator2Layout);
        xSeparator2Layout.setHorizontalGroup(
            xSeparator2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 481, Short.MAX_VALUE)
        );
        xSeparator2Layout.setVerticalGroup(
            xSeparator2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );

        formPanel2.add(xSeparator2);

        xRadio1.setMnemonic('a');
        xRadio1.setCaption("Pay all properties");
        xRadio1.setCaptionMnemonic('a');
        xRadio1.setCaptionWidth(200);
        xRadio1.setCellPadding(new java.awt.Insets(5, 10, 0, 0));
        xRadio1.setIndex(-10);
        xRadio1.setName("payoption"); // NOI18N
        xRadio1.setOpaque(false);
        xRadio1.setOptionValue("all");
        xRadio1.setPreferredSize(new java.awt.Dimension(111, 24));
        xRadio1.setShowCaption(false);
        xRadio1.setText(" Pay all properties");
        formPanel2.add(xRadio1);

        xRadio2.setMnemonic('l');
        xRadio2.setCaption("Pay by ledger");
        xRadio2.setCaptionMnemonic('l');
        xRadio2.setCaptionWidth(200);
        xRadio2.setCellPadding(new java.awt.Insets(0, 10, 0, 0));
        xRadio2.setName("payoption"); // NOI18N
        xRadio2.setOpaque(false);
        xRadio2.setOptionValue("byledger");
        xRadio2.setPreferredSize(new java.awt.Dimension(150, 24));
        xRadio2.setShowCaption(false);
        xRadio2.setText(" Pay by ledger");
        formPanel2.add(xRadio2);

        xFormPanel1.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        xFormPanel1.setPadding(new java.awt.Insets(0, 0, 0, 0));
        xFormPanel1.setShowCaption(false);

        xRadio3.setMnemonic('l');
        xRadio3.setCaption("Pay the first ");
        xRadio3.setCaptionMnemonic('l');
        xRadio3.setCaptionWidth(200);
        xRadio3.setCellPadding(new java.awt.Insets(0, 10, 0, 0));
        xRadio3.setName("payoption"); // NOI18N
        xRadio3.setOpaque(false);
        xRadio3.setOptionValue("bycount");
        xRadio3.setPreferredSize(new java.awt.Dimension(95, 21));
        xRadio3.setShowCaption(false);
        xRadio3.setStretchWidth(50);
        xRadio3.setText(" Pay the first ");
        xRadio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xRadio3ActionPerformed(evt);
            }
        });
        xFormPanel1.add(xRadio3);

        xIntegerField1.setDepends(new String[] {"payoption"});
        xIntegerField1.setEnabled(false);
        xIntegerField1.setName("bill.itemcount"); // NOI18N
        xIntegerField1.setPreferredSize(new java.awt.Dimension(50, 20));
        xIntegerField1.setShowCaption(false);
        xFormPanel1.add(xIntegerField1);

        xLabel1.setCellPadding(new java.awt.Insets(0, 2, 0, 0));
        xLabel1.setExpression("#{\"ledger(s).\"}");
        xLabel1.setShowCaption(false);
        xFormPanel1.add(xLabel1);

        formPanel2.add(xFormPanel1);

        xSeparator1.setPreferredSize(new java.awt.Dimension(0, 20));

        org.jdesktop.layout.GroupLayout xSeparator1Layout = new org.jdesktop.layout.GroupLayout(xSeparator1);
        xSeparator1.setLayout(xSeparator1Layout);
        xSeparator1Layout.setHorizontalGroup(
            xSeparator1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 481, Short.MAX_VALUE)
        );
        xSeparator1Layout.setVerticalGroup(
            xSeparator1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );

        formPanel2.add(xSeparator1);

        xButton1.setMnemonic('p');
        xButton1.setName("process"); // NOI18N
        xButton1.setCellPadding(new java.awt.Insets(0, 10, 0, 0));
        xButton1.setDefaultCommand(true);
        xButton1.setPreferredSize(new java.awt.Dimension(100, 23));
        xButton1.setShowCaption(false);
        xButton1.setText("Process");
        formPanel2.add(xButton1);

        xPanel1.setDepends(new String[] {"processing", "msg"});
        xPanel1.setVisibleWhen("#{processing || msg != null}");
        xPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(0, 7, 0, 0)));
        xPanel1.setCellPadding(new java.awt.Insets(0, 10, 0, 0));
        xPanel1.setOpaque(false);
        xPanel1.setPreferredSize(new java.awt.Dimension(0, 34));
        xPanel1.setShowCaption(false);
        xPanel1.setLayout(new java.awt.BorderLayout());

        xLabel4.setName("loadingicon"); // NOI18N
        xLabel4.setVisibleWhen("#{processing}");
        xLabel4.setIconResource("com/rameses/rcp/icons/loading16.gif");
        xPanel1.add(xLabel4, java.awt.BorderLayout.WEST);

        xLabel2.setExpression("#{msg}");
        xLabel2.setVisibleWhen("#{msg != null}");
        xLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        xLabel2.setForeground(new java.awt.Color(153, 0, 0));
        xPanel1.add(xLabel2, java.awt.BorderLayout.CENTER);

        formPanel2.add(xPanel1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(formPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(formPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void xRadio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xRadio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xRadio3ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel2;
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XIntegerField xIntegerField1;
    private com.rameses.rcp.control.XIntegerField xIntegerField2;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XPanel xPanel1;
    private com.rameses.rcp.control.XRadio xRadio1;
    private com.rameses.rcp.control.XRadio xRadio2;
    private com.rameses.rcp.control.XRadio xRadio3;
    private com.rameses.rcp.control.XSeparator xSeparator1;
    private com.rameses.rcp.control.XSeparator xSeparator2;
    // End of variables declaration//GEN-END:variables
    
}

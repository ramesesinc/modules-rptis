/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.gov.etracs.landtax.views;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.Template;

@Template(FormPage.class)
public class CashReceiptBatchCompletedPage extends javax.swing.JPanel {

    /**
     * Creates new form RPTBatchCollectionPaymentPage
     */
    public CashReceiptBatchCompletedPage() {
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
        xDecimalField3 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField8 = new com.rameses.rcp.control.XDecimalField();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();
        xIntegerField1 = new com.rameses.rcp.control.XIntegerField();
        jLabel1 = new javax.swing.JLabel();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        xTitledBorder1.setPadding(new java.awt.Insets(30, 10, 10, 10));
        xTitledBorder1.setTitle("Payment Detail");
        xFormPanel1.setBorder(xTitledBorder1);
        xFormPanel1.setCaptionFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        xFormPanel1.setCaptionWidth(110);

        xDecimalField3.setCaption("Amount Paid");
        xDecimalField3.setName("entity.amount"); // NOI18N
        xDecimalField3.setCaptionFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xDecimalField3.setCaptionWidth(160);
        xDecimalField3.setCellPadding(new java.awt.Insets(5, 30, 0, 0));
        xDecimalField3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField3.setEnabled(false);
        xDecimalField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        xDecimalField3.setPreferredSize(new java.awt.Dimension(230, 35));
        xFormPanel1.add(xDecimalField3);

        xDecimalField8.setCaption("Change");
        xDecimalField8.setDepends(new String[] {"entity.totalcash"});
        xDecimalField8.setName("entity.change"); // NOI18N
        xDecimalField8.setCaptionFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xDecimalField8.setCaptionWidth(160);
        xDecimalField8.setCellPadding(new java.awt.Insets(0, 30, 0, 0));
        xDecimalField8.setDisabledTextColor(new java.awt.Color(204, 0, 0));
        xDecimalField8.setEnabled(false);
        xDecimalField8.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        xDecimalField8.setPreferredSize(new java.awt.Dimension(230, 35));
        xFormPanel1.add(xDecimalField8);

        xDataTable1.setHandler("receiptHandler");
        xDataTable1.setName("receiptHandler"); // NOI18N
        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("List of Issued Receipts");
        xDataTable1.setBorder(xTitledBorder2);
        xDataTable1.setColumns(new com.rameses.rcp.common.Column[]{
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "receiptno"}
                , new Object[]{"caption", "Receipt No."}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"visible", true}
                , new Object[]{"visibleWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.NONE}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "amount"}
                , new Object[]{"caption", "Amount"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"visible", true}
                , new Object[]{"visibleWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.NONE}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.DecimalColumnHandler("#,##0.00", -1.0, -1.0, false, 2)}
            })
        });

        xIntegerField1.setName("receiptcount"); // NOI18N
        xIntegerField1.setEnabled(false);
        xIntegerField1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Total No. of Receipts:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xIntegerField1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                        .addComponent(xDataTable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xDataTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(xIntegerField1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XDecimalField xDecimalField3;
    private com.rameses.rcp.control.XDecimalField xDecimalField8;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XIntegerField xIntegerField1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.gov.etracs.landtax.views;

import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;
import com.rameses.seti2.views.CrudFormPage;

@Template(CrudFormPage.class)
@StyleSheet()
public class AuctionPropertyPage extends javax.swing.JPanel {

    /**
     * Creates new form AuctionSoldPage
     */
    public AuctionPropertyPage() {
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
        xDecimalField4 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField7 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField8 = new com.rameses.rcp.control.XDecimalField();
        xFormPanel3 = new com.rameses.rcp.control.XFormPanel();
        xLabel11 = new com.rameses.rcp.control.XLabel();
        xLabel12 = new com.rameses.rcp.control.XLabel();
        xLabel13 = new com.rameses.rcp.control.XLabel();
        xLabel14 = new com.rameses.rcp.control.XLabel();
        xLabel15 = new com.rameses.rcp.control.XLabel();
        xLabel16 = new com.rameses.rcp.control.XLabel();
        xDecimalField6 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField9 = new com.rameses.rcp.control.XDecimalField();
        xFormPanel4 = new com.rameses.rcp.control.XFormPanel();
        xLabel10 = new com.rameses.rcp.control.XLabel();
        xLabel8 = new com.rameses.rcp.control.XLabel();
        xDecimalField5 = new com.rameses.rcp.control.XDecimalField();
        xTabbedPane1 = new com.rameses.rcp.control.XTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        xDataTable2 = new com.rameses.rcp.control.XDataTable();
        jPanel3 = new javax.swing.JPanel();
        xFormPanel2 = new com.rameses.rcp.control.XFormPanel();
        xLabel6 = new com.rameses.rcp.control.XLabel();
        xLabel9 = new com.rameses.rcp.control.XLabel();
        xDecimalField3 = new com.rameses.rcp.control.XDecimalField();
        jPanel2 = new javax.swing.JPanel();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setPadding(new java.awt.Insets(25, 10, 10, 10));
        xTitledBorder1.setTitle("Bid Information");
        xFormPanel1.setBorder(xTitledBorder1);
        xFormPanel1.setCaptionWidth(110);

        xDecimalField4.setCaption("Tax Due");
        xDecimalField4.setName("entity.amtdue"); // NOI18N
        xDecimalField4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField4.setEnabled(false);
        xDecimalField4.setOpaque(false);
        xDecimalField4.setPreferredSize(new java.awt.Dimension(0, 22));
        xFormPanel1.add(xDecimalField4);

        xDecimalField7.setCaption("Cost of Sale");
        xDecimalField7.setName("entity.costofsale"); // NOI18N
        xDecimalField7.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField7.setEnabled(false);
        xDecimalField7.setForeground(new java.awt.Color(255, 0, 0));
        xDecimalField7.setPreferredSize(new java.awt.Dimension(0, 22));
        xFormPanel1.add(xDecimalField7);

        xDecimalField8.setCaption("Min. Bid Amount");
        xDecimalField8.setName("entity.minbidamt"); // NOI18N
        xDecimalField8.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField8.setEnabled(false);
        xDecimalField8.setForeground(new java.awt.Color(255, 0, 0));
        xDecimalField8.setPreferredSize(new java.awt.Dimension(0, 22));
        xFormPanel1.add(xDecimalField8);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setPadding(new java.awt.Insets(25, 10, 10, 10));
        xTitledBorder2.setTitle("Property Information");
        xFormPanel3.setBorder(xTitledBorder2);
        xFormPanel3.setCaptionWidth(110);

        xLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        xLabel11.setCaption("State");
        xLabel11.setExpression("#{entity.state}");
        xLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        xLabel11.setForeground(new java.awt.Color(204, 0, 0));
        xLabel11.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel3.add(xLabel11);

        xLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        xLabel12.setCaption("TD No.");
        xLabel12.setExpression("#{entity.rptledger.tdno}");
        xLabel12.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel3.add(xLabel12);

        xLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        xLabel13.setCaption("PIN");
        xLabel13.setExpression("#{entity.rptledger.fullpin}");
        xLabel13.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel3.add(xLabel13);

        xLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        xLabel14.setCaption("Title No.");
        xLabel14.setExpression("#{entity.rptledger.titleno}");
        xLabel14.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel3.add(xLabel14);

        xLabel15.setCaption("Lot No.");
        xLabel15.setExpression("#{entity.rptledger.cadastrallotno}");
        xLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        xLabel15.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel3.add(xLabel15);

        xLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        xLabel16.setCaption("Owner Name");
        xLabel16.setExpression("#{entity.rptledger.owner.name}");
        xLabel16.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel3.add(xLabel16);

        xDecimalField6.setCaption("Area (sqm)");
        xDecimalField6.setName("entity.rptledger.totalareasqm"); // NOI18N
        xDecimalField6.setScale(6);
        xDecimalField6.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField6.setEnabled(false);
        xDecimalField6.setOpaque(false);
        xDecimalField6.setPreferredSize(new java.awt.Dimension(120, 20));
        xFormPanel3.add(xDecimalField6);

        xDecimalField9.setCaption("Assessed Value");
        xDecimalField9.setName("entity.rptledger.totalav"); // NOI18N
        xDecimalField9.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField9.setEnabled(false);
        xDecimalField9.setOpaque(false);
        xDecimalField9.setPreferredSize(new java.awt.Dimension(120, 20));
        xFormPanel3.add(xDecimalField9);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setPadding(new java.awt.Insets(25, 10, 10, 10));
        xTitledBorder3.setTitle("Winning Bidder");
        xFormPanel4.setBorder(xTitledBorder3);
        xFormPanel4.setCaptionWidth(120);

        xLabel10.setCaption("Name");
        xLabel10.setExpression("#{entity.bidder.entity.name}");
        xLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        xLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        xLabel10.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel4.add(xLabel10);

        xLabel8.setCaption("Address");
        xLabel8.setExpression("#{entity.bidder.entity.address.text}");
        xLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        xLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        xLabel8.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel4.add(xLabel8);

        xDecimalField5.setCaption("Bid Amount");
        xDecimalField5.setName("entity.bidamt"); // NOI18N
        xDecimalField5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField5.setEnabled(false);
        xDecimalField5.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        xDecimalField5.setPreferredSize(new java.awt.Dimension(120, 20));
        xFormPanel4.add(xDecimalField5);

        xTabbedPane1.setHandler("sectionHandler");

        xDataTable2.setHandler("bidderListHandler");
        xDataTable2.setColumns(new com.rameses.rcp.common.Column[]{
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "bidderno"}
                , new Object[]{"caption", "Bidder No."}
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
                new Object[]{"name", "bidder.name"}
                , new Object[]{"caption", "Name"}
                , new Object[]{"width", 200}
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
                new Object[]{"name", "bidder.address"}
                , new Object[]{"caption", "Address"}
                , new Object[]{"width", 200}
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
            })
        });
        xDataTable2.setId("itemHandlers.bidders");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xDataTable2, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xDataTable2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );

        xTabbedPane1.addTab("Bidders", jPanel4);

        xFormPanel2.setCaptionWidth(130);

        xLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel6.setCaption("Redeemed By");
        xLabel6.setExpression("#{entity.redeemedby.name}");
        xLabel6.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel2.add(xLabel6);

        xLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel9.setCaption("Address");
        xLabel9.setExpression("#{entity.redeemedby.address.text}");
        xLabel9.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel2.add(xLabel9);

        xDecimalField3.setCaption("Redeemed Amount");
        xDecimalField3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField3.setEnabled(false);
        xDecimalField3.setName("entity.redeemedamt"); // NOI18N
        xDecimalField3.setPreferredSize(new java.awt.Dimension(120, 20));
        xFormPanel2.add(xDecimalField3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );

        xTabbedPane1.addTab("Redemption", jPanel3);

        xDataTable1.setHandler("itemHandlers.credits");
        xDataTable1.setColumns(new com.rameses.rcp.common.Column[]{
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "refno"}
                , new Object[]{"caption", "Ref No."}
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
                new Object[]{"name", "refdate"}
                , new Object[]{"caption", "Ref Date"}
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
                , new Object[]{"typeHandler", new com.rameses.rcp.common.DateColumnHandler(null, null, null)}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "particulars"}
                , new Object[]{"caption", "Particulars"}
                , new Object[]{"width", 200}
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xDataTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xDataTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );

        xTabbedPane1.addTab("Payments", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(xFormPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(xFormPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(xFormPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xFormPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XDataTable xDataTable2;
    private com.rameses.rcp.control.XDecimalField xDecimalField3;
    private com.rameses.rcp.control.XDecimalField xDecimalField4;
    private com.rameses.rcp.control.XDecimalField xDecimalField5;
    private com.rameses.rcp.control.XDecimalField xDecimalField6;
    private com.rameses.rcp.control.XDecimalField xDecimalField7;
    private com.rameses.rcp.control.XDecimalField xDecimalField8;
    private com.rameses.rcp.control.XDecimalField xDecimalField9;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XFormPanel xFormPanel2;
    private com.rameses.rcp.control.XFormPanel xFormPanel3;
    private com.rameses.rcp.control.XFormPanel xFormPanel4;
    private com.rameses.rcp.control.XLabel xLabel10;
    private com.rameses.rcp.control.XLabel xLabel11;
    private com.rameses.rcp.control.XLabel xLabel12;
    private com.rameses.rcp.control.XLabel xLabel13;
    private com.rameses.rcp.control.XLabel xLabel14;
    private com.rameses.rcp.control.XLabel xLabel15;
    private com.rameses.rcp.control.XLabel xLabel16;
    private com.rameses.rcp.control.XLabel xLabel6;
    private com.rameses.rcp.control.XLabel xLabel8;
    private com.rameses.rcp.control.XLabel xLabel9;
    private com.rameses.rcp.control.XTabbedPane xTabbedPane1;
    // End of variables declaration//GEN-END:variables
}

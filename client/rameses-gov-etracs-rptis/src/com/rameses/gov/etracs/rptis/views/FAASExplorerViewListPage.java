/*
 * ExplorerViewListPage2.java
 *
 * Created on April 24, 2013, 12:44 PM
 */

package com.rameses.gov.etracs.rptis.views;

/**
 *
 * @author  wflores
 */
public class FAASExplorerViewListPage extends javax.swing.JPanel {
    
    public FAASExplorerViewListPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblTitle = new com.rameses.rcp.control.XLabel();
        xActionBar1 = new com.rameses.rcp.control.XActionBar();
        jPanel1 = new javax.swing.JPanel();
        xActionBar2 = new com.rameses.rcp.control.XActionBar();
        pnlBody = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        xFormPanel2 = new com.rameses.rcp.control.XFormPanel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xTextField5 = new com.rameses.rcp.control.XTextField();
        xTextField4 = new com.rameses.rcp.control.XTextField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xTextField3 = new com.rameses.rcp.control.XTextField();
        xFormPanel6 = new com.rameses.rcp.control.XFormPanel();
        xTextField11 = new com.rameses.rcp.control.XTextField();
        xTextField12 = new com.rameses.rcp.control.XTextField();
        xTextField13 = new com.rameses.rcp.control.XTextField();
        xTextField15 = new com.rameses.rcp.control.XTextField();
        xTextField6 = new com.rameses.rcp.control.XTextField();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();
        jPanel6 = new javax.swing.JPanel();
        xFormPanel5 = new com.rameses.rcp.control.XFormPanel();
        xComboBox9 = new com.rameses.rcp.control.XComboBox();
        xFormPanel3 = new com.rameses.rcp.control.XFormPanel();
        xIntegerField2 = new com.rameses.rcp.control.XIntegerField();
        xComboBox8 = new com.rameses.rcp.control.XComboBox();
        xFormPanel4 = new com.rameses.rcp.control.XFormPanel();
        xComboBox4 = new com.rameses.rcp.control.XComboBox();
        xComboBox5 = new com.rameses.rcp.control.XComboBox();
        xComboBox10 = new com.rameses.rcp.control.XComboBox();
        xComboBox11 = new com.rameses.rcp.control.XComboBox();
        xLookupField1 = new com.rameses.rcp.control.XLookupField();
        jPanel2 = new javax.swing.JPanel();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xLabel6 = new com.rameses.rcp.control.XLabel();
        xLabel7 = new com.rameses.rcp.control.XLabel();
        xLabel5 = new com.rameses.rcp.control.XLabel();
        xLabel9 = new com.rameses.rcp.control.XLabel();
        xLabel12 = new com.rameses.rcp.control.XLabel();
        xLabel14 = new com.rameses.rcp.control.XLabel();
        xHorizontalPanel2 = new com.rameses.rcp.control.XHorizontalPanel();
        navBar1 = new com.rameses.rcp.control.XActionBar();
        jPanel7 = new javax.swing.JPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        jPanel4 = new javax.swing.JPanel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        jPanel8 = new javax.swing.JPanel();
        xButton5 = new com.rameses.rcp.control.XButton();
        xButton4 = new com.rameses.rcp.control.XButton();

        setLayout(new java.awt.BorderLayout());

        pnlHeader.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        com.rameses.rcp.control.border.XEtchedBorder xEtchedBorder1 = new com.rameses.rcp.control.border.XEtchedBorder();
        xEtchedBorder1.setHideBottom(true);
        xEtchedBorder1.setHideRight(true);
        jPanel3.setBorder(xEtchedBorder1);
        jPanel3.setPreferredSize(new java.awt.Dimension(154, 30));
        jPanel3.setLayout(new java.awt.BorderLayout());

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setExpression("#{listHandler.title}");
        lblTitle.setFontStyle("font-size: 14; font-weight:bold;");
        lblTitle.setName("nodechange"); // NOI18N
        lblTitle.setOpaque(true);
        lblTitle.setPadding(new java.awt.Insets(2, 7, 2, 5));
        jPanel3.add(lblTitle, java.awt.BorderLayout.WEST);

        xActionBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xActionBar1.setButtonBorderPainted(false);
        xActionBar1.setButtonContentAreaFilled(false);
        xActionBar1.setDynamic(true);
        xActionBar1.setName("listHandler.nodeActions"); // NOI18N
        xActionBar1.setOpaque(false);
        xActionBar1.setShowCaptions(false);
        xActionBar1.setUseToolBar(false);
        jPanel3.add(xActionBar1, java.awt.BorderLayout.CENTER);

        pnlHeader.add(jPanel3, java.awt.BorderLayout.NORTH);

        com.rameses.rcp.control.border.XEtchedBorder xEtchedBorder2 = new com.rameses.rcp.control.border.XEtchedBorder();
        xEtchedBorder2.setHideRight(true);
        jPanel1.setBorder(xEtchedBorder2);
        jPanel1.setLayout(new java.awt.BorderLayout());

        xActionBar2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xActionBar2.setDepends(new String[] {"listHandler.selectedEntity", "nodechange"});
        xActionBar2.setDynamic(true);
        xActionBar2.setName("listHandler.formActions"); // NOI18N
        jPanel1.add(xActionBar2, java.awt.BorderLayout.WEST);

        pnlHeader.add(jPanel1, java.awt.BorderLayout.CENTER);

        add(pnlHeader, java.awt.BorderLayout.NORTH);

        pnlBody.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 2));
        pnlBody.setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Search ");
        jPanel5.setBorder(xTitledBorder1);
        jPanel5.setLayout(new java.awt.BorderLayout());

        xFormPanel2.setCaptionBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        xFormPanel2.setCaptionVAlignment(com.rameses.rcp.constant.UIConstants.CENTER);
        xFormPanel2.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        xFormPanel2.setPadding(new java.awt.Insets(0, 0, 2, 0));
        xFormPanel2.setShowCaption(false);
        xFormPanel2.setStretchWidth(100);

        xTextField1.setCaption("TD No.");
        xTextField1.setCaptionWidth(60);
        xTextField1.setCellPadding(new java.awt.Insets(0, 5, 0, 10));
        xTextField1.setName("query.tdno"); // NOI18N
        xTextField1.setStretchWidth(100);
        xFormPanel2.add(xTextField1);

        xTextField5.setCaption("Prev. TD No.");
        xTextField5.setCellPadding(new java.awt.Insets(0, 0, 0, 10));
        xTextField5.setName("query.prevtdno"); // NOI18N
        xTextField5.setStretchWidth(100);
        xFormPanel2.add(xTextField5);

        xTextField4.setCaption("Lot No.");
        xTextField4.setCaptionWidth(55);
        xTextField4.setCellPadding(new java.awt.Insets(0, 0, 0, 10));
        xTextField4.setName("query.cadastrallotno"); // NOI18N
        xTextField4.setStretchWidth(100);
        xFormPanel2.add(xTextField4);

        xTextField2.setCaption("PIN");
        xTextField2.setCaptionWidth(55);
        xTextField2.setCellPadding(new java.awt.Insets(0, 0, 0, 10));
        xTextField2.setName("query.fullpin"); // NOI18N
        xTextField2.setStretchWidth(100);
        xFormPanel2.add(xTextField2);

        xTextField3.setCaption("Title No.");
        xTextField3.setCaptionWidth(60);
        xTextField3.setCellPadding(new java.awt.Insets(0, 0, 0, 10));
        xTextField3.setName("query.titleno"); // NOI18N
        xTextField3.setStretchWidth(100);
        xFormPanel2.add(xTextField3);

        jPanel5.add(xFormPanel2, java.awt.BorderLayout.NORTH);

        xFormPanel6.setCaptionBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        xFormPanel6.setCaptionVAlignment(com.rameses.rcp.constant.UIConstants.CENTER);
        xFormPanel6.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        xFormPanel6.setPadding(new java.awt.Insets(0, 0, 5, 0));
        xFormPanel6.setShowCaption(false);
        xFormPanel6.setStretchWidth(100);

        xTextField11.setCaption("Owner");
        xTextField11.setCaptionWidth(60);
        xTextField11.setCellPadding(new java.awt.Insets(0, 5, 0, 10));
        xTextField11.setName("query.ownername"); // NOI18N
        xTextField11.setStretchWidth(100);
        xFormPanel6.add(xTextField11);

        xTextField12.setCaption("Administrator");
        xTextField12.setCellPadding(new java.awt.Insets(0, 0, 0, 10));
        xTextField12.setName("query.administrator"); // NOI18N
        xTextField12.setStretchWidth(100);
        xFormPanel6.add(xTextField12);

        xTextField13.setCaption("Survey");
        xTextField13.setCaptionWidth(55);
        xTextField13.setCellPadding(new java.awt.Insets(0, 0, 0, 10));
        xTextField13.setName("query.surveyno"); // NOI18N
        xTextField13.setStretchWidth(100);
        xFormPanel6.add(xTextField13);

        xTextField15.setCaption("Doc No.");
        xTextField15.setCaptionWidth(55);
        xTextField15.setCellPadding(new java.awt.Insets(0, 0, 0, 10));
        xTextField15.setName("query.utdno"); // NOI18N
        xTextField15.setStretchWidth(100);
        xFormPanel6.add(xTextField15);

        xTextField6.setCaption("Block No.");
        xTextField6.setCaptionWidth(60);
        xTextField6.setCellPadding(new java.awt.Insets(0, 0, 0, 10));
        xTextField6.setName("query.blockno"); // NOI18N
        xTextField6.setStretchWidth(100);
        xFormPanel6.add(xTextField6);

        jPanel5.add(xFormPanel6, java.awt.BorderLayout.CENTER);

        pnlBody.add(jPanel5, java.awt.BorderLayout.NORTH);

        xDataTable1.setAutoResize(false);
        xDataTable1.setHandler("listHandler");
        xDataTable1.setImmediate(true);
        xDataTable1.setName("listHandler.selectedEntity"); // NOI18N
        pnlBody.add(xDataTable1, java.awt.BorderLayout.CENTER);

        jPanel6.setPreferredSize(new java.awt.Dimension(14, 160));
        jPanel6.setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setPadding(new java.awt.Insets(25, 5, 5, 5));
        xTitledBorder2.setTitle("Additional Filter");
        xFormPanel5.setBorder(xTitledBorder2);
        xFormPanel5.setCaptionWidth(70);
        xFormPanel5.setPreferredSize(new java.awt.Dimension(320, 29));

        xComboBox9.setCaption("State");
        xComboBox9.setExpression("#{item.objid}");
        xComboBox9.setItems("states");
        xComboBox9.setName("query.state"); // NOI18N
        xComboBox9.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel5.add(xComboBox9);

        xFormPanel3.setCaptionWidth(90);
        xFormPanel3.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        xFormPanel3.setPadding(new java.awt.Insets(0, 0, 0, 0));
        xFormPanel3.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel3.setShowCaption(false);

        xIntegerField2.setCaption("Revision");
        xIntegerField2.setCaptionWidth(70);
        xIntegerField2.setName("query.ry"); // NOI18N
        xFormPanel3.add(xIntegerField2);

        xComboBox8.setCaption("Txn");
        xComboBox8.setCaptionWidth(50);
        xComboBox8.setCellPadding(new java.awt.Insets(0, 5, 0, 0));
        xComboBox8.setExpression("#{item.objid}");
        xComboBox8.setItems("txntypes");
        xComboBox8.setName("query.txntype"); // NOI18N
        xComboBox8.setPreferredSize(new java.awt.Dimension(83, 20));
        xFormPanel3.add(xComboBox8);

        xFormPanel5.add(xFormPanel3);

        xFormPanel4.setCaptionWidth(90);
        xFormPanel4.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        xFormPanel4.setPadding(new java.awt.Insets(0, 0, 0, 0));
        xFormPanel4.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel4.setShowCaption(false);

        xComboBox4.setCaption("Property");
        xComboBox4.setCaptionWidth(70);
        xComboBox4.setItems("rputypes");
        xComboBox4.setName("query.rputype"); // NOI18N
        xComboBox4.setPreferredSize(new java.awt.Dimension(100, 20));
        xFormPanel4.add(xComboBox4);

        xComboBox5.setCaption("Class");
        xComboBox5.setCaptionWidth(50);
        xComboBox5.setCellPadding(new java.awt.Insets(0, 5, 0, 0));
        xComboBox5.setExpression("#{item.code}");
        xComboBox5.setItems("classifications");
        xComboBox5.setName("query.classification"); // NOI18N
        xComboBox5.setPreferredSize(new java.awt.Dimension(83, 20));
        xFormPanel4.add(xComboBox5);

        xFormPanel5.add(xFormPanel4);

        xComboBox10.setCaption("LGU");
        xComboBox10.setExpression("#{item.name}");
        xComboBox10.setItems("lgus");
        xComboBox10.setName("query.lgu"); // NOI18N
        xComboBox10.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel5.add(xComboBox10);

        xComboBox11.setCaption("Barangay");
        xComboBox11.setDepends(new String[] {"query.lgu"});
        xComboBox11.setDynamic(true);
        xComboBox11.setExpression("#{item.name}");
        xComboBox11.setItems("barangays");
        xComboBox11.setName("query.barangay"); // NOI18N
        xComboBox11.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel5.add(xComboBox11);

        xLookupField1.setCaption("Taxpayer");
        xLookupField1.setExpression("#{item.name}");
        xLookupField1.setHandler("entity:lookup");
        xLookupField1.setName("query.taxpayer"); // NOI18N
        xLookupField1.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel5.add(xLookupField1);

        jPanel6.add(xFormPanel5, java.awt.BorderLayout.EAST);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setTitle("FAAS Information");
        jPanel2.setBorder(xTitledBorder3);
        jPanel2.setPreferredSize(new java.awt.Dimension(424, 200));
        jPanel2.setLayout(new java.awt.BorderLayout());

        xFormPanel1.setCaptionWidth(90);

        xLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel6.setCaption("TD No.");
        xLabel6.setDepends(new String[] {"listHandler.selectedEntity"});
        xLabel6.setExpression("#{selectedEntity.tdno}");
        xLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        xLabel6.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel1.add(xLabel6);

        xLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel7.setCaption("PIN");
        xLabel7.setDepends(new String[] {"listHandler.selectedEntity"});
        xLabel7.setExpression("#{selectedEntity.displaypin}");
        xLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        xLabel7.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel1.add(xLabel7);

        xLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel5.setCaption("Owner Name");
        xLabel5.setDepends(new String[] {"listHandler.selectedEntity"});
        xLabel5.setExpression("#{selectedEntity.owner.name}");
        xLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        xLabel5.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel1.add(xLabel5);

        xLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel9.setCaption("Owner Address");
        xLabel9.setDepends(new String[] {"listHandler.selectedEntity"});
        xLabel9.setExpression("#{selectedEntity.owner.address}");
        xLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        xLabel9.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel1.add(xLabel9);

        xLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel12.setCaption("Administrator");
        xLabel12.setDepends(new String[] {"listHandler.selectedEntity"});
        xLabel12.setExpression("#{selectedEntity.administrator.name}");
        xLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        xLabel12.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel1.add(xLabel12);

        xLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel14.setCaption("Address");
        xLabel14.setDepends(new String[] {"listHandler.selectedEntity"});
        xLabel14.setExpression("#{selectedEntity.administrator.address}");
        xLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        xLabel14.setPreferredSize(new java.awt.Dimension(0, 19));
        xFormPanel1.add(xLabel14);

        jPanel2.add(xFormPanel1, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel2, java.awt.BorderLayout.CENTER);

        pnlBody.add(jPanel6, java.awt.BorderLayout.SOUTH);

        add(pnlBody, java.awt.BorderLayout.CENTER);

        navBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 25));
        navBar1.setName("listHandler.navActions"); // NOI18N
        xHorizontalPanel2.add(navBar1);

        jPanel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 10));
        jPanel7.setLayout(new java.awt.BorderLayout());

        xLabel1.setDepends(new String[] {"listHandler.selectedEntity"});
        xLabel1.setExpression("#{listHandler.recordCountInfo}");
        xLabel1.setUseHtml(true);
        jPanel7.add(xLabel1, java.awt.BorderLayout.CENTER);

        xHorizontalPanel2.add(jPanel7);

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 10));
        jPanel4.setLayout(new java.awt.BorderLayout());

        xLabel2.setDepends(new String[] {"listHandler.selectedEntity"});
        xLabel2.setExpression("#{listHandler.pageCountInfo}");
        xLabel2.setUseHtml(true);
        jPanel4.add(xLabel2, java.awt.BorderLayout.CENTER);

        jPanel8.setLayout(new java.awt.BorderLayout());

        xButton5.setMnemonic('s');
        xButton5.setDefaultCommand(true);
        xButton5.setName("search"); // NOI18N
        xButton5.setPreferredSize(new java.awt.Dimension(120, 23));
        xButton5.setText("Search");
        jPanel8.add(xButton5, java.awt.BorderLayout.WEST);

        xButton4.setMnemonic('e');
        xButton4.setFocusable(false);
        xButton4.setName("clear"); // NOI18N
        xButton4.setPreferredSize(new java.awt.Dimension(120, 23));
        xButton4.setText("Clear");
        jPanel8.add(xButton4, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel8, java.awt.BorderLayout.LINE_END);

        xHorizontalPanel2.add(jPanel4);

        add(xHorizontalPanel2, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private com.rameses.rcp.control.XLabel lblTitle;
    private com.rameses.rcp.control.XActionBar navBar1;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlHeader;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XActionBar xActionBar2;
    private com.rameses.rcp.control.XButton xButton4;
    private com.rameses.rcp.control.XButton xButton5;
    private com.rameses.rcp.control.XComboBox xComboBox10;
    private com.rameses.rcp.control.XComboBox xComboBox11;
    private com.rameses.rcp.control.XComboBox xComboBox4;
    private com.rameses.rcp.control.XComboBox xComboBox5;
    private com.rameses.rcp.control.XComboBox xComboBox8;
    private com.rameses.rcp.control.XComboBox xComboBox9;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XFormPanel xFormPanel2;
    private com.rameses.rcp.control.XFormPanel xFormPanel3;
    private com.rameses.rcp.control.XFormPanel xFormPanel4;
    private com.rameses.rcp.control.XFormPanel xFormPanel5;
    private com.rameses.rcp.control.XFormPanel xFormPanel6;
    private com.rameses.rcp.control.XHorizontalPanel xHorizontalPanel2;
    private com.rameses.rcp.control.XIntegerField xIntegerField2;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel12;
    private com.rameses.rcp.control.XLabel xLabel14;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel5;
    private com.rameses.rcp.control.XLabel xLabel6;
    private com.rameses.rcp.control.XLabel xLabel7;
    private com.rameses.rcp.control.XLabel xLabel9;
    private com.rameses.rcp.control.XLookupField xLookupField1;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField11;
    private com.rameses.rcp.control.XTextField xTextField12;
    private com.rameses.rcp.control.XTextField xTextField13;
    private com.rameses.rcp.control.XTextField xTextField15;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField3;
    private com.rameses.rcp.control.XTextField xTextField4;
    private com.rameses.rcp.control.XTextField xTextField5;
    private com.rameses.rcp.control.XTextField xTextField6;
    // End of variables declaration//GEN-END:variables
    
}

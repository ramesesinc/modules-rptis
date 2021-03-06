/*
 * RPTLedgerPage.java
 *
 * Created on July 2, 2011, 11:43 AM
 */

package com.rameses.gov.etracs.landtax.views;

import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;
import com.rameses.seti2.views.CrudFormPage;

/**
 *
 * @author  Rameses Systems Inc.
 */
@Template(CrudFormPage.class) 
@StyleSheet
public class RPTLedgerPage extends javax.swing.JPanel {
    
    /** Creates new form RPTLedgerPage */
    public RPTLedgerPage() {
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
        jPanel3 = new javax.swing.JPanel();
        formPanel6 = new com.rameses.rcp.util.FormPanel();
        xLabel10 = new com.rameses.rcp.control.XLabel();
        xLabel26 = new com.rameses.rcp.control.XLabel();
        xLabel11 = new com.rameses.rcp.control.XLabel();
        xLabel21 = new com.rameses.rcp.control.XLabel();
        xLabel27 = new com.rameses.rcp.control.XLabel();
        xLabel31 = new com.rameses.rcp.control.XLabel();
        jPanel4 = new javax.swing.JPanel();
        formPanel7 = new com.rameses.rcp.util.FormPanel();
        xLabel19 = new com.rameses.rcp.control.XLabel();
        xLabel29 = new com.rameses.rcp.control.XLabel();
        formPanel10 = new com.rameses.rcp.util.FormPanel();
        xLabel28 = new com.rameses.rcp.control.XLabel();
        formPanel11 = new com.rameses.rcp.util.FormPanel();
        xLabel22 = new com.rameses.rcp.control.XLabel();
        xLabel23 = new com.rameses.rcp.control.XLabel();
        formPanel12 = new com.rameses.rcp.util.FormPanel();
        xLabel24 = new com.rameses.rcp.control.XLabel();
        xLabel25 = new com.rameses.rcp.control.XLabel();
        formPanel17 = new com.rameses.rcp.util.FormPanel();
        xDecimalField4 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField5 = new com.rameses.rcp.control.XDecimalField();
        formPanel18 = new com.rameses.rcp.util.FormPanel();
        xDecimalField8 = new com.rameses.rcp.control.XDecimalField();
        xDecimalField9 = new com.rameses.rcp.control.XDecimalField();
        xCheckBox1 = new com.rameses.rcp.control.XCheckBox();
        formPanel19 = new com.rameses.rcp.util.FormPanel();
        xLabel30 = new com.rameses.rcp.control.XLabel();
        xCheckBox3 = new com.rameses.rcp.control.XCheckBox();
        xTabbedPane1 = new com.rameses.rcp.control.XTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        xDataTable4 = new com.rameses.rcp.control.XDataTable();
        xActionBar1 = new com.rameses.rcp.control.XActionBar();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("General Information");
        formPanel6.setBorder(xTitledBorder1);
        formPanel6.setCaptionWidth(100);

        xLabel10.setCaption("Property Owner");
        xLabel10.setExpression("#{entity.taxpayer.name}");
        xLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel10.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        xLabel10.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel6.add(xLabel10);

        xLabel26.setCaption("Administrator");
        xLabel26.setExpression("#{entity.administrator.name}");
        xLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel26.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        xLabel26.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel6.add(xLabel26);

        xLabel11.setCaption("Beneficiary");
        xLabel11.setExpression("#{entity.beneficiary.name}");
        xLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel11.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        xLabel11.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel6.add(xLabel11);

        xLabel21.setCaption("TD No.");
        xLabel21.setExpression("#{entity.tdno}");
        xLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel21.setCaptionWidth(100);
        xLabel21.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        xLabel21.setPreferredSize(new java.awt.Dimension(0, 19));
        xLabel21.setStretchWidth(50);
        formPanel6.add(xLabel21);

        xLabel27.setCaption("Prev. TD No.");
        xLabel27.setExpression("#{entity.prevtdno}");
        xLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel27.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        xLabel27.setPreferredSize(new java.awt.Dimension(0, 19));
        xLabel27.setStretchWidth(50);
        formPanel6.add(xLabel27);

        xLabel31.setCaption("PIN ");
        xLabel31.setExpression("#{entity.fullpin}");
        xLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel31.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        xLabel31.setPreferredSize(new java.awt.Dimension(0, 19));
        xLabel31.setStretchWidth(100);
        formPanel6.add(xLabel31);

        jPanel3.add(formPanel6, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Payment Information");
        formPanel7.setBorder(xTitledBorder2);
        formPanel7.setCaptionWidth(90);
        formPanel7.setPreferredSize(new java.awt.Dimension(230, 146));

        xLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel19.setCaption("Last Year Paid");
        xLabel19.setExpression("#{entity.lastyearpaid}");
        xLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        xLabel19.setForeground(new java.awt.Color(204, 0, 0));
        xLabel19.setPreferredSize(new java.awt.Dimension(0, 24));
        xLabel19.setStretchWidth(100);
        formPanel7.add(xLabel19);

        xLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel29.setCaption("Last Qtr Paid");
        xLabel29.setExpression("#{entity.lastqtrpaid}");
        xLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        xLabel29.setForeground(new java.awt.Color(204, 0, 0));
        xLabel29.setPreferredSize(new java.awt.Dimension(0, 24));
        xLabel29.setStretchWidth(100);
        formPanel7.add(xLabel29);

        jPanel4.add(formPanel7, java.awt.BorderLayout.EAST);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setTitle("Property Information");
        formPanel10.setBorder(xTitledBorder3);
        formPanel10.setPreferredSize(new java.awt.Dimension(380, 184));

        xLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel28.setCaption("Barangay");
        xLabel28.setCaptionWidth(100);
        xLabel28.setExpression("#{entity.barangay.name}");
        xLabel28.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        xLabel28.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel10.add(xLabel28);

        formPanel11.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel11.setPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel11.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel11.setShowCaption(false);

        xLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel22.setCaption("Type / Class");
        xLabel22.setCaptionWidth(100);
        xLabel22.setExpression("#{entity.rputype}");
        xLabel22.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        xLabel22.setPreferredSize(new java.awt.Dimension(127, 18));
        xLabel22.setStretchWidth(50);
        formPanel11.add(xLabel22);

        xLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel23.setCaption("Type / Class");
        xLabel23.setExpression("#{entity.classcode}");
        xLabel23.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        xLabel23.setPreferredSize(new java.awt.Dimension(137, 18));
        xLabel23.setShowCaption(false);
        xLabel23.setStretchWidth(50);
        formPanel11.add(xLabel23);

        formPanel10.add(formPanel11);

        formPanel12.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel12.setPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel12.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel12.setShowCaption(false);

        xLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel24.setCaption("Cadastral / Block");
        xLabel24.setCaptionWidth(100);
        xLabel24.setExpression("#{entity.cadastrallotno}");
        xLabel24.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        xLabel24.setPreferredSize(new java.awt.Dimension(127, 18));
        xLabel24.setStretchWidth(50);
        formPanel12.add(xLabel24);

        xLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel25.setCaption("Type / Class");
        xLabel25.setExpression("#{entity.blockno}");
        xLabel25.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        xLabel25.setPreferredSize(new java.awt.Dimension(137, 18));
        xLabel25.setShowCaption(false);
        xLabel25.setStretchWidth(50);
        formPanel12.add(xLabel25);

        formPanel10.add(formPanel12);

        formPanel17.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel17.setPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel17.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel17.setShowCaption(false);
        formPanel17.setStretchWidth(100);

        xDecimalField4.setCaption("Area (sqm / ha)");
        xDecimalField4.setCaptionWidth(100);
        xDecimalField4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField4.setEnabled(false);
        xDecimalField4.setName("entity.totalareasqm"); // NOI18N
        xDecimalField4.setPreferredSize(new java.awt.Dimension(127, 18));
        xDecimalField4.setStretchWidth(50);
        formPanel17.add(xDecimalField4);

        xDecimalField5.setCaption("Area (ha/sqm)");
        xDecimalField5.setCaptionWidth(100);
        xDecimalField5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField5.setEnabled(false);
        xDecimalField5.setName("entity.totalareaha"); // NOI18N
        xDecimalField5.setPattern("#,##0.0000");
        xDecimalField5.setPreferredSize(new java.awt.Dimension(137, 20));
        xDecimalField5.setScale(6);
        xDecimalField5.setShowCaption(false);
        xDecimalField5.setStretchWidth(50);
        formPanel17.add(xDecimalField5);

        formPanel10.add(formPanel17);

        formPanel18.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel18.setPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel18.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel18.setShowCaption(false);

        xDecimalField8.setCaption("Market Value");
        xDecimalField8.setCaptionWidth(100);
        xDecimalField8.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField8.setEnabled(false);
        xDecimalField8.setName("entity.totalmv"); // NOI18N
        xDecimalField8.setPreferredSize(new java.awt.Dimension(127, 18));
        xDecimalField8.setStretchWidth(50);
        formPanel18.add(xDecimalField8);

        xDecimalField9.setCaption("A.V.");
        xDecimalField9.setCaptionWidth(40);
        xDecimalField9.setCellPadding(new java.awt.Insets(0, 10, 0, 0));
        xDecimalField9.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDecimalField9.setEnabled(false);
        xDecimalField9.setName("entity.totalav"); // NOI18N
        xDecimalField9.setPreferredSize(new java.awt.Dimension(87, 20));
        xDecimalField9.setStretchWidth(50);
        formPanel18.add(xDecimalField9);

        xCheckBox1.setText("xCheckBox1");
        formPanel18.add(xCheckBox1);

        formPanel10.add(formPanel18);

        formPanel19.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel19.setPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel19.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel19.setShowCaption(false);

        xLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel30.setCaption("Title No.");
        xLabel30.setCaptionWidth(100);
        xLabel30.setExpression("#{entity.titleno}");
        xLabel30.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        xLabel30.setPreferredSize(new java.awt.Dimension(127, 18));
        xLabel30.setStretchWidth(50);
        formPanel19.add(xLabel30);

        xCheckBox3.setCaption("Taxable");
        xCheckBox3.setCaptionWidth(60);
        xCheckBox3.setCellPadding(new java.awt.Insets(0, 10, 0, 0));
        xCheckBox3.setEnabled(false);
        xCheckBox3.setName("entity.taxable"); // NOI18N
        formPanel19.add(xCheckBox3);

        formPanel10.add(formPanel19);

        jPanel4.add(formPanel10, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4, java.awt.BorderLayout.EAST);

        xTabbedPane1.setItems("sections");
        xTabbedPane1.setName("section"); // NOI18N
        xTabbedPane1.setDynamic(true);

        xDataTable4.setHandler("itemHandlers.faases");
        xDataTable4.setName("selectedItem"); // NOI18N
        xDataTable4.setAutoResize(false);
        xDataTable4.setColumns(new com.rameses.rcp.common.Column[]{
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "state"}
                , new Object[]{"caption", "State"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"visible", true}
                , new Object[]{"visibleWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "tdno"}
                , new Object[]{"caption", "TD No."}
                , new Object[]{"width", 150}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"visible", true}
                , new Object[]{"visibleWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "txntype.objid"}
                , new Object[]{"caption", "Txn"}
                , new Object[]{"width", 60}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"visible", true}
                , new Object[]{"visibleWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "classification.code"}
                , new Object[]{"caption", "Classification"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"visible", true}
                , new Object[]{"visibleWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.TextColumnHandler()}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "actualuse.code"}
                , new Object[]{"caption", "Actual Use"}
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
                new Object[]{"name", "fromyear"}
                , new Object[]{"caption", "From Year"}
                , new Object[]{"width", 70}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"visible", true}
                , new Object[]{"visibleWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.IntegerColumnHandler("0000", -1, -1)}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "fromqtr"}
                , new Object[]{"caption", "From Qtr"}
                , new Object[]{"width", 70}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"visible", true}
                , new Object[]{"visibleWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.IntegerColumnHandler("0", -1, -1)}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "toyear"}
                , new Object[]{"caption", "To Year"}
                , new Object[]{"width", 70}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"visible", true}
                , new Object[]{"visibleWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.IntegerColumnHandler("0000", -1, -1)}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "toqtr"}
                , new Object[]{"caption", "To Qtr"}
                , new Object[]{"width", 70}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"visible", true}
                , new Object[]{"visibleWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.IntegerColumnHandler("0", -1, -1)}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "taxable"}
                , new Object[]{"caption", "Tax?"}
                , new Object[]{"width", 60}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"visible", true}
                , new Object[]{"visibleWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.CheckBoxColumnHandler(java.lang.Boolean.class, true, false)}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "backtax"}
                , new Object[]{"caption", "Back Tax?"}
                , new Object[]{"width", 80}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"visible", true}
                , new Object[]{"visibleWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.CheckBoxColumnHandler(java.lang.Boolean.class, true, false)}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "reclassed"}
                , new Object[]{"caption", "Reclassed?"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"visible", true}
                , new Object[]{"visibleWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.CheckBoxColumnHandler(java.lang.Boolean.class, true, false)}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "assessedvalue"}
                , new Object[]{"caption", "Assessed Value"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", false}
                , new Object[]{"visible", true}
                , new Object[]{"visibleWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.UPPER}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.DecimalColumnHandler("#,##0.00", -1.0, -1.0, false, 0)}
            })
        });
        xDataTable4.setImmediate(true);

        xActionBar1.setDepends(new String[] {"selectedItem"});
        xActionBar1.setName("historyActions"); // NOI18N
        xActionBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xActionBar1.setUseToolBar(false);

        org.jdesktop.layout.GroupLayout jPanel8Layout = new org.jdesktop.layout.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(xDataTable4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
                    .add(xActionBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .add(xDataTable4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xActionBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        xTabbedPane1.addTab("FAAS History", jPanel8);

        org.jdesktop.layout.GroupLayout jPanel7Layout = new org.jdesktop.layout.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
                    .add(xTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 163, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel7, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel10;
    private com.rameses.rcp.util.FormPanel formPanel11;
    private com.rameses.rcp.util.FormPanel formPanel12;
    private com.rameses.rcp.util.FormPanel formPanel17;
    private com.rameses.rcp.util.FormPanel formPanel18;
    private com.rameses.rcp.util.FormPanel formPanel19;
    private com.rameses.rcp.util.FormPanel formPanel6;
    private com.rameses.rcp.util.FormPanel formPanel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XCheckBox xCheckBox1;
    private com.rameses.rcp.control.XCheckBox xCheckBox3;
    private com.rameses.rcp.control.XDataTable xDataTable4;
    private com.rameses.rcp.control.XDecimalField xDecimalField4;
    private com.rameses.rcp.control.XDecimalField xDecimalField5;
    private com.rameses.rcp.control.XDecimalField xDecimalField8;
    private com.rameses.rcp.control.XDecimalField xDecimalField9;
    private com.rameses.rcp.control.XLabel xLabel10;
    private com.rameses.rcp.control.XLabel xLabel11;
    private com.rameses.rcp.control.XLabel xLabel19;
    private com.rameses.rcp.control.XLabel xLabel21;
    private com.rameses.rcp.control.XLabel xLabel22;
    private com.rameses.rcp.control.XLabel xLabel23;
    private com.rameses.rcp.control.XLabel xLabel24;
    private com.rameses.rcp.control.XLabel xLabel25;
    private com.rameses.rcp.control.XLabel xLabel26;
    private com.rameses.rcp.control.XLabel xLabel27;
    private com.rameses.rcp.control.XLabel xLabel28;
    private com.rameses.rcp.control.XLabel xLabel29;
    private com.rameses.rcp.control.XLabel xLabel30;
    private com.rameses.rcp.control.XLabel xLabel31;
    private com.rameses.rcp.control.XTabbedPane xTabbedPane1;
    // End of variables declaration//GEN-END:variables
    
}

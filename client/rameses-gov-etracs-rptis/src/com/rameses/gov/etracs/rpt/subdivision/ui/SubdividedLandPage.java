package com.rameses.gov.etracs.rpt.subdivision.ui;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.Template;

@Template(FormPage.class)
public class SubdividedLandPage extends javax.swing.JPanel {
    
    /** Creates new form SubdivisionLandMain */
    public SubdividedLandPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();
        jPanel2 = new javax.swing.JPanel();
        xFormPanel2 = new com.rameses.rcp.control.XFormPanel();
        xIntegerField1 = new com.rameses.rcp.control.XIntegerField();
        xActionBar1 = new com.rameses.rcp.control.XActionBar();
        xSubFormPanel1 = new com.rameses.rcp.control.XSubFormPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.setLayout(new java.awt.BorderLayout());

        xFormPanel1.setPadding(new java.awt.Insets(10, 5, 10, 5));

        xComboBox1.setCaption("Section");
        xComboBox1.setExpression("#{item.section}");
        xComboBox1.setItems("sections");
        xComboBox1.setName("selectedSection"); // NOI18N
        xComboBox1.setCaptionWidth(70);
        xComboBox1.setDynamic(true);
        xComboBox1.setEmptyText("ALL");
        xComboBox1.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xComboBox1);

        jPanel1.add(xFormPanel1, java.awt.BorderLayout.PAGE_START);

        xDataTable1.setHandler("listHandler");
        xDataTable1.setName("selectedItem"); // NOI18N
        xDataTable1.setColumns(new com.rameses.rcp.common.Column[]{
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "newpin"}
                , new Object[]{"caption", "Subdivided PIN"}
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
        jPanel1.add(xDataTable1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.BorderLayout());

        xFormPanel2.setCaptionBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        xFormPanel2.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        xFormPanel2.setPadding(new java.awt.Insets(5, 5, 5, 5));

        xIntegerField1.setCaption("Count");
        xIntegerField1.setCaptionWidth(50);
        xIntegerField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xIntegerField1.setEnabled(false);
        xIntegerField1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        xIntegerField1.setName("count"); // NOI18N
        xIntegerField1.setPreferredSize(new java.awt.Dimension(40, 20));
        xFormPanel2.add(xIntegerField1);

        jPanel2.add(xFormPanel2, java.awt.BorderLayout.EAST);

        xActionBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        xActionBar1.setDynamic(true);
        xActionBar1.setName("pinActions"); // NOI18N
        xActionBar1.setUseToolBar(false);
        jPanel2.add(xActionBar1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.SOUTH);

        add(jPanel1, java.awt.BorderLayout.WEST);

        xSubFormPanel1.setDepends(new String[] {"selectedItem"});
        xSubFormPanel1.setHandler("opener");
        xSubFormPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        xSubFormPanel1.setDynamic(true);
        add(xSubFormPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XFormPanel xFormPanel2;
    private com.rameses.rcp.control.XIntegerField xIntegerField1;
    private com.rameses.rcp.control.XSubFormPanel xSubFormPanel1;
    // End of variables declaration//GEN-END:variables
    
}

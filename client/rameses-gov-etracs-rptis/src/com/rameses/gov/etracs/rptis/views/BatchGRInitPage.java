package com.rameses.gov.etracs.rptis.views;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

@Template(FormPage.class)
@StyleSheet
public class BatchGRInitPage extends javax.swing.JPanel {
    
    /** Creates new form FAASNewPage */
    public BatchGRInitPage() {
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
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xComboBox4 = new com.rameses.rcp.control.XComboBox();
        xComboBox3 = new com.rameses.rcp.control.XComboBox();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        xComboBox5 = new com.rameses.rcp.control.XComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        xTextArea1 = new com.rameses.rcp.control.XTextArea();

        setLayout(new java.awt.BorderLayout());

        formPanel1.setCaptionWidth(150);
        formPanel1.setPadding(new java.awt.Insets(0, 5, 0, 0));

        xComboBox1.setCaption("New Revision Year");
        xComboBox1.setDepends(new String[] {"params.lgu", "params.barangay"});
        xComboBox1.setItems("rylist");
        xComboBox1.setName("entity.ry"); // NOI18N
        xComboBox1.setAllowNull(false);
        xComboBox1.setDynamic(true);
        xComboBox1.setPreferredSize(new java.awt.Dimension(150, 22));
        xComboBox1.setRequired(true);
        formPanel1.add(xComboBox1);

        xComboBox4.setCaption("LGU");
        xComboBox4.setExpression("#{item.name}");
        xComboBox4.setItems("lgus");
        xComboBox4.setName("entity.lgu"); // NOI18N
        xComboBox4.setAllowNull(false);
        xComboBox4.setPreferredSize(new java.awt.Dimension(0, 22));
        xComboBox4.setRequired(true);
        formPanel1.add(xComboBox4);

        xComboBox3.setCaption("Barangay");
        xComboBox3.setDepends(new String[] {"entity.lgu"});
        xComboBox3.setExpression("#{item.name}");
        xComboBox3.setItems("barangays");
        xComboBox3.setName("entity.barangay"); // NOI18N
        xComboBox3.setAllowNull(false);
        xComboBox3.setDynamic(true);
        xComboBox3.setImmediate(true);
        xComboBox3.setPreferredSize(new java.awt.Dimension(0, 22));
        xComboBox3.setRequired(true);
        formPanel1.add(xComboBox3);

        xTextField1.setCaption("Section");
        xTextField1.setName("entity.section"); // NOI18N
        xTextField1.setPreferredSize(new java.awt.Dimension(150, 20));
        formPanel1.add(xTextField1);

        xComboBox2.setCaption("Property Type");
        xComboBox2.setExpression("#{item.name}");
        xComboBox2.setItems("rputypes");
        xComboBox2.setName("entity.rputype"); // NOI18N
        xComboBox2.setEmptyText("ALL");
        xComboBox2.setImmediate(true);
        xComboBox2.setPreferredSize(new java.awt.Dimension(150, 22));
        formPanel1.add(xComboBox2);

        xComboBox5.setCaption("Classification");
        xComboBox5.setExpression("#{item.name}");
        xComboBox5.setItems("classifications");
        xComboBox5.setName("entity.classification"); // NOI18N
        xComboBox5.setEmptyText("ALL");
        xComboBox5.setPreferredSize(new java.awt.Dimension(150, 22));
        formPanel1.add(xComboBox5);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(0, 100));

        xTextArea1.setCaption("Default Memoranda");
        xTextArea1.setLineWrap(true);
        xTextArea1.setName("entity.memoranda"); // NOI18N
        xTextArea1.setWrapStyleWord(true);
        xTextArea1.setCellPadding(new java.awt.Insets(10, 0, 0, 0));
        xTextArea1.setPreferredSize(new java.awt.Dimension(0, 100));
        xTextArea1.setRequired(true);
        xTextArea1.setTextCase(com.rameses.rcp.constant.TextCase.UPPER);
        jScrollPane1.setViewportView(xTextArea1);

        formPanel1.add(jScrollPane1);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 484, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 271, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XComboBox xComboBox3;
    private com.rameses.rcp.control.XComboBox xComboBox4;
    private com.rameses.rcp.control.XComboBox xComboBox5;
    private com.rameses.rcp.control.XTextArea xTextArea1;
    private com.rameses.rcp.control.XTextField xTextField1;
    // End of variables declaration//GEN-END:variables
    
}

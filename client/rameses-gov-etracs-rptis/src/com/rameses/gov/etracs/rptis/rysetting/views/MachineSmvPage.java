/*
 * BldgAdditionalItemPage.java
 *
 * Created on June 22, 2011, 3:52 PM
 */

package com.rameses.gov.etracs.rptis.rysetting.views;

import com.rameses.rcp.ui.annotations.Template;
import com.rameses.seti2.views.CrudFormPage;

@Template(CrudFormPage.class)
public class MachineSmvPage extends javax.swing.JPanel {
    
    /** Creates new form BldgAdditionalItemPage */
    public MachineSmvPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xActionBar1 = new com.rameses.rcp.control.XActionBar();
        jPanel1 = new javax.swing.JPanel();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xLookupField1 = new com.rameses.rcp.control.XLookupField();
        jScrollPane1 = new javax.swing.JScrollPane();
        xTextArea1 = new com.rameses.rcp.control.XTextArea();
        xButton1 = new com.rameses.rcp.control.XButton();

        setPreferredSize(new java.awt.Dimension(513, 324));
        setLayout(new java.awt.BorderLayout());

        xLookupField1.setCaption("Machine");
        xLookupField1.setExpression("#{item.name}");
        xLookupField1.setHandler("machine:lookup");
        xLookupField1.setName("entity.machine"); // NOI18N
        xLookupField1.setPreferredSize(new java.awt.Dimension(0, 20));
        xLookupField1.setRequired(true);
        formPanel2.add(xLookupField1);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Computation Formula");
        jScrollPane1.setBorder(xTitledBorder1);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(0, 90));

        xTextArea1.setName("entity.expr"); // NOI18N
        xTextArea1.setCellPadding(new java.awt.Insets(5, 0, 0, 0));
        xTextArea1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        xTextArea1.setReadonly(true);
        xTextArea1.setShowCaption(false);
        jScrollPane1.setViewportView(xTextArea1);

        formPanel2.add(jScrollPane1);

        xButton1.setDisableWhen("#{mode == 'read' }");
        xButton1.setMnemonic('f');
        xButton1.setName("editExpression"); // NOI18N
        xButton1.setShowCaption(false);
        xButton1.setText("Formula");
        formPanel2.add(xButton1);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 484, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XLookupField xLookupField1;
    private com.rameses.rcp.control.XTextArea xTextArea1;
    // End of variables declaration//GEN-END:variables
    
}

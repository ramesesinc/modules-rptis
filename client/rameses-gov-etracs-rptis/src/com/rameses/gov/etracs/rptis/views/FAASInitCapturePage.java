/*
 * FAASNewPage.java
 *
 * Created on June 25, 2011, 10:35 AM
 */

package com.rameses.gov.etracs.rptis.views;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

@Template(FormPage.class)
@StyleSheet
public class FAASInitCapturePage extends javax.swing.JPanel {
    
    /** Creates new form FAASNewPage */
    public FAASInitCapturePage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        xIntegerField1 = new com.rameses.rcp.control.XIntegerField();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xComboBox3 = new com.rameses.rcp.control.XComboBox();
        xComboBox4 = new com.rameses.rcp.control.XComboBox();
        xComboBox5 = new com.rameses.rcp.control.XComboBox();
        xLookupField2 = new com.rameses.rcp.control.XLookupField();
        xIntegerField2 = new com.rameses.rcp.control.XIntegerField();
        xIntegerField3 = new com.rameses.rcp.control.XIntegerField();
        xIntegerField4 = new com.rameses.rcp.control.XIntegerField();
        xIntegerField5 = new com.rameses.rcp.control.XIntegerField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xLabel1 = new com.rameses.rcp.control.XLabel();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Initial Information");
        formPanel1.setBorder(xTitledBorder1);
        formPanel1.setCaptionWidth(100);

        xComboBox2.setAllowNull(false);
        xComboBox2.setCaption("PIN Type");
        xComboBox2.setImmediate(true);
        xComboBox2.setIndex(-10);
        xComboBox2.setItems("pinTypes");
        xComboBox2.setName("entity.pintype"); // NOI18N
        xComboBox2.setPreferredSize(new java.awt.Dimension(100, 22));
        xComboBox2.setRequired(true);
        formPanel1.add(xComboBox2);

        xIntegerField1.setCaption("Revision Year");
        xIntegerField1.setName("entity.ry"); // NOI18N
        xIntegerField1.setRequired(true);
        formPanel1.add(xIntegerField1);

        xComboBox1.setCaption("Transaction");
        xComboBox1.setExpression("#{item.name}");
        xComboBox1.setImmediate(true);
        xComboBox1.setIndex(-10);
        xComboBox1.setItems("txnTypes");
        xComboBox1.setName("entity.txntype"); // NOI18N
        xComboBox1.setPreferredSize(new java.awt.Dimension(0, 22));
        xComboBox1.setRequired(true);
        formPanel1.add(xComboBox1);

        xComboBox3.setAllowNull(false);
        xComboBox3.setCaption("Property Type");
        xComboBox3.setImmediate(true);
        xComboBox3.setItems("rpuTypes");
        xComboBox3.setName("entity.rputype"); // NOI18N
        xComboBox3.setPreferredSize(new java.awt.Dimension(0, 22));
        xComboBox3.setRequired(true);
        formPanel1.add(xComboBox3);

        xComboBox4.setAllowNull(false);
        xComboBox4.setCaption("LGU");
        xComboBox4.setDepends(new String[] {"entity.rputype", "entity.lgu"});
        xComboBox4.setExpression("#{item.name}");
        xComboBox4.setItems("lgus");
        xComboBox4.setName("entity.lgu"); // NOI18N
        xComboBox4.setPreferredSize(new java.awt.Dimension(0, 22));
        xComboBox4.setRequired(true);
        formPanel1.add(xComboBox4);

        xComboBox5.setCaption("Barangay");
        xComboBox5.setDepends(new String[] {"entity.rputype", "entity.lgu"});
        xComboBox5.setDynamic(true);
        xComboBox5.setExpression("#{item.name}");
        xComboBox5.setItems("barangays");
        xComboBox5.setName("entity.barangay"); // NOI18N
        xComboBox5.setPreferredSize(new java.awt.Dimension(0, 22));
        xComboBox5.setRequired(true);
        formPanel1.add(xComboBox5);

        xLookupField2.setCaption("Land PIN");
        xLookupField2.setDepends(new String[] {"entity.rputype"});
        xLookupField2.setExpression("#{entity.rp.pin}");
        xLookupField2.setHandler("lookupRealProperty");
        xLookupField2.setName("entity.rp"); // NOI18N
        xLookupField2.setPreferredSize(new java.awt.Dimension(0, 20));
        xLookupField2.setRequired(true);
        formPanel1.add(xLookupField2);

        xIntegerField2.setCaption("Section");
        xIntegerField2.setDepends(new String[] {"entity.pintype", "entity.rputype"});
        xIntegerField2.setName("entity.isection"); // NOI18N
        xIntegerField2.setRequired(true);
        formPanel1.add(xIntegerField2);

        xIntegerField3.setCaption("Parcel");
        xIntegerField3.setDepends(new String[] {"entity.pintype", "entity.rputype"});
        xIntegerField3.setName("entity.iparcel"); // NOI18N
        xIntegerField3.setRequired(true);
        formPanel1.add(xIntegerField3);

        xIntegerField4.setCaption("Suffix");
        xIntegerField4.setDepends(new String[] {"entity.rputype"});
        xIntegerField4.setName("entity.suffix"); // NOI18N
        xIntegerField4.setRequired(true);
        formPanel1.add(xIntegerField4);

        xIntegerField5.setCaption("Post Fix");
        xIntegerField5.setDepends(new String[] {"entity.rputype"});
        xIntegerField5.setName("entity.subsuffix"); // NOI18N
        formPanel1.add(xIntegerField5);

        xTextField2.setCaption("Claim No.");
        xTextField2.setDepends(new String[] {"entity.rputype"});
        xTextField2.setName("entity.claimno"); // NOI18N
        xTextField2.setPreferredSize(new java.awt.Dimension(100, 19));
        xTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xTextField2ActionPerformed(evt);
            }
        });
        formPanel1.add(xTextField2);

        xLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        com.rameses.rcp.control.border.XLineBorder xLineBorder1 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder1.setLineColor(new java.awt.Color(153, 153, 153));
        xLabel1.setBorder(xLineBorder1);
        xLabel1.setCaption("PIN No.");
        xLabel1.setCaptionFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xLabel1.setExpression("#{entity.fullpin}");
        xLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 30));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, xLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, formPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 315, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void xTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xTextField2ActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_xTextField2ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XComboBox xComboBox3;
    private com.rameses.rcp.control.XComboBox xComboBox4;
    private com.rameses.rcp.control.XComboBox xComboBox5;
    private com.rameses.rcp.control.XIntegerField xIntegerField1;
    private com.rameses.rcp.control.XIntegerField xIntegerField2;
    private com.rameses.rcp.control.XIntegerField xIntegerField3;
    private com.rameses.rcp.control.XIntegerField xIntegerField4;
    private com.rameses.rcp.control.XIntegerField xIntegerField5;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLookupField xLookupField2;
    private com.rameses.rcp.control.XTextField xTextField2;
    // End of variables declaration//GEN-END:variables
    
}

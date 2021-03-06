/*
 * SubdivisionPage.java
 *
 * Created on July 1, 2011, 4:55 PM
 */

package com.rameses.gov.etracs.rpt.subdivision.ui;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author  rameses
 */
@Template(FormPage.class)
public class SubdivisionInfoMainPage extends javax.swing.JPanel {
    
    /** Creates new form SubdivisionPage */
    public SubdivisionInfoMainPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formPanel3 = new com.rameses.rcp.util.FormPanel();
        xLabel15 = new com.rameses.rcp.control.XLabel();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        xLabel5 = new com.rameses.rcp.control.XLabel();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Subdivision Information");
        formPanel3.setBorder(xTitledBorder1);
        formPanel3.setCaptionWidth(95);

        xLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel15.setCaption("Tracking No.");
        xLabel15.setCaptionWidth(115);
        xLabel15.setExpression("#{entity.trackingno}");
        xLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        xLabel15.setForeground(new java.awt.Color(153, 0, 0));
        xLabel15.setPreferredSize(new java.awt.Dimension(0, 21));
        formPanel3.add(xLabel15);

        xLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel3.setCaption("Revision Year");
        xLabel3.setCaptionWidth(115);
        xLabel3.setExpression("#{entity.ry}");
        xLabel3.setPreferredSize(new java.awt.Dimension(130, 19));
        formPanel3.add(xLabel3);

        xLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel4.setCaption("Effectivity Year");
        xLabel4.setCaptionWidth(115);
        xLabel4.setExpression("#{entity.effectivityyear}");
        xLabel4.setPreferredSize(new java.awt.Dimension(130, 19));
        formPanel3.add(xLabel4);

        xLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel5.setCaption("Effectivity Qtr");
        xLabel5.setCaptionWidth(115);
        xLabel5.setExpression("#{entity.effectivityqtr}");
        xLabel5.setPreferredSize(new java.awt.Dimension(130, 19));
        formPanel3.add(xLabel5);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 484, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 305, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel3;
    private com.rameses.rcp.control.XLabel xLabel15;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XLabel xLabel5;
    // End of variables declaration//GEN-END:variables
    
}

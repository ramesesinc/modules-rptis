/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rptis.obo.views;

import com.rameses.rcp.ui.annotations.Template;
import com.rameses.seti2.views.CrudFormPage;

@Template(CrudFormPage.class)
public class OccupancyPermitPage extends javax.swing.JPanel {

    /**
     * Creates new form OccupancyPermitPage
     */
    public OccupancyPermitPage() {
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
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        xLabel7 = new com.rameses.rcp.control.XLabel();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        xLabel5 = new com.rameses.rcp.control.XLabel();
        xLabel6 = new com.rameses.rcp.control.XLabel();
        xFormPanel2 = new com.rameses.rcp.control.XFormPanel();
        xLookupField1 = new com.rameses.rcp.control.XLookupField();
        xLabel10 = new com.rameses.rcp.control.XLabel();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xIntegerField1 = new com.rameses.rcp.control.XIntegerField();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setPadding(new java.awt.Insets(25, 10, 10, 10));
        xTitledBorder1.setTitle("Building Information");
        xFormPanel1.setBorder(xTitledBorder1);
        xFormPanel1.setCaptionWidth(130);

        xLabel1.setCaption("Building Permit No.");
        xLabel1.setExpression("#{entity.bldgpermitno}");
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xLabel1);

        xDateField1.setCaption("Date Issued");
        xDateField1.setName("entity.bldgpermitdtissued"); // NOI18N
        xDateField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        xDateField1.setEnabled(false);
        xDateField1.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xDateField1);

        xLabel2.setCaption("Number of Units");
        xLabel2.setExpression("#{entity.actualnumunits}");
        xLabel2.setCellPadding(new java.awt.Insets(10, 0, 0, 0));
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xLabel2);

        xLabel3.setCaption("Number of Floors");
        xLabel3.setExpression("#{entity.actualnumfloors}");
        xLabel3.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xLabel3);

        xLabel7.setCaption("Location");
        xLabel7.setExpression("#{entity.location.text}");
        xLabel7.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xLabel7);

        xLabel4.setCaption("Actual Project Cost");
        xLabel4.setExpression("#{entity.actualprojectcost}");
        xLabel4.setCellPadding(new java.awt.Insets(10, 0, 0, 0));
        xLabel4.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xLabel4);

        xLabel5.setCaption("Applicant");
        xLabel5.setExpression("#{entity.applicant.name}");
        xLabel5.setCellPadding(new java.awt.Insets(10, 0, 0, 0));
        xLabel5.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xLabel5);

        xLabel6.setCaption("Address");
        xLabel6.setExpression("#{entity.applicant.address.text}");
        xLabel6.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xLabel6);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setPadding(new java.awt.Insets(25, 10, 10, 10));
        xTitledBorder2.setTitle("Building FAAS Information");
        xFormPanel2.setBorder(xTitledBorder2);
        xFormPanel2.setCaptionWidth(120);

        xLookupField1.setCaption("Property Owner");
        xLookupField1.setExpression("#{entity.taxpayer.name}");
        xLookupField1.setHandler("entity:lookup");
        xLookupField1.setName("entity.taxpayer"); // NOI18N
        xLookupField1.setPreferredSize(new java.awt.Dimension(0, 20));
        xLookupField1.setRequired(true);
        xFormPanel2.add(xLookupField1);

        xLabel10.setCaption("Address");
        xLabel10.setExpression("#{entity.taxpayer.addresstext}");
        xLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        xLabel10.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel2.add(xLabel10);

        xComboBox1.setCaption("Land RPU");
        xComboBox1.setExpression("#{item.tdno}");
        xComboBox1.setItems("rpus");
        xComboBox1.setName("entity.landfaas"); // NOI18N
        xComboBox1.setAllowNull(false);
        xComboBox1.setPreferredSize(new java.awt.Dimension(0, 20));
        xComboBox1.setRequired(true);
        xFormPanel2.add(xComboBox1);

        xIntegerField1.setCaption("Suffix");
        xIntegerField1.setName("entity.suffix"); // NOI18N
        xIntegerField1.setRequired(true);
        xFormPanel2.add(xIntegerField1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xFormPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xFormPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XFormPanel xFormPanel2;
    private com.rameses.rcp.control.XIntegerField xIntegerField1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel10;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XLabel xLabel5;
    private com.rameses.rcp.control.XLabel xLabel6;
    private com.rameses.rcp.control.XLabel xLabel7;
    private com.rameses.rcp.control.XLookupField xLookupField1;
    // End of variables declaration//GEN-END:variables
}

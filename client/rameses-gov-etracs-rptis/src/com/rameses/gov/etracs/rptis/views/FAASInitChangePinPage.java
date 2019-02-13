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
public class FAASInitChangePinPage extends javax.swing.JPanel {
    
    /** Creates new form FAASNewPage */
    public FAASInitChangePinPage() {
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
        xLookupField3 = new com.rameses.rcp.control.XLookupField();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xSeparator1 = new com.rameses.rcp.control.XSeparator();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        xIntegerField1 = new com.rameses.rcp.control.XIntegerField();
        xComboBox3 = new com.rameses.rcp.control.XComboBox();
        xComboBox5 = new com.rameses.rcp.control.XComboBox();
        xLookupField2 = new com.rameses.rcp.control.XLookupField();
        xNumberField3 = new com.rameses.rcp.control.XNumberField();
        xNumberField4 = new com.rameses.rcp.control.XNumberField();
        xNumberField5 = new com.rameses.rcp.control.XNumberField();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Revision Initial Information");
        formPanel1.setBorder(xTitledBorder1);
        formPanel1.setCaptionWidth(110);

        xLookupField3.setCaption("Property to process");
        xLookupField3.setCaptionWidth(130);
        xLookupField3.setExpression("#{entity.faas.tdno}");
        xLookupField3.setHandler("lookupFaas");
        xLookupField3.setHint("Search Property");
        xLookupField3.setName("entity.faas"); // NOI18N
        xLookupField3.setPreferredSize(new java.awt.Dimension(0, 19));
        xLookupField3.setRequired(true);
        formPanel1.add(xLookupField3);

        com.rameses.rcp.control.border.XLineBorder xLineBorder1 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder1.setLineColor(new java.awt.Color(153, 153, 153));
        xLabel2.setBorder(xLineBorder1);
        xLabel2.setCaption("Current PIN");
        xLabel2.setCaptionWidth(130);
        xLabel2.setExpression("#{entity.faas.fullpin}");
        xLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 21));
        formPanel1.add(xLabel2);

        xSeparator1.setPreferredSize(new java.awt.Dimension(0, 20));

        org.jdesktop.layout.GroupLayout xSeparator1Layout = new org.jdesktop.layout.GroupLayout(xSeparator1);
        xSeparator1.setLayout(xSeparator1Layout);
        xSeparator1Layout.setHorizontalGroup(
            xSeparator1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 357, Short.MAX_VALUE)
        );
        xSeparator1Layout.setVerticalGroup(
            xSeparator1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );

        formPanel1.add(xSeparator1);

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

        xComboBox3.setAllowNull(false);
        xComboBox3.setCaption("Property Type");
        xComboBox3.setDepends(new String[] {"entity.faas"});
        xComboBox3.setImmediate(true);
        xComboBox3.setItems("rpuTypes");
        xComboBox3.setName("entity.rputype"); // NOI18N
        xComboBox3.setPreferredSize(new java.awt.Dimension(0, 22));
        xComboBox3.setRequired(true);
        formPanel1.add(xComboBox3);

        xComboBox5.setCaption("Barangay");
        xComboBox5.setDepends(new String[] {"entity.rputype", "entity.lgu", "entity.faas"});
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

        xNumberField3.setCaption("Section");
        xNumberField3.setDepends(new String[] {"entity.rputype", "entity.faas"});
        xNumberField3.setFieldType(Integer.class);
        xNumberField3.setName("entity.isection"); // NOI18N
        xNumberField3.setPreferredSize(new java.awt.Dimension(100, 19));
        xNumberField3.setRequired(true);
        formPanel1.add(xNumberField3);

        xNumberField4.setCaption("Parcel");
        xNumberField4.setDepends(new String[] {"entity.rputype", "entity.faas"});
        xNumberField4.setFieldType(Integer.class);
        xNumberField4.setName("entity.iparcel"); // NOI18N
        xNumberField4.setPreferredSize(new java.awt.Dimension(100, 19));
        xNumberField4.setRequired(true);
        formPanel1.add(xNumberField4);

        xNumberField5.setCaption("Suffix");
        xNumberField5.setDepends(new String[] {"entity.rputype", "entity.faas"});
        xNumberField5.setFieldType(Integer.class);
        xNumberField5.setName("entity.suffix"); // NOI18N
        xNumberField5.setPreferredSize(new java.awt.Dimension(100, 19));
        xNumberField5.setRequired(true);
        formPanel1.add(xNumberField5);

        xLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        com.rameses.rcp.control.border.XLineBorder xLineBorder2 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder2.setLineColor(new java.awt.Color(153, 153, 153));
        xLabel1.setBorder(xLineBorder2);
        xLabel1.setCaption("PIN No.");
        xLabel1.setCaptionFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xLabel1.setExpression("#{entity.fullpin}");
        xLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 30));

        xDataTable1.setColumns(new com.rameses.rcp.common.Column[]{
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "selected"}
                , new Object[]{"caption", " "}
                , new Object[]{"width", 40}
                , new Object[]{"minWidth", 40}
                , new Object[]{"maxWidth", 40}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", true}
                , new Object[]{"editableWhen", null}
                , new Object[]{"visible", true}
                , new Object[]{"visibleWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.NONE}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.CheckBoxColumnHandler(java.lang.Boolean.class, true, false)}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "attribute"}
                , new Object[]{"caption", "Attributes"}
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
            })
        });
        xDataTable1.setHandler("listHandler");
        xDataTable1.setImmediate(true);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(xDataTable1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(formPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .add(xLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 287, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xDataTable1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 226, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XComboBox xComboBox3;
    private com.rameses.rcp.control.XComboBox xComboBox5;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XIntegerField xIntegerField1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLookupField xLookupField2;
    private com.rameses.rcp.control.XLookupField xLookupField3;
    private com.rameses.rcp.control.XNumberField xNumberField3;
    private com.rameses.rcp.control.XNumberField xNumberField4;
    private com.rameses.rcp.control.XNumberField xNumberField5;
    private com.rameses.rcp.control.XSeparator xSeparator1;
    // End of variables declaration//GEN-END:variables
    
}

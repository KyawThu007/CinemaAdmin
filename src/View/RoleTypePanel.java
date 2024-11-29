/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Panel.java to edit this template
 */
package View;

import Controller.EmployeeImp;
import Controller.RoleTypeImp;
import Controller.SalaryImp;
import Model.Employee;
import Model.RoleType;
import Model.Salary;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class RoleTypePanel extends java.awt.Panel {

    /**
     * Creates new form RoleTypePanel
     */
    DefaultTableModel model;

    public RoleTypePanel() {
        initComponents();
        buttonGroup1.add(manageRadioBtn);
        buttonGroup1.add(entryRadioBtn);
        buttonGroup1.add(noneRadioBtn);
        getAllRoleTypeAction();
        // Create a custom cell renderer to left align text
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.LEFT);

        for (int i = 0; i < roleTypeTable.getColumnCount(); i++) {
            roleTypeTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jpanel = new javax.swing.JPanel();
        insertBtn = new javax.swing.JButton();
        roleField = new javax.swing.JTextField();
        salaryField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        manageRadioBtn = new javax.swing.JRadioButton();
        entryRadioBtn = new javax.swing.JRadioButton();
        noneRadioBtn = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        roleTypeTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        typeBox = new javax.swing.JComboBox<>();
        searchField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jpanel.setBackground(new java.awt.Color(204, 204, 204));

        insertBtn.setText("Insert");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        roleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleFieldActionPerformed(evt);
            }
        });

        salaryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Role");

        jLabel3.setText("Salary");

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        manageRadioBtn.setText("Manage");

        entryRadioBtn.setText("Entry");

        noneRadioBtn.setText("None");

        javax.swing.GroupLayout jpanelLayout = new javax.swing.GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(roleField, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(manageRadioBtn)
                        .addGap(18, 18, 18)
                        .addComponent(entryRadioBtn)
                        .addGap(18, 18, 18)
                        .addComponent(noneRadioBtn)
                        .addGap(60, 60, 60)
                        .addComponent(insertBtn)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBtn))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noneRadioBtn)
                    .addComponent(manageRadioBtn)
                    .addComponent(entryRadioBtn)
                    .addComponent(insertBtn)
                    .addComponent(cancelBtn)
                    .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(287, 287, 287))
        );

        roleTypeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Role", "Salary", "Control"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(roleTypeTable);
        if (roleTypeTable.getColumnModel().getColumnCount() > 0) {
            roleTypeTable.getColumnModel().getColumn(0).setMinWidth(60);
            roleTypeTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            roleTypeTable.getColumnModel().getColumn(0).setMaxWidth(60);
            roleTypeTable.getColumnModel().getColumn(1).setResizable(false);
            roleTypeTable.getColumnModel().getColumn(2).setMinWidth(200);
            roleTypeTable.getColumnModel().getColumn(2).setPreferredWidth(200);
            roleTypeTable.getColumnModel().getColumn(2).setMaxWidth(200);
            roleTypeTable.getColumnModel().getColumn(3).setMinWidth(200);
            roleTypeTable.getColumnModel().getColumn(3).setPreferredWidth(200);
            roleTypeTable.getColumnModel().getColumn(3).setMaxWidth(200);
        }

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Role Type");
        jLabel5.setToolTipText("");

        typeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Role", "Control" }));
        typeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeBoxActionPerformed(evt);
            }
        });

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        jLabel1.setText(" Type :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(deleteBtn)
                .addGap(18, 18, 18)
                .addComponent(updateBtn)
                .addGap(18, 18, 18)
                .addComponent(refreshBtn)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn)
                    .addComponent(deleteBtn)
                    .addComponent(updateBtn)
                    .addComponent(refreshBtn)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        // TODO add your handling code here:
        addRoleTypeAction();
    }//GEN-LAST:event_insertBtnActionPerformed

    private void roleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleFieldActionPerformed

    private void salaryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryFieldActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        cancel();

    }//GEN-LAST:event_cancelBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        // TODO add your handling code here:
        updateRoleTypeAction();

    }//GEN-LAST:event_updateBtnActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        deleteRoleTypeAction();

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void typeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeBoxActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        getAllRoleTypeAction();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void search() {
        List<RoleType> list = new ArrayList<>();
        String type = typeBox.getItemAt(typeBox.getSelectedIndex());
        for (RoleType roleType : new RoleTypeImp().getAllRoleType()) {
            switch (type) {
                    case "Role":
                        if (roleType.getRole_type().toLowerCase().contains(searchField.getText().toLowerCase())) {
                            list.add(roleType);
                        }
                        break;
                    case "Control":
                        if (roleType.getControl().toLowerCase().contains(searchField.getText().toLowerCase())) {
                            list.add(roleType);
                        }
                        break;

                }
        }
       while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        for (RoleType roleType : list) {
            model.addRow(new Object[]{roleType.getId(), roleType.getRole_type(), roleType.getSalary(), roleType.getControl()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JRadioButton entryRadioBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanel;
    private javax.swing.JRadioButton manageRadioBtn;
    private javax.swing.JRadioButton noneRadioBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTextField roleField;
    private javax.swing.JTable roleTypeTable;
    private javax.swing.JTextField salaryField;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JComboBox<String> typeBox;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private void addRoleTypeAction() {

        String controlValue = null;
        if (manageRadioBtn.isSelected()) {
            controlValue = manageRadioBtn.getText();
        } else if (entryRadioBtn.isSelected()) {
            controlValue = entryRadioBtn.getText();
        } else if (noneRadioBtn.isSelected()) {
            controlValue = noneRadioBtn.getText();
        }

        RoleType roleType = new RoleType();
        roleType.setRole_type(roleField.getText());
        roleType.setSalary(Double.parseDouble(salaryField.getText()));
        roleType.setControl(controlValue);

        int n = new RoleTypeImp().addRoleType(roleType);
        if (n == 1) {
            logMessage("Added Successful!");
            cancel();
            getAllRoleTypeAction();
        } else {
            logMessage("Error!");
        }
    }

    private void updateRoleTypeAction() {
        int selectedRow = roleTypeTable.getSelectedRow();
        System.out.println("Selected Row => " + selectedRow);
        if (selectedRow != -1) {
            // Get data from the selected row
            RoleType roleType = new RoleType();
            roleType.setId((int) roleTypeTable.getValueAt(selectedRow, 0));
            roleType.setRole_type(roleTypeTable.getValueAt(selectedRow, 1).toString());
            roleType.setSalary(Double.parseDouble(roleTypeTable.getValueAt(selectedRow, 2).toString()));
            roleType.setControl(roleTypeTable.getValueAt(selectedRow, 3).toString());
            new RoleTypeImp().updateRoleType(roleType);
            getAllRoleTypeAction();
        } else {
            // No row selected
            logMessage("Selected!");
        }
    }

    private void deleteRoleTypeAction() {
        int selectedRow = roleTypeTable.getSelectedRow();
        if (selectedRow != -1) {
            // Get data from the selected row
            new RoleTypeImp().deleteRoleType((int) roleTypeTable.getValueAt(selectedRow, 0));
            getAllRoleTypeAction();
        } else {
            // No row selected
            logMessage("Selected!");
        }
    }

    private void cancel() {
        roleField.setText("");
        salaryField.setText("");
    }

    private void getAllRoleTypeAction() {
        model = (DefaultTableModel) roleTypeTable.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        for (RoleType roleType : new RoleTypeImp().getAllRoleType()) {
            model.addRow(new Object[]{roleType.getId(), roleType.getRole_type(), roleType.getSalary(), roleType.getControl()});
        }
    }

    public void logMessage(String log) {
        JOptionPane.showMessageDialog(null, log, "", JOptionPane.INFORMATION_MESSAGE);
    }
}
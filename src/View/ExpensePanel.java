/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.CinemaImp;
import Controller.ExpenseImp;
import Model.Cinema;
import Model.Expense;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class ExpensePanel extends javax.swing.JPanel {

    /**
     * Creates new form ExpensePanel
     */
    DefaultTableModel model;
    int cinema_id;

    public ExpensePanel() {
        initComponents();

        model = (DefaultTableModel) expenseTable.getModel();

        for (Cinema cinema : new CinemaImp().getAllCinema()) {
            branchBox.addItem(cinema.getBranch());
        }

        // Create a custom cell renderer to left align text
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.LEFT);

        for (int i = 0; i < expenseTable.getColumnCount(); i++) {
            expenseTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        try {
            cinemaSelected();
            getAllExpenseAction();
        } catch (Exception e) {
        }
        branchBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                cinemaSelected();
                getAllExpenseAction();
            }
        });
dateChooser.setDateFormatString("yyyy-MM-dd");
        dateChooser.setDate(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        typeBox = new javax.swing.JComboBox<>();
        searchField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        branchBox = new javax.swing.JComboBox<>();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        expenseTable = new javax.swing.JTable();
        jpanel = new javax.swing.JPanel();
        insertBtn = new javax.swing.JButton();
        amountField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        noteArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();

        setMaximumSize(new java.awt.Dimension(80, 23));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(80, 23));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Expense");

        typeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Note", "Date" }));
        typeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeBoxActionPerformed(evt);
            }
        });

        searchField.setMinimumSize(new java.awt.Dimension(64, 18));
        searchField.setPreferredSize(new java.awt.Dimension(64, 18));

        jButton1.setText("Search");
        jButton1.setMaximumSize(new java.awt.Dimension(80, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        branchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchBoxActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.setMaximumSize(new java.awt.Dimension(80, 23));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.setMaximumSize(new java.awt.Dimension(80, 23));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        refreshBtn.setText("Refresh");
        refreshBtn.setMaximumSize(new java.awt.Dimension(80, 23));
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Branch :");

        jLabel5.setText("Type :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(branchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(branchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25))
        );

        expenseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Amount", "Note", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(expenseTable);
        if (expenseTable.getColumnModel().getColumnCount() > 0) {
            expenseTable.getColumnModel().getColumn(0).setMinWidth(60);
            expenseTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            expenseTable.getColumnModel().getColumn(0).setMaxWidth(60);
            expenseTable.getColumnModel().getColumn(1).setMinWidth(200);
            expenseTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            expenseTable.getColumnModel().getColumn(1).setMaxWidth(200);
            expenseTable.getColumnModel().getColumn(3).setMinWidth(120);
            expenseTable.getColumnModel().getColumn(3).setPreferredWidth(120);
            expenseTable.getColumnModel().getColumn(3).setMaxWidth(120);
        }

        jpanel.setBackground(new java.awt.Color(204, 204, 204));

        insertBtn.setText("Insert");
        insertBtn.setMaximumSize(new java.awt.Dimension(80, 23));
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        amountField.setMinimumSize(new java.awt.Dimension(64, 18));
        amountField.setPreferredSize(new java.awt.Dimension(64, 18));
        amountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Amount");

        cancelBtn.setText("Cancel");
        cancelBtn.setMaximumSize(new java.awt.Dimension(80, 23));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        noteArea.setColumns(20);
        noteArea.setRows(5);
        jScrollPane2.setViewportView(noteArea);

        jLabel8.setText("Note");

        jLabel2.setText("Date");

        dateChooser.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jpanelLayout = new javax.swing.GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(amountField, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(89, Short.MAX_VALUE))
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpanelLayout.createSequentialGroup()
                                .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void typeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void branchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchBoxActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        deleteExpenseAction();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        updateExpenseAction();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        getAllExpenseAction();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        // TODO add your handling code here:
        addExpenseAction();
    }//GEN-LAST:event_insertBtnActionPerformed

    private void amountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountFieldActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        cancel();
    }//GEN-LAST:event_cancelBtnActionPerformed
    private void search() {
        List<Expense> list = new ArrayList<>();
        String type = typeBox.getItemAt(typeBox.getSelectedIndex());
        for (Expense expense : new ExpenseImp().getAllExpense(cinema_id)) {
            if (cinema_id == expense.getCinema_id()) {
                switch (type) {
                    case "Note":
                        if (expense.getNote().toLowerCase().contains(searchField.getText().toLowerCase())) {
                            list.add(expense);
                        }
                        break;
                    case "Date":
                        if (expense.getDate().equals(searchField.getText())) {
                            list.add(expense);
                        }
                        break;

                }
            }

        }
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        for (Expense expense : list) {
            model.addRow(new Object[]{expense.getId(), expense.getAmount(), expense.getNote(), expense.getDate()});

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountField;
    private javax.swing.JComboBox<String> branchBox;
    private javax.swing.JButton cancelBtn;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable expenseTable;
    private javax.swing.JButton insertBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpanel;
    private javax.swing.JTextArea noteArea;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JComboBox<String> typeBox;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private void addExpenseAction() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(dateChooser.getDate());
        Expense expense = new Expense();
        expense.setCinema_id(cinema_id);
        expense.setAmount(Double.parseDouble(amountField.getText()));
        expense.setNote(noteArea.getText());
        expense.setDate(date);
        int n = new ExpenseImp().addExpense(expense);
        if (n == 1) {
            logMessage("Added Successful!");
            cancel();
            getAllExpenseAction();
        } else {
            logMessage("Error!");
        }
    }

    private void getAllExpenseAction() {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        for (Expense expense : new ExpenseImp().getAllExpense(cinema_id)) {
            model.addRow(new Object[]{expense.getId(), expense.getAmount(), expense.getNote(), expense.getDate()});

        }
    }

    private void deleteExpenseAction() {
        int selectedRow = expenseTable.getSelectedRow();
        if (selectedRow != -1) {
            // Get data from the selected row
            new ExpenseImp().deleteExpense((int) expenseTable.getValueAt(selectedRow, 0));
            getAllExpenseAction();
        } else {
            // No row selected
            logMessage("Selected!");
        }
    }

    private void updateExpenseAction() {
        int selectedRow = expenseTable.getSelectedRow();
        System.out.println("Selected Row => " + selectedRow);
        if (selectedRow != -1) {
            // Get data from the selected row
            Expense expense = new Expense();
            expense.setCinema_id(cinema_id);
            expense.setId((int) expenseTable.getValueAt(selectedRow, 0));
            expense.setAmount((double) expenseTable.getValueAt(selectedRow, 1));
            expense.setNote(expenseTable.getValueAt(selectedRow, 2).toString());
            expense.setDate(expenseTable.getValueAt(selectedRow, 3).toString());

            new ExpenseImp().updateExpense(expense);
            getAllExpenseAction();
        } else {
            // No row selected
            logMessage("Selected!");
        }
    }

    private void cancel() {
        amountField.setText("");
        noteArea.setText("");
    }

    public void logMessage(String log) {
        JOptionPane.showMessageDialog(null, log, "", JOptionPane.INFORMATION_MESSAGE);
    }

    public void cinemaSelected() {
        List<Cinema> list = new CinemaImp().getAllCinema();
        for (Cinema cinema : list) {
            if (cinema.getBranch().equals(branchBox.getSelectedItem())) {
                cinema_id = cinema.getId();
                break;
            }
        }
    }
}
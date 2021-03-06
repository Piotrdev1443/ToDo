/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Igor
 */
public class ToDoListmain extends javax.swing.JFrame {

    private TaskTableModel list = new TaskTableModel();
    private TaskTableModel listRep = new TaskTableModel();
    private Pattern patternInputTextFields = Pattern.compile("[0-9]*");
    private Matcher matcher1;
    private Matcher matcher2;

    private int counter;

    /**
     * Creates new form List
     */
    public ToDoListmain() {
        initComponents();
        // list.setColumnCount(2)
        ListSelectionModel select = toDoTable.getSelectionModel();

        this.setResizable(false);
        toDoTable.setDefaultRenderer(Object.class, new ColorRows());

        toDoTable.setModel(list);
        toDoTable.getColumnModel().getColumn(0).setPreferredWidth(300);
        toDoTable.setDragEnabled(false);
        toDoTable.getColumnModel().getColumn(0).setHeaderValue("Zadania jednorazowe");
        toDoTable.getColumnModel().getColumn(1).setHeaderValue("Okres");
        toDoTable.setAutoCreateRowSorter(true);

        list.addTask(new TaskAllDayEveryday("Zadania Repetytywne", "Dni"));
        doneTaskButton.setEnabled(false);
        enableDoneTaskButton();
        toDoTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        oneTimeTextField.setEnabled(false);
        everydayTextField.setEnabled(false);
        periodLabel.setEnabled(false);
        everydayLabel.setEnabled(false);
        toDoTable.setShowGrid(true);
        toDoTable.setRowSelectionAllowed(true);
        toDoTable.setSelectionBackground(Color.GREEN);
        everydayCheckBox.setEnabled(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        doneTaskButton = new javax.swing.JButton();
        everydayTaskRadioButton = new javax.swing.JRadioButton();
        onetimeRadioButton = new javax.swing.JRadioButton();
        periodCheckBox = new javax.swing.JCheckBox();
        oneTimeTextField = new javax.swing.JTextField();
        periodLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        toDoTable = new javax.swing.JTable();
        everydayCheckBox = new javax.swing.JCheckBox();
        everydayTextField = new javax.swing.JTextField();
        everydayLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        deletebutton = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        saveMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ToDO List");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Dodaj Zadanie");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        doneTaskButton.setText("Wykonane zadanie");
        doneTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneTaskButtonActionPerformed(evt);
            }
        });

        everydayTaskRadioButton.setText("repetytywne");
        everydayTaskRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                everydayTaskRadioButtonActionPerformed(evt);
            }
        });

        onetimeRadioButton.setSelected(true);
        onetimeRadioButton.setText("jednorazowe");
        onetimeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onetimeRadioButtonActionPerformed(evt);
            }
        });

        periodCheckBox.setText("na okres");
        periodCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodCheckBoxActionPerformed(evt);
            }
        });

        oneTimeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneTimeTextFieldActionPerformed(evt);
            }
        });

        periodLabel.setText("dni");

        toDoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        toDoTable.setEditingColumn(1);
        toDoTable.setEditingRow(1);
        toDoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toDoTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(toDoTable);

        everydayCheckBox.setText("Co ile dni");
        everydayCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                everydayCheckBoxActionPerformed(evt);
            }
        });

        everydayTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                everydayTextFieldActionPerformed(evt);
            }
        });

        everydayLabel.setText("dni");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Dodaj zadanie");

        deletebutton.setText("Usuń");
        deletebutton.setEnabled(false);
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        jMenu1.setText("Plik");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        saveMenuItem.setText("Zapisz");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenuItem);

        jMenuBar.add(jMenu1);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(everydayCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(everydayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(everydayLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(periodCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oneTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(periodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onetimeRadioButton)
                    .addComponent(everydayTaskRadioButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(doneTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deletebutton)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(onetimeRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodCheckBox)
                            .addComponent(oneTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(periodLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(everydayTaskRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(everydayCheckBox)
                            .addComponent(everydayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(everydayLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doneTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletebutton)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        matcher1 = patternInputTextFields.matcher(oneTimeTextField.getText());
        matcher2 = patternInputTextFields.matcher(everydayTextField.getText());
        if (onetimeRadioButton.isSelected()) {
            if (matcher1.matches() && !jTextField1.getText().isEmpty()) {
                if (periodCheckBox.isSelected() && !oneTimeTextField.getText().isEmpty()) {
                    Taskonce task1 = new Taskonce(jTextField1.getText(), oneTimeTextField.getText());
                    task1.addTime();
                    list.insertTask(0, task1);
                    counter++;
                } else {
                    Taskonce task1 = new Taskonce(jTextField1.getText(), "1");
                    task1.addTime();
                    list.insertTask(0, task1);
                    counter++;
                }

            }

        }
        if (everydayTaskRadioButton.isSelected() && (!jTextField1.getText().isEmpty())) {
            if (matcher2.matches() && !everydayTextField.getText().isEmpty()) {
                TaskAllDayEveryday task1 = new TaskAllDayEveryday(jTextField1.getText(), everydayTextField.getText());
                task1.addTime();
                task1.repetitive = Integer.parseInt(task1.time);
                list.addTask(task1);
            } else {
                TaskAllDayEveryday task1 = new TaskAllDayEveryday(jTextField1.getText(), "1");
                task1.addTime();
                list.addTask(task1);
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        try {
            // TODO add your handling code here:
            saveTable();
            saveTableRep();
        } catch (Exception ex) {
            Logger.getLogger(ToDoListmain.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void doneTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneTaskButtonActionPerformed
        try {
            if (list.getTask(toDoTable.getSelectedRow()) instanceof Taskonce) {
                counter--;
            } else {
                TaskAllDayEveryday task1 = (TaskAllDayEveryday) list.getTask(toDoTable.getSelectedRow());
                task1.addTime();
                task1.repetitive = Integer.parseInt(task1.time);

                listRep.addTask(task1);
            }
            list.removeTask(toDoTable.getSelectedRow());
            doneTaskButton.setEnabled(false);
        } catch (ArrayIndexOutOfBoundsException e) {
            doneTaskButton.setEnabled(false);
        }


    }//GEN-LAST:event_doneTaskButtonActionPerformed

    private void onetimeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onetimeRadioButtonActionPerformed
        everydayTaskRadioButton.setSelected(false);
        periodCheckBox.setEnabled(true);
        everydayTextField.setEnabled(false);
        everydayLabel.setEnabled(false);
        everydayCheckBox.setEnabled(false);
        everydayCheckBox.setSelected(false);
        everydayTextField.setText("");

    }//GEN-LAST:event_onetimeRadioButtonActionPerformed

    private void everydayTaskRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_everydayTaskRadioButtonActionPerformed
        // TODO add your handling code here:
        everydayCheckBox.setEnabled(true);
        periodCheckBox.setEnabled(false);
        oneTimeTextField.setEnabled(false);
        periodLabel.setEnabled(false);
        onetimeRadioButton.setSelected(false);
        periodCheckBox.setSelected(false);
        oneTimeTextField.setText("");
    }//GEN-LAST:event_everydayTaskRadioButtonActionPerformed

    private void periodCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodCheckBoxActionPerformed
        oneTimeTextField.setEnabled(true);
        periodLabel.setEnabled(true);
        if (periodCheckBox.isSelected() == false) {
            oneTimeTextField.setEnabled(false);
            periodLabel.setEnabled(false);
        }
    }//GEN-LAST:event_periodCheckBoxActionPerformed

    private void oneTimeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneTimeTextFieldActionPerformed
        if (onetimeRadioButton.isSelected()) {
            oneTimeTextField.setVisible(true);
        }


    }//GEN-LAST:event_oneTimeTextFieldActionPerformed

    private void everydayCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_everydayCheckBoxActionPerformed
        // TODO add your handling code here:
        everydayTextField.setEnabled(true);
        everydayLabel.setEnabled(true);
        if (everydayCheckBox.isSelected() == false) {
            everydayTextField.setEnabled(false);
            everydayLabel.setEnabled(false);
        }
    }//GEN-LAST:event_everydayCheckBoxActionPerformed

    private void enableDoneTaskButton() {

        toDoTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (toDoTable.getSelectedRow() >= 0 && toDoTable.getSelectedRow() < toDoTable.getRowCount()) {
                    if (toDoTable.getSelectedRow() != counter) {
                        doneTaskButton.setEnabled(true);
                        deletebutton.setEnabled(true);
                    } else {
                        doneTaskButton.setEnabled(false);
                        deletebutton.setEnabled(false);
                    }
                }

            }
        });

    }


    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void toDoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toDoTableMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_toDoTableMouseClicked

    private void everydayTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_everydayTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_everydayTextFieldActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        try {
            if (list.getTask(toDoTable.getSelectedRow()) instanceof Taskonce) {
                counter--;
            }

            list.removeTask(toDoTable.getSelectedRow());
            doneTaskButton.setEnabled(false);
        } catch (ArrayIndexOutOfBoundsException e) {
            doneTaskButton.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    public void saveTable() throws Exception {
        PrintWriter bfw = new PrintWriter(new FileWriter("Data.txt"));

        for (int i = 0; i < toDoTable.getRowCount(); i++) {
            bfw.println();
            for (int j = 0; j < toDoTable.getColumnCount(); j++) {
                bfw.write((String) (toDoTable.getValueAt(i, j)));
                bfw.write(",");

            }
            bfw.write(Integer.toString(list.getTask(i).deadlineTime));
            bfw.write(",");
            bfw.write(Integer.toString(list.getTask(i).repetitive));

        }
        bfw.close();
    }

    public void saveTableRep() throws Exception {
        try (FileWriter fw = new FileWriter("DataRep.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
            for (int i = 0; i < listRep.getRowCount(); i++) {

                out.println();
                for (int j = 0; j < listRep.getColumnCount(); j++) {
                    out.write((String) (listRep.getValueAt(i, j)));
                    out.write(",");

                }
                System.out.println(listRep.getTask(i).deadlineTime);
                out.write(Integer.toString(listRep.getTask(i).deadlineTime));
                out.write(",");
                out.write(Integer.toString(listRep.getTask(i).repetitive));

            }
            out.close();
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }

    public void loadTable() throws Exception {
        File file = new File("data.txt");
        String line;
        String[] lines;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(file));
            if (reader.readLine() != null) {

            }
            while (null != (line = reader.readLine())) {
                if (line.equals("Zadania Repetytywne,Dni,0,1")) {
                    while (null != (line = reader.readLine())) {
                        lines = line.split(",");
                        TaskAllDayEveryday task1 = new TaskAllDayEveryday(lines[0], lines[1], lines[2]);
                        if (task1.timeInt >= 0) {
                            list.addTask(task1);
                        } else {
                            task1 = new TaskAllDayEveryday(lines[0], lines[3], lines[2], lines[3]);
                            list.addTask(task1);
                        }

                    }
                } else {

                    System.out.println(LocalDate.now());
                    lines = line.split(",");
                    Taskonce task1 = new Taskonce(lines[0], lines[1], lines[2]);
                    //   task1.time();
                    if (task1.timeInt >= 0) {
                        list.insertTask(0, task1);
                        counter++;
                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error");
            e.printStackTrace();

        }

    }

    public void loadTableRep() throws Exception {
        File file = new File("DataRep.txt");
        File file2 = new File("DataTemp.txt");
        PrintWriter bfw = new PrintWriter(file2);

        String line;
        String[] lines;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(file));
            if (reader.readLine() != null) {

            }
            while (null != (line = reader.readLine())) {

                lines = line.split(",");
                TaskAllDayEveryday task1 = new TaskAllDayEveryday(lines[0], lines[1], lines[2]);
                if (task1.timeInt >= 0) {
                    bfw.println();
                    bfw.write(line);

                } else {
                    task1 = new TaskAllDayEveryday(lines[0], lines[3], lines[2], lines[3]);

                    list.addTask(task1);
                }

            }
            bfw.close();
            reader.close();
            file.delete();
            file2.renameTo(file);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error");
            e.printStackTrace();

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        /* Set the Nimbus look and feel */

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ToDoListmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToDoListmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToDoListmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToDoListmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question().setVisible(true);

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton doneTaskButton;
    private javax.swing.JCheckBox everydayCheckBox;
    private javax.swing.JLabel everydayLabel;
    private javax.swing.JRadioButton everydayTaskRadioButton;
    private javax.swing.JTextField everydayTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField oneTimeTextField;
    private javax.swing.JRadioButton onetimeRadioButton;
    private javax.swing.JCheckBox periodCheckBox;
    private javax.swing.JLabel periodLabel;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTable toDoTable;
    // End of variables declaration//GEN-END:variables
}

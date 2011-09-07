/*
 * FBPwn
 * 
 * http://sourceforge.net/projects/fbpwn/
 * 
 * Copyright (C) 2011 - FBPwn
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fbpwn.ui;

import fbpwn.core.AuthenticatedAccount;
import fbpwn.core.FacebookManager;
import fbpwn.core.FacebookTask;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URI;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 * Main Swing GUI form for the application 
 */
public class MainForm extends javax.swing.JFrame implements FacebookGUI {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int) (dim.getWidth() / 2 - getWidth() / 2), (int) (dim.getHeight() / 2 - getHeight() / 2));

        jTable1.setCellSelectionEnabled(false);
        jTable1.setColumnSelectionAllowed(false);
        jTable1.setRowSelectionAllowed(true);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jTable2.setCellSelectionEnabled(false);
        jTable2.setColumnSelectionAllowed(false);
        jTable2.setRowSelectionAllowed(true);
        jTable2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jTable2.getColumn(jTable2.getColumnName(4)).setCellRenderer(new ProgressBar());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FBPwn - Beta - Version 0.1.3");
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account ID", "Account E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButton1.setText("Add account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remove account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Attack !");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(67, 67, 67)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Authenticated Accounts Management", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Authenticated Profile", "Target Profile URL", "Module", "Status", "Progress", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable2.setColumnSelectionAllowed(true);
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButton5.setText("Remove Task");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cancel Task");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Remove Finished");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Exit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                        .addComponent(jButton8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(jButton7)
                    .addComponent(jButton8)))
        );

        jTabbedPane1.addTab("Monitor Submitted Tasks", jPanel2);

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem2.setText("Visit project's page");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("About");
        jMenuItem3.setEnabled(false);
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    System.exit(0);
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    System.exit(0);
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    AddAuthenticatedAccount addAuthenticatedAccount = new AddAuthenticatedAccount(this, true);
    AuthenticatedAccount account = addAuthenticatedAccount.showAddAuthenticatedAccountDialog();


    if (account != null) {
        FacebookManager.getInstance().addAuthenticatedProfile(account);
        refresh();
    }
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    if (jTable1.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(this,
                "You need to select an authenticated account first",
                "Error Occurred",
                JOptionPane.ERROR_MESSAGE);
        return;
    }
    DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
    InitiateANewAttack addNewTask = new InitiateANewAttack(this,
            true,
            (AuthenticatedAccount) jTable1.getValueAt(jTable1.getSelectedRow(), 1));

    addNewTask.setVisible(true);
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    if (jTable1.getSelectedRowCount() == 0) {
        JOptionPane.showMessageDialog(this,
                "You need to select an authenticated account first",
                "Error Occurred",
                JOptionPane.ERROR_MESSAGE);
        return;
    }
    DefaultTableModel table = (DefaultTableModel) jTable1.getModel();


    FacebookManager.getInstance().removeAuthenticatedProfile((AuthenticatedAccount) table.getValueAt(jTable1.getSelectedRow(), 1));
    refresh();
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    if (jTable2.getSelectedRowCount() == 0) {
        JOptionPane.showMessageDialog(this,
                "You need to select a task first",
                "Error Occurred",
                JOptionPane.ERROR_MESSAGE);
        return;
    }


    DefaultTableModel table = (DefaultTableModel) jTable2.getModel();
    FacebookTask removedTask = (FacebookTask) table.getValueAt(jTable2.getSelectedRow(), 2);

    if (removedTask.isRunning()) {
        JOptionPane.showMessageDialog(this,
                "You need to cancel the running task first",
                "Error Occurred",
                JOptionPane.ERROR_MESSAGE);
        return;
    }

    FacebookManager.getInstance().removeTask(removedTask);
    table.removeRow(jTable2.getSelectedRow());


}//GEN-LAST:event_jButton5ActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    if (jTable2.getSelectedRowCount() == 0) {
        JOptionPane.showMessageDialog(this,
                "You need to select a task first",
                "Error Occurred",
                JOptionPane.ERROR_MESSAGE);
        return;
    }
    DefaultTableModel table = (DefaultTableModel) jTable2.getModel();
    FacebookTask cancelledTask = (FacebookTask) table.getValueAt(jTable2.getSelectedRow(), 2);

    if (!cancelledTask.isRunning()) {
        JOptionPane.showMessageDialog(this,
                "You need to select a running task first",
                "Error Occurred",
                JOptionPane.ERROR_MESSAGE);
        return;
    }

    cancelledTask.sendCancelSignal();
}//GEN-LAST:event_jButton6ActionPerformed

private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    DefaultTableModel table = (DefaultTableModel) jTable2.getModel();
    for (int i = 0; i < table.getRowCount(); i++) {
        if (((FacebookTask) table.getValueAt(i, 2)).isFinished()) {
            table.removeRow(i);
            i--;
        }
    }
}//GEN-LAST:event_jButton7ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    try {
        Desktop.getDesktop().browse(new URI("http://code.google.com/p/fbpwn/"));
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this,
                "Failed to open browser",
                "Error Occurred",
                JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    System.exit(0);
}//GEN-LAST:event_jButton8ActionPerformed

    private void refresh() {


        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);

        List<AuthenticatedAccount> authenticatedAccounts = FacebookManager.getInstance().getAuthenticatedAccounts();

        for (AuthenticatedAccount account : authenticatedAccounts) {
            tableModel.addRow(new Object[]{
                        account.getAccountID(),
                        account});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    /**
     * Updates the progress for the given task
     * @param task The task to update progress to
     */
    @Override
    public void updateTaskProgress(final FacebookTask task) {
        final DefaultTableModel table = (DefaultTableModel) jTable2.getModel();
        for (int i = 0; i < table.getRowCount(); i++) {
            if ((FacebookTask) table.getValueAt(i, 2) == task) {

                final int t = i;
                SwingUtilities.invokeLater(new Runnable() {

                    @Override
                    public void run() {
                        table.setValueAt(task.getMessage(), t, 3);
                        ((ProgressBar) table.getValueAt(t, 4)).setValue(task.getPercentage().intValue());
                        table.setValueAt(task.getTaskState(), t, 5);
                    }
                });
                return;

            }
        }
    }

    /**
     * Adds a new task to the GUI
     * @param task The task to be added
     */
    @Override
    public void addTask(FacebookTask task) {
        DefaultTableModel table = (DefaultTableModel) jTable2.getModel();

        ProgressBar progressBar = new ProgressBar();
        progressBar.setMaximum(100);
        progressBar.setMinimum(0);
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);

        table.addRow(new Object[]{task.getAuthenticatedProfile(),
                    task.getFacebookTargetProfile().getProfilePageURL(),
                    task,
                    task.getMessage(),
                    progressBar, task.getTaskState()});

    }

    /**
     * Removes a task from the GUI
     * @param task The task to be removed
     */
    @Override
    public void removeTask(FacebookTask task) {
        DefaultTableModel table = (DefaultTableModel) jTable2.getModel();
        for (int i = 0; i < table.getRowCount(); i++) {
            if ((FacebookTask) table.getValueAt(i, 2) == task) {
                table.removeRow(i);
                i--;
            }
        }
    }
}
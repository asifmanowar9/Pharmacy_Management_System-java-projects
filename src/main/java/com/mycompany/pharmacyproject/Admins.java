/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pharmacyproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Admins extends javax.swing.JFrame {

    /**
     * Creates new form Admins
     */
    public Admins() {
        initComponents();
        component2();
       // component();
    }
    private void component2()
    {
        File read2 = new File("Fullname.txt");
        String[] col = {"FullName","UserName","Password","Email","Birth Date"};

                DefaultTableModel model = new DefaultTableModel();
                 model.setColumnIdentifiers(col);
                jTable2.setModel(model);
        try {
            Scanner sc2 = new Scanner(read2);
            String[] rows1 = new String[5];
             int i = 0;
              while(sc2.hasNextLine()){
                String line = sc2.nextLine();
                rows1[i] = line;
                System.out.println(line);
                if((i+1)%5 == 0){
                    model.addRow(rows1);
                    i = 0;
                }
                else i++;
            }
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admins.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   /* private  void component(){
        
        File read = new File("logins.txt");
        
                                        String[] col = {"FullName","UserName","Password"};

                DefaultTableModel model = new DefaultTableModel();
                 model.setColumnIdentifiers(col);
                jTable1.setModel(model);

        try{
            Scanner sc = new Scanner(read);
            
             
            String[] rows = new String[2];
            int i = 0;
           
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                rows[i] = line;
                System.out.println(line);
                if((i+1)%2 == 0){
                    model.addRow(rows);
                    i = 0;
                }
                else i++;
            }
            sc.close();
        }
        catch(FileNotFoundException e){
        }
}*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1350, 650));

        jPanel1.setBackground(new java.awt.Color(215, 243, 241));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-left (1).png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(55, 16, 16));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(215, 243, 241));

        jTable2.setBackground(new java.awt.Color(55, 16, 16));
        jTable2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.setGridColor(new java.awt.Color(255, 255, 51));
        jTable2.setSelectionBackground(new java.awt.Color(55, 16, 16));
        jTable2.setShowGrid(true);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setText("Name: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setText("UserName: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setText("Birth Date:");

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 16, 16), 3));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 16, 16), 3));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 16, 16), 3));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        Save.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save (3).png"))); // NOI18N
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setText("Password:");

        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 16, 16), 3));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/garbage.png"))); // NOI18N
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear (7).png"))); // NOI18N
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/updated (4).png"))); // NOI18N
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jDateChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 16, 16), 3));
        jDateChooser1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(txtUsername)
                            .addComponent(txtPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(536, 536, 536)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Update)
                        .addGap(18, 18, 18)
                        .addComponent(Clear)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Clear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(1115, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(520, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGap(2, 2, 2)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        MedicineManagement MedicineManagementFrame = new MedicineManagement();
        MedicineManagementFrame.setVisible(true);
        MedicineManagementFrame.pack();
        MedicineManagementFrame.setLocationRelativeTo(null);
       // MedicineManagementFrame.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        // DefaultTableModel model = new DefaultTableModel();
        // int i =jTable1.getSelectedRow();
        // model.removeRow(i);
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int selectedRow = jTable2.getSelectedRow();
        txtName.setText(model.getValueAt(selectedRow, 0).toString());
        //txtPrice.setText(model.getValueAt(selectedRow, 1).toString());
        txtUsername.setText(model.getValueAt(selectedRow, 1).toString());
        txtPassword.setText(model.getValueAt(selectedRow, 2).toString());
        txtEmail.setText(model.getValueAt(selectedRow, 3).toString());
                try {   
            Date date = new SimpleDateFormat("MMM-d-y").parse((String)model.getValueAt(selectedRow, 4).toString());  
            jDateChooser1.setDate(date);
                    } catch (ParseException ex) {
           // Logger.getLogger(Java_JTable_And_JDateChooser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
       
        
        String name = txtName.getText();
        //String company = txtPrice.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String email = txtEmail.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-d-y");
    Date selectedDate = jDateChooser1.getDate();
        if (selectedDate == null || name.isBlank() || username.isBlank() || password.isBlank() || email.isBlank() ) {
        JOptionPane.showMessageDialog(null, "Please enter all information and select a valid expiration date.");
    }
        else
        {
            String expirationDate = dateFormat.format(selectedDate);

    int response = JOptionPane.showConfirmDialog(this, "Do you want to save this information?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//int response =  JOptionPane.showConfirmDialog(this,"Do you want to continue ?","Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
      if(response==JOptionPane.YES_OPTION)
      {
 

            try {
                FileWriter ffll = new FileWriter("Fullname.txt",true);
                ffll.write(name+"\n"+username+"\n"+password+"\n"+email+"\n"+expirationDate+"\n");
                ffll.close();
                FileWriter ffll2 = new FileWriter("Logins.txt",true);
                ffll2.write(username+"\t"+password+"\n");
                ffll2.close();

                txtName.setText("");
                //txtPrice.setText("");
                txtUsername.setText("");
                txtPassword.setText("");
                txtEmail.setText("");
                jDateChooser1.setDate(null);

                File read = new File("Fullname.txt");
                String[] col = {"FullName","UserName","Password","Email","Birth Date"};

                DefaultTableModel model = new DefaultTableModel();
                model.setColumnIdentifiers(col);
                jTable2.setModel(model);

                try{
                    Scanner sc = new Scanner(read);
                    String[] rows = new String[5];
                    int i = 0;

                    while(sc.hasNextLine()){
                        String line = sc.nextLine();
                        rows[i] = line;
                        //System.out.println(line);
                        if((i+1)%5 == 0){
                            model.addRow(rows);
                            i = 0;
                        }
                        else i++;
                    }
                    sc.close();
                }
                catch(FileNotFoundException e){
                }
            }
            catch(IOException e){
            }
            JOptionPane.showMessageDialog(null,"Saved Successfully");
            //String filepath = "C:\Users\Admin\Documents\NetBeansProjects\PharmacyProject\Medicines.txt";
      }else
      {
          JOptionPane.showMessageDialog(null,"Not Saved!");
      }
        }
      
          //
      
      
    }//GEN-LAST:event_SaveActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int selectedRow = jTable2.getSelectedRow();

        if (selectedRow != -1 && selectedRow < model.getRowCount()) {
            model.removeRow(selectedRow);

            int response = JOptionPane.showConfirmDialog(this, "Do you want to delete this information?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
      if(response==JOptionPane.YES_OPTION)
      {
            
            ArrayList<String> remainingLines = new ArrayList<>();
            for (int i = 0; i < model.getRowCount(); i++) {
                StringBuilder row = new StringBuilder();
                for (int j = 0; j < model.getColumnCount(); j++) {
                    row.append(model.getValueAt(i, j)).append("\n");
                }
                remainingLines.add(row.toString().trim());
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("Fullname.txt"))) {
                for (String line : remainingLines) {
                    writer.write(line);
                    writer.newLine();
                }
            } catch (IOException ex) {
                ex.printStackTrace(); // Added for better debugging
            }
      JOptionPane.showMessageDialog(null,"Saved Successfully");
            
      }else
      {
          JOptionPane.showMessageDialog(null,"Not Saved");
           Admins AdminsFrame = new Admins();
        AdminsFrame.setVisible(true);
        AdminsFrame.pack();
        AdminsFrame.setLocationRelativeTo(null);
        //AdminsFrame.setResizable(false);
        this.dispose();
      }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a valid row to delete.");
        }
                txtName.setText("");
                txtUsername.setText("");
                txtPassword.setText("");
                txtEmail.setText("");
                jDateChooser1.setDate(null);
      
    }//GEN-LAST:event_deleteActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:

        txtName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtEmail.setText("");
        jDateChooser1.setDate(null);
    }//GEN-LAST:event_ClearActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        
        
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int selectedRow = jTable2.getSelectedRow();
         SimpleDateFormat date = new SimpleDateFormat("MMM-d-y");

        if (selectedRow != -1 && selectedRow < model.getRowCount()) {

int response = JOptionPane.showConfirmDialog(this, "Do you want to update this information?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
      if(response==JOptionPane.YES_OPTION)
      {
            // Update the selected row with new values. Replace `newValue1`, `newValue2`, etc. with the actual new values.
            model.setValueAt(txtName.getText(), selectedRow, 0); // Column 0
          //  model.setValueAt(txtPrice.getText(), selectedRow, 1); // Column 1
            model.setValueAt(txtUsername.getText(), selectedRow, 1);
            model.setValueAt(txtPassword.getText(), selectedRow, 2);
            model.setValueAt(txtEmail.getText(), selectedRow, 3);
             model.setValueAt(date.format(jDateChooser1.getDate()), selectedRow, 4);
            // Add more columns as needed
            // model.setValueAt(newValueX, selectedRow, X); // Column X

            // Collect updated rows
            ArrayList<String> updatedLines = new ArrayList<>();
            for (int i = 0; i < model.getRowCount(); i++) {
                StringBuilder row = new StringBuilder();
                for (int j = 0; j < model.getColumnCount(); j++) {
                    row.append(model.getValueAt(i, j)).append("\n");
                }
                updatedLines.add(row.toString().trim());
            }

            // Write updated lines to file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("Fullname.txt"))) {
                for (String line : updatedLines) {
                    writer.write(line);
                    writer.newLine();
                }
            } catch (IOException ex) {
                ex.printStackTrace(); // Added for better debugging
            }
            txtName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtEmail.setText("");
        //txtEd.setText("");
        jDateChooser1.setDate(null);
        JOptionPane.showMessageDialog(null,"Saved Successfully");
            
      }else
      {
          JOptionPane.showMessageDialog(null,"Not Saved");
           Admins AdminsFrame = new Admins();
        AdminsFrame.setVisible(true);
        AdminsFrame.pack();
        AdminsFrame.setLocationRelativeTo(null);
        //AdminsFrame.setResizable(false);
        this.dispose();
      }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a valid row to update.");
        }
      
    }//GEN-LAST:event_UpdateActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Save;
    private javax.swing.JButton Update;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    public javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admins().setVisible(true);
            }
        });
    }

}

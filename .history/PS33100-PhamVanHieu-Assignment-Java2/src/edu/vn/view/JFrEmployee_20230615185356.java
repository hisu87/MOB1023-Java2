/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.vn.view;

import edu.vn.models.Employee;
import edu.vn.models.EmployeeDAO;
import edu.vn.thread.ClockThread;
import edu.vn.ultils.FileUltil;

import java.awt.Color;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author numpa
 */
public class JFrEmployee extends javax.swing.JFrame {

    EmployeeDAO dao = new EmployeeDAO();
    int position = -1;
    private static final String P_EMAIL = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";

    // Create a new thread to update the digital clock display
    
    


    /**
     * Creates new form JFrEmployee
     */
    public JFrEmployee() {
        initComponents();
        setLocationRelativeTo(null);
        lbl_record.setText("Record: " + (position + 1) + " of " + dao.count());

    }
    public void clearForm() {
        txt_id.setText("");
        txt_fullname.setText("");
        txt_age.setText("");
        txt_email.setText("");
        txt_salary.setText("");
    }

    @SuppressWarnings("empty-statement")
    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) table_NhanVien.getModel();
        model.setRowCount(0);
        for (Employee ee : dao.getAlls()) {
            Object[] rowdata = new Object[5];
            rowdata[0] = ee.getId();
            rowdata[1] = ee.getName();
            rowdata[2] = ee.getAge();
            rowdata[3] = ee.getEmail();
            rowdata[4] = ee.getSalary();
            model.addRow(rowdata);
        };
    }

    public boolean validateForm() {
        if (txt_id.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập mã nhân viên");
            return false;
        }
        if (txt_fullname.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập mã họ tên");
            return false;

        }
        if (txt_age.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập tuổi");
            return false;
        }
        try {
            Integer.parseInt(txt_age.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tuổi phải là số");
            return false;
        }

        if (txt_email.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập email");
            return false;
        }
        Matcher matcher = Pattern.compile(P_EMAIL).matcher(txt_email.getText());
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(this, "Email sai định dạng");
            return false;
        }
        if (txt_salary.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập lương");
            return false;
        }
        try {
            Double.parseDouble(txt_salary.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Lương phải là số", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emptyBorder1 = (javax.swing.border.EmptyBorder)javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1);
        jLabel1 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_fullname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_age = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_salary = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn_new = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_find = new javax.swing.JButton();
        btn_open = new javax.swing.JButton();
        btn_ext = new javax.swing.JButton();
        btn_first = new javax.swing.JButton();
        btn_previous = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_NhanVien = new javax.swing.JTable();
        lbl_record = new javax.swing.JLabel();
        lbl_message = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("Quản Lý Nhân Viên");

        txt_id.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_id.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Mã Nhân Viên");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Họ và Tên");

        txt_fullname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_fullname.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Tuổi");

        txt_age.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_age.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ageActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Email");

        txt_email.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Lương");

        txt_salary.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_salary.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_new.setBackground(new java.awt.Color(255, 204, 204));
        btn_new.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_new.setText("New");
        btn_new.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_save.setBackground(new java.awt.Color(255, 204, 204));
        btn_save.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_save.setText("Save");
        btn_save.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(255, 204, 204));
        btn_delete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_find.setBackground(new java.awt.Color(255, 204, 204));
        btn_find.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_find.setText("Find");
        btn_find.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });

        btn_open.setBackground(new java.awt.Color(255, 204, 204));
        btn_open.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_open.setText("Open");
        btn_open.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_openActionPerformed(evt);
            }
        });

        btn_ext.setBackground(new java.awt.Color(255, 204, 204));
        btn_ext.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_ext.setText("Exit");
        btn_ext.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_extActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_ext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_new, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_find, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_open, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_new, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_find)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_open)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ext)
                .addContainerGap())
        );

        btn_first.setBackground(new java.awt.Color(153, 153, 255));
        btn_first.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_first.setText("|<");
        btn_first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_firstActionPerformed(evt);
            }
        });

        btn_previous.setBackground(new java.awt.Color(153, 153, 255));
        btn_previous.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_previous.setText("<<");
        btn_previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previousActionPerformed(evt);
            }
        });

        btn_next.setBackground(new java.awt.Color(153, 153, 255));
        btn_next.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_next.setText(">>");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_last.setBackground(new java.awt.Color(153, 153, 255));
        btn_last.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_last.setText(">|");
        btn_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        table_NhanVien.setBackground(new java.awt.Color(255, 204, 204));
        table_NhanVien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        table_NhanVien.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        table_NhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Họ Và Tên", "Tuổi", "Email", "Lương"
            }
        ));
        table_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_NhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_NhanVien);

        lbl_record.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_record.setForeground(new java.awt.Color(204, 0, 51));
        lbl_record.setText("Record: 1 of 10 ");

        lbl_message.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_message.setForeground(new java.awt.Color(0, 153, 255));
        lbl_message.setText("Thông Báo: ");

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 0, 51));
        lblTime.setText("00:00 AM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_first)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_previous)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_next)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_last)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_record))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 19, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(108, 108, 108)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTime)))))
                    .addComponent(jScrollPane1)
                    .addComponent(lbl_message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txt_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTime)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_first)
                    .addComponent(btn_previous)
                    .addComponent(btn_next)
                    .addComponent(btn_last)
                    .addComponent(lbl_record))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_message)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ageActionPerformed

    private void btn_previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previousActionPerformed
        // TODO add your handling code here:
        position--;
        if (position < 0) {
            position = 0;
        }
        Employee ee = dao.getEmployeeByPosition(position);
        setModel(ee);
        lbl_record.setText("Record: " + (position + 1) + " of " + dao.count());
    }//GEN-LAST:event_btn_previousActionPerformed

    private void btn_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastActionPerformed
        // TODO add your handling code here:
        position = dao.count() - 1;
        Employee ee = dao.getEmployeeByPosition(position);
        setModel(ee);
        lbl_record.setText("Record: " + (position + 1) + " of " + dao.count());
    }//GEN-LAST:event_btn_lastActionPerformed

    private void btn_extActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_extActionPerformed
        // TODO add your handling code here:
        try {
            FileUltil.writeFile(dao.getAlls());
            JOptionPane.showMessageDialog(this, "Lưu dữ liệu thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        }
        System.exit(0);
    }//GEN-LAST:event_btn_extActionPerformed

    
    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_openActionPerformed
        // TODO add your handling code here:
        dao.openFile();
        fillTable();
        lbl_record.setText("Record: " + (position + 1) + " of " + dao.count());
        lbl_message.setText("Mở File thành công");
        lbl_message.setForeground(Color.blue);
    }//GEN-LAST:event_btn_openActionPerformed

    public void setModel(Employee ee) {
        txt_id.setText(ee.getId());
        txt_fullname.setText(ee.getName());
        txt_age.setText(String.valueOf(ee.getAge()));
        txt_email.setText(ee.getEmail());
        txt_salary.setText(String.valueOf(ee.getSalary()));
    }
    private void btn_firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_firstActionPerformed
        // TODO add your handling code here:
        position = 0;
        dao.getEmployeeByPosition(position);
        Employee ee = dao.getEmployeeByPosition(position);
        setModel(ee);
        lbl_record.setText("Record: " + (position + 1) + " of " + dao.count());
    }//GEN-LAST:event_btn_firstActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
        position++;
        if (position >= dao.count() - 1) {
            position = dao.count() - 1;
        }
        Employee ee = dao.getEmployeeByPosition(position);
        setModel(ee);
        lbl_record.setText("Record: " + (position + 1) + " of " + dao.count());
    }//GEN-LAST:event_btn_nextActionPerformed

    public Employee getModel() {
        Employee ee = new Employee();
        ee.setId(txt_id.getText());
        ee.setName(txt_fullname.getText());
        ee.setAge(Integer.parseInt(txt_age.getText()));
        ee.setEmail(txt_email.getText());
        ee.setSalary(Double.parseDouble(txt_salary.getText()));
        return ee;
    }
    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        if(validateForm()){
            Employee ee = getModel();
            if(dao.save(ee) >=0){
                JOptionPane.showMessageDialog(this, "Lưu thành công");
                lbl_message.setText("Lưu thành công");
                lbl_message.setForeground(Color.GREEN);
            }else{
                JOptionPane.showMessageDialog(this, "Lưu thất bại");
                lbl_message.setText("Lưu thất bại");
                lbl_message.setForeground(Color.RED);
            }
        }
        fillTable();
    }//GEN-LAST:event_btn_saveActionPerformed

    private void table_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_NhanVienMouseClicked
        // TODO add your handling code here:
        int position = table_NhanVien.getSelectedRow();
        setModel(dao.getEmployeeByPosition(position));
        lbl_record.setText("Record: " + (position + 1) + " of " + dao.count());
    }//GEN-LAST:event_table_NhanVienMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        String strID = JOptionPane.showInputDialog("Nhập mã nhân viên cần xóa");
        if (dao.del(strID) > 0) {
            lbl_message.setText("Xóa thành công");
            lbl_message.setForeground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            lbl_message.setText("Xóa thất bại");
            lbl_message.setForeground(Color.RED);
            JOptionPane.showMessageDialog(this, "Xóa thất bại", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
        fillTable();
    }//GEN-LAST:event_btn_deleteActionPerformed


    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
        // TODO add your handling code here:
        String strID = JOptionPane.showInputDialog("Nhập mã nhân viên cần tìm");
        int pos = dao.findByID(strID);
        if (pos > 0) {
            setModel(dao.getEmployeeByPosition(pos));
            lbl_message.setText("Tìm thành công");
            lbl_message.setForeground(Color.green);
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên");
            lbl_message.setText("Tìm không thành công");
            lbl_message.setForeground(Color.red);
        }
    }//GEN-LAST:event_btn_findActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ClockThread clockThread = new ClockThread(lblTime);
        Thread t1 = new Thread((Runnable) clockThread);
        t1.start();
        position = -1;
        lbl_record.setText("Record: " + (position + 1) + " of " + dao.count());
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFrEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_ext;
    private javax.swing.JButton btn_find;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_open;
    private javax.swing.JButton btn_previous;
    private javax.swing.JButton btn_save;
    private javax.swing.border.EmptyBorder emptyBorder1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lbl_message;
    private javax.swing.JLabel lbl_record;
    private javax.swing.JTable table_NhanVien;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fullname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_salary;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lab3;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author numpa
 */
public class QLSV extends javax.swing.JFrame {

    /**
     * Creates new form QLSV
     */
    public QLSV() {
        initComponents();
        setLocationRelativeTo(null);
        setForm();
    }

    StudentsDAO dao = new StudentsDAO();
    Students stu = new Students();

    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tbl_students.getModel();
        model.setRowCount(0);
        for (Students st : dao.getAll()) {
            Object[] rowdata = new Object[6];
            rowdata[0] = st.getId();
            rowdata[1] = st.getName();
            rowdata[2] = st.getMark();
            rowdata[3] = st.getMajor();
            rowdata[4] = st.getGrade();
            rowdata[5] = st.isBonus() ? "Có" : "Không";
            model.addRow(rowdata);
        }
    }

    public void setForm() {
        btn_add.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_update.setEnabled(false);
    }

    public void resetForm() {
        btn_add.setEnabled(true);
        btn_delete.setEnabled(true);
        btn_update.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_fullname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbomajor = new javax.swing.JComboBox<>();
        txt_rank = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ckc_bonus = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_students = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_mark = new javax.swing.JTextField();
        oderbymark = new javax.swing.JButton();
        oderbyname = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Quản Lý Sinh Viên");

        txt_fullname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_fullname.setToolTipText("");
        txt_fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fullnameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Ngành");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Họ Và Tên");

        cbomajor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbomajor.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Ứng Dụng Phần Mềm", "Phát Triển Phần Mềm", "Lập Trình Mobile", "Lập Trình Web" }));

        txt_rank.setEditable(false);
        txt_rank.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_rank.setToolTipText("");
        txt_rank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rankActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Học Lực");

        ckc_bonus.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ckc_bonus.setText("Có phần thưởng ?");
        ckc_bonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckc_bonusActionPerformed(evt);
            }
        });

        tbl_students.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null }
                },
                new String[] {
                        "Mã Số SV", "Họ Tên", "ĐIểm", "Ngành", "Học Lực", "Thưởng"
                }));
        tbl_students.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_studentsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_students);

        btn_add.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_add.setText("Thêm");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_delete.setText("Xóa");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_update.setText("Cập Nhật");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_refresh.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_refresh.setText("Nhập Mới");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Điểm");

        txt_mark.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_mark.setToolTipText("");
        txt_mark.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_markCaretUpdate(evt);
            }
        });
        txt_mark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_markActionPerformed(evt);
            }
        });

        oderbymark.setText("Sắp Xếp Theo Điểm");
        oderbymark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oderbymarkActionPerformed(evt);
            }
        });

        oderbyname.setText("Sắp Xếp Theo Tên");
        oderbyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oderbynameActionPerformed(evt);
            }
        });

        txt_id.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_id.setToolTipText("");
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Mã Số SV");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(284, 284, 284))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(oderbyname)
                                                .addGap(18, 18, 18)
                                                .addComponent(oderbymark)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(38, 38, 38)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(txt_id,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(cbomajor, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ckc_bonus, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btn_add,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 73,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btn_delete,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 73,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btn_update)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btn_refresh))
                                                        .addComponent(txt_fullname,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 639,
                                                                Short.MAX_VALUE)
                                                        .addComponent(txt_mark)
                                                        .addComponent(txt_rank))))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_id)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_fullname))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_mark))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbomajor, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_rank)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ckc_bonus)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_add)
                                        .addComponent(btn_delete)
                                        .addComponent(btn_update)
                                        .addComponent(btn_refresh))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(oderbymark)
                                        .addComponent(oderbyname))
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setModel(Students stu) {
        txt_id.setText(stu.getId());
        txt_fullname.setText(stu.getName());
        txt_mark.setText(stu.getMark() + "");
        cbomajor.setSelectedItem(stu.getMajor());
    }

    private void tbl_studentsMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tbl_studentsMouseClicked
        // TODO add your handling code here:
        int point = tbl_students.getSelectedRow();
        setModel(dao.getAll().get(point));
        btn_delete.setEnabled(true);
        btn_update.setEnabled(true);
        btn_add.setEnabled(false);


    }// GEN-LAST:event_tbl_studentsMouseClicked

    public void reset() {
        txt_id.setText("");
        txt_fullname.setText("");
        txt_mark.setText("");
        cbomajor.setSelectedIndex(0);
    }

    private void txt_rankActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_rankActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_rankActionPerformed

    private void ckc_bonusActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ckc_bonusActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_ckc_bonusActionPerformed

    public Students getModel() {
        stu = new Students();
        stu.setId(txt_id.getText());
        stu.setName(txt_fullname.getText());
        stu.setMark(Double.parseDouble(txt_mark.getText()));
        stu.setMajor(cbomajor.getSelectedItem().toString());
        return stu;
    }

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        int rs = dao.add(getModel());
        if (rs > 0) {
            JOptionPane.showMessageDialog(this, "Add success");
            fillTable();
            reset();
            setForm();
        } else {
            JOptionPane.showMessageDialog(this, "Add fail");
        }

    }// GEN-LAST:event_btn_addActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        if (!txt_id.getText().isEmpty()) {
            int rs = dao.findStudentByID(txt_id.getText());
            if (rs >= 0) {
                dao.del(txt_id.getText());
                JOptionPane.showMessageDialog(this, "Delete success");
            } else {
                JOptionPane.showMessageDialog(this, "Delete fail");
            }
        }
    }// GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btn_updateActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        reset();
        String strID = "SD" + (new Random().nextInt(9999) + 1000);
        txt_id.setText(strID);
        resetForm();
    }// GEN-LAST:event_btn_refreshActionPerformed

    private void txt_markActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_markActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_markActionPerformed

    private void oderbymarkActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_oderbymarkActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_oderbymarkActionPerformed

    private void oderbynameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_oderbynameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_oderbynameActionPerformed

    private void txt_fullnameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_fullnameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_fullnameActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_idActionPerformed

    private void txt_markCaretUpdate(javax.swing.event.CaretEvent evt) {// GEN-FIRST:event_txt_markCaretUpdate
        // TODO add your handling code here:
        if (!txt_mark.getText().isEmpty()) {
            double mark = Double.parseDouble(txt_mark.getText());
            stu.setMark(mark);
            txt_rank.setText(stu.getGrade());
        }
    }// GEN-LAST:event_txt_markCaretUpdate

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cbomajor;
    private javax.swing.JCheckBox ckc_bonus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton oderbymark;
    private javax.swing.JButton oderbyname;
    private javax.swing.JTable tbl_students;
    private javax.swing.JTextField txt_fullname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_mark;
    private javax.swing.JTextField txt_rank;
    // End of variables declaration//GEN-END:variables
}

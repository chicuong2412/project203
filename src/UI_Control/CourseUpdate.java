package UI_Control;

import static userDAO.AllUserProgress.*;
import enity.Course;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static services.CourseServices.checkPrerequisites;
import static services.CourseServices.getListByStatusCourses;
import services.TableChangeGPA;
import services.TableCoursesStatus;

public class CourseUpdate extends javax.swing.JFrame {

    /**
     * Creates new form testFrame
     *
     * @param menu
     */
    public CourseUpdate(MainMenu menu) {
        initComponents();
        this.menu = menu;
        getTableIncompleted("", "");
        getTableComplete("", "");
        getTableGPA("", "");
        this.setLocationRelativeTo(null);
    }

    public void getTableComplete(String choice, String searchKey) {

        listCom.setModel(new TableCoursesStatus(this.menu.UserCourses.getArrayCourses(),
                true,
                searchKey, choice).toTable());

    }

    public void getTableIncompleted(String choice, String searchKey) {
        list.setModel(new TableCoursesStatus(this.menu.UserCourses.getArrayCourses(),
                false,
                searchKey, choice).toTable());
//        list.setBackground(Color.GRAY);
    }

    public void getTableGPA(String choice, String searchKey) {
        GPAtable.setModel(new TableChangeGPA(this.menu.UserCourses.getArrayCourses(),
                true,
                searchKey, choice).toTable());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        GPAtab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        nameChangeStatus = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listCom = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JTable();
        idChangeStatus = new javax.swing.JRadioButton();
        jSearchKeyStatusChange = new UIcomponent.RoundJTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        GPAtable = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        NAME = new javax.swing.JTextField();
        GPA = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idChangeGPA = new javax.swing.JRadioButton();
        nameChangeGPA = new javax.swing.JRadioButton();
        jSearchKeyGPA = new javax.swing.JTextField();
        jChangeGPAButton = new javax.swing.JButton();
        back = new javax.swing.JButton();
        applyChangeStatus = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CHANGE COURSE PROGRESS");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        GPAtab.setBackground(new java.awt.Color(2, 30, 68));
        GPAtab.setForeground(new java.awt.Color(255, 255, 255));
        GPAtab.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        GPAtab.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(39, 64, 139));

        nameChangeStatus.setBackground(new java.awt.Color(39, 64, 139));
        nameChangeStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameChangeStatus.setForeground(new java.awt.Color(255, 255, 255));
        nameChangeStatus.setText("Name");
        nameChangeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameChangeStatusActionPerformed(evt);
            }
        });

        listCom.setModel(new javax.swing.table.DefaultTableModel(
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
        listCom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listComMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listCom);

        list.setModel(new javax.swing.table.DefaultTableModel(
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
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        idChangeStatus.setBackground(new java.awt.Color(39, 64, 139));
        idChangeStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idChangeStatus.setForeground(new java.awt.Color(255, 255, 255));
        idChangeStatus.setText("ID");
        idChangeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idChangeStatusActionPerformed(evt);
            }
        });

        jSearchKeyStatusChange.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSearchKeyStatusChangeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSearchKeyStatusChangeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSearchKeyStatusChangeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSearchKeyStatusChange, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nameChangeStatus))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSearchKeyStatusChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idChangeStatus))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        GPAtab.addTab("Change Courses Status", jPanel1);

        jPanel2.setBackground(new java.awt.Color(39, 64, 139));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        GPAtable.setModel(new javax.swing.table.DefaultTableModel(
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
        GPAtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GPAtableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(GPAtable);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setText("Completed");

        ID.setEditable(false);

        NAME.setEditable(false);

        GPA.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Status");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GPA");

        idChangeGPA.setBackground(new java.awt.Color(39, 64, 139));
        idChangeGPA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idChangeGPA.setForeground(new java.awt.Color(255, 255, 255));
        idChangeGPA.setText("ID");
        idChangeGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idChangeGPAActionPerformed(evt);
            }
        });

        nameChangeGPA.setBackground(new java.awt.Color(39, 64, 139));
        nameChangeGPA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameChangeGPA.setForeground(new java.awt.Color(255, 255, 255));
        nameChangeGPA.setText("Name");
        nameChangeGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameChangeGPAActionPerformed(evt);
            }
        });

        jSearchKeyGPA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSearchKeyGPAKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSearchKeyGPAKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSearchKeyGPAKeyTyped(evt);
            }
        });

        jChangeGPAButton.setBackground(new java.awt.Color(2, 30, 68));
        jChangeGPAButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jChangeGPAButton.setForeground(new java.awt.Color(255, 255, 255));
        jChangeGPAButton.setText("Apply Change");
        jChangeGPAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChangeGPAButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idChangeGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameChangeGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSearchKeyGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                    .addComponent(NAME, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GPA)
                                    .addComponent(ID, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                                .addComponent(jChangeGPAButton)
                                .addGap(134, 134, 134))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idChangeGPA)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(nameChangeGPA))
                    .addComponent(jSearchKeyGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addComponent(jChangeGPAButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        GPAtab.addTab("Change GPA", jPanel2);

        back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(2, 31, 68));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        applyChangeStatus.setBackground(new java.awt.Color(2, 31, 68));
        applyChangeStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        applyChangeStatus.setForeground(new java.awt.Color(255, 255, 255));
        applyChangeStatus.setText("Apply");
        applyChangeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyChangeStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(applyChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(back)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(GPAtab, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(applyChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(GPAtab, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        int row = list.getSelectedRow();
        ArrayList<Course> tempt = getListByStatusCourses(this.menu.UserCourses.getArrayCourses(), true);
        DefaultTableModel complete = (DefaultTableModel) listCom.getModel();
        for (int i = 0; i < complete.getRowCount(); i++) {
            String id = String.valueOf(complete.getValueAt(i, 0));
            Course temptCourse = this.menu.UserCourses.getCourse(id);
            temptCourse.setStatus(true);
            tempt.add(temptCourse);
        }
        
        if (checkPrerequisites(this.menu.UserCourses.getCourse(String.valueOf(list.getValueAt(row, 0))),
                tempt)){
            changeStatus(list, listCom, true, row);
        } else {
            JOptionPane.showMessageDialog(this, "You didn't complete the courses prerequisites");
        }
        
    }//GEN-LAST:event_listMouseClicked

    private void listComMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listComMouseClicked
        int row = listCom.getSelectedRow();
        changeStatus(listCom, list, false, row);
    }//GEN-LAST:event_listComMouseClicked

    public void changeStatus(javax.swing.JTable tableRemoveRow, 
            javax.swing.JTable tableAddRow, 
            boolean statusChange, 
            int row){
        Object[] selectedRow = new Object[3];
        DefaultTableModel tabl = (DefaultTableModel) tableRemoveRow.getModel();
        selectedRow[0] = tableRemoveRow.getValueAt(row, 0);
        selectedRow[1] = tableRemoveRow.getValueAt(row, 1);
        selectedRow[2] = (statusChange)?"completed":"not completed";
        tabl.removeRow(row);
        DefaultTableModel table = (DefaultTableModel) tableAddRow.getModel();
        tableAddRow.setModel(table);
        table.addRow(selectedRow);
    }
    
    private void applyChangeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyChangeStatusActionPerformed
        DefaultTableModel unComplete = (DefaultTableModel) list.getModel();
        for (int i = 0; i < unComplete.getRowCount(); i++) {
            String id = String.valueOf(unComplete.getValueAt(i, 0));
            changeStatus(false, id);
        }

        DefaultTableModel complete = (DefaultTableModel) listCom.getModel();
        for (int i = 0; i < complete.getRowCount(); i++) {
            String id = String.valueOf(complete.getValueAt(i, 0));
            changeStatus(true, id);
        }
        setCourses(this.menu.acc, this.menu.UserCourses.getArrayCourses());
        getTableGPA("", "");
    }//GEN-LAST:event_applyChangeStatusActionPerformed

    public void changeStatus(boolean status, String id){
        Course course = this.menu.UserCourses.getCourse(id);
        course.setStatus(status);
        this.menu.UserCourses.setCourse(course);
    }
    
    
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void idChangeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idChangeStatusActionPerformed
        if (idChangeStatus.isSelected()) {
            nameChangeStatus.setEnabled(false);
        } else {
            nameChangeStatus.setEnabled(true);
        }
    }//GEN-LAST:event_idChangeStatusActionPerformed

    private void nameChangeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameChangeStatusActionPerformed
        if (nameChangeStatus.isSelected()) {
            idChangeStatus.setEnabled(false);
        } else {
            idChangeStatus.setEnabled(true);
        }
    }//GEN-LAST:event_nameChangeStatusActionPerformed
    
    public void doSearchStatus(){
        if (idChangeStatus.isSelected()) {
            getTableComplete("ID", jSearchKeyStatusChange.getText());
            getTableIncompleted("ID", jSearchKeyStatusChange.getText());
        } else if (nameChangeStatus.isSelected()) {
            getTableComplete("NAME", jSearchKeyStatusChange.getText());
            getTableIncompleted("NAME", jSearchKeyStatusChange.getText());
        } else {
            getTableComplete("", jSearchKeyStatusChange.getText());
            getTableIncompleted("", jSearchKeyStatusChange.getText());
        }
    }
    
    private void GPAtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GPAtableMouseClicked
        int row = GPAtable.getSelectedRow();
        Object[] selectedRow = new Object[4];
        DefaultTableModel tabl = (DefaultTableModel) listCom.getModel();
        selectedRow[0] = GPAtable.getValueAt(row, 0);
        selectedRow[1] = GPAtable.getValueAt(row, 1);
        selectedRow[2] = "Completed";
        selectedRow[3] = GPAtable.getValueAt(row, 3);
        ID.setText(String.valueOf(selectedRow[0]));
        NAME.setText(String.valueOf(selectedRow[1]));
        GPA.setText(String.valueOf(selectedRow[3]));
    }//GEN-LAST:event_GPAtableMouseClicked

    private void idChangeGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idChangeGPAActionPerformed
        if (idChangeGPA.isSelected()) {
            nameChangeGPA.setEnabled(false);
        } else {
            nameChangeGPA.setEnabled(true);
        }
    }//GEN-LAST:event_idChangeGPAActionPerformed

    private void nameChangeGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameChangeGPAActionPerformed
        if (nameChangeGPA.isSelected()) {
            idChangeGPA.setEnabled(false);
        } else {
            idChangeGPA.setEnabled(true);
        }
    }//GEN-LAST:event_nameChangeGPAActionPerformed

    private void jSearchKeyGPAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyGPAKeyPressed
        doSearchGPA();
    }//GEN-LAST:event_jSearchKeyGPAKeyPressed

    private void jSearchKeyGPAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyGPAKeyReleased
        doSearchGPA();
    }//GEN-LAST:event_jSearchKeyGPAKeyReleased

    private void jSearchKeyGPAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyGPAKeyTyped
        doSearchGPA();
    }//GEN-LAST:event_jSearchKeyGPAKeyTyped
    
    public void doSearchGPA(){
        if (idChangeGPA.isSelected()) {
            getTableGPA("ID", jSearchKeyGPA.getText());
        } else if (nameChangeGPA.isSelected()) {
            getTableGPA("NAME", jSearchKeyGPA.getText());
        } else {
            getTableGPA("", jSearchKeyGPA.getText());
        }
    }
    
    private void jChangeGPAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChangeGPAButtonActionPerformed
        if (!ID.getText().equals("") && ID.getText()!= null) {
            Course course = this.menu.UserCourses.getCourse(ID.getText());
            try{
                course.setGPA(Double.parseDouble(GPA.getText()));
                this.menu.UserCourses.setCourse(course);
                setCourses(this.menu.acc, this.menu.UserCourses.getArrayCourses());
            } catch (Exception e){
                 JOptionPane.showMessageDialog(this, "GPA must be a number");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Choose at least one course to change");
        }
    }//GEN-LAST:event_jChangeGPAButtonActionPerformed

    private void jSearchKeyStatusChangeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyStatusChangeKeyPressed
        doSearchStatus();
    }//GEN-LAST:event_jSearchKeyStatusChangeKeyPressed

    private void jSearchKeyStatusChangeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyStatusChangeKeyReleased
        doSearchStatus();
    }//GEN-LAST:event_jSearchKeyStatusChangeKeyReleased

    private void jSearchKeyStatusChangeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyStatusChangeKeyTyped
        doSearchStatus();
    }//GEN-LAST:event_jSearchKeyStatusChangeKeyTyped

    /**
     * @param args the command line arguments
     */
    public MainMenu menu;
    private String path;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GPA;
    private javax.swing.JTabbedPane GPAtab;
    private javax.swing.JTable GPAtable;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField NAME;
    private javax.swing.JButton applyChangeStatus;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton idChangeGPA;
    private javax.swing.JRadioButton idChangeStatus;
    private javax.swing.JButton jChangeGPAButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jSearchKeyGPA;
    private UIcomponent.RoundJTextField jSearchKeyStatusChange;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable list;
    private javax.swing.JTable listCom;
    private javax.swing.JRadioButton nameChangeGPA;
    private javax.swing.JRadioButton nameChangeStatus;
    // End of variables declaration//GEN-END:variables
}

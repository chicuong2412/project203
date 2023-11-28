package UI_Control;

import static userDAO.AllUserProgress.*;
import enity.Course;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import picture.GetImage;
import static services.CourseServices.checkPrerequisites;
import static services.CourseServices.getListByStatusCourses;
import services.TableChangeGPA;
import services.TableCoursesStatus;
import services.IconSize_Services;

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
        backIcon.setIcon(new IconSize_Services("back.png", backIcon).getIcon());
        backIcon.setText("Back");
        this.setIconImage(new ImageIcon(
                GetImage.class.getResource("edit.png"))
                .getImage());
        this.setLocationRelativeTo(null);
    }

    
    
    public void getTableComplete(String choice, String searchKey) {

        listComplete.setModel(new TableCoursesStatus(this.menu.UserCourses.getArrayCourses(),
                true,
                searchKey, choice).toTable());

    }

    public void getTableIncompleted(String choice, String searchKey) {
        listIncomplete.setModel(new TableCoursesStatus(this.menu.UserCourses.getArrayCourses(),
                false,
                searchKey, choice).toTable());
        
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
        listComplete = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        listIncomplete = new javax.swing.JTable();
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
        applyChangeStatus = new javax.swing.JButton();
        backIcon = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CHANGE COURSE PROGRESS");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        GPAtab.setBackground(new java.awt.Color(51, 51, 255));
        GPAtab.setForeground(new java.awt.Color(255, 255, 255));
        GPAtab.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        GPAtab.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        nameChangeStatus.setBackground(new java.awt.Color(51, 51, 255));
        nameChangeStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameChangeStatus.setForeground(new java.awt.Color(255, 255, 255));
        nameChangeStatus.setText("Name");
        nameChangeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameChangeStatusActionPerformed(evt);
            }
        });

        listComplete.setBackground(new java.awt.Color(255, 255, 255));
        listComplete.setModel(new javax.swing.table.DefaultTableModel(
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
        listComplete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listCompleteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listComplete);

        listIncomplete.setBackground(new java.awt.Color(255, 255, 255));
        listIncomplete.setModel(new javax.swing.table.DefaultTableModel(
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
        listIncomplete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listIncompleteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listIncomplete);

        idChangeStatus.setBackground(new java.awt.Color(51, 51, 255));
        idChangeStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idChangeStatus.setForeground(new java.awt.Color(255, 255, 255));
        idChangeStatus.setText("ID");
        idChangeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idChangeStatusActionPerformed(evt);
            }
        });

        jSearchKeyStatusChange.setForeground(new java.awt.Color(0, 0, 0));
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSearchKeyStatusChange, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSearchKeyStatusChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameChangeStatus)))
                    .addComponent(idChangeStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        GPAtab.addTab("Change Courses Status", jPanel1);

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));

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
        jTextField1.setText("Completed");

        ID.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Status");

        jLabel4.setText("GPA");

        idChangeGPA.setText("ID");
        idChangeGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idChangeGPAActionPerformed(evt);
            }
        });

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
                        .addGap(41, 41, 41)
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
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jChangeGPAButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idChangeGPA)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameChangeGPA)
                            .addComponent(jSearchKeyGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jChangeGPAButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        GPAtab.addTab("Change GPA", jPanel2);

        applyChangeStatus.setText("Apply");
        applyChangeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyChangeStatusActionPerformed(evt);
            }
        });

        backIcon.setBackground(new java.awt.Color(0, 0, 0));
        backIcon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backIcon.setText("Back");
        backIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GPAtab)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(applyChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200)
                .addComponent(backIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(applyChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(GPAtab, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listIncompleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listIncompleteMouseClicked
        int row = listIncomplete.getSelectedRow();
        ArrayList<Course> tempt = getListByStatusCourses(this.menu.UserCourses.getArrayCourses(), true);
        DefaultTableModel complete = (DefaultTableModel) listComplete.getModel();
        for (int i = 0; i < complete.getRowCount(); i++) {
            String id = String.valueOf(complete.getValueAt(i, 0));
            Course temptCourse = this.menu.UserCourses.getCourse(id);
            temptCourse.setStatus(true);
            tempt.add(temptCourse);
        }
        
        if (checkPrerequisites(this.menu.UserCourses.getCourse(String.valueOf(listIncomplete.getValueAt(row, 0))),
                tempt)){
            changeStatus(listIncomplete, listComplete, true, row);
        } else {
            JOptionPane.showMessageDialog(this, "You didn't complete the courses prerequisites");
        }
        
    }//GEN-LAST:event_listIncompleteMouseClicked

    private void listCompleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCompleteMouseClicked
        int row = listComplete.getSelectedRow();
        changeStatus(listComplete, listIncomplete, false, row);
    }//GEN-LAST:event_listCompleteMouseClicked

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
        DefaultTableModel unComplete = (DefaultTableModel) listIncomplete.getModel();
        for (int i = 0; i < unComplete.getRowCount(); i++) {
            String id = String.valueOf(unComplete.getValueAt(i, 0));
            changeStatus(false, id);
        }

        DefaultTableModel complete = (DefaultTableModel) listComplete.getModel();
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
        DefaultTableModel tabl = (DefaultTableModel) listComplete.getModel();
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

    private void backIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backIconMouseClicked
        this.menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backIconMouseClicked

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
    private javax.swing.JLabel backIcon;
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
    private javax.swing.JTable listComplete;
    private javax.swing.JTable listIncomplete;
    private javax.swing.JRadioButton nameChangeGPA;
    private javax.swing.JRadioButton nameChangeStatus;
    // End of variables declaration//GEN-END:variables
}

package UI_Control;

import static userDAO.AllUserProgress.*;
import enity.Course;
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

        listCompleteCourses.setModel(new TableCoursesStatus(this.menu.UserCourses.getArrayCourses(),
                true,
                searchKey, choice).toTable());

    }

    public void getTableIncompleted(String choice, String searchKey) {
        listIncompleteCourses.setModel(new TableCoursesStatus(this.menu.UserCourses.getArrayCourses(),
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
        changeCoursesStatusPanel = new javax.swing.JPanel();
        nameChangeStatus = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listCompleteCourses = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        listIncompleteCourses = new javax.swing.JTable();
        idChangeStatus = new javax.swing.JRadioButton();
        jSearchKeyStatusChange = new UIcomponent.RoundJTextField();
        changeGPAPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        GPAtable = new javax.swing.JTable();
        StatusTextField = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        NAME = new javax.swing.JTextField();
        GPA = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idChangeGPA = new javax.swing.JRadioButton();
        nameChangeGPA = new javax.swing.JRadioButton();
        jChangeGPAButton = new javax.swing.JButton();
        jSearchKeyGPA = new UIcomponent.RoundJTextField();
        back = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CHANGE COURSE PROGRESS");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        GPAtab.setBackground(new java.awt.Color(2, 30, 68));
        GPAtab.setForeground(new java.awt.Color(255, 255, 255));
        GPAtab.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        GPAtab.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        changeCoursesStatusPanel.setBackground(new java.awt.Color(2, 31, 68));

        nameChangeStatus.setBackground(new java.awt.Color(2, 29, 68));
        nameChangeStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameChangeStatus.setForeground(new java.awt.Color(255, 255, 255));
        nameChangeStatus.setText("Name");
        nameChangeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameChangeStatusActionPerformed(evt);
            }
        });

        listCompleteCourses.setModel(new javax.swing.table.DefaultTableModel(
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
        listCompleteCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listCompleteCoursesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listCompleteCourses);

        listIncompleteCourses.setModel(new javax.swing.table.DefaultTableModel(
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
        listIncompleteCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listIncompleteCoursesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listIncompleteCourses);

        idChangeStatus.setBackground(new java.awt.Color(2, 31, 68));
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

        javax.swing.GroupLayout changeCoursesStatusPanelLayout = new javax.swing.GroupLayout(changeCoursesStatusPanel);
        changeCoursesStatusPanel.setLayout(changeCoursesStatusPanelLayout);
        changeCoursesStatusPanelLayout.setHorizontalGroup(
            changeCoursesStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeCoursesStatusPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(changeCoursesStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changeCoursesStatusPanelLayout.createSequentialGroup()
                        .addGroup(changeCoursesStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSearchKeyStatusChange, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(changeCoursesStatusPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        changeCoursesStatusPanelLayout.setVerticalGroup(
            changeCoursesStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeCoursesStatusPanelLayout.createSequentialGroup()
                .addGroup(changeCoursesStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changeCoursesStatusPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nameChangeStatus))
                    .addGroup(changeCoursesStatusPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(changeCoursesStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSearchKeyStatusChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idChangeStatus))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(changeCoursesStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        GPAtab.addTab("Change Courses Status", changeCoursesStatusPanel);

        changeGPAPanel.setBackground(new java.awt.Color(2, 31, 68));
        changeGPAPanel.setForeground(new java.awt.Color(255, 255, 255));

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

        StatusTextField.setEditable(false);
        StatusTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        StatusTextField.setText("Completed");

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

        idChangeGPA.setBackground(new java.awt.Color(2, 31, 68));
        idChangeGPA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idChangeGPA.setForeground(new java.awt.Color(255, 255, 255));
        idChangeGPA.setText("ID");
        idChangeGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idChangeGPAActionPerformed(evt);
            }
        });

        nameChangeGPA.setBackground(new java.awt.Color(2, 31, 68));
        nameChangeGPA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameChangeGPA.setForeground(new java.awt.Color(255, 255, 255));
        nameChangeGPA.setText("Name");
        nameChangeGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameChangeGPAActionPerformed(evt);
            }
        });

        jChangeGPAButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jChangeGPAButton.setText("Apply Change");
        jChangeGPAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChangeGPAButtonActionPerformed(evt);
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

        javax.swing.GroupLayout changeGPAPanelLayout = new javax.swing.GroupLayout(changeGPAPanel);
        changeGPAPanel.setLayout(changeGPAPanelLayout);
        changeGPAPanelLayout.setHorizontalGroup(
            changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeGPAPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changeGPAPanelLayout.createSequentialGroup()
                        .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idChangeGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameChangeGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSearchKeyGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(changeGPAPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(changeGPAPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(changeGPAPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(StatusTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                    .addComponent(NAME, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GPA)
                                    .addComponent(ID, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changeGPAPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                                .addComponent(jChangeGPAButton)
                                .addGap(134, 134, 134))))))
        );
        changeGPAPanelLayout.setVerticalGroup(
            changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeGPAPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idChangeGPA)
                    .addGroup(changeGPAPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(nameChangeGPA))
                    .addComponent(jSearchKeyGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changeGPAPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addComponent(jChangeGPAButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        GPAtab.addTab("Change GPA", changeGPAPanel);

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
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
                        .addComponent(GPAtab, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(back)
                        .addGap(44, 44, 44))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GPAtab, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
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

    private void listIncompleteCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listIncompleteCoursesMouseClicked
        int row = listIncompleteCourses.getSelectedRow();       // click on listIncompleted change courses to the listCompleted
        ArrayList<Course> tempt = getListByStatusCourses(this.menu.UserCourses.getArrayCourses(), true);
        DefaultTableModel completedTable = (DefaultTableModel) listCompleteCourses.getModel();
        for (int i = 0; i < completedTable.getRowCount(); i++) {
            String id = String.valueOf(completedTable.getValueAt(i, 0));
            Course temptCourse = new Course();
            temptCourse = this.menu.UserCourses.getCourse(id);
            temptCourse.setStatus(true);
            tempt.add(temptCourse);
        }
        
        if (checkPrerequisites(this.menu.UserCourses.getCourse(String.valueOf(listIncompleteCourses.getValueAt(row, 0))),
                tempt)){// check prerequisites including current list completed table
            changeStatus(listIncompleteCourses, listCompleteCourses, true, row);
        } else {
            JOptionPane.showMessageDialog(this, "You didn't complete the courses prerequisites");
        }
        applyCurrentProgress();
        getTableGPA("", "");
        
    }//GEN-LAST:event_listIncompleteCoursesMouseClicked

    private void listCompleteCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCompleteCoursesMouseClicked
        int row = listCompleteCourses.getSelectedRow();
        changeStatus(listCompleteCourses, listIncompleteCourses, false, row);
        applyCurrentProgress();
        getTableGPA("", "");
    }//GEN-LAST:event_listCompleteCoursesMouseClicked

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
    
    public void applyCurrentProgress(){
        DefaultTableModel unComplete = (DefaultTableModel) listIncompleteCourses.getModel();
        for (int i = 0; i < unComplete.getRowCount(); i++) {
            String id = String.valueOf(unComplete.getValueAt(i, 0));
            changeStatus(false, id);
        }

        DefaultTableModel complete = (DefaultTableModel) listCompleteCourses.getModel();
        for (int i = 0; i < complete.getRowCount(); i++) {
            String id = String.valueOf(complete.getValueAt(i, 0));
            changeStatus(true, id);
        }
//        setCourses(this.menu.acc, this.menu.UserCourses.getArrayCourses());
    }
    
    public void changeStatus(boolean status, String id){
        this.menu.UserCourses.getCourse(id).setStatus(status);
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
        DefaultTableModel tabl = (DefaultTableModel) listCompleteCourses.getModel();
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

    private void jSearchKeyGPAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyGPAKeyPressed
        doSearchGPA();
    }//GEN-LAST:event_jSearchKeyGPAKeyPressed

    private void jSearchKeyGPAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyGPAKeyReleased
        doSearchGPA();
    }//GEN-LAST:event_jSearchKeyGPAKeyReleased

    private void jSearchKeyGPAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyGPAKeyTyped
        doSearchGPA();
    }//GEN-LAST:event_jSearchKeyGPAKeyTyped

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
    private javax.swing.JTextField StatusTextField;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel changeCoursesStatusPanel;
    private javax.swing.JPanel changeGPAPanel;
    private javax.swing.JRadioButton idChangeGPA;
    private javax.swing.JRadioButton idChangeStatus;
    private javax.swing.JButton jChangeGPAButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private UIcomponent.RoundJTextField jSearchKeyGPA;
    private UIcomponent.RoundJTextField jSearchKeyStatusChange;
    private javax.swing.JTable listCompleteCourses;
    private javax.swing.JTable listIncompleteCourses;
    private javax.swing.JRadioButton nameChangeGPA;
    private javax.swing.JRadioButton nameChangeStatus;
    // End of variables declaration//GEN-END:variables
}

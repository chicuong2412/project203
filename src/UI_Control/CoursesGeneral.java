package UI_Control;


import services.TableAllInformation;
import services.TableAvailable;

public class CoursesGeneral extends javax.swing.JFrame {

    /**
     * Creates new form AvailableCourses
     */
    public CoursesGeneral(MainMenu menu) {
        initComponents();
        this.menu = menu;
        getTableAvaiable("" , "");
        getTableAll("" ,  ""); 
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jSearchTextField = new javax.swing.JTextField();
        nameCheckRaidoButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAvailable = new javax.swing.JTable();
        idCheckRaidoButton = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        nameCheckAll = new javax.swing.JRadioButton();
        idCheckAll = new javax.swing.JRadioButton();
        jSearchAllField = new javax.swing.JTextField();
        allCoursesTable = new javax.swing.JScrollPane();
        allTableCourses = new javax.swing.JTable();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("List of courses you can sign up for");

        jTabbedPane4.setBackground(new java.awt.Color(255, 255, 255));

        jSearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSearchTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSearchTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSearchTextFieldKeyTyped(evt);
            }
        });

        nameCheckRaidoButton.setText("Name");
        nameCheckRaidoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameCheckRaidoButtonActionPerformed(evt);
            }
        });

        listAvailable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Credit", "Prerequisites"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        listAvailable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listAvailableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listAvailable);
        if (listAvailable.getColumnModel().getColumnCount() > 0) {
            listAvailable.getColumnModel().getColumn(3).setMinWidth(200);
            listAvailable.getColumnModel().getColumn(3).setMaxWidth(200);
        }

        idCheckRaidoButton.setText("ID");
        idCheckRaidoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCheckRaidoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idCheckRaidoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameCheckRaidoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idCheckRaidoButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameCheckRaidoButton)
                            .addComponent(jSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Available Courses", jPanel1);

        nameCheckAll.setText("Name");
        nameCheckAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameCheckAllActionPerformed(evt);
            }
        });

        idCheckAll.setText("ID");
        idCheckAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCheckAllActionPerformed(evt);
            }
        });

        jSearchAllField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSearchAllFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSearchAllFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSearchAllFieldKeyTyped(evt);
            }
        });

        allTableCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Credit", "Score", "GPA", "Status", "Prerequisites"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        allTableCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allTableCoursesMouseClicked(evt);
            }
        });
        allCoursesTable.setViewportView(allTableCourses);
        if (allTableCourses.getColumnModel().getColumnCount() > 0) {
            allTableCourses.getColumnModel().getColumn(3).setHeaderValue("TotalScore");
            allTableCourses.getColumnModel().getColumn(6).setMinWidth(200);
            allTableCourses.getColumnModel().getColumn(6).setMaxWidth(200);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(allCoursesTable, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idCheckAll, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameCheckAll, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jSearchAllField, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idCheckAll)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameCheckAll)
                            .addComponent(jSearchAllField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(allCoursesTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("All Courses", jPanel2);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(back)
                .addContainerGap(521, Short.MAX_VALUE))
            .addComponent(jTabbedPane4)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void idCheckRaidoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCheckRaidoButtonActionPerformed
        if (idCheckRaidoButton.isSelected()) {
            nameCheckRaidoButton.setEnabled(false);
        } else {
            nameCheckRaidoButton.setEnabled(true);
        }
    }//GEN-LAST:event_idCheckRaidoButtonActionPerformed

    private void nameCheckRaidoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameCheckRaidoButtonActionPerformed
        if (nameCheckRaidoButton.isSelected()) {
            idCheckRaidoButton.setEnabled(false);
        } else {
            idCheckRaidoButton.setEnabled(true);
        }
    }//GEN-LAST:event_nameCheckRaidoButtonActionPerformed

    private void jSearchTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchTextFieldKeyPressed
        doSearchStatus();
    }//GEN-LAST:event_jSearchTextFieldKeyPressed

    private void jSearchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchTextFieldKeyReleased
        doSearchStatus();
    }//GEN-LAST:event_jSearchTextFieldKeyReleased

    private void jSearchTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchTextFieldKeyTyped
        doSearchStatus();
    }//GEN-LAST:event_jSearchTextFieldKeyTyped

    private void nameCheckAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameCheckAllActionPerformed
        if (nameCheckAll.isSelected()) {
            idCheckAll.setEnabled(false);
        } else {
            idCheckAll.setEnabled(true);
        }
    }//GEN-LAST:event_nameCheckAllActionPerformed

    private void idCheckAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCheckAllActionPerformed
        if (idCheckAll.isSelected()) {
            nameCheckAll.setEnabled(false);
        } else {
            nameCheckAll.setEnabled(true);
        }
    }//GEN-LAST:event_idCheckAllActionPerformed

    private void jSearchAllFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchAllFieldKeyPressed
        doSearchAll();
    }//GEN-LAST:event_jSearchAllFieldKeyPressed

    private void jSearchAllFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchAllFieldKeyReleased
        doSearchAll();
    }//GEN-LAST:event_jSearchAllFieldKeyReleased

    private void jSearchAllFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchAllFieldKeyTyped
        doSearchAll();
    }//GEN-LAST:event_jSearchAllFieldKeyTyped

    private void listAvailableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listAvailableMouseClicked
        int row = listAvailable.getSelectedRow();
        new ShowCourseInfo(
                this.menu.UserCourses.getCourse(String.valueOf(listAvailable.getValueAt(row, 0)))).setVisible(true);
    }//GEN-LAST:event_listAvailableMouseClicked

    private void allTableCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allTableCoursesMouseClicked
        int row = allTableCourses.getSelectedRow();
        new ShowCourseInfo(
                this.menu.UserCourses.getCourse(String.valueOf(allTableCourses.getValueAt(row, 0)))).setVisible(true);
    }//GEN-LAST:event_allTableCoursesMouseClicked

    public void getTableAvaiable(String choice, String searchKey) {
        listAvailable.setModel(new TableAvailable(this.menu.UserCourses.getArrayCourses(), 
                searchKey, 
                choice)
                .toTable());

    }
    
    public void getTableAll(String choice, String searchKey) {
        allTableCourses.setModel(new TableAllInformation(this.menu.UserCourses.getArrayCourses(), 
                searchKey, 
                choice)
                .toTable());

    }
    
    public void doSearchStatus(){
        if (idCheckRaidoButton.isSelected()) {
            getTableAvaiable("ID", jSearchTextField.getText());
        } else if (nameCheckRaidoButton.isSelected()) {
            getTableAvaiable("NAME", jSearchTextField.getText());
        } else {
            getTableAvaiable("", jSearchTextField.getText());
        }
    }
    
    
    public void doSearchAll(){
        if (idCheckAll.isSelected()) {
            getTableAll("ID", jSearchAllField.getText());
        } else if (nameCheckAll.isSelected()) {
            getTableAll("NAME", jSearchAllField.getText());
        } else {
            getTableAll("", jSearchAllField.getText());
        }
    }
    /**
     * @param args the command line arguments
     */

    MainMenu menu;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane allCoursesTable;
    private javax.swing.JTable allTableCourses;
    private javax.swing.JButton back;
    private javax.swing.JRadioButton idCheckAll;
    private javax.swing.JRadioButton idCheckRaidoButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSearchAllField;
    private javax.swing.JTextField jSearchTextField;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable listAvailable;
    private javax.swing.JRadioButton nameCheckAll;
    private javax.swing.JRadioButton nameCheckRaidoButton;
    // End of variables declaration//GEN-END:variables
}

package UI;

import UIcomponent.CustomJButton;
import accountDAO.UserCourses;
import enity.Account;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.FileServices;

/**
 *
 * @author admin
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     *
     * @param path
     */
    public MainMenu(Account acc) {
        initComponents();
        this.acc = acc;
        this.UserCourses = new UserCourses(acc);
        jUsername.setText(this.acc.getFullName());
        test.setText(String.valueOf(this.acc.getYearAttend()));
        this.setLocationRelativeTo(null);
    }
    int menuBarWidth = 159;

    public void openMenuBar() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < menuBarWidth; i++) {
                    pnMenuBar.setSize(i, 379);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    public void closeMenuBar() {
        new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = menuBarWidth; i > 0; i--) {
                    pnMenuBar.setSize(i, 379);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jUsername = new javax.swing.JLabel();
        test = new javax.swing.JLabel();
        pnMain = new javax.swing.JPanel();
        openAvailableUI = new javax.swing.JButton();
        saveInfoButton = new javax.swing.JButton();
        menuBar = new javax.swing.JLabel();
        openProgressMenu = new UIcomponent.CustomJButton();
        progressPic = new javax.swing.JLabel();
        pnMenuBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        profileAccount = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        logOut = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jUsername.setText("jLabel1");

        test.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnMain.setBackground(new java.awt.Color(255, 255, 255));

        openAvailableUI.setText("Available courses");
        openAvailableUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openAvailableUIActionPerformed(evt);
            }
        });

        saveInfoButton.setText("Save");
        saveInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInfoButtonActionPerformed(evt);
            }
        });

        menuBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/menu_1.png"))); // NOI18N
        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarMouseClicked(evt);
            }
        });

        openProgressMenu.setBorder(null);
        openProgressMenu.setForeground(new java.awt.Color(255, 255, 255));
        openProgressMenu.setText("Progress Menu");
        openProgressMenu.setBorderColor(new java.awt.Color(0, 0, 51));
        openProgressMenu.setBorderPainted(false);
        openProgressMenu.setBorderSize(0);
        openProgressMenu.setColor(new java.awt.Color(46, 165, 228));
        openProgressMenu.setColorClick(new java.awt.Color(255, 102, 102));
        openProgressMenu.setColorOver(new java.awt.Color(0, 51, 255));
        openProgressMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        openProgressMenu.setRadius(50);
        openProgressMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openProgressMenuActionPerformed(evt);
            }
        });

        progressPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/progress (1).png"))); // NOI18N
        progressPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                progressPicMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 458, Short.MAX_VALUE)
                        .addComponent(saveInfoButton))
                    .addGroup(pnMainLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(progressPic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(openProgressMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(openAvailableUI, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuBar)
                            .addComponent(progressPic)))
                    .addGroup(pnMainLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(openProgressMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(openAvailableUI, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(saveInfoButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnMenuBar.setBackground(new java.awt.Color(46, 165, 228));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        profileAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profileAccount.setForeground(new java.awt.Color(255, 255, 255));
        profileAccount.setText("Profile Account");
        profileAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileAccountMouseClicked(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        logOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logOut.setForeground(new java.awt.Color(255, 255, 255));
        logOut.setText("Log out");
        logOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnMenuBarLayout = new javax.swing.GroupLayout(pnMenuBar);
        pnMenuBar.setLayout(pnMenuBarLayout);
        pnMenuBarLayout.setHorizontalGroup(
            pnMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMenuBarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(24, 24, 24))
            .addGroup(pnMenuBarLayout.createSequentialGroup()
                .addGroup(pnMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMenuBarLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(profileAccount))
                    .addGroup(pnMenuBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logOut)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMenuBarLayout.setVerticalGroup(
            pnMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profileAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOut)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(666, Short.MAX_VALUE))
            .addComponent(pnMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMenuBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
//        FileServices.writeFileExcel(acc.getUsername(), courses);
    }//GEN-LAST:event_formWindowClosing

    private void openAvailableUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openAvailableUIActionPerformed
        new CoursesGeneral(this).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_openAvailableUIActionPerformed

    private void saveInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInfoButtonActionPerformed
        FileServices.writeFileExcel(this.acc.getUsername(), this.UserCourses.getArrayCourses());
    }//GEN-LAST:event_saveInfoButtonActionPerformed

    private void menuBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarMouseClicked
        openMenuBar();

    }//GEN-LAST:event_menuBarMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        closeMenuBar();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void profileAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileAccountMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_profileAccountMouseClicked

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
        new LoginFrame(this.acc.getUsername()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutMouseClicked

    private void openProgressMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openProgressMenuActionPerformed
        new CourseUpdate(this).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_openProgressMenuActionPerformed

    private void progressPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_progressPicMouseClicked
        new CourseUpdate(this).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_progressPicMouseClicked

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Account acc;
    private String username;
    public UserCourses UserCourses;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel jUsername;
    private javax.swing.JLabel logOut;
    private javax.swing.JLabel menuBar;
    private javax.swing.JButton openAvailableUI;
    private UIcomponent.CustomJButton openProgressMenu;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnMenuBar;
    private javax.swing.JLabel profileAccount;
    private javax.swing.JLabel progressPic;
    private javax.swing.JButton saveInfoButton;
    private javax.swing.JLabel test;
    // End of variables declaration//GEN-END:variables
}

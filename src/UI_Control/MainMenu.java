package UI_Control;

import enity.Account;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import services.FileServices;
import userDAO.UserCourses;

public class MainMenu extends javax.swing.JFrame {

    private int width = 160;
    private int height = 450;

    public MainMenu(Account acc) {
        initComponents();
        this.acc = acc;
        this.setLocationRelativeTo(null);
        this.username = acc.getUsername();
        this.UserCourses = new UserCourses(acc);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowDeiconified(WindowEvent e) {
                super.windowDeiconified(e);
                openMenubarBt.setVisible(true);
            }   
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menubar = new javax.swing.JPanel();
        titleMenuLabel = new javax.swing.JLabel();
        profileAccountLable = new javax.swing.JLabel();
        editAccountLable = new javax.swing.JLabel();
        logoutLable = new javax.swing.JLabel();
        closeMenubarBt = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        openAvailableUIButton = new javax.swing.JButton();
        openProgressMenuButton = new javax.swing.JButton();
        saveInfoButton = new javax.swing.JButton();
        openMenubarBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Course Self_management");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menubar.setBackground(new java.awt.Color(255, 255, 255));
        menubar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titleMenuLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleMenuLabel.setForeground(new java.awt.Color(2, 30, 68));
        titleMenuLabel.setText("DASH BOARD");

        profileAccountLable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profileAccountLable.setText("Profile Account");
        profileAccountLable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileAccountLableMouseClicked(evt);
            }
        });

        editAccountLable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editAccountLable.setText("Edit Accocunt");
        editAccountLable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editAccountLableMouseClicked(evt);
            }
        });

        logoutLable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logoutLable.setText("Log out");
        logoutLable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLableMouseClicked(evt);
            }
        });

        closeMenubarBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/close_icon.jpg"))); // NOI18N
        closeMenubarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeMenubarBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menubarLayout = new javax.swing.GroupLayout(menubar);
        menubar.setLayout(menubarLayout);
        menubarLayout.setHorizontalGroup(
            menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menubarLayout.createSequentialGroup()
                .addGroup(menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menubarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(closeMenubarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menubarLayout.createSequentialGroup()
                        .addGroup(menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menubarLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(titleMenuLabel)
                                    .addGroup(menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(menubarLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(editAccountLable))
                                        .addComponent(profileAccountLable, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(menubarLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(logoutLable, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        menubarLayout.setVerticalGroup(
            menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menubarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeMenubarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(titleMenuLabel)
                .addGap(27, 27, 27)
                .addComponent(profileAccountLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editAccountLable)
                .addGap(18, 18, 18)
                .addComponent(logoutLable)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        jPanel1.add(menubar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 450));

        jPanel3.setBackground(new java.awt.Color(2, 30, 68));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 770, -1));

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Workbg.jpg"))); // NOI18N
        jPanel1.add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 3, 26)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(102, 102, 102));
        titleLabel.setText("Welcome to Course Self-Management");
        jPanel1.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 470, -1));

        openAvailableUIButton.setBackground(new java.awt.Color(255, 255, 255));
        openAvailableUIButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        openAvailableUIButton.setForeground(new java.awt.Color(0, 51, 255));
        openAvailableUIButton.setText("Available Courses");
        openAvailableUIButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openAvailableUIButtonActionPerformed(evt);
            }
        });
        jPanel1.add(openAvailableUIButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 240, 50));

        openProgressMenuButton.setBackground(new java.awt.Color(255, 255, 255));
        openProgressMenuButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        openProgressMenuButton.setForeground(new java.awt.Color(0, 51, 255));
        openProgressMenuButton.setText("Progress Menu");
        openProgressMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openProgressMenuButtonActionPerformed(evt);
            }
        });
        jPanel1.add(openProgressMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 190, 40));

        saveInfoButton.setBackground(new java.awt.Color(255, 255, 255));
        saveInfoButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saveInfoButton.setForeground(new java.awt.Color(0, 51, 255));
        saveInfoButton.setText("Save Change");
        saveInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInfoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(saveInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        openMenubarBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/M.png"))); // NOI18N
        openMenubarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenubarBtActionPerformed(evt);
            }
        });
        jPanel1.add(openMenubarBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMenubarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeMenubarBtActionPerformed
        closeMenubar(WIDTH, HEIGHT);
    }//GEN-LAST:event_closeMenubarBtActionPerformed

    private void openMenubarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenubarBtActionPerformed
        openMenubar(width, height);
    }//GEN-LAST:event_openMenubarBtActionPerformed

    private void editAccountLableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editAccountLableMouseClicked
        new AccountInfomationChange(acc, this).setVisible(true);
    }//GEN-LAST:event_editAccountLableMouseClicked

    private void logoutLableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLableMouseClicked
        new LoginFrame(username).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutLableMouseClicked

    private void profileAccountLableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileAccountLableMouseClicked
        new AccountInformation(this.acc).setVisible(true);
    }//GEN-LAST:event_profileAccountLableMouseClicked

    private void openAvailableUIButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openAvailableUIButtonActionPerformed
        new CoursesGeneral(this).setVisible(true);
    }//GEN-LAST:event_openAvailableUIButtonActionPerformed

    private void openProgressMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openProgressMenuButtonActionPerformed
        new CourseUpdate(this).setVisible(true);
    }//GEN-LAST:event_openProgressMenuButtonActionPerformed

    private void saveInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInfoButtonActionPerformed
        FileServices.writeFileExcelFromAccount(username, this.UserCourses.getArrayCourses());
    }//GEN-LAST:event_saveInfoButtonActionPerformed

    private void closeMenubar(int width, int height) {
        openMenubarBt.setVisible(true);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = width; i > 0; i--) {
                    menubar.setSize(i, height);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                    }
                }
            }
        }).start();

    }

    private void openMenubar(int width, int height) {
        openMenubarBt.setVisible(false);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= width; i++) {
                    menubar.setSize(i, height);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                    }
                }
            }
        }).start();
    }

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
    private javax.swing.JButton closeMenubarBt;
    private javax.swing.JLabel editAccountLable;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logoutLable;
    private javax.swing.JPanel menubar;
    private javax.swing.JButton openAvailableUIButton;
    private javax.swing.JButton openMenubarBt;
    private javax.swing.JButton openProgressMenuButton;
    private javax.swing.JLabel profileAccountLable;
    private javax.swing.JButton saveInfoButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleMenuLabel;
    // End of variables declaration//GEN-END:variables

}

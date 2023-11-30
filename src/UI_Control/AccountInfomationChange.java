package UI_Control;

import enity.Account;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import picture.GetImage;
import services.AccountServices;
import static services.AccountServices.getAccount;
import static services.AccountServices.updateAccountInformation;
import services.IconSize_Services;

public class AccountInfomationChange extends javax.swing.JFrame {

    public AccountInfomationChange(Account acc, MainMenu menu) {
        initComponents();
        this.acc = acc;
        showInfo();
        avatarGender();
        this.menu = menu;
        this.setLocationRelativeTo(null);
    }

    public void showInfo() {
        fullNameTextField.setText(acc.getFullName());
        usernameTextField.setText(acc.getUsername());
        studentIdTextField.setText(acc.getStudentID());
        jGenderCombo.setSelectedIndex((acc.isGender()) ? 0 : 1);
        yearAttendTextField.setText(String.valueOf(acc.getYearAttend()));
    }

    public void avatarGender() {
        if (jGenderCombo.getSelectedIndex() == 0) {
            imageAvatar.setIcon(new IconSize_Services("male1.png", imageAvatar).getIcon());
        } else {
            imageAvatar.setIcon(new IconSize_Services("female.png", imageAvatar).getIcon());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fullNameTextField = new UIcomponent.RoundJTextField();
        jLabel3 = new javax.swing.JLabel();
        usernameTextField = new UIcomponent.RoundJTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        studentIdTextField = new UIcomponent.RoundJTextField();
        jLabel5 = new javax.swing.JLabel();
        yearAttendTextField = new UIcomponent.RoundJTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        imageAvatar = new javax.swing.JLabel();
        jGenderCombo = new javax.swing.JComboBox<>();
        updateInfoButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        oldPasswordField = new UIcomponent.RoundJTextPassword();
        newPasswordField = new UIcomponent.RoundJTextPassword();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Account Information");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setBackground(new java.awt.Color(51, 153, 255));

        jPanel1.setBackground(new java.awt.Color(2, 30, 68));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(221, 196, 136));
        jLabel1.setText("Full name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(221, 196, 136));
        jLabel3.setText("Username");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(221, 196, 136));
        jLabel2.setText("Gender");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(221, 196, 136));
        jLabel4.setText("Student ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(221, 196, 136));
        jLabel5.setText("Year attend");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(2, 30, 68));
        jLabel6.setText("Update Information");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        imageAvatar.setText("jLabel8");

        jGenderCombo.setForeground(new java.awt.Color(2, 30, 68));
        jGenderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jGenderCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jGenderComboItemStateChanged(evt);
            }
        });

        updateInfoButton.setBackground(new java.awt.Color(255, 255, 255));
        updateInfoButton.setForeground(new java.awt.Color(0, 0, 0));
        updateInfoButton.setText("Update");
        updateInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInfoButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(221, 196, 136));
        jLabel8.setText("Old password");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(221, 196, 136));
        jLabel9.setText("New password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(175, 175, 175))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(yearAttendTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2))
                                            .addComponent(oldPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(newPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(updateInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jGenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(studentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(studentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(imageAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(yearAttendTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jGenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 596, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGenderComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jGenderComboItemStateChanged
        avatarGender();
    }//GEN-LAST:event_jGenderComboItemStateChanged

    private void updateInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInfoButtonActionPerformed
        String olduserID = acc.getUserID();
        String oldUsername = acc.getUsername();
        String newUsername = usernameTextField.getText();
        String oldPassword = String.valueOf(oldPasswordField.getPassword());
        String newPassword = String.valueOf(newPasswordField.getPassword());
        int newYearAttend = Integer.parseInt(yearAttendTextField.getText());
        boolean gender = (jGenderCombo.getSelectedIndex() == 0) ? true : false;
        String newFullName = fullNameTextField.getText();
        String newStudentID = studentIdTextField.getText();
        if (getAccount(newUsername) == null
                || newUsername.equals(oldUsername)) {
            if (AccountServices.getAccountByStudentID(newStudentID) == null
                    || newStudentID.equals(acc.getStudentID())) {
                if (oldPassword.equals(acc.getPassword())) {
                    int confirm = JOptionPane.showConfirmDialog(this,
                            "Are you sure to change these information",
                            "Update Information Confirm",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.YES_NO_OPTION,
                            new ImageIcon(GetImage.class.getResource("questionmark.png")));
                    if (confirm == JOptionPane.YES_OPTION) {
                        Account acc = new Account(newUsername,
                                (newPassword.equals("") ? oldPassword : newPassword),
                                newFullName,
                                newYearAttend,
                                newStudentID,
                                gender);
                        updateAccountInformation(acc, olduserID, oldUsername);
                        JOptionPane.showMessageDialog(this,
                                "Succesfully!!! Reopen the app to apply new information",
                                "Successfully",
                                JOptionPane.INFORMATION_MESSAGE,
                                new ImageIcon(GetImage.class.getResource("complete.png")));
                        this.menu.dispose();
                        this.dispose();

                    }
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Type the correct password in old password field",
                            "Wrong password",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this,
                        "This student ID existed",
                        "Same student ID",
                        JOptionPane.ERROR_MESSAGE,
                        new ImageIcon(GetImage.class.getResource("cancel.png")));
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Error this username already existed",
                    "Error",
                    JOptionPane.ERROR_MESSAGE,
                    new ImageIcon(GetImage.class.getResource("cancel.png")));
        }

    }//GEN-LAST:event_updateInfoButtonActionPerformed

    public boolean checkBlankSpace() {
        if (usernameTextField.getText().equals("")
                || oldPasswordField.getPassword().equals("")
                || fullNameTextField.getText().equals("")
                || yearAttendTextField.getText().equals("")
                || studentIdTextField.getText().equals("")) {
            return false;
        }
        return true;
    }

    private MainMenu menu;
    private Account acc;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private UIcomponent.RoundJTextField fullNameTextField;
    private javax.swing.JLabel imageAvatar;
    private javax.swing.JComboBox<String> jGenderCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private UIcomponent.RoundJTextPassword newPasswordField;
    private UIcomponent.RoundJTextPassword oldPasswordField;
    private UIcomponent.RoundJTextField studentIdTextField;
    private javax.swing.JButton updateInfoButton;
    private UIcomponent.RoundJTextField usernameTextField;
    private UIcomponent.RoundJTextField yearAttendTextField;
    // End of variables declaration//GEN-END:variables
}

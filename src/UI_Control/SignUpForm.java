package UI_Control;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import picture.GetImage;
import static services.AccountServices.addAccount;
import static services.AccountServices.getAccount;
import static services.AccountServices.getAccountByStudentID;
import services.IconSize_Services;

public class SignUpForm extends javax.swing.JFrame {

    public SignUpForm() {
        initComponents();
        avatarGender();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AllPanel = new javax.swing.JPanel();
        InfoFillPanel = new javax.swing.JPanel();
        fullNameTextField = new UIcomponent.RoundJTextField();
        fullnameLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new UIcomponent.RoundJTextField();
        passwordPasswordField = new UIcomponent.RoundJTextPassword();
        passwordLabel = new javax.swing.JLabel();
        yearAttendLabel = new javax.swing.JLabel();
        studentIDTextField = new UIcomponent.RoundJTextField();
        genderLabel = new javax.swing.JLabel();
        jGenderCombo = new javax.swing.JComboBox<>();
        studentIDLabel = new javax.swing.JLabel();
        yearAttendTextField = new UIcomponent.RoundJTextField();
        SubTitleLable = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        imageAvatarLabel = new javax.swing.JLabel();
        signupLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sign up");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AllPanel.setBackground(new java.awt.Color(2, 30, 68));

        InfoFillPanel.setBackground(new java.awt.Color(2, 30, 68));

        fullnameLabel.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        fullnameLabel.setForeground(new java.awt.Color(255, 239, 219));
        fullnameLabel.setText("Full name");

        usernameLabel.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 239, 219));
        usernameLabel.setText("Username");

        passwordLabel.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 239, 219));
        passwordLabel.setText("Password");

        yearAttendLabel.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        yearAttendLabel.setForeground(new java.awt.Color(255, 239, 219));
        yearAttendLabel.setText("Year attend");

        genderLabel.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 239, 219));
        genderLabel.setText("Gender");

        jGenderCombo.setForeground(new java.awt.Color(2, 30, 68));
        jGenderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jGenderCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jGenderComboItemStateChanged(evt);
            }
        });

        studentIDLabel.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        studentIDLabel.setForeground(new java.awt.Color(255, 239, 219));
        studentIDLabel.setText("Student ID");

        SubTitleLable.setBackground(new java.awt.Color(255, 255, 255));
        SubTitleLable.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        SubTitleLable.setForeground(new java.awt.Color(255, 239, 219));
        SubTitleLable.setText("Get yourself ready for the app!!!");

        backLabel.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        backLabel.setForeground(new java.awt.Color(255, 239, 219));
        backLabel.setText("Back");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout InfoFillPanelLayout = new javax.swing.GroupLayout(InfoFillPanel);
        InfoFillPanel.setLayout(InfoFillPanelLayout);
        InfoFillPanelLayout.setHorizontalGroup(
            InfoFillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoFillPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfoFillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfoFillPanelLayout.createSequentialGroup()
                        .addGroup(InfoFillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InfoFillPanelLayout.createSequentialGroup()
                                .addComponent(studentIDLabel)
                                .addGap(24, 24, 24)
                                .addComponent(studentIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InfoFillPanelLayout.createSequentialGroup()
                                .addComponent(yearAttendLabel)
                                .addGap(18, 18, 18)
                                .addGroup(InfoFillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(InfoFillPanelLayout.createSequentialGroup()
                                        .addComponent(yearAttendTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(genderLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jGenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoFillPanelLayout.createSequentialGroup()
                        .addGroup(InfoFillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordLabel))
                        .addGap(50, 50, 50)
                        .addComponent(SubTitleLable, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        InfoFillPanelLayout.setVerticalGroup(
            InfoFillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoFillPanelLayout.createSequentialGroup()
                .addComponent(SubTitleLable)
                .addGap(24, 24, 24)
                .addGroup(InfoFillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullnameLabel)
                    .addComponent(fullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(InfoFillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(InfoFillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(20, 20, 20)
                .addGroup(InfoFillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearAttendLabel)
                    .addComponent(yearAttendTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderLabel)
                    .addComponent(jGenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(InfoFillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIDLabel)
                    .addComponent(studentIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backLabel)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        TitleLabel.setFont(new java.awt.Font("Bodoni MT", 1, 31)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 239, 219));
        TitleLabel.setText("Welcome");

        imageAvatarLabel.setText("jLabel1");

        signupLabel.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        signupLabel.setForeground(new java.awt.Color(255, 239, 219));
        signupLabel.setText("Sign up");
        signupLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AllPanelLayout = new javax.swing.GroupLayout(AllPanel);
        AllPanel.setLayout(AllPanelLayout);
        AllPanelLayout.setHorizontalGroup(
            AllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AllPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InfoFillPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(AllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AllPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(imageAvatarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(AllPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(AllPanelLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(TitleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AllPanelLayout.setVerticalGroup(
            AllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AllPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(TitleLabel)
                .addGap(18, 18, 18)
                .addComponent(InfoFillPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(AllPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(imageAvatarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signupLabel)
                .addGap(25, 25, 25))
        );

        getContentPane().add(AllPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avatarGender() {
        if (jGenderCombo.getSelectedIndex() == 0) {
            imageAvatarLabel.setIcon(new IconSize_Services("male1.png", imageAvatarLabel).getIconAsLabelSize());
        } else {
            imageAvatarLabel.setIcon(new IconSize_Services("female.png", imageAvatarLabel).getIconAsLabelSize());
        }
    }

    private void signupLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLabelMouseClicked

        if (checkBlankSpace()) {
            String usernameText = this.usernameTextField.getText();
            String passwordText = String.valueOf(this.passwordPasswordField.getPassword());
            if (getAccount(usernameText) != null) {
                JOptionPane.showMessageDialog(this,
                        "Error this username already existed",
                        "Error",
                        JOptionPane.ERROR_MESSAGE,
                        new ImageIcon(GetImage.class.getResource("cancel.png")));
            } else {
                if (getAccountByStudentID(studentIDTextField.getText()) == null) {
                    int id = JOptionPane.showConfirmDialog(this, "Are you sure to create?");
                    if (id == JOptionPane.YES_OPTION) {
                        addAccount(usernameText,
                                passwordText,
                                fullNameTextField.getText(),
                                Integer.parseInt(yearAttendTextField.getText()),
                                studentIDTextField.getText(),
                                (jGenderCombo.getSelectedIndex() == 0) ? true : false);
                        JOptionPane.showMessageDialog(this, "Succesfull!!!");
                        new LoginFrame(usernameText).setVisible(true);
                        this.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(this,
                            "This student ID existed",
                            "Same student ID",
                            JOptionPane.ERROR_MESSAGE,
                            new ImageIcon(GetImage.class.getResource("cancel.png")));
                }

            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Please fill every box",
                    "Error",
                    JOptionPane.ERROR_MESSAGE,
                    new ImageIcon(GetImage.class.getResource("cancel.png")));
        }
    }//GEN-LAST:event_signupLabelMouseClicked

    private void jGenderComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jGenderComboItemStateChanged
        avatarGender();
    }//GEN-LAST:event_jGenderComboItemStateChanged

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        new LoginFrame("").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backLabelMouseClicked

    private boolean checkBlankSpace() {
        if (usernameTextField.getText().equals("")
                || String.valueOf(passwordPasswordField.getPassword()).equals("")
                || fullNameTextField.getText().equals("")
                || yearAttendTextField.getText().equals("")
                || studentIDTextField.getText().equals("")) {
            return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AllPanel;
    private javax.swing.JPanel InfoFillPanel;
    private javax.swing.JLabel SubTitleLable;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel backLabel;
    private UIcomponent.RoundJTextField fullNameTextField;
    private javax.swing.JLabel fullnameLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel imageAvatarLabel;
    private javax.swing.JComboBox<String> jGenderCombo;
    private javax.swing.JLabel passwordLabel;
    private UIcomponent.RoundJTextPassword passwordPasswordField;
    private javax.swing.JLabel signupLabel;
    private javax.swing.JLabel studentIDLabel;
    private UIcomponent.RoundJTextField studentIDTextField;
    private javax.swing.JLabel usernameLabel;
    private UIcomponent.RoundJTextField usernameTextField;
    private javax.swing.JLabel yearAttendLabel;
    private UIcomponent.RoundJTextField yearAttendTextField;
    // End of variables declaration//GEN-END:variables
}

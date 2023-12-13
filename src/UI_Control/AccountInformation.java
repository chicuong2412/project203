package UI_Control;

import enity.Account;
import java.awt.Image;
import javax.swing.ImageIcon;
import picture.GetImage;
import static services.AccountServices.getAccountGPA;
import static services.CourseServices.getListByStatusCourses;
import services.IconSize_Services;
import static userDAO.AllUserProgress.getListCourses;

public class AccountInformation extends javax.swing.JFrame {

    public AccountInformation(Account acc) {
        initComponents();
        this.acc = acc;
        showInfo();
        if (acc.isGender()) {
            imageAvatarLabel.setIcon(new IconSize_Services("male1.png", imageAvatarLabel).getIconAsLabelSize());
        } else {
            imageAvatarLabel.setIcon(new IconSize_Services("female.png", imageAvatarLabel).getIconAsLabelSize());
        }
        ImageIcon icon = new ImageIcon(GetImage.class.getResource("information_icon.png"));
        Image image = icon.getImage();
        this.setIconImage(image);
        this.setLocationRelativeTo(null);
    }

    private void showInfo() {
        fullNameTextField.setText(acc.getFullName());
        usernameTextField.setText(acc.getUsername());
        studentIdTextField.setText(acc.getStudentID());
        genderTextField.setText((acc.isGender() == true) ? "Male" : "Female");
        yearAttendTextField.setText(String.valueOf(acc.getYearAttend()));
        double GPA = getAccountGPA(
                getListByStatusCourses(
                        getListCourses(this.acc), true));
        String text = String.format("%.2f", GPA);
        GPATextField.setText((text.equalsIgnoreCase("NaN"))?"0.0":text);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JLayeredPane();
        infoPanel = new javax.swing.JPanel();
        fullnameLabel = new javax.swing.JLabel();
        fullNameTextField = new UIcomponent.RoundJTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new UIcomponent.RoundJTextField();
        genderTextField = new UIcomponent.RoundJTextField();
        genderLabel = new javax.swing.JLabel();
        studentIDLabel = new javax.swing.JLabel();
        studentIdTextField = new UIcomponent.RoundJTextField();
        yearAttendLabel = new javax.swing.JLabel();
        yearAttendTextField = new UIcomponent.RoundJTextField();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        imageAvatarLabel = new javax.swing.JLabel();
        GPATextField = new UIcomponent.RoundJTextField();
        GPAlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Account Information");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(51, 153, 255));

        infoPanel.setBackground(new java.awt.Color(2, 30, 68));

        fullnameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fullnameLabel.setForeground(new java.awt.Color(221, 196, 136));
        fullnameLabel.setText("Full name");

        fullNameTextField.setEditable(false);

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(221, 196, 136));
        usernameLabel.setText("Username");

        usernameTextField.setEditable(false);

        genderTextField.setEditable(false);

        genderLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(221, 196, 136));
        genderLabel.setText("Gender");

        studentIDLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        studentIDLabel.setForeground(new java.awt.Color(221, 196, 136));
        studentIDLabel.setText("Student ID");

        studentIdTextField.setEditable(false);

        yearAttendLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        yearAttendLabel.setForeground(new java.awt.Color(221, 196, 136));
        yearAttendLabel.setText("Year attend");

        yearAttendTextField.setEditable(false);

        titlePanel.setBackground(new java.awt.Color(204, 204, 204));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(2, 30, 68));
        titleLabel.setText("Your information");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imageAvatarLabel.setText("avatar");

        GPATextField.setEditable(false);
        GPATextField.setForeground(new java.awt.Color(0, 0, 0));

        GPAlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GPAlabel.setForeground(new java.awt.Color(221, 196, 136));
        GPAlabel.setText("GPA");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearAttendLabel)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentIDLabel)
                            .addComponent(usernameLabel)
                            .addComponent(fullnameLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addComponent(studentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addComponent(genderLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addComponent(GPAlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(GPATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearAttendTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
            .addComponent(titlePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fullnameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabel)
                            .addComponent(genderLabel)
                            .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(GPAlabel)
                                .addComponent(GPATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(studentIDLabel)
                                .addComponent(studentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(imageAvatarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearAttendLabel)
                    .addComponent(yearAttendTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        mainPanel.setLayer(infoPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 596, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Account acc;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private UIcomponent.RoundJTextField GPATextField;
    private javax.swing.JLabel GPAlabel;
    private UIcomponent.RoundJTextField fullNameTextField;
    private javax.swing.JLabel fullnameLabel;
    private javax.swing.JLabel genderLabel;
    private UIcomponent.RoundJTextField genderTextField;
    private javax.swing.JLabel imageAvatarLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLayeredPane mainPanel;
    private javax.swing.JLabel studentIDLabel;
    private UIcomponent.RoundJTextField studentIdTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JLabel usernameLabel;
    private UIcomponent.RoundJTextField usernameTextField;
    private javax.swing.JLabel yearAttendLabel;
    private UIcomponent.RoundJTextField yearAttendTextField;
    // End of variables declaration//GEN-END:variables
}

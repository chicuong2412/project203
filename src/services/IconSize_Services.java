package services;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import picture.GetImage;



public class IconSize_Services {
    
    private String path;
    private Icon icon;
    private JLabel lable;

    public IconSize_Services(String path, JLabel lable){
        this.path = path;
        this.lable = lable;
    }
    
    public Icon getIcon(){
        ImageIcon imageIcon = new ImageIcon(GetImage.class.getResource(path));
        Image image = imageIcon.getImage();
        Image imgScale = image.getScaledInstance(lable.getWidth(), lable.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon tempt = new ImageIcon(imgScale);
        return tempt;
    }
    
}

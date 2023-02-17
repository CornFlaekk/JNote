import java.awt.Font;

import javax.security.auth.callback.TextInputCallback;
import javax.swing.*;

public class About extends JFrame{
    
    About(){
        setBounds(100,100,500,400);
        setTitle("About JNote");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ImageIcon icon = new ImageIcon(getClass().getResource("peepo.png"));
        setIconImage(icon.getImage());
        
        setLayout(null);

        JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource("peepo.png")));
        iconLabel.setBounds(100,50,100,100);
        add(iconLabel);

        JLabel textLabel = new JLabel("<html><br>JNote by CornFlaekk</br></html>");
        textLabel.setBounds(100,50,350,300);
        textLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,16));
        add(textLabel); 

    }

    public static void main(String[] args){
        new About().setVisible(true);
    }

}

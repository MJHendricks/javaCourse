import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {

    myFrame() {
        // create label
        JLabel label = new JLabel();
        label.setText("Hello");
        this.add(label);

        //add image to frame
        ImageIcon image = new ImageIcon("logo.png");

        label.setIcon(image);

        label.setHorizontalTextPosition(JLabel.CENTER); // LEFT, CENTER OR RIGHT OF IMAGE
        label.setVerticalTextPosition(JLabel.TOP); // TOP, CENTER, BOTTON OF IMAGE

        // text styling
        label.setForeground(new Color(0x00AAFF)); //text color
        label.setFont(new Font("MV Boli",Font.BOLD, 20));

        //setup frame
        this.setTitle("GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ALLOWS X TO CLOSE APPLICATION
        this.setSize(420,360); // set x and y
        this.setVisible(true); // make frame visible

        // change icon
        ImageIcon icon = new ImageIcon("logo.png");
        this.setIconImage(icon.getImage());

//        change bg color
        this.getContentPane().setBackground(new Color(255,255,255));


    }

}

package gui;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;


public class MyButton extends JButton {

    
    public MyButton(){
        this.setBackground(Color.DARK_GRAY);
        this.setVisible(true);
        this.setText("");
        this.setFont(new Font("Segoe Print", Font.PLAIN, 80));
        this.setFocusPainted(false);         
    }
}

package gui;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;


public class PanelScore extends JPanel {


	public PanelScore(){
        this.setPreferredSize(new Dimension(600, 42));
		this.setBackground(Color.DARK_GRAY);
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 0));
    }
    
}

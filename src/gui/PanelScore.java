package gui;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;


public class PanelScore extends JPanel {


	public PanelScore(){
        this.setPreferredSize(new Dimension(600, 30));
		this.setBackground(Color.DARK_GRAY);
		this.setLayout(new GridLayout(1, 4, 0, 0));
    }
    
}

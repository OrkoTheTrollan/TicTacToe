package gui;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;

public class PanelGame extends JPanel {
	
	

    public PanelGame(){
        this.setPreferredSize(new Dimension(600, 600));
		this.setBackground(Color.DARK_GRAY);
		this.setLayout(new GridLayout(3, 3, 2, 2));
 
        }
    }
    
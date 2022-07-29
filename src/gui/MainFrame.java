package gui;


import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;



public class MainFrame extends JFrame{

	
	public MainFrame(PanelScore ps, PanelGame pg, MyMenu mm) {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(615, 704);
		this.setTitle("TicTacToe");
		this.setBackground(Color.BLACK);
		this.setResizable(false);
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		ImageIcon icon = new ImageIcon("src/images/tictactoe.png");
        this.setIconImage(icon.getImage());
		this.setLocationRelativeTo(null);
		
		this.add(mm);
		this.add(ps);
        this.add(pg);
		this.setVisible(true);
	}

	
}

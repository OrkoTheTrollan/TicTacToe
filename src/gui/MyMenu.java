package gui;

import java.awt.event.KeyEvent;
import javax.swing.*;


public class MyMenu extends JMenuBar{
	
	
	JMenu fileMenu;
	JMenu helpMenu;	
	
	public JMenuItem restartItem;
	public JMenuItem exitItem;
	
	
	
	public MyMenu() {

		
		fileMenu = new JMenu("File");
		helpMenu = new JMenu("Help");
		
		fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F for File
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H for Help
		
		restartItem = new JMenuItem("Restart");
		exitItem = new JMenuItem("Exit");
		
		restartItem.setMnemonic(KeyEvent.VK_R); // R for Restart // Setting keyboard shortcut to the load menu // Mnemonic = Gedächtnisstütze
		exitItem.setMnemonic(KeyEvent.VK_E); // E for Exit // Setting keyboard shortcut to the load menu
		
		fileMenu.add(restartItem);
		fileMenu.add(exitItem);
		
		this.add(fileMenu);
		this.add(helpMenu);
		this.setVisible(true);
	}
}
 
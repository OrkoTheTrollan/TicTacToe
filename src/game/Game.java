package game;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import gui.MainFrame;
import gui.MyButton;
import gui.MyMenu;
import gui.PanelGame;
import gui.PanelScore;

public class Game implements ActionListener {

    private int score1 = 0;
    private int score2 = 0;

    PanelScore ps = new PanelScore();
	PanelGame pg = new PanelGame();
	MyMenu mm = new MyMenu();
	MainFrame mf = new MainFrame(ps, pg, mm);
    MyButton[] button = new MyButton[9];
    int moveCount = 0;
    Random random = new Random();
    int player = 1;


    public Game(int sc1, int sc2) {
        score1 = sc1;
        score2 = sc2;
        
        JLabel pl1 = new JLabel("Player One");
		pl1.setForeground(Color.WHITE);
		pl1.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		JLabel pl2 = new JLabel("Player Two");
		pl2.setForeground(Color.WHITE);
		pl2.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		JLabel s1 = new JLabel(Integer.toString(score1));
		s1.setForeground(new Color(0xe03641));
		s1.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		JLabel s2 = new JLabel(Integer.toString(score2));
		s2.setForeground(new Color(0x28bcde));
		s2.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		ps.add (pl1);
		ps.add (s1);
		ps.add (pl2);
		ps.add (s2);

        mm.restartItem.addActionListener(this);
		mm.exitItem.addActionListener(this);
    
        for (int i = 0; i < 9; i++) {
            button[i] = new MyButton();
            pg.add(button[i]);
            button[i].addActionListener(this);      
        }
        pg.revalidate();

        startGame(); 
    } 

    public void startGame() {

       int move=random.nextInt(100);

        if (move%2 == 0) {
            player = 1;
            JOptionPane.showMessageDialog(mf, "Player 1 (x) begins!");
        } else {
            player = 2;
            JOptionPane.showMessageDialog(mf, "Player 2 (o) begins!");
        }
    } 

    public void gameOver(String s){
        Object[] option={"New round","Exit"};
        int n=JOptionPane.showOptionDialog(mf, "Game Over\n"+s,"Game Over",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, option,option[0]);
        if(n==0){
            mf.dispose();
            new Game(score1, score2); 
        }
        else{
            mf.dispose();
        }
    
    }

    public void checkForWinner() {
        if ((button[0].getText() == "X") && (button[1].getText() == "X") && (button[2].getText() == "X")) {
            pl1Wins(0, 1, 2);
        }
        else if ((button[0].getText() == "X") && (button[4].getText() == "X") && (button[8].getText() == "X")) {
            pl1Wins(0, 4, 8);
        }
        else if ((button[0].getText() == "X") && (button[3].getText() == "X") && (button[6].getText() == "X")) {
            pl1Wins(0, 3, 6);
        }
        else if ((button[1].getText() == "X") && (button[4].getText() == "X") && (button[7].getText() == "X")) {
            pl1Wins(1, 4, 7);
        }
        else if ((button[2].getText() == "X") && (button[4].getText() == "X") && (button[6].getText() == "X")) {
            pl1Wins(2, 4, 6);
        }
        else if ((button[2].getText() == "X") && (button[5].getText() == "X") && (button[8].getText() == "X")) {
            pl1Wins(2, 5, 8);
        }
       else if ((button[3].getText() == "X") && (button[4].getText() == "X") && (button[5].getText() == "X")) {
            pl1Wins(3, 4, 5);
        }
       else if ((button[6].getText() == "X") && (button[7].getText() == "X") && (button[8].getText() == "X")) {
            pl1Wins(6, 7, 8);
        }
      
        else if ((button[0].getText() == "O") && (button[1].getText() == "O") && (button[2].getText() == "O")) {
            pl2Wins(0, 1, 2);
        }
        else if ((button[0].getText() == "O") && (button[3].getText() == "O") && (button[6].getText() == "O")) {
            pl2Wins(0, 3, 6);
        }
        else if ((button[0].getText() == "O") && (button[4].getText() == "O") && (button[8].getText() == "O")) {
            pl2Wins(0, 4, 8);
        }
        else if ((button[1].getText() == "O") && (button[4].getText() == "O") && (button[7].getText() == "O")) {
            pl2Wins(1, 4, 7);
        }
        else if ((button[2].getText() == "O") && (button[4].getText() == "O") && (button[6].getText() == "O")) {
            pl2Wins(2, 4, 6);
        }
        else if ((button[2].getText() == "O") && (button[5].getText() == "O") && (button[8].getText() == "O")) {
            pl2Wins(2, 5, 8);
        }
        else if ((button[3].getText() == "O") && (button[4].getText() == "O") && (button[5].getText() == "O")) {
            pl2Wins(3, 4, 5);
        } else if ((button[6].getText() == "O") && (button[7].getText() == "O") && (button[8].getText() == "O")) {
            pl2Wins(6, 7, 8);
        }
        else if(moveCount==9) {
             gameOver("Nobody scores!");
        }
    }

    public void pl1Wins(int x1, int x2, int x3) {
        button[x1].setBackground(new Color(0xe03641));
        button[x2].setBackground(new Color(0xe03641));
        button[x3].setBackground(new Color(0xe03641));

        for (int i = 0; i < 9; i++) {
            button[i].setEnabled(false);
        }
        score1 = score1 + 1;
        gameOver("Player 1 wins");
    }

    public void pl2Wins(int o1, int o2, int o3) {
        button[o1].setBackground(new Color(0x28bcde));
        button[o2].setBackground(new Color(0x28bcde));
        button[o3].setBackground(new Color(0x28bcde));

        for (int i = 0; i < 9; i++) {
            button[i].setEnabled(false);
        }
        score2 = score2 + 1;
        gameOver("Player 2 wins");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == button[i]) {
                if (player == 1) {
                    if (button[i].getText() == "") {
                        button[i].setForeground(new Color(0xe03641));
                        button[i].setText("X");
                        player = 2;
                        moveCount++;
                        checkForWinner();
                    }
                } else {
                    if (button[i].getText() == "") {
                        button[i].setForeground(new Color(0x28bcde));
                        button[i].setText("O");
                        player = 1;
                        moveCount++;
                        checkForWinner();
                    }
                }
            }
        }	

        if(e.getSource() == mm.restartItem) {
			System.out.println("Game starts again");
            mf.dispose();
            new Game(0,0);
		} 
        else if(e.getSource() == mm.exitItem) {
			System.exit(0);
		}	
    }

}
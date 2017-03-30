package edu.wmich.cs1120.la5;

import javax.swing.JOptionPane;

import edu.wmich.cs1120.la5.gui.MainWindow;

public class LA5Main {

	public static void main(String[] args) {
		char userIn = 'y';
		while( userIn == 'y'||userIn=='Y'){
		
		
		MainWindow.startGUI();
		
		userIn=JOptionPane.showInputDialog("Do again? yes or no").charAt(0);
		}
		

	}

}

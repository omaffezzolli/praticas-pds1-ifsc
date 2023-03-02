package Exercicios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {
		
		
		
	    ArrayList<String> exibir = new ArrayList();
		
		for (int i = 0; i < 10; i++) {
		String num =	JOptionPane.showInputDialog("Insira um elemento");
			
			
			exibir.add(num);
		}
		
		JOptionPane.showMessageDialog(null, exibir);
		
	
			
		}
		

	}



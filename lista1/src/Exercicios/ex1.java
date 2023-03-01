package Exercicios;

import javax.swing.JOptionPane;

public class ex1 {
	
	public static void main(String[] args){
		
		double precolitro = 0;
		Integer qtdlitro = 0;
		
		precolitro = Double.valueOf(JOptionPane.showInputDialog("Insira o valor da gasolina"));
		qtdlitro = Integer.valueOf(JOptionPane.showInputDialog("Insira a quantidade da gasolina"));
		
		JOptionPane.showMessageDialog(null, "Preço total: " +calctotal(qtdlitro, precolitro));
	}
	
	public static Double calctotal (Integer qtdlitro, Double precolitro){
		Double totalpag = qtdlitro * precolitro;
		return totalpag;
	}

}

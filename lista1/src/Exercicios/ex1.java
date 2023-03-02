package Exercicios;

import javax.swing.JOptionPane;

public class ex1 {
	
	public static void main(String[] args){
		
		double pl = 0;
		Integer qtdl = 0;
		
		pl = Double.valueOf(JOptionPane.showInputDialog("Insira o valor da gasolina"));
		qtdl = Integer.valueOf(JOptionPane.showInputDialog("Insira a quantidade da gasolina"));
		
		JOptionPane.showMessageDialog(null, "Preço total: " +calctotal(qtdl, pl));
	}
	
	public static Double calctotal (Integer qtdl, Double pl){
		Double totalpag = qtdl * pl;
		return totalpag;
	}

}

package Exercicios;

import javax.swing.JOptionPane;

public class ex3 {
	
	public static void main(String[] args){
		
		double nota1;
		double nota2;
		double nota3;
		
		nota1 = Double.valueOf(JOptionPane.showInputDialog("Insira a nota"));
		nota2 = Double.valueOf(JOptionPane.showInputDialog("Insira a nota"));
		nota3 = Double.valueOf(JOptionPane.showInputDialog("Insira a nota"));
		
		JOptionPane.showMessageDialog(null, "Media final: " +mediafinal(nota1, nota2, nota3));

}
	public static Double mediafinal (double nota1, double nota2, double nota3){
		Double mf = (nota1 + nota2 + nota3)/3;
		
		if(mf >= 6) {
			System.out.println("Aprovado");
		} if ((mf >= 4 ) && (mf < 6)){
			System.out.println("Recuperação");
		} if  (mf < 4){
			System.out.println("Reprovado");
		}
		return mf;
	
	}
	
}
    

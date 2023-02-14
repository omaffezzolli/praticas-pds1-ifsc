package aula1controle;

import java.util.ArrayList;

import modelo.Funcionario;

public class FuncionarioDAO {
	
	private static ArrayList<Funcionario> listafuncionario;
	
	
	public FuncionarioDAO() {
		listafuncionario = new 	ArrayList<>();
	}
	
	public boolean inserir(Funcionario func) {
		listafuncionario.add(func);
		return false;
	}
	
	public ArrayList<Funcionario> listar(){
		return listafuncionario;
	}
	
	public FuncionarioDAO getInstance() {
		return null;
	}

}

package Exercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ex4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex4 frame = new ex4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ex4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 111, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(149, 11, 111, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnadicao = new JButton("Adição");
		btnadicao.setBounds(10, 42, 111, 23);
		contentPane.add(btnadicao);
		
		JButton btnsubtracao = new JButton("Subtração");
		btnsubtracao.setBounds(149, 42, 111, 23);
		contentPane.add(btnsubtracao);
		
		JButton btndivisao = new JButton("Divisão");
		btndivisao.setBounds(10, 76, 111, 23);
		contentPane.add(btndivisao);
		
		JButton btnmultiplicacao = new JButton("Multiplicação");
		btnmultiplicacao.setBounds(149, 76, 111, 23);
		contentPane.add(btnmultiplicacao);
	}
}

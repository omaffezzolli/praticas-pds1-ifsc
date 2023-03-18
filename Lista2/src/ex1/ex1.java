package ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ex1 extends JFrame {

	private JPanel contentPane;
	private JTextField textnum;
	private JTextField textresult;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex1 frame = new ex1();
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
	public ex1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textnum = new JTextField();
		textnum.setBounds(52, 38, 86, 20);
		contentPane.add(textnum);
		textnum.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numero");
		lblNewLabel.setBounds(52, 13, 46, 14);
		contentPane.add(lblNewLabel);
		
		textresult = new JTextField();
		textresult.setEditable(false);
		textresult.setBounds(184, 38, 86, 20);
		contentPane.add(textresult);
		textresult.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(184, 13, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		ArrayList <Double> cadastrar = new ArrayList<>();
		Double numero = Double.valueOf(textnum.getText());
		
		JButton btncadastrar = new JButton("Cadastrar");
		btncadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cadastrar.add(numero);
			}
		});
		btncadastrar.setBounds(52, 84, 89, 23);
		contentPane.add(btncadastrar);
		
		JButton btnexibir = new JButton("Exibir");
		btnexibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double count = 0.0;
				for (int i = 0; i < numero; i++) {
					if (numero/2 == 0) {
						count ++;
						JOptionPane.showMessageDialog(null, count);
					}
				}
			}
		});
		btnexibir.setBounds(181, 84, 89, 23);
		contentPane.add(btnexibir);
	}
}

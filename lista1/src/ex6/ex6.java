package ex6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex6 extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textNota2;
	private JTextField textNota1;
	private JTextField textNota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex6 frame = new ex6();
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
	public ex6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textName = new JTextField();
		textName.setBounds(106, 11, 86, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textNota2 = new JTextField();
		textNota2.setBounds(106, 78, 86, 20);
		contentPane.add(textNota2);
		textNota2.setColumns(10);
		
		textNota1 = new JTextField();
		textNota1.setBounds(10, 78, 86, 20);
		contentPane.add(textNota1);
		textNota1.setColumns(10);
		
		textNota3 = new JTextField();
		textNota3.setBounds(201, 78, 86, 20);
		contentPane.add(textNota3);
		textNota3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome ");
		lblNewLabel.setBounds(133, 42, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota1");
		lblNewLabel_1.setBounds(30, 109, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 2");
		lblNewLabel_2.setBounds(133, 109, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nota 3");
		lblNewLabel_3.setBounds(224, 109, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textName.getText();
				Double n1 = Double.valueOf(textNota1.getText());
				Double n2 = Double.valueOf(textNota2.getText());
				Double n3 = Double.valueOf(textNota3.getText());
				
				double mediaf = (n1 + n2 + n3)/3.0;
				
				if (mediaf<0 && mediaf>10) {
					JOptionPane.showMessageDialog(btnCalc, "Erro, valor invalido");
				}
				if (mediaf > 0 && mediaf < 6) {
					JOptionPane.showMessageDialog(btnCalc, "Reprovado");
				}
				if (mediaf <= 10 && mediaf >= 6) {
					JOptionPane.showMessageDialog(btnCalc, "Aprovado");
				}

				
			}
		});
		btnCalc.setBounds(297, 77, 89, 23);
		contentPane.add(btnCalc);
	}

}

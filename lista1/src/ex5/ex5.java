package ex5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex5 extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex5 frame = new ex5();
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
	public ex5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		text1 = new JTextField();
		text1.setBounds(10, 11, 86, 20);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setBounds(106, 11, 86, 20);
		contentPane.add(text2);
		text2.setColumns(10);
		
		text3 = new JTextField();
		text3.setBounds(202, 11, 86, 20);
		contentPane.add(text3);
		text3.setColumns(10);
		
		JButton btnconfirma = new JButton("Confirma");
		btnconfirma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double l1 = Double.valueOf(text1.getText());
				double l2 = Double.valueOf(text2.getText());
				double l3 = Double.valueOf(text3.getText());
				
				if ((l1 == l2) && (l1 ==l3)) {
					JOptionPane.showMessageDialog(btnconfirma, "Triangulo equilatero");
				}
				if (((l1 == l2) && (l1 != l2)) || ((l2 != l1 ) && (l2 == l3 )) || ((l1 == l3 ) && (l1 != l2))){
					JOptionPane.showMessageDialog(btnconfirma, "Triangulo isoceles");
				}
				if ((l1 != l2 ) && (l1 != l3) && (l2 != l3)) {
					JOptionPane.showMessageDialog(btnconfirma, "Triangulo escaleno");
				}

			}
		});
		btnconfirma.setBounds(298, 10, 89, 23);
		contentPane.add(btnconfirma);
		
		JLabel lblNewLabel = new JLabel("Lado 1");
		lblNewLabel.setBounds(41, 42, 32, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lado 2");
		lblNewLabel_1.setBounds(134, 42, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lado 3");
		lblNewLabel_2.setBounds(230, 42, 46, 14);
		contentPane.add(lblNewLabel_2);
	}
}

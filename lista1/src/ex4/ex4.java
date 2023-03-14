package ex4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex4 extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;

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
		
		text1 = new JTextField();
		text1.setBounds(27, 11, 107, 20);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setBounds(170, 11, 110, 20);
		contentPane.add(text2);
		text2.setColumns(10);
		
		JButton btnsoma = new JButton("Soma");
		btnsoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long inp1 = Long.valueOf(text1.getText());
				Long inp2 = Long.valueOf(text2.getText());

		        Long soma = inp1 + inp2;
		        
		        JOptionPane.showMessageDialog(btnsoma, "A soma é: " +soma);
			}
		});
		btnsoma.setBounds(24, 42, 110, 23);
		contentPane.add(btnsoma);
		
		JButton btnsubtração = new JButton("Subtração");
		btnsubtração.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Long inp1 = Long.valueOf(text1.getText());
				Long inp2 = Long.valueOf(text2.getText());

		        Long subtracao = inp1 / inp2;
		        
		        JOptionPane.showMessageDialog(btnsubtração, "A divisão é: " +subtracao);
			}
		});
		btnsubtração.setBounds(170, 42, 110, 23);
		contentPane.add(btnsubtração);
		
		JButton btndivisão = new JButton("Divisão");
		btndivisão.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long inp1 = Long.valueOf(text1.getText());
				Long inp2 = Long.valueOf(text2.getText());

		        Long divisao = inp1 / inp2;
		        
		        JOptionPane.showMessageDialog(btndivisão, "A divisão é: " +divisao);

			}
		});
		btndivisão.setBounds(24, 76, 110, 23);
		contentPane.add(btndivisão);
		
		JButton btnmultiplicaçao = new JButton("Multiplicação");
		btnmultiplicaçao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Long inp1 = Long.valueOf(text1.getText());
				Long inp2 = Long.valueOf(text2.getText());

		        Long multiplicaçao = inp1 * inp2;
		        
		        JOptionPane.showMessageDialog(btnmultiplicaçao, "A multiplicação é: " +multiplicaçao);
			}
		});
		btnmultiplicaçao.setBounds(170, 76, 110, 23);
		contentPane.add(btnmultiplicaçao);
	}
}

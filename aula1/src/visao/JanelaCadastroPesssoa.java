package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import aula1controle.FuncionarioDAO;
import modelo.Funcionario;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCadastroPesssoa extends JFrame {

	private JPanel contentPane;
	private JTextField textnome;
	private JTextField textcpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastroPesssoa frame = new JanelaCadastroPesssoa();
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
	public JanelaCadastroPesssoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textnome = new JTextField();
		textnome.setBounds(128, 11, 86, 27);
		contentPane.add(textnome);
		textnome.setColumns(10);
		
		textcpf = new JTextField();
		textcpf.setBounds(128, 49, 86, 27);
		contentPane.add(textcpf);
		textcpf.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome do funcionario");
		lblNewLabel.setBounds(10, 17, 115, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cpf do funcionario");
		lblNewLabel_1.setBounds(10, 55, 102, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textnome.getText(); 
				String cpf = textcpf.getText();
				
				if(nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum nome preenchido");
				}
				if(cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum cpf preenchido");
				}
				Funcionario func = new Funcionario();
				func.setNome(nome);
				func.setCpf(Long.valueOf(cpf));
				
				FuncionarioDAO bdPessoa = FuncionarioDAO.getInstance();
				bdPessoa.inserir(func);
			}
		});
		btnNewButton.setBounds(128, 87, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
		
	}
}

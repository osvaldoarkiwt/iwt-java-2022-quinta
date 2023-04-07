package projetografico.tela;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import projetografico.modelo.Aluno;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField campoId;
	private JTextField campoNome;
	private JTextField campoEndereco;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tela Aluno");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(0, 26, 654, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("id:");
		lblNewLabel_1.setBounds(10, 52, 68, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("nome:");
		lblNewLabel_2.setBounds(10, 83, 68, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("endereço:");
		lblNewLabel_3.setBounds(10, 117, 68, 14);
		contentPane.add(lblNewLabel_3);
		
		campoId = new JTextField();
		campoId.setBounds(83, 49, 86, 20);
		contentPane.add(campoId);
		campoId.setColumns(10);
				
		campoNome = new JTextField();
		campoNome.setBounds(83, 80, 153, 20);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		campoEndereco = new JTextField();
		campoEndereco.setBounds(83, 114, 153, 20);
		contentPane.add(campoEndereco);
		campoEndereco.setColumns(10);
		
		JButton botao01 = new JButton("mostrar dados");
		botao01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Aluno a01 = new Aluno();
				
				String id = campoId.getText();
				String nome = campoNome.getText();
				LocalDate dataDeNascimento = LocalDate.now();
				String endereco = campoEndereco.getText();
				
				a01.setId(Long.parseLong(id));
				a01.setNome(nome);
				a01.setDataDeNascimento(dataDeNascimento);
				a01.setEndereco(endereco);
				
				JOptionPane.showMessageDialog(rootPane,a01);
				
				Object[] linha = new Object[]{id,nome,endereco};
				
				((DefaultTableModel) table.getModel()).addRow(linha);
				
				limparFormulario(campoNome, campoId, campoEndereco);
				
			}
		});
		botao01.setBounds(10, 192, 153, 23);
		contentPane.add(botao01);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(255, 51, 389, 266);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "nome", "endere\u00E7o"
			}
		) {
			Class[] columnTypes = new Class[] {
				Long.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton limpa = new JButton("limpar tabela");
		limpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpaTela(table);
			}
		});
		limpa.setBounds(10, 236, 153, 23);
		contentPane.add(limpa);
	}
	
	public static void limpaTela(JTable table) {
		((DefaultTableModel) table.getModel()).setNumRows(0); 
	}
	
	public static void limparFormulario(JTextField j1,JTextField j2,JTextField j3) {
		j1.setText("");
		j2.setText("");
		j3.setText("");
	}
}

package projetografico.tela;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import projetografico.dao.AlunoDao;
import projetografico.modelo.Aluno;

public class Tela03 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	AlunoDao dao = new AlunoDao();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela03 frame = new Tela03();
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
	public Tela03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label01 = new JLabel("id:");
		label01.setBounds(10, 34, 84, 14);
		contentPane.add(label01);
		
		textField = new JTextField();
		textField.setBounds(90, 31, 155, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label02 = new JLabel("nome:");
		label02.setBounds(10, 82, 84, 14);
		contentPane.add(label02);
		
		textField_1 = new JTextField();
		textField_1.setBounds(90, 79, 155, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label03 = new JLabel("endereço:");
		label03.setBounds(10, 132, 72, 14);
		contentPane.add(label03);
		
		textField_2 = new JTextField();
		textField_2.setBounds(90, 129, 155, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnEnviar = new JButton("salvar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Aluno a01 = new Aluno();
				
				a01.setNome(Optional.of(textField_1.getText()).orElse("vazio"));
				a01.setEndereco(Optional.of(textField_2.getText()).orElse("vazio02"));
				
				dao.matricularAluno(a01);
				
				limparFormulario(textField, textField_1, textField_2);
	
				popularTabela(dao, table);	
				
				JOptionPane.showMessageDialog(getParent(), "Aluno adicionado com sucesso");
			}
		});
		btnEnviar.setBounds(10, 221, 89, 23);
		contentPane.add(btnEnviar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(269, 31, 369, 270);
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
		
		popularTabela(dao, table);
		
	}
	
	public static void limparFormulario(JTextField j1,JTextField j2,JTextField j3) {
		j1.setText("");
		j2.setText("");
		j3.setText("");
	}
	
	public static void popularTabela(AlunoDao dao, JTable table) {
		
		
		((DefaultTableModel) table.getModel()).setNumRows(0);
		
		List<Aluno> alunos = dao.retornarAlunos();
		
		alunos.stream().forEach(aluno -> {
			
			Object[] row = {aluno.getId(),aluno.getNome(),aluno.getEndereco()};
			
			((DefaultTableModel) table.getModel()).addRow(row);
		});
	}
}

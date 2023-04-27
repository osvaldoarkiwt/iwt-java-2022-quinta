package projetografico.tela;

import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FocusTraversalPolicy;
import java.awt.Font;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import projetografico.dao.AlunoDao;
import projetografico.modelo.Aluno;

public class Tela02 extends JFrame {

	private JPanel contentPane;
	private JTextField campoId;
	private JTextField campoNome;
	private JTextField campoEndereco;
	private JTable table;

	AlunoDao dao = new AlunoDao();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela02 frame = new Tela02();
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
	public Tela02() {
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
		
		JButton insere = new JButton("inserir");
		insere.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        
		    	JButton focusedButton = (JButton) KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
		    	
		    	if (e.getKeyCode() == KeyEvent.VK_ENTER && focusedButton == insere) {
		        	
		        	
		            
		        	JOptionPane.showMessageDialog(null, "Button Enviar clicked!");
		        	
		            insere.doClick();
		        }
		    }
		});
		insere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Aluno adicionado com sucesso");
				
			}
		});
		insere.setBounds(16, 294, 153, 23);
		contentPane.add(insere);
		
		JButton mostra = new JButton("mostrar dados");
		mostra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Aluno a01 = new Aluno();
				
				a01.setNome(Optional.of(campoNome.getText()).orElse("vazio"));
				a01.setEndereco(Optional.of(campoEndereco.getText()).orElse("vazio02"));
				
				dao.matricularAluno(a01);
				
				limparFormulario(campoNome, campoId, campoEndereco);

				JOptionPane.showMessageDialog(null, "Aluno adicionado com sucesso");
			}
		});
		mostra.setBounds(10, 192, 153, 23);
		contentPane.add(mostra);
		
		JButton limpa = new JButton("limpar tabela");
		limpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpaTela(table);
			}
		});
		limpa.setBounds(10, 236, 153, 23);
		contentPane.add(limpa);
		
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
		
		setFocusTraversalPolicy(new MyFocusTraversalPolicy(campoId,campoNome,campoEndereco,mostra,limpa));
		
	}
	
	public static void limpaTela(JTable table) {
		((DefaultTableModel) table.getModel()).setNumRows(0); 
	}
	
	public static void limparFormulario(JTextField j1,JTextField j2,JTextField j3) {
		j1.setText("");
		j2.setText("");
		j3.setText("");
	}
	
	private class MyFocusTraversalPolicy extends FocusTraversalPolicy{

		private ArrayList<Component> order;
		
		private MyFocusTraversalPolicy(JTextField j1,JTextField j2,JTextField j3,JButton b1, JButton b2) {
			order = new ArrayList<Component>();
			
			order.add(j1);
			order.add(j2);
			order.add(j3);
			order.add(b1);
			order.add(b2);
		}
		
		 public Component getComponentAfter(Container focusCycleRoot, Component aComponent) {
		        int idx = (order.indexOf(aComponent) + 1) % order.size();
		        return order.get(idx);
		    }

		    public Component getComponentBefore(Container focusCycleRoot, Component aComponent) {
		        int idx = order.indexOf(aComponent) - 1;
		        if (idx < 0) {
		            idx = order.size() - 1;
		        }
		        return order.get(idx);
		    }

		    public Component getDefaultComponent(Container focusCycleRoot) {
		        return order.get(0);
		    }

		    public Component getLastComponent(Container focusCycleRoot) {
		        return order.get(order.size() - 1);
		    }

		    public Component getFirstComponent(Container focusCycleRoot) {
		        return order.get(0);
		    }
	}
}

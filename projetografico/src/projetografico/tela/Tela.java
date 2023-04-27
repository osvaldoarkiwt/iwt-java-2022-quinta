package projetografico.tela;

import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FocusTraversalPolicy;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import projetografico.dao.AlunoDao;
import projetografico.modelo.Aluno;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	
	AlunoDao dao = new AlunoDao();

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
		setBounds(100, 100, 852, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(28, 32, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(28, 74, 114, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(28, 117, 114, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnEnviar = new JButton("enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				inserir(dao, textField, textField_1, textField_2, table);
				
				JOptionPane.showMessageDialog(getParent(), "Aluno salvo com sucesso!");
			}
		});
		btnEnviar.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        
		    	JButton focusedButton = (JButton) KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
		    	
		    	if (e.getKeyCode() == KeyEvent.VK_ENTER && focusedButton == btnEnviar) {
		            
		    		inserir(dao, textField, textField_1, textField_2, table);
					
					JOptionPane.showMessageDialog(getParent(), "Aluno salvo com sucesso!");
		        }
		    }
		});
		
		btnEnviar.setBounds(28, 202, 117, 25);
		contentPane.add(btnEnviar);
		
		JButton btnEditar = new JButton("editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				editar(dao, textField, textField_1, textField_2, table);
				
				JOptionPane.showMessageDialog(getParent(), "Aluno editado com sucesso!");
			}
		});
		btnEditar.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        
		    	JButton focusedButton = (JButton) KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
		    	
		    	if (e.getKeyCode() == KeyEvent.VK_ENTER && focusedButton == btnEditar) {
		            

					editar(dao, textField, textField_1, textField_2, table);
					
					JOptionPane.showMessageDialog(getParent(), "Aluno editado com sucesso!");
		        }
		    }
		});
		btnEditar.setBounds(28, 239, 117, 25);
		contentPane.add(btnEditar);
		
		JButton btnCarregar = new JButton("carregar");
		btnCarregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int indice = table.getSelectedRow();
				
				textField.setText(table.getValueAt(indice, 0).toString());
				textField_1.setText((String)table.getValueAt(indice, 1).toString());
				textField_2.setText((String)table.getValueAt(indice, 2).toString());
				
			}
		});
		btnCarregar.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        
		    	JButton focusedButton = (JButton) KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
		    	
		    	if (e.getKeyCode() == KeyEvent.VK_ENTER && focusedButton == btnCarregar) {
		        	         
		    		int indice = table.getSelectedRow();
					
					textField.setText(table.getValueAt(indice, 0).toString());
					textField_1.setText(table.getValueAt(indice, 1).toString());
					textField_2.setText(table.getValueAt(indice, 2).toString());
		        	
		        }
		    }
		});
		btnCarregar.setBounds(25, 280, 117, 25);
		contentPane.add(btnCarregar);
		
		JButton btnApagar = new JButton("apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				deletar(dao, table);
			}
		});
		btnApagar.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        
		    	JButton focusedButton = (JButton) KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
		    	
		    	if(e.getKeyCode() == KeyEvent.VK_ENTER && focusedButton == btnApagar) {
		              
		        	deletar(dao, table);
		        }
		    }
		});
		btnApagar.setBounds(25, 318, 117, 25);
		contentPane.add(btnApagar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(195, 32, 622, 252);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "nome", "endereco"
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
		/*
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(194, 318, 114, 24);
		contentPane.add(comboBox);
		
		comboBox.addItem("primeiro");
		comboBox.addItem("segundo");
		comboBox.addItem("terceiro");
		comboBox.addItem("quarto");
		
		comboBox.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent event) {
                // Do nothing
            }
            public void focusLost(FocusEvent event) {
         
                String selectedMonster = (String) comboBox.getSelectedItem();
                if (!selectedMonster.equals("primeiro")) {
                    
                    JOptionPane.showMessageDialog(null, "You selected " + selectedMonster + ".");
                }
            }
        });
		
		
		  comboBox.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent event) {
	              // Get the selected item from the JComboBox
	              String selectedMonster = (String) comboBox.getSelectedItem();
	              if (!selectedMonster.equals("Select a monster...")) {
	                    // Display a message box with the selected monster name
	                    JOptionPane.showMessageDialog(null, "You selected " + selectedMonster + ".");
	               }
               }
          }); 
		  
		 */
		
		popularTabela(dao, table);
		
		setFocusTraversalPolicy(new MyFocusTraversalPolicy(textField,textField_1,textField_2,btnEnviar,btnEditar,btnCarregar,btnApagar));
	}
	
	private class MyFocusTraversalPolicy extends FocusTraversalPolicy {
		
		private ArrayList<Component> order;

	    public MyFocusTraversalPolicy(JTextField tf1, JTextField tf2, JTextField tf3, JButton btnEnviar, JButton btnEditar, JButton btnCarregar, JButton btnApagar) {
	        order = new ArrayList<Component>();
	        order.add(tf1);
	        order.add(tf2);
	        order.add(tf3);
	        order.add(btnEnviar);
	        order.add(btnEditar);
	        order.add(btnCarregar);
	        order.add(btnApagar);
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

	public static void popularTabela(AlunoDao dao, JTable table) {
		
		
		((DefaultTableModel) table.getModel()).setNumRows(0);
		
		List<Aluno> alunos = dao.retornarAlunos();
		
		alunos.stream().forEach(aluno -> {
			
			Object[] row = {aluno.getId(),aluno.getNome(),aluno.getEndereco()};
			
			((DefaultTableModel) table.getModel()).addRow(row);
		});
	}
	
	public static void inserir(AlunoDao dao,JTextField jt1,JTextField jt2,JTextField jt3,JTable table) {		
		
		Aluno a01 = new Aluno();
		a01.setNome(Optional.of(jt2.getText()).orElse("vazio"));
		a01.setEndereco(Optional.of(jt3.getText()).orElse("vazio02"));
		
		dao.matricularAluno(a01);
		
		limparFormulario(jt1,jt2,jt3);

		limpaTabela(table);
		
		popularTabela(dao, table);	
		
	}
	
	public static void editar(AlunoDao dao,JTextField jt1,JTextField jt2,JTextField jt3,JTable table) {
		
		Long id = Long.parseLong(jt1.getText());
		
		Aluno a01 = new Aluno();
		a01.setNome(Optional.of(jt2.getText()).orElse("vazio"));
		a01.setEndereco(Optional.of(jt3.getText()).orElse("vazio02"));
		
		dao.editarAluno(id, a01);
		
		limparFormulario(jt1,jt2,jt3);

		limpaTabela(table);
		
		popularTabela(dao, table);	
		
	}
	
	public static void deletar(AlunoDao dao, JTable table) {
		
		int indice = table.getSelectedRow();
		
		Long id = (Long) table.getValueAt(indice, 0);
		
		dao.deletarAluno(id);
		
		limpaTabela(table);
		
		popularTabela(dao, table);
	}
	
	public static void limparFormulario(JTextField j1,JTextField j2,JTextField j3) {
		j1.setText("");
		j2.setText("");
		j3.setText("");
	}
	
	public static void limpaTabela(JTable table) {
		((DefaultTableModel) table.getModel()).setNumRows(0); 
	}
}

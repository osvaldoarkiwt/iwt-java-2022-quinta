package projetografico.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projetografico.conexao.ConnectionFactory;
import projetografico.modelo.Aluno;

public class AlunoDao {
	
	private Connection con;
	
	public AlunoDao() {
			con = ConnectionFactory.getConnection();
	}

	
	public void matricularAluno(Aluno aluno) {
		
		String sql = "insert into aluno(nome,endereco) values(?,?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getEndereco());
			
			stmt.execute();
			
			System.out.println("registro salvo com sucesso");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void editarAluno(Long id, Aluno aluno) {		
		
		String sql = "update aluno set nome = ?, endereco = ? where id = ?";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, aluno.getNome());
			stmt.setString(2,aluno.getEndereco());
			stmt.setLong(3, id);
			
			stmt.execute();
			
			System.out.println("aluno editado com sucesso.");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
		
	}
	
	public Aluno retornaAlunoPorId(Long id) {
		
		String sql = "select * from aluno where id = ?";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setLong(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			Aluno aluno = new Aluno();

			while(rs.next()) {
				
				aluno.setNome(rs.getString("nome"));
								
				aluno.setEndereco(rs.getString("endereco"));
			}
			
			aluno.setId(id);
			
			return aluno;
			
		} catch (SQLException e) {
			
			throw new RuntimeException("aluno não localizado",e);
		}
	}
	
	public List<Aluno> retornarAlunos(){
		
		List<Aluno> alunos = new ArrayList<>();
		
		String sql = "select * from aluno";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();

			while(rs.next()) {
				Aluno aluno = new Aluno();
				
				aluno.setId(rs.getLong("id"));
				
				aluno.setNome(rs.getString("nome"));
				
				aluno.setEndereco(rs.getString("endereco"));

				alunos.add(aluno);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return alunos;
	}
	
	public void deletarAluno(Long id) {
		
		String sql = "delete from aluno where id = ?";
	
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setLong(1, id);
			stmt.execute();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}

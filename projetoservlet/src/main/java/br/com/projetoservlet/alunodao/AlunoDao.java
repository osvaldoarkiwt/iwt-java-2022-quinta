package br.com.projetoservlet.alunodao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projetoservlet.connection.ConnectionFactory;
import br.com.projetoservlet.model.Aluno;

public class AlunoDao {

private Connection con;
	
	public AlunoDao() {
			con = ConnectionFactory.getConnection();
	}

	
	public void matricularAluno(Aluno aluno) {
		
		String sql = "insert into aluno(nome,idade,endereco,curso,turno) values(?,?,?,?,?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, aluno.getNome());
			stmt.setInt(2, aluno.getIdade());
			stmt.setString(3, aluno.getEndereco());
			stmt.setString(4, aluno.getCurso());
			stmt.setString(5, aluno.getTurno());
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void editarAluno(Long id, Aluno aluno) {		
		
		String sql = "update aluno set nome = ?,idade = ?, endereco = ?, curso = ?, turno = ? where id = ?";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, aluno.getNome());
			stmt.setInt(2, aluno.getIdade());
			stmt.setString(3,aluno.getEndereco());
			stmt.setString(4,aluno.getCurso());
			stmt.setString(5,aluno.getTurno());
			stmt.setLong(6, id);
			
			stmt.execute();
			
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
				
				aluno.setIdade(rs.getInt("idade"));
				
				aluno.setEndereco(rs.getString("endereco"));
				
				aluno.setCurso(rs.getString("curso"));
				
				aluno.setTurno(rs.getString("turno"));
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

				aluno.setIdade(rs.getInt("idade"));
				
				aluno.setEndereco(rs.getString("endereco"));

				aluno.setCurso(rs.getString("curso"));
				
				aluno.setTurno(rs.getString("turno"));
				
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

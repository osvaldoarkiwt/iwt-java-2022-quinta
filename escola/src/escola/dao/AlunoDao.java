package escola.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import escola.conexao.ConnectionFactory;
import escola.model.Aluno;

public class AlunoDao {
	
	private Connection con;
	
	public AlunoDao() {
			con = ConnectionFactory.getConnection();
	}

	
	public void matricularAluno(Aluno aluno) {
		
		String sql = "insert into aluno(nome,data_de_nascimento,endereco) values(?,?,?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, aluno.getNome());
			stmt.setDate(2, Date.valueOf(aluno.getDataDeNascimento()));
			stmt.setString(3, aluno.getEndereco());
			
			stmt.execute();
			
			System.out.println("registro salvo com sucesso");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void editarAluno(Long id, Aluno aluno) {		
		
		String sql = "update aluno set nome = ?, data_de_nascimento = ?, endereco = ? where id = ?";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, aluno.getNome());
			stmt.setDate(2, Date.valueOf(aluno.getDataDeNascimento()));
			stmt.setString(3,aluno.getEndereco());
			stmt.setLong(4, id);
			
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
				
				Date date = rs.getDate("data_de_nascimento");
		
				Instant instant = Instant.ofEpochMilli(date.getTime());
				
				LocalDate dataDeNascimento = instant.atZone(ZoneId.systemDefault()).toLocalDate();	
				
				aluno.setDataDeNascimento(dataDeNascimento);
				
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
				
				Date date = rs.getDate("data_de_nascimento");
		
				Instant instant = Instant.ofEpochMilli(date.getTime());
				
				LocalDate dataDeNascimento = instant.atZone(ZoneId.systemDefault()).toLocalDate();	
				
				aluno.setDataDeNascimento(dataDeNascimento);
				
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

		LocalDateTime deletado = LocalDateTime.now();
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setLong(1, id);
			stmt.execute();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}

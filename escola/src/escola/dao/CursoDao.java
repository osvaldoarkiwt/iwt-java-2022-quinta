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
import escola.model.Curso;
import escola.model.Curso;

public class CursoDao {
	
private Connection con;
	
	public CursoDao() {
			con = ConnectionFactory.getConnection();
	}

	
	public void registrarCurso(Curso curso) {
		
		String sql = "insert into curso(nome) values(?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, curso.getNome());
			
			stmt.execute();
			
			System.out.println("registro salvo com sucesso");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void editarCurso(Long id, Curso curso) {		
		
		String sql = "update curso set nome = ? where id = ?";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, curso.getNome());
			stmt.setLong(2, id);
			
			stmt.execute();
			
			System.out.println("curso editado com sucesso.");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
		
	}
	
	public Curso retornaCursoPorId(Long id) {
		
		String sql = "select * from curso where id = ?";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setLong(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			Curso curso = new Curso();

			while(rs.next()) {
				
				curso.setNome(rs.getString("nome"));
				
				}
			
			curso.setId(id);
			
			return curso;
			
		} catch (SQLException e) {
			
			throw new RuntimeException("aluno não localizado",e);
		}
	}
	
	public List<Curso> listarCursos(){
		
		List<Curso> cursos = new ArrayList<>();
		
		String sql = "select * from curso";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();

			while(rs.next()) {
				Curso curso = new Curso();
				
				curso.setId(rs.getLong("id"));
				
				curso.setNome(rs.getString("nome"));
				
				cursos.add(curso);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return cursos;
	}
	
	public void deletarCurso(Long id) {
		
		String sql = "delete from curso where id = ?";

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

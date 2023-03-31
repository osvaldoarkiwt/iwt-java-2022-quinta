package escola.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import escola.conexao.ConnectionFactory;
import escola.model.Aluno;
import escola.model.Turma;

public class TurmaDao {

	private AlunoDao aDao;
	
	private CursoDao cDao;
	
	private Connection con;
	
	public TurmaDao() {
		con = ConnectionFactory.getConnection();
	}
	
	
	public void matricularAlunoEmCurso(Long cursoId, Long alunoId) {
	
		String sql = "insert into curso_aluno(curso_id,aluno_id) values(?,?)";
		
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setLong(1, cursoId);
			stmt.setLong(2, alunoId);
			
			stmt.execute();
			
			System.out.println("matricula realizada com sucesso");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Turma listarAlunosDeUmaTurma(Long turmaId) {
	
		Turma turma = new Turma();
		
		List<Aluno> alunos = new ArrayList<>();
		
		String sql = "select a.id as aluno_id, a.nome as aluno_nome from curso_aluno ca "
				+ "inner join aluno a on ca.aluno_id = a.id "
				+ "inner join curso c on ca.curso_id = c.id "
				+ "where c.id = ? ";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setLong(1,turmaId);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Aluno aluno = new Aluno();
			
				aluno.setId(rs.getLong("aluno_id"));
				aluno.setNome(rs.getString("aluno_nome"));
				
				alunos.add(aluno);
			}
			
			turma.setAlunos(alunos);
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return turma;
	}
}

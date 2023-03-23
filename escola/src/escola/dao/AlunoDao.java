package escola.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
	
}

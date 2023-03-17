package escola.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) {
		
		Connection con =  ConnectionFactory.getConnection();
			
		try {
			
			String sql = "insert into aluno(nome,idade,curso) values(?,?,?)";
			
			PreparedStatement stmt = con.prepareStatement(sql);
		
			stmt.setString(1, "Jonathan");
			stmt.setInt(2, 23);
			stmt.setString(3, "Java");
			
			stmt.execute();
			
			stmt.close();
			
			System.out.println("inserção realizada com sucesso!" );
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}

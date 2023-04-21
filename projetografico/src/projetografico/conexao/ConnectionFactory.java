package projetografico.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	
	private static final String URL = "jdbc:postgresql://127.0.0.1:5432/aluno"; 

	private static final String USER = "postgres";
	
	private static final String PASSWORD = "iwt123";
	
	public static Connection getConnection() {
				
		try {
		
			return DriverManager.getConnection(URL,USER,PASSWORD);
		
		} catch (SQLException e) {

			throw new RuntimeException("Erro ao conectar com o banco",e);
		}
	}
}

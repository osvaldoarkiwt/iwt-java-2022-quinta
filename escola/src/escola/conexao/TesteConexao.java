package escola.conexao;

import java.time.LocalDate;
import java.util.Date;

import escola.dao.AlunoDao;
import escola.model.Aluno;

public class TesteConexao {

	public static void main(String[] args) {
	
		Aluno aluno = new Aluno();
		
		aluno.setNome("Luíza");
		aluno.setDataDeNascimento(LocalDate.of(2002, 10, 3));
		aluno.setEndereco("aldeota");
		
		AlunoDao dao = new AlunoDao();
		
		//dao.matricularAluno(aluno);
		
		//dao.editarAluno(2L, aluno);
		
		//Aluno alunoResposta = dao.retornaAlunoPorId(1L);
		
		//System.out.println(alunoResposta);
		
		dao.deletarAluno(1L);
		
	}
}

package escola.conexao;

import escola.dao.TurmaDao;
import escola.model.Curso;
import escola.model.Turma;

public class TesteConexao {

	public static void main(String[] args) {
	
//		 Aluno aluno = new Aluno();
//		
//		 aluno.setNome("Armando"); aluno.setDataDeNascimento(LocalDate.of(1997, 5,
//		 30)); aluno.setEndereco("Lagamar");
//		AlunoDao dao = new AlunoDao();
//		 
		
		//dao.matricularAluno(aluno);
		
		//dao.editarAluno(2L, aluno);
		
		//Aluno alunoResposta = dao.retornaAlunoPorId(1L);
		
		//System.out.println(alunoResposta);
		
		//dao.deletarAluno(1L);
		
//		List<Aluno> resultado = dao.retornarAlunos();
//		
//		resultado.forEach(System.out::println);
		
		Curso curso = new Curso();
		
		curso.setNome("Programação JAVA");
		
		
		//CursoDao cDao = new CursoDao();
		
		//cDao.registrarCurso(curso);
		
		TurmaDao tDao = new TurmaDao();
		
		
		//tDao.matricularAlunoEmCurso(1L, 2L);
		
		Turma turma = new Turma();
		
		turma = tDao.listarAlunosDeUmaTurma(1L);
		
		turma.getAlunos().forEach(System.out::println);
		
	}
}

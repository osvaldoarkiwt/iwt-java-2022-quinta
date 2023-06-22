package testes;

import java.util.Arrays;

import org.junit.Test;

import br.com.projeto.tarefa.model.Aluno;
import br.com.projeto.tarefa.model.Disciplina;
import br.com.projeto.tarefa.model.Professor;

public class AlunoTest extends InicializacaoTest{
	
	@Test
	public void insereAluno() {
		
		Professor professor = new Professor();
		
		professor.setNome("Livia");
		professor.setIdade(20);
		professor.setEndereco("Gramado");
		
		
		Disciplina disciplina = new Disciplina();
		
		disciplina.setNome("Ciência de dados Python");
		
		disciplina.setProfessor(entityManager.find(Professor.class, 2L));
		
		Aluno a01 = entityManager.find(Aluno.class,1L);
		Aluno a02 = entityManager.find(Aluno.class,2L);
		Aluno a03 = entityManager.find(Aluno.class,3L);
		
		disciplina.setAlunos(Arrays.asList(a01,a02,a03));
		
		System.out.println(disciplina.getNome());
		
		entityManager.getTransaction().begin();
		entityManager.persist(disciplina);
		entityManager.getTransaction().commit();
		
		entityManager.clear();
		
	}

}

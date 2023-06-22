package br.com.projeto.tarefa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="alunos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long matricula;
	private String nome;
	private String idade;
	private String endereco;

	@ManyToMany
	@JoinTable(name="alunos_disciplinas",
				joinColumns = @JoinColumn(name="disciplina_id"),
				inverseJoinColumns = @JoinColumn(name="alunos_id"))
	private List<Disciplina> disciplinas;
}

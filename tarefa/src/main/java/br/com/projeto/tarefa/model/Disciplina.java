package br.com.projeto.tarefa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="disciplinas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Disciplina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String nome;
	@ManyToOne
	@JoinColumn(name="professor_id")
	private Professor professor;
	@ManyToMany(mappedBy="disciplinas")
	private List<Aluno> alunos;
}

package br.com.projeto.tarefa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="professores")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Integer idade;
	private String endereco;
	@OneToMany(mappedBy="professor")
	List<Disciplina> disciplinas;
}

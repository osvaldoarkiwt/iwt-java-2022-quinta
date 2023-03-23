package escola.model;

import java.util.Objects;

public class Professor {
	
	private Long id;
	
	private String nome;
	
	public Professor() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", nome=" + nome + "]";
	}
}

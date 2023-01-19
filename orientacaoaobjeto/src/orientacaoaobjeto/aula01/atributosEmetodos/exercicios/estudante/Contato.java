package orientacaoaobjeto.aula01.atributosEmetodos.exercicios.estudante;

public class Contato {

    String telefone01;
    String telefone02;
    String email;

    public Contato(String telefone01,
                   String telefone02,
                   String email) {
        this.telefone01 = telefone01;
        this.telefone02 = telefone02;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato [telefone01=" + telefone01 + ", telefone02=" + telefone02 + ", email=" + email + "]";
    }
}

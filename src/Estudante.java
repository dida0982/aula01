public class Estudante {
    String nome;
    int matricula;

    public Estudante(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    void exibirDados() {
        System.out.println("Nome: " + nome + ", Matricula: " + matricula);
    }
}

class TesteEstudante {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Bruno", 12345);
        estudante.exibirDados();
    }
}

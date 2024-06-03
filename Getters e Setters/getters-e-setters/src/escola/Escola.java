package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Leo");
        aluno.setIdade(21);

        System.out.printf("O aluno %s tem %d anos.", aluno.getNome(), aluno.getIdade());
    }
}

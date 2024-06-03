public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("1234", "Leonardo");

        pessoa1.setEndereco("RUA DO BURITI");

        System.out.printf("%s - %s", pessoa1.getNome(), pessoa1.getCpfc());
    }
}

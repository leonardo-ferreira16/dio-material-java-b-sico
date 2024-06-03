public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.printf("%s - %s - %d\n", e.getSigla(), e.getNome(), e.getIbge());
        }
        EstadoBrasileiro eb = EstadoBrasileiro.MARANHAO;
        System.out.println(eb.getNome());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getSigla());
        System.out.println(eb.getIbge());

    }
}

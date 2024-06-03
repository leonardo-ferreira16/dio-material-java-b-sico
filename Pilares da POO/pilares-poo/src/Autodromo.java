public class Autodromo {
    public static void main(String[] args) throws Exception {
        Carro ferrari = new Carro();
        ferrari.setChassi("123456");
        ferrari.ligar();

        Moto moto = new Moto();
        moto.setChassi("654321");
        moto.ligar();
    }
}

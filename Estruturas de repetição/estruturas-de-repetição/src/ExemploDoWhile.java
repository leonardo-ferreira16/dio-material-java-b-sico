import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
       do{
        System.out.println("Telefone tocando");

       } while(tocando());
       System.out.println("Alô?");
    }
    private static boolean tocando(){
        boolean atender = new Random().nextInt(3) == 1;//tem um valor aleatório de 1 a 3. Se for igual a 1, atender printará true e com o true, o while printa o alô
        System.out.println("Atendeu? " + atender);
        return ! atender;
    }
}


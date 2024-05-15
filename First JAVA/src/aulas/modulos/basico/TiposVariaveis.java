package aulas.modulos.basico;
public class TiposVariaveis {

    public static void main (String [] args){
        /* 
        System.out.print("Hello, Guys!");
        //Tipos de variável:
        String nome = "Leo";
        int idade = 21;
        boolean verdadeira = true;
        double salario = 2500;
        float altura = 1.70F;
        short ano = 2024;
        byte idade2 = 123;
        long cpf = 12345678900L;
        char letra = 'L'; 
        */

        /* 
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        */

        /*Declarando como uma constante que não pode ser alterada:

        final int NUMERO = 5;
        NUMERO = 10;
        System.out.print(NUMERO);
        */
        
        String primeiroNome = "Leonardo";
        String segundoNome = "Ferreira";
        String completedName = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(completedName);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
        
    }
}

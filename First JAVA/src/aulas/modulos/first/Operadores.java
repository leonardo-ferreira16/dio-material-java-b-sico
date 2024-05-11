package aulas.modulos.first;

public class Operadores {
    public static void main(String [] args){
        /*
         Operadores Unários:
         + positivo;
         - negativo;
         ++ incremento;
         -- decremento;
         */

        //Mudar o sinal de um número:
        int numero = 10;
        numero = -numero;
        System.out.println(numero);
        numero = -numero;
        System.out.println(numero);

        //Incremento:
        int numero2 = 12;
        numero2++;
        System.out.println(numero2);

        //Operador ternário: Serve para abreviação de condicional dependendo do caso

        int a = 5;
        int b = 6;

        boolean resultado = (a==b) ? true : false;

        System.out.println(resultado);

        //Operadores relacionais (retorna um valor booleano): >; <; ==; !=; >=; <=.
        
        //Método equals:
        String nome1 = "Leonardo";
        String nome2 = "Gomes";

        System.out.println(nome1.equals(nome2));
    
        //Operadores lógicos: &&; ||;

        
    }
}

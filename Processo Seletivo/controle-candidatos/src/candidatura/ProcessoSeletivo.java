
package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        //selecaoCandidatos();
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);

        }
        //imprimirSelecionados();
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            } else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while(continuarTentando && tentativasRealizadas < 3);
        if(atendeu){
            System.out.printf("CONSEGUIMOS CONTATO COM %s na %dº tentativa \n", candidato, tentativasRealizadas);
        } else{
            System.out.printf("NÃO CONSEGUIMOS CONTATO COM %s, NÚMERO MÁXIMO TENTATIVAS %d REALIZADA(S)\n", candidato, tentativasRealizadas);
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    } 

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento\n");

        for(int indice=0; indice < candidatos.length; indice++){
            System.out.printf("O candidato de nº %d é %s \n", indice+1, candidatos[indice]);
        }

        System.out.println("\nForma abreviada com for each: \n");

        for(String candidato: candidatos){
            System.out.printf("O candidato selecionado foi %s \n", candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;//indice
        double salarioBase = 2000.0;
        while(candidatosSelecionados <= 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];//O primeiro é o felipe
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou este valor de salário: %.2f \n",candidato, salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.printf("O candidato %s foi selecionado para a vaga\n", candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else{
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }
    }
}

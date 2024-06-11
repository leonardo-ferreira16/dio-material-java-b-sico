import java.util.Scanner;
import java.util.Locale;

public class Main{
    public static void main(String[] args) {   
        ListaTarefa listaDeTarefas = new ListaTarefa();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        while(true){
        System.out.println("---------------------------------------");
        System.out.println("                 MENU              ");
        System.out.println("---------------------------------------");
        System.out.println("Bem vindo ao seu Gerenciador de tarefas! \nEscolha uma das opções de gerenciamento abaixo: (Digite 0 para sair)\n1-Adicionar tarefa;\n2-Remover tarefa;\n3-Obter número total de tarefas;\n4-Obter descrição das tarefas.");
        int decisao = scanner.nextInt();

        
        if(decisao == 1){
            System.out.println("Digite a descricao da tarefa: ");
            String desc = scanner.nextLine();
            scanner.nextLine(); 
            System.out.println("Digite a prioridade da tarefa: ");
            int pr = scanner.nextInt();
            scanner.nextLine();
            listaDeTarefas.adicionarTarefa(desc, pr);
        } else if(decisao == 2){
            System.out.println("Digite a descrição da tarefa que deseja remover: ");
            String rem = scanner.nextLine();
            scanner.nextLine();
            listaDeTarefas.removerTarefa(rem);
        } else if(decisao == 3){
            System.out.println("Número total de tarefas: " + listaDeTarefas.obterNumeroTotalTarefas() + "\n");
            
        } else if(decisao == 4){
            System.out.println("Descrições das tarefas: \n");
            listaDeTarefas.obterDescricoesTarefas();
        }
        else if(decisao == 0){
            break;
        }
    }
        
        scanner.close();
    }
}
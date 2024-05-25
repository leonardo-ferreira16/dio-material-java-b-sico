public class ExemploFor {
    public static void main(String[] args) throws Exception {
        for(int carneirinhos = 1; carneirinhos<=20; carneirinhos++){
            System.out.println(carneirinhos + " Carneirinhos");
        }
        System.out.println();
        String alunos [] = {"LEONARDO", "JULIANA", "JOÃO", "BEATRIZ"};
        /* 
        for(int x=0; x<alunos.length; x++){
            System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
        }
        */
        for (String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
        System.out.println();

        for(int num = 1; num<=5; num++){
            if(num == 3){
                continue;
            }
            System.out.println(num); 
        }
    }
}

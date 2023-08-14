package Exercicio3;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Criando a turma
        System.out.println("CRIANDO A TURMA.");
        System.out.println("Digite o código da turma: ");
        String codigo = scanner.nextLine();
        System.out.println("Digite a data de inicio da turma (no formato dd/mm/aaaa): ");
        String dataInicio = scanner.nextLine();
        System.out.println("Digite a data de final da turma (no formato dd/mm/aaaa): ");
        String dataFim = scanner.nextLine();

        //Criando o aluno 1
        System.out.println("\nCRIANDO O ALUNO 1.");
        System.out.println("Digite o nome do primeiro Aluno: ");
        String nomeAluno1 = scanner.nextLine();
        System.out.println("Digite a Nota do Trabalho do Grau A: ");
        int notaTrabalhoAluno1 = scanner.nextInt();
        System.out.println("Digite a Nota da Prova do Grau A: ");
        int notaProvaAluno1 = scanner.nextInt();
        GrauA gaAluno1 = new GrauA(dataInicio, dataFim, notaTrabalhoAluno1, notaProvaAluno1);
        System.out.println("Digite a Nota das Atividades do Grau B: ");
        int notaAtividadesAluno1 = scanner.nextInt();
        System.out.println("Digite a Nota do Seminário do Grau B: ");
        int notaSeminarioAluno1 = scanner.nextInt();
        System.out.println("Digite a Nota de Participação do Grau B: ");
        int notaParticipacaoAluno1 = scanner.nextInt();
        scanner.nextLine();
        GrauB gbAluno1 = new GrauB(dataInicio, dataFim, notaAtividadesAluno1, notaSeminarioAluno1, notaParticipacaoAluno1);
        Aluno aluno1 = new Aluno(nomeAluno1, gaAluno1, gbAluno1);
        System.out.println("ALUNO 1 CRIADO!");

        //Criando o aluno 2
        System.out.println("\nCRIANDO O ALUNO 2.");
        System.out.println("Digite o nome do segundo Aluno: ");
        String nomeAluno2 = scanner.nextLine();
        System.out.println("Digite a Nota do Trabalho do Grau A: ");
        int notaTrabalhoAluno2 = scanner.nextInt();
        System.out.println("Digite a Nota da Prova do Grau A: ");
        int notaProvaAluno2 = scanner.nextInt();
        GrauA gaAluno2 = new GrauA(dataInicio, dataFim, notaTrabalhoAluno2, notaProvaAluno2);
        System.out.println("Digite a Nota das Atividades do Grau B: ");
        int notaAtividadesAluno2 = scanner.nextInt();
        System.out.println("Digite a Nota do Seminário do Grau B: ");
        int notaSeminarioAluno2 = scanner.nextInt();
        System.out.println("Digite a Nota de Participação do Grau B: ");
        int notaParticipacaoAluno2 = scanner.nextInt();
        scanner.nextLine();
        GrauB gbAluno2 = new GrauB(dataInicio, dataFim, notaAtividadesAluno2, notaSeminarioAluno2, notaParticipacaoAluno2);
        Aluno aluno2 = new Aluno(nomeAluno2, gaAluno2, gbAluno2);
        System.out.println("ALUNO 2 CRIADO!");

        //Criando o aluno 3
        System.out.println("\nCRIANDO O ALUNO 3.");
        System.out.println("Digite o nome do terceiro Aluno: ");
        String nomeAluno3 = scanner.nextLine();
        System.out.println("Digite a Nota do Trabalho do Grau A: ");
        int notaTrabalhoAluno3 = scanner.nextInt();
        System.out.println("Digite a Nota da Prova do Grau A: ");
        int notaProvaAluno3 = scanner.nextInt();
        GrauA gaAluno3 = new GrauA(dataInicio, dataFim, notaTrabalhoAluno3, notaProvaAluno3);
        System.out.println("Digite a Nota das Atividades do Grau B: ");
        int notaAtividadesAluno3 = scanner.nextInt();
        System.out.println("Digite a Nota do Seminário do Grau B: ");
        int notaSeminarioAluno3 = scanner.nextInt();
        System.out.println("Digite a Nota de Participação do Grau B: ");
        int notaParticipacaoAluno3 = scanner.nextInt();
        scanner.nextLine();
        GrauB gbAluno3 = new GrauB(dataInicio, dataFim, notaAtividadesAluno3, notaSeminarioAluno3, notaParticipacaoAluno3);
        Aluno aluno3 = new Aluno(nomeAluno3, gaAluno3, gbAluno3);
        System.out.println("ALUNO 3 CRIADO!");

        //Turma Criada
        Turma turma = new Turma(codigo, aluno1, aluno2, aluno3);

        //Imprimindo a média das notas
        double mediaNotas = turma.mediaNotasTurma();
        if(mediaNotas != -1){
            System.out.printf("Média de notas da turma: %.2f%n"+mediaNotas);
        }else{
            System.out.println("Não existem alunos na turma!");
        }

        //Imprimindo a aprovação dos alunos
        if(aluno1.calculaNotaFinal()>=6.0){
            System.out.println("O Aluno "+nomeAluno1+" foi Aprovado!");
        }else{
            System.out.println("O Aluno"+nomeAluno1+"Ficou em Grau C!");
        }
        if(aluno2.calculaNotaFinal()>=6.0){
            System.out.println("O Aluno "+nomeAluno2+" foi Aprovado!");
        }else{
            System.out.println("O Aluno"+nomeAluno2+"Ficou em Grau C!");
        }
        if(aluno3.calculaNotaFinal()>=6.0){
            System.out.println("O Aluno "+nomeAluno3+" foi Aprovado!");
        }else{
            System.out.println("O Aluno"+nomeAluno3+"Ficou em Grau C!");
        }
    }
}

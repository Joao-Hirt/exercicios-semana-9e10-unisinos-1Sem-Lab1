package Exercicio1;

import java.util.Scanner;
import javax.swing.*;
import java.awt.Color;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da sala: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a cor R da primeira cadeira: ");
        int rC1 = scanner.nextInt();
        System.out.println("Digite a cor G da primeira cadeira: ");
        int gC1 = scanner.nextInt();
        System.out.println("Digite a cor B da primeira cadeira: ");
        int bC1 = scanner.nextInt();
        Cadeira c1 = new Cadeira(new Cor(rC1, gC1, bC1));
        System.out.println("Primeira Exercicio1.Cadeira Criada!");

        System.out.println("Digite a cor R da segunda cadeira: ");
        int rC2 = scanner.nextInt();
        System.out.println("Digite a cor G da segunda cadeira: ");
        int gC2 = scanner.nextInt();
        System.out.println("Digite a cor B da segunda cadeira: ");
        int bC2 = scanner.nextInt();
        Cadeira c2 = new Cadeira(new Cor(rC2, gC2, bC2));
        System.out.println("Segunda Exercicio1.Cadeira Criada!");

        System.out.println("Digite a cor R da terceira cadeira: ");
        int rC3 = scanner.nextInt();
        System.out.println("Digite a cor G da terceira cadeira: ");
        int gC3 = scanner.nextInt();
        System.out.println("Digite a cor B da terceira cadeira: ");
        int bC3 = scanner.nextInt();
        Cadeira c3 = new Cadeira(new Cor(rC3, gC3, bC3));
        System.out.println("Terceira Exercicio1.Cadeira Criada!");

        System.out.println("Digite a cor R da quarta cadeira: ");
        int rC4 = scanner.nextInt();
        System.out.println("Digite a cor G da quarta cadeira: ");
        int gC4 = scanner.nextInt();
        System.out.println("Digite a cor B da quarta cadeira: ");
        int bC4 = scanner.nextInt();
        Cadeira c4 = new Cadeira(new Cor(rC4, gC4, bC4));
        System.out.println("Quarta Exercicio1.Cadeira Criada!");

        Sala sala = new Sala(nome, c1, c2, c3, c4);
        System.out.println("Exercicio1.Sala Criada!");
        System.out.println(sala);

        for (int i = 1; i <= 6; i++){
            scanner.nextLine();
            System.out.println("Digite o nome do aluno "+i+": ");
            String nomeAluno = scanner.nextLine();
            System.out.println("Digite a idade do aluno "+i+": ");
            int idadeAluno = scanner.nextInt();
            System.out.println("Digite o tipo de cadeira desejado (mesa ou rodinha): ");
            String tipoCadeira = scanner.nextLine();
            Aluno aluno = new Aluno(nomeAluno, idadeAluno);
            Cadeira cadeira = sala.entraAluno(aluno, tipoCadeira);
            if(cadeira != null){
                System.out.println("O aluno "+nomeAluno+" sentou na cadeira de "+cadeira);
            }else{
                System.out.println("Não há lugar na sala pra o aluno "+nomeAluno);
            }

        }

        System.out.println("Área das mesas acopladas:");
        if(sala.getC1() instanceof CadeiraComMesa){
            CadeiraComMesa cadeiraC1 = (CadeiraComMesa) sala.getC1();
            System.out.println("Exercicio1.Cadeira 1 - Área da Mesa: "+cadeiraC1.getLargura()*cadeiraC1.getProfundidade());
        }
        if(sala.getC2() instanceof CadeiraComMesa){
            CadeiraComMesa cadeiraC2 = (CadeiraComMesa) sala.getC2();
            System.out.println("Exercicio1.Cadeira 2 - Área da Mesa: "+cadeiraC2.getLargura()*cadeiraC2.getProfundidade());
        }
        if(sala.getC3() instanceof CadeiraComMesa){
            CadeiraComMesa cadeiraC3 = (CadeiraComMesa) sala.getC3();
            System.out.println("Exercicio1.Cadeira 3 - Área da Mesa: "+cadeiraC3.getLargura()*cadeiraC3.getProfundidade());
        }
        if(sala.getC4() instanceof CadeiraComMesa){
            CadeiraComMesa cadeiraC4 = (CadeiraComMesa) sala.getC4();
            System.out.println("Exercicio1.Cadeira 4 - Área da Mesa: "+cadeiraC4.getLargura()*cadeiraC4.getProfundidade());
        }

        System.out.println("Exercicio1.Data de manutenção das cadeiras com rodinhas:");
        if(sala.getC1() instanceof CadeiraComRodinhas){
            CadeiraComRodinhas cadeiraRodinhasC1 = (CadeiraComRodinhas) sala.getC1();
            System.out.println("Exercicio1.Cadeira 1 - Exercicio1.Data de manutenção: "+cadeiraRodinhasC1.getDataManutencao());
        }
        if(sala.getC2() instanceof CadeiraComRodinhas){
            CadeiraComRodinhas cadeiraRodinhasC2 = (CadeiraComRodinhas) sala.getC2();
            System.out.println("Exercicio1.Cadeira 2 - Exercicio1.Data de manutenção: "+cadeiraRodinhasC2.getDataManutencao());
        }
        if(sala.getC3() instanceof CadeiraComRodinhas){
            CadeiraComRodinhas cadeiraRodinhasC3 = (CadeiraComRodinhas) sala.getC3();
            System.out.println("Exercicio1.Cadeira 3 - Exercicio1.Data de manutenção: "+cadeiraRodinhasC3.getDataManutencao());
        }
        if(sala.getC4() instanceof CadeiraComRodinhas){
            CadeiraComRodinhas cadeiraRodinhasC4 = (CadeiraComRodinhas) sala.getC4();
            System.out.println("Exercicio1.Cadeira 4 - Exercicio1.Data de manutenção: "+cadeiraRodinhasC4.getDataManutencao());
        }

        System.out.println("Digite o nome de um aluno para procurar na sala: ");
        String nomeAlunoProcurado = scanner.nextLine();

        Color corCadeiraAluno = null;
        if (sala.getC1().getAluno() != null && sala.getC1().getAluno().getNome().equalsIgnoreCase(nomeAlunoProcurado)){
            corCadeiraAluno = new Color(sala.getC1().getCor().getR(), sala.getC1().getCor().getG(), sala.getC1().getCor().getB());
        }else if(sala.getC2().getAluno() != null && sala.getC2().getAluno().getNome().equalsIgnoreCase(nomeAlunoProcurado)){
            corCadeiraAluno = new Color(sala.getC2().getCor().getR(), sala.getC2().getCor().getG(), sala.getC2().getCor().getB());
        }else if(sala.getC3().getAluno() != null && sala.getC3().getAluno().getNome().equalsIgnoreCase(nomeAlunoProcurado)){
            corCadeiraAluno = new Color(sala.getC3().getCor().getR(), sala.getC3().getCor().getG(), sala.getC3().getCor().getB());
        }else if(sala.getC4().getAluno() != null && sala.getC4().getAluno().getNome().equalsIgnoreCase(nomeAlunoProcurado)){
            corCadeiraAluno = new Color(sala.getC4().getCor().getR(), sala.getC4().getCor().getG(), sala.getC4().getCor().getB());
        }

        if (corCadeiraAluno != null){
            JFrame a = new JFrame();
            a.setSize(200,200);
            a.getContentPane().setBackground(corCadeiraAluno);
            a.setVisible(true);
        }else{
            System.out.println("O aluno não foi encontrado na sala.");
        }
    }
}

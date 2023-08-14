package Exercicio5;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Competicao competicao1 = new Competicao("Correr cansa", new Data(19,05,2011));
        System.out.println(competicao1.getNome()+" - "+competicao1.getData());
        Nadador nadador1 = new Nadador("Cielo", 23, "Borboleta");
        System.out.println(nadador1.imprimeInfo());
        Corredor corredor1 = new Corredor("Pedro",91, 68,competicao1);
        corredor1.getCompeticao().getData().setMes(02);
        corredor1.getCompeticao().imprimeInfo();
        Corredor corredor2 = new Corredor("Augosto",100,70,new Competicao("São Silvestre",new Data(01,01,2012)));
        System.out.println(corredor2.imprimeInfo());
        Atleta a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para criar um Nadador ou 2 para criar um Corredor");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        if (opcao == 1){
            System.out.println("Digite o Nome: ");
            String nome = scanner.nextLine();
            System.out.println("Digite a Idade: ");
            int idade = scanner.nextInt();
            System.out.println("Digite a Categoria: ");
            String categoria = scanner.nextLine();
            a = new Nadador(nome, idade, categoria);
            System.out.println("Este atleta é um Nadador!");
        }else if (opcao == 2){
            System.out.println("Digite o Nome: ");
            String nome = scanner.nextLine();
            System.out.println("Digite a Idade: ");
            int idade = scanner.nextInt();
            System.out.println("Digite o Peso: ");
            double peso = scanner.nextDouble();
            System.out.println("Digite o nome da Competição: ");
            String nomeCompeticao = scanner.nextLine();
            System.out.println("Digite o dia da Competição: ");
            int diaCompeticao = scanner.nextInt();
            System.out.println("Digite o mês da Competição: ");
            int mesCompeticao = scanner.nextInt();
            System.out.println("Digite o ano da Competição: ");
            int anoCompeticao = scanner.nextInt();
            Competicao competicao = new Competicao(nomeCompeticao, new Data(diaCompeticao, mesCompeticao, anoCompeticao));
            a = new Corredor(nome, idade, peso, competicao);
            System.out.println("Este atleta é um Corredor!");
        }else{
            System.out.println("Opção Inválida!");
            return;
        }
        InformacoesAtletas infoAtletas = new InformacoesAtletas();
        infoAtletas.imprimeExclusivosAtleta(a);
        infoAtletas.imprimeInformacoesAtleta(a);

        if (a instanceof Nadador){
            Nadador nadador = (Nadador) a;
            nadador.setCategoria("Livre");
        }else if (a instanceof Corredor){
            Corredor corredor = (Corredor) a;
            corredor.setPeso(89);
        }
    }
}

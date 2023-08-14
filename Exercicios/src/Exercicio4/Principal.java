package Exercicio4;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto[] produtos = new Produto[4];

        for(int i = 0; i < 4; i++){
            int sorteio = (int) (Math.random()*100)+1;
            if (sorteio % 2 == 0){
                System.out.println("Informe o nome do produto: ");
                String nome = scanner.nextLine();
                System.out.println("Digite uma descrição do produto: ");
                String descricao = scanner.nextLine();
                System.out.println("Informe o valor do produto: ");
                double valor = scanner.nextDouble();
                System.out.println("Digite o dia da Validade: ");
                int dia = scanner.nextInt();
                System.out.println("Digite o mês da Validade: ");
                int mes = scanner.nextInt();
                System.out.println("Digite o ano da Validade:");
                int ano = scanner.nextInt();
                produtos[i] = new Perecivel(nome, descricao, valor, new Data(dia, mes, ano));
            }else{
                System.out.println("Informe o nome do produto: ");
                String nome = scanner.nextLine();
                System.out.println("Digite uma descrição do produto: ");
                String descricao = scanner.nextLine();
                System.out.println("Informe o valor do produto: ");
                double valor = scanner.nextDouble();
                System.out.println("Digite o dia da Fabricação: ");
                int dia = scanner.nextInt();
                System.out.println("Digite o mês da Fabricação: ");
                int mes = scanner.nextInt();
                System.out.println("Digite o ano da Fabricação:");
                int ano = scanner.nextInt();
                produtos[i] = new NaoPerecivel(nome, descricao, valor, new Data(dia, mes, ano));
            }
        }

        Perecivel produtoMaisCaro = null;
        for (Produto produto : produtos){
            if (produto instanceof Perecivel){
                Perecivel perecivel = (Perecivel) produto;
                if (produtoMaisCaro == null || perecivel.getValor() > produtoMaisCaro.getValor()){
                    produtoMaisCaro = perecivel;
                }
            }
        }
        if (produtoMaisCaro != null){
            System.out.println("\nO produto mais caro é: ");
            System.out.println(produtoMaisCaro);
        }else{
            System.out.println("\nNão há produtos perecíveis.");
        }
        System.out.println("\nProdutos não-perecíveis fabricados antes de 2023:");
        for (Produto produto : produtos){
            if (produto instanceof NaoPerecivel){
                NaoPerecivel naoPerecivel = (NaoPerecivel) produto;
                if (naoPerecivel.getDataDeFabricacao().getAno() < 2023){
                    System.out.println(naoPerecivel.getNome()+" - "+naoPerecivel.getDataDeFabricacao());
                }
            }
        }
        System.out.println("\nProdutos perecíveis vencidos em 01/05/2023:");
        for (Produto produto : produtos){
            if (produto instanceof Perecivel){
                Perecivel perecivel = (Perecivel) produto;
                if (perecivel.getDataDeValidade().getAno() < 2023){
                    System.out.println(perecivel.getNome());
                }else if (perecivel.getDataDeValidade().getAno() == 2023 && perecivel.getDataDeValidade().getMes() < 05){
                    System.out.println(perecivel.getNome());
                }
            }
        }
    }
}

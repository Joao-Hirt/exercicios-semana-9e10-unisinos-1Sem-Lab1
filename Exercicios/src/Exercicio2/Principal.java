package Exercicio2;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 0;
        //Criação dos objetos (Circulo 0, Retangulo 1 usando o Random)
        while (contador < 4){
            int escolha1 = random.nextInt(2);
            if (escolha1 == 0){
                double x = random.nextDouble()*10;
                double y = random.nextDouble()*10;
                double raio = random.nextDouble()*5;
                Circulo circulo = new Circulo(x,y,raio);
                double area = circulo.calculaArea();
                System.out.printf("Área do Círculo: %.2f%n",area);
            }else{
                double x = random.nextDouble()*10;
                double y = random.nextDouble()*10;
                double base = random.nextDouble()*10;
                double altura = random.nextDouble()*10;
                Retangulo retangulo = new Retangulo(x,y,base,altura);
                double area = retangulo.calculaArea();
                System.out.printf("Área do Retangulo: %.2f%n",area);
            }
            contador++;
        }
    }
}

package Exercicio2;

public class Circulo extends Figura{
    private double raio;

    public Circulo(double x, double y, double raio){
        super(x,y);
        this.raio = raio;
    }

    public Circulo(double raio){
        super();
        this.raio = raio;
    }

    public Circulo(){
        super();
        this.raio = 0.0;
    }

    private double getRaio(){
        return raio;
    }
    private void setRaio(double raio){
        this.raio = raio;
    }

    @Override
    public String toString(){
        return "Circulo [raio="+raio+", "+super.toString()+"]";
    }

    public double calculaArea(){
        final double PI = 3.14;
        double area = PI*(raio*raio);
        return area;
    }
}

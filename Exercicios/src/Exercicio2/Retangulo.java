package Exercicio2;

public class Retangulo extends Figura{
    private double base;
    private double altura;

    public Retangulo(double x, double y, double base, double altura){
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(double base, double altura){
        super();
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(){
        super();
        this.base = 0.0;
        this.altura = 0.0;
    }

    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base = base;
    }

    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public String toString(){
        return "Retangulo [base="+base+", altura="+altura+", "+super.toString()+"]";
    }

    public double calculaArea(){
        double area = base*altura;
        return area;
    }
}

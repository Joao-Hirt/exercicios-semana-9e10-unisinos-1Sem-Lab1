package Exercicio2;

public class Figura {
    private double x;
    private double y;

    public Figura(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Figura(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString(){
        return "Figura [x="+x+", y="+y+"]";
    }
}

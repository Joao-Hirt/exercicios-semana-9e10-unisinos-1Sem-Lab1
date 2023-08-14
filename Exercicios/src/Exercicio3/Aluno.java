package Exercicio3;

public class Aluno {
    private String nome;
    private GrauA ga;
    private GrauB gb;

    public Aluno(String nome, GrauA ga, GrauB gb){
        this.nome = nome;
        this.ga = ga;
        this.gb = gb;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public GrauA getGa(){
        return ga;
    }
    public void setGa(GrauA ga){
        this.ga = ga;
    }

    public GrauB getGb(){
        return gb;
    }
    public void setGb(GrauB gb){
        this.gb = gb;
    }

    public double calculaNotaFinal(){
        double notaFinal = 0;
        double notaGa = ga.calculaNotaFinalGrau();
        double notaGb = gb.calculaNotaFinalGrau();
        notaFinal = (notaGa*0.33)+(notaGb*0.67);
        return notaFinal;
    }

    @Override
    public String toString(){
        return "Aluno [Nome: "+nome+", Nota Grau A: "+ga+", Nota Grau B: "+gb+"]";
    }
}

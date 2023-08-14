package Exercicio3;

public class GrauA extends Grau{
    private int notaTrabalho;
    private int notaProva;

    public GrauA(String dataComeco, String dataFim, int notaProva, int notaTrabalho){
        super(dataComeco, dataFim);
        this.notaTrabalho = notaTrabalho;
        this.notaProva = notaProva;
    }

    public GrauA(){
        super();
        this.notaTrabalho = 0;
        this.notaProva = 0;
    }

    public int getNotaTrabalho(){
        return notaTrabalho;
    }
    public void setNotaTrabalho(int notaTrabalho){
        this.notaTrabalho = notaTrabalho;
    }

    public int getNotaProva(){
        return notaProva;
    }
    public void setNotaProva(int notaProva){
        this.notaProva = notaProva;
    }

    @Override
    public String toString(){
        return "\nNotas [Nota Trabalho: "+notaTrabalho+", Nota Prova: "+notaProva+"]"+super.toString();
    }

    public double calculaNotaFinalGrau(){
        double nota = (notaTrabalho*0.3)+(notaProva*0.7);
        return nota;
    }
}

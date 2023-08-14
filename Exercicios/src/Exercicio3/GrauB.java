package Exercicio3;

public class GrauB extends Grau{
    private int notaAtividades;
    private int notaSeminario;
    private int notaParticipacao;

    public GrauB(String dataComeco, String dataFim, int notaAtividades, int notaSeminario, int notaParticipacao){
        super(dataComeco, dataFim);
        this.notaAtividades = notaAtividades;
        this.notaSeminario = notaSeminario;
        this.notaParticipacao = notaParticipacao;
    }

    public GrauB(){
        super();
        this.notaAtividades = 0;
        this.notaSeminario = 0;
        this.notaParticipacao = 0;
    }

    public int getNotaAtividades() {
        return notaAtividades;
    }
    public void setNotaAtividades(int notaAtividades) {
        this.notaAtividades = notaAtividades;
    }

    public int getNotaSeminario() {
        return notaSeminario;
    }
    public void setNotaSeminario(int notaSeminario) {
        this.notaSeminario = notaSeminario;
    }

    public int getNotaParticipacao() {
        return notaParticipacao;
    }
    public void setNotaParticipacao(int notaParticipacao) {
        this.notaParticipacao = notaParticipacao;
    }

    @Override
    public String toString(){
        return "\nNotas: [Nota Atividades: "+notaAtividades+", Nota Seminário: "+notaSeminario+", Nota de Participação: "+notaParticipacao+"]"+super.toString();
    }

    public double calculaNotaFinalGrau(){
        double nota = (notaAtividades*0.3)+(notaSeminario*0.6)+(notaParticipacao*0.1);
        return nota;
    }
}

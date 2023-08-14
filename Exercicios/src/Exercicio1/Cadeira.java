package Exercicio1;

public class Cadeira {
    private Cor cor;
    private Aluno aluno;

    public Cadeira(Cor cor){
        this.cor = cor;
        this.aluno = aluno;
    }

    public Cor getCor(){
        return cor;
    }
    public void setCor(Cor cor){
        this.cor = cor;
    }

    public Aluno getAluno(){
        return aluno;
    }
    public void setAluno(Aluno aluno){
        this.aluno = aluno;
    }

    @Override
    public String toString(){
        return "Exercicio1.Cor da cadeira: "+cor+"\nExercicio1.Aluno sentado na cadeira: "+aluno;
    }
}

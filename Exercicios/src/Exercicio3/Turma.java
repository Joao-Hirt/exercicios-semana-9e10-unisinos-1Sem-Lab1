package Exercicio3;

public class Turma {
    private String codigo;
    private Aluno aluno1;
    private Aluno aluno2;
    private Aluno aluno3;

    public Turma(String codigo, Aluno aluno1, Aluno aluno2, Aluno aluno3){
        this.codigo = codigo;
        this.aluno1 = aluno1;
        this.aluno2 = aluno2;
        this.aluno3 = aluno3;
    }

    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public Aluno getAluno1(){
        return aluno1;
    }
    public void setAluno1(Aluno aluno1){
        this.aluno1 = aluno1;
    }

    public Aluno getAluno2(){
        return aluno2;
    }
    public void setAluno2(Aluno aluno2){
        this.aluno2 = aluno2;
    }

    public Aluno getAluno3(){
        return aluno3;
    }
    public void setAluno3(Aluno aluno3){
        this.aluno3 = aluno3;
    }

    public double mediaNotasTurma(){
        double somaNotas = 0;
        double quantAlunos = 0;
        if (aluno1 != null){
            somaNotas += aluno1.calculaNotaFinal();
            quantAlunos++;
        }
        if (aluno2 != null){
            somaNotas += aluno2.calculaNotaFinal();
            quantAlunos++;
        }
        if (aluno3 != null){
            somaNotas += aluno3.calculaNotaFinal();
            quantAlunos++;
        }
        if (quantAlunos > 0){
            return somaNotas/quantAlunos;
        }else{
            return -1;
        }
    }

    public void alteraNotasGrauA(String nomeAlunoAlterar, int notaTrabalhoAlterarGa, int notaProvaAlterarGa){
        if(aluno1 != null && aluno1.getNome().equalsIgnoreCase(nomeAlunoAlterar)){
            aluno1.getGa().setNotaTrabalho(notaTrabalhoAlterarGa);
            aluno1.getGa().setNotaProva(notaProvaAlterarGa);
        }
        if(aluno2 != null && aluno2.getNome().equalsIgnoreCase(nomeAlunoAlterar)){
            aluno2.getGa().setNotaTrabalho(notaTrabalhoAlterarGa);
            aluno2.getGa().setNotaProva(notaProvaAlterarGa);
        }
        if(aluno3 != null && aluno3.getNome().equalsIgnoreCase(nomeAlunoAlterar)){
            aluno3.getGa().setNotaTrabalho(notaTrabalhoAlterarGa);
            aluno3.getGa().setNotaProva(notaProvaAlterarGa);
        }
    }

    public void alterarNotasGrauB(String nomeAlunoAlterar, int notaAtividadesAlterarGb, int notaSeminarioAlterarGb, int notaParticipacaoAlterarGb){
        if(aluno1 != null && aluno1.getNome().equalsIgnoreCase(nomeAlunoAlterar)){
            aluno1.getGb().setNotaAtividades(notaAtividadesAlterarGb);
            aluno1.getGb().setNotaSeminario(notaSeminarioAlterarGb);
            aluno1.getGb().setNotaParticipacao(notaParticipacaoAlterarGb);
        }
        if(aluno2 != null && aluno2.getNome().equalsIgnoreCase(nomeAlunoAlterar)){
            aluno2.getGb().setNotaAtividades(notaAtividadesAlterarGb);
            aluno2.getGb().setNotaSeminario(notaSeminarioAlterarGb);
            aluno2.getGb().setNotaParticipacao(notaParticipacaoAlterarGb);
        }
        if(aluno3 != null && aluno3.getNome().equalsIgnoreCase(nomeAlunoAlterar)){
            aluno3.getGb().setNotaAtividades(notaAtividadesAlterarGb);
            aluno3.getGb().setNotaSeminario(notaSeminarioAlterarGb);
            aluno3.getGb().setNotaParticipacao(notaParticipacaoAlterarGb);
        }
    }
}

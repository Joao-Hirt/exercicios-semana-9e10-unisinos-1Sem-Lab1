package Exercicio5;

public class Corredor extends Atleta{
    private double peso;
    private Competicao competicao;

    public Corredor(String nome, int idade, double peso, Competicao competicao) {
        super(nome, idade);
        this.peso = peso;
        this.competicao = competicao;
    }

    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public Competicao getCompeticao(){
        return competicao;
    }
    public void setCompeticao(Competicao competicao){
        this.competicao = competicao;
    }

    public String imprimeCompeticao(){
        return "Nome Competição: "+competicao.getNome()+"\nData da competição: "+competicao.getData();
    }

    @Override
    public String imprimeInfo(){
        return super.imprimeInfo()+"\nPeso: "+peso;
    }
}

package Exercicio5;

public class Competicao {
    private String nome;
    private Data data;

    public Competicao(String nome, Data data){
        this.nome = nome;
        this.data = data;
    }

    public String getNome(){
        return nome;
    }
    public void SetNome(String nome){
        this.nome = nome;
    }

    public Data getData(){
        return data;
    }
    public void setData(Data data){
        this.data = data;
    }

    public Data imprimeInfo(){
        return data;
    }
}

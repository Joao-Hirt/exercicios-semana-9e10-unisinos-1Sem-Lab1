package Exercicio4;

public class Perecivel extends Produto{
    private Data dataDeValidade;

    public Perecivel(String nome, String descricao, double valor, Data dataDeValidade) {
        super(nome, descricao, valor);
        this.dataDeValidade = dataDeValidade;
    }

    public Data getDataDeValidade(){
        return dataDeValidade;
    }
    public void setDataDeValidade(Data dataDeValidade){
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString(){
        return super.toString()+"\nData de Validade: "+dataDeValidade;
    }
}

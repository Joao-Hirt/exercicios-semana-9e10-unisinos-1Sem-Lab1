package Exercicio4;

public class NaoPerecivel extends Produto{
    private Data dataDeFabricacao;

    public NaoPerecivel(String nome, String descricao, double valor, Data dataDeFabricacao){
        super(nome, descricao, valor);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public Data getDataDeFabricacao(){
        return dataDeFabricacao;
    }
    public void setDataDeFabricacao(Data dataDeFabricacao){
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public String toString(){
        return super.toString()+"\nData de Fabricação: "+dataDeFabricacao;
    }
}

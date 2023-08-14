package Exercicio3;

public class Grau {
    private String dataComeco;
    private String dataFim;

    public Grau(String dataComeco, String dataFim){
        this.dataComeco = dataComeco;
        this.dataFim = dataFim;
    }

    public Grau(){
        this.dataComeco = null;
        this.dataFim = null;
    }

    public String getDataComeco(){
        return dataComeco;
    }
    public void setDataComeco(String dataComeco){
        this.dataComeco = dataComeco;
    }

    public String getDataFim(){
        return dataFim;
    }
    public void setDataFim(String dataFim){
        this.dataFim = dataFim;
    }

    @Override
    public String toString(){
        return "\nDatas [Data de Começo: "+dataComeco+", Data de Fim: "+dataFim+"]";
    }
}

package Exercicio1;

public class CadeiraComRodinhas extends Cadeira{
    private Data dataManutencao;

    public CadeiraComRodinhas(Cor cor, Data dataManutencao) {
        super(cor);
        this.dataManutencao = dataManutencao;
    }

    public Data getDataManutencao(){
        return dataManutencao;
    }
    public void setDataManutencao(Data dataManutencao){
        this.dataManutencao = dataManutencao;
    }

    @Override
    public String toString(){
        return super.toString()+"\nExercicio1.Data de Manutenção: "+dataManutencao;
    }
}

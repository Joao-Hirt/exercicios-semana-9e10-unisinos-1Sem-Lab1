package Exercicio5;

public class Nadador extends Atleta{
    private String categoria;

    public Nadador(String nome, int idade, String categoria){
        super(nome, idade);
        this.categoria = categoria;
    }

    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    @Override
    public String imprimeInfo(){
        return super.imprimeInfo()+"\nCategoria: "+categoria;
    }
}

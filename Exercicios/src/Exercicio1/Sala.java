package Exercicio1;

public class Sala {
    private String nome;
    private Cadeira c1;
    private Cadeira c2;
    private Cadeira c3;
    private Cadeira c4;

    public Sala (String nome, Cadeira c1, Cadeira c2, Cadeira c3, Cadeira c4){
        this.nome = nome;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Cadeira getC1(){
        return c1;
    }
    public void setC1(Cadeira c1) {
        this.c1 = c1;
    }

    public Cadeira getC2() {
        return c2;
    }
    public void setC2(Cadeira c2) {
        this.c2 = c2;
    }

    public Cadeira getC3() {
        return c3;
    }
    public void setC3(Cadeira c3) {
        this.c3 = c3;
    }

    public Cadeira getC4() {
        return c4;
    }
    public void setC4(Cadeira c4) {
        this.c4 = c4;
    }

    public int cadeirasComMesaDisponiveis(){
        int count = 0;
        if(c1 instanceof CadeiraComMesa && c1.getAluno() == null){
            count++;
        }
        if(c2 instanceof CadeiraComMesa && c2.getAluno() == null){
            count++;
        }
        if(c3 instanceof CadeiraComMesa && c3.getAluno() == null){
            count++;
        }
        if(c4 instanceof CadeiraComMesa && c4.getAluno() == null){
            count++;
        }
        return count;
    }

    public Cadeira entraAluno(Aluno aluno, String tipoCadeira){
        Cadeira cadeira = null;
        if(tipoCadeira.equalsIgnoreCase("mesa")){
            if(c1 instanceof CadeiraComMesa && c1.getAluno() == null){
                cadeira = c1;
            }
            if(c2 instanceof CadeiraComMesa && c2.getAluno() == null){
                cadeira = c2;
            }
            if(c3 instanceof CadeiraComMesa && c3.getAluno() == null){
                cadeira = c3;
            }
            if(c4 instanceof CadeiraComMesa && c4.getAluno() == null){
                cadeira = c4;
            }
        }else if(tipoCadeira.equalsIgnoreCase("rodinha")){
            if(c1 instanceof CadeiraComRodinhas && c1.getAluno() == null){
                cadeira = c1;
            }
            if(c2 instanceof CadeiraComRodinhas && c2.getAluno() == null){
                cadeira = c2;
            }
            if(c3 instanceof CadeiraComRodinhas && c3.getAluno() == null){
                cadeira = c3;
            }
            if(c4 instanceof CadeiraComRodinhas && c4.getAluno() == null){
                cadeira = c4;
            }
        }
        if (cadeira != null){
            cadeira.setAluno(aluno);
        }
        return cadeira;
    }

    @Override
    public String toString(){
        return "Nome da Exercicio1.Sala: "+nome+"\nExercicio1.Cadeira 1: "+c1+"\nExercicio1.Cadeira 2: "+c2+"\nExercicio1.Cadeira 3: "+c3+"\nExercicio1.Cadeira 4: "+c4;
    }
}

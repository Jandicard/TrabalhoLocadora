package entidades;

/**
 *
 * @author janderson.cardoso
 */
public class Filme extends Item {
    private String diretor;
    private int duracao;

    public Filme(Categoria categoria){
        super(categoria); //comando super serve para pegar um parametro que foi recebido na classe filha e enviada para classe mae
    }
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}

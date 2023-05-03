package entidades;

/**
 *
 * @author janderson.cardoso
 */
public class ItemLocacao {
    private int id;
    private double valor;
    private Filme filme;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
}

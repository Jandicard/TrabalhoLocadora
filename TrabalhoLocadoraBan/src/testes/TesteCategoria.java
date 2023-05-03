package testes;

import entidades.Categoria;
import modelo.CategoriaDAO;

public class TesteCategoria {
    public static void main(String[] args) {
        Categoria categoria = new Categoria();
        categoria.setNome("Terror");
        categoria.setTipo('F');
        //categoria.setId(1);
        //CategoriaDAO.inserir(categoria);
        //CategoriaDAO.alterar(categoria);
        //CategoriaDAO.excluir(3);
        System.out.println(CategoriaDAO.listar());
    }
}

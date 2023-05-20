package br.com.biblioteca.dominio;

import java.time.LocalDate;
import java.util.List;

public class Colecao extends BaseBiblioteca {

    private String editora;

    private List<Livro> livro;

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public List<Livro> getLivro() {
        return livro;
    }

    public void setLivro(List<Livro> livro) {
        this.livro = livro;
    }

    public Colecao() {
    }

    public Colecao(String editora) {
        this.editora = editora;
    }

    public Colecao(int codigo, String descricao, LocalDate dataCadastro, String editora, List<Livro> livro) {
        super(codigo, descricao, dataCadastro);
        this.editora = editora;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Colecao ";
        s += "[Codigo = " + this.codigo + ",";
        s += "Descrica = " + this.descricao + ",";
        s += "Editora = " + this.editora + "]";
        return s;
        // return "Colecao [editora=" + editora + "]";
    }

}

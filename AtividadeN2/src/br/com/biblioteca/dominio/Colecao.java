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

    public Colecao(int codigo, String descricao, LocalDate dataCadastro, String editora) {
        super(codigo, descricao, dataCadastro);
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Colecao [editora=" + editora + "]";
    }

}

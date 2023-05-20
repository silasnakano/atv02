package br.com.biblioteca.dominio;

import java.time.LocalDate;
import java.util.List;

public class Livro extends BaseBiblioteca {

    private String codigoSBN;
    private int codigoAutor;
    private String titulo;

    private List<Autor> autor;

    public String getCodigoSBN() {
        return codigoSBN;
    }

    public void setCodigoSBN(String codigoSBN) {
        this.codigoSBN = codigoSBN;
    }

    public int getCodigoAutor() {
        return codigoAutor;
    }

    public void setCodigoAutor(int codigoAutor) {
        this.codigoAutor = codigoAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutor() {
        return autor;
    }

    public void setAutor(List<Autor> autor) {
        this.autor = autor;
    }

    public Livro() {
    }

    public Livro(int codigo, String descricao, LocalDate dataCadastro, String codigoSBN, int codigoAutor,
            String titulo) {
        super(codigo, descricao, dataCadastro);
        this.codigoSBN = codigoSBN;
        this.codigoAutor = codigoAutor;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro [codigoSBN=" + codigoSBN + ", codigoAutor=" + codigoAutor + ", titulo=" + titulo + "]";
    }

}

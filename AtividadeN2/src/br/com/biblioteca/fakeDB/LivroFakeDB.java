package br.com.biblioteca.fakeDB;

import java.time.LocalDate;

import br.com.biblioteca.dominio.Livro;

public class LivroFakeDB extends BaseFakeDB<Livro> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Livro(1, "Livro 01", LocalDate.now(), "SBN 01", 1, "Título 01"));
        this.tabela.add(new Livro(2, "Livro 02", LocalDate.now(), "SBN 02", 2, "Título 02"));
        this.tabela.add(new Livro(3, "Livro 03", LocalDate.now(), "SBN 03", 3, "Título 03"));
    }

}

package br.com.biblioteca.fakeDB;

import java.time.LocalDate;

import br.com.biblioteca.dominio.Livro;

public class LivroFakeDB extends BaseFakeDB<Livro> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Livro(1, "Livro1", LocalDate.now(), "SBN01", 1, "Livro01"));
        this.tabela.add(new Livro(2, "Livro2", LocalDate.now(), "SBN02", 1, "Livro02"));
        this.tabela.add(new Livro(3, "Livro3", LocalDate.now(), "SBN03", 1, "Livro03"));
        // this.tabela.add(new Livro("SBN02", 2, "Título02"));
        // this.tabela.add(new Livro("SBN03", 3, "Título03"));
    }

}

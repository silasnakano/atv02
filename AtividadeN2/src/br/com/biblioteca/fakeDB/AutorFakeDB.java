package br.com.biblioteca.fakeDB;

import java.time.LocalDate;

import br.com.biblioteca.dominio.Autor;

public class AutorFakeDB extends BaseFakeDB<Autor> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Autor(1, "Autor 01", LocalDate.now(), "Nome 01", "Sobrenome 01"));
        this.tabela.add(new Autor(2, "Autor 02", LocalDate.now(), "Nome 02", "Sobrenome 02"));
        this.tabela.add(new Autor(3, "Autor 03", LocalDate.now(), "Nome 03", "Sobrenome 03"));
    }

}

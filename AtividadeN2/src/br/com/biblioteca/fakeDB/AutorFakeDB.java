package br.com.biblioteca.fakeDB;

import br.com.biblioteca.dominio.Autor;

public class AutorFakeDB extends BaseFakeDB<Autor> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Autor("Autor01", "Sobrenome01"));
        this.tabela.add(new Autor("Autor02", "Sobrenome02"));
        this.tabela.add(new Autor("Autor03", "Sobrenome03"));
    }

}

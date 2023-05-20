package br.com.biblioteca.fakeDB;

import br.com.biblioteca.dominio.Colecao;

public class ColecaoFakeDB extends BaseFakeDB<Colecao> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Colecao("Editora01"));
        this.tabela.add(new Colecao("Editora02"));
        this.tabela.add(new Colecao("Editora03"));
    }

}

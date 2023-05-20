package br.com.biblioteca.fakeDB;

import java.time.LocalDate;

import br.com.biblioteca.dominio.Colecao;

public class ColecaoFakeDB extends BaseFakeDB<Colecao> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Colecao(1, "Coleção 01", LocalDate.now(), "Editora 01"));
        this.tabela.add(new Colecao(2, "Coleção 02", LocalDate.now(), "Editora 02"));
        this.tabela.add(new Colecao(3, "Coleção 03", LocalDate.now(), "Editora 03"));
    }
    
}

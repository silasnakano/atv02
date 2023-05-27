package br.com.biblioteca2.fakeDB;

import java.time.LocalDate;

import br.com.biblioteca2.dominio.InstituicaoBancaria;

public class InstituicaoBancariaFakeDB extends BaseFakeDB<InstituicaoBancaria> {

    @Override
    public void AutoFill() {
        this.tabela.add(new InstituicaoBancaria(1, "Banco01", LocalDate.now(), true, 1, "www.banco01.com.br"));
        this.tabela.add(new InstituicaoBancaria(2, "Banco02", LocalDate.now(), false, 2, "www.banco02.com.br"));
        this.tabela.add(new InstituicaoBancaria(3, "Banco03", LocalDate.now(), true, 3, "www.banco03.com.br"));
    }

}

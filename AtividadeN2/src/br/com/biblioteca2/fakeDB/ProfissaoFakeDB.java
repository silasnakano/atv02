package br.com.biblioteca2.fakeDB;

import java.time.LocalDate;

import br.com.biblioteca2.dominio.Profissao;

public class ProfissaoFakeDB extends BaseFakeDB<Profissao> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Profissao(1, "Profissão01", LocalDate.now(), true));
        this.tabela.add(new Profissao(2, "Profissão02", LocalDate.now(), false));
        this.tabela.add(new Profissao(3, "Profissão03", LocalDate.now(), true));
    }

}

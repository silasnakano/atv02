package br.com.biblioteca2.repositorio;

import br.com.biblioteca2.dominio.InstituicaoBancaria;
import br.com.biblioteca2.fakeDB.InstituicaoBancariaFakeDB;

public class InstituicaoBancariaRepositorio extends BaseRepositorio<InstituicaoBancaria> {

    public InstituicaoBancariaRepositorio() {
        super();
        this.tabela = new InstituicaoBancariaFakeDB().getTabela();
    }

    @Override
    public InstituicaoBancaria Create(InstituicaoBancaria obj) {

        int chave = 0;

        if (this.tabela.size() == 0) {
            chave++;
        } else {
            int tamanho = this.tabela.size();
            chave = this.tabela.get(tamanho - 1).getCodigo() + 1;
        }

        obj.setCodigo(chave);
        this.tabela.add(obj);

        return obj;

    }

    @Override
    public InstituicaoBancaria Read(int chave) {

        InstituicaoBancaria res = new InstituicaoBancaria();

        for (InstituicaoBancaria tupla : this.tabela) {

            if (tupla.getCodigo() == chave) {
                res = tupla;
                break;
            } else {
                res = null;
            }

        }

        return res;

    }

    @Override
    public InstituicaoBancaria Update(InstituicaoBancaria obj) {

        InstituicaoBancaria alteracao = this.Read(obj.getCodigo());

        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }

        return alteracao;

    }

}

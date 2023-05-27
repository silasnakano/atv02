package br.com.biblioteca2.repositorio;

import br.com.biblioteca2.dominio.Profissao;
import br.com.biblioteca2.fakeDB.ProfissaoFakeDB;

public class ProfissaoRepositorio extends BaseRepositorio<Profissao> {

    public ProfissaoRepositorio() {
        super();
        this.tabela = new ProfissaoFakeDB().getTabela();
    }

    @Override
    public Profissao Create(Profissao obj) {

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
    public Profissao Read(int chave) {

        Profissao res = new Profissao();

        for (Profissao tupla : this.tabela) {

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
    public Profissao Update(Profissao obj) {

        Profissao alteracao = this.Read(obj.getCodigo());

        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }

        return alteracao;

    }

}

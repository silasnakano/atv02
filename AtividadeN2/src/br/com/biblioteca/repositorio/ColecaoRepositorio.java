package br.com.biblioteca.repositorio;

import br.com.biblioteca.dominio.Colecao;
import br.com.biblioteca.fakeDB.ColecaoFakeDB;

public class ColecaoRepositorio extends BaseRepositorio<Colecao> {

    public ColecaoRepositorio() {
        super();
        this.tabela = new ColecaoFakeDB().getTabela();
    }

    @Override
    public Colecao Create(Colecao obj) {

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
    public Colecao Read(int chave) {

        Colecao res = new Colecao();

        for (Colecao tupla : this.tabela) {

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
    public Colecao Update(Colecao obj) {

        Colecao alteracao = this.Read(obj.getCodigo());

        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }

        return alteracao;

    }

}

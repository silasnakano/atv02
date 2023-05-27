package br.com.biblioteca2.teste;

import br.com.biblioteca2.servico.BaseServico;

public abstract class BaseTeste<TTeste> implements IBaseTeste<TTeste> {

    protected BaseServico<TTeste> servico;

    public BaseTeste() {

    }

    protected abstract int TestarCriacao();

    protected abstract void TestarLeitura(int chave);

    protected abstract void TestarLeituraVarios();

    protected abstract void TestarAtualizacao(int chave);

    protected abstract void TestarDeletar(int chave);

}

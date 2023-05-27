package br.com.biblioteca2.servico;

import br.com.biblioteca2.repositorio.BaseRepositorio;

public abstract class BaseServico<TDado> implements IBaseServico<TDado> {

    protected BaseRepositorio<TDado> repositorio;

    public BaseServico() {

    }

}

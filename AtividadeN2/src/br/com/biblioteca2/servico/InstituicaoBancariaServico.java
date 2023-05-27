package br.com.biblioteca2.servico;

import java.util.List;

import br.com.biblioteca2.dominio.InstituicaoBancaria;
import br.com.biblioteca2.repositorio.InstituicaoBancariaRepositorio;

public class InstituicaoBancariaServico extends BaseServico<InstituicaoBancaria> {

    public InstituicaoBancariaServico() {
        super();
        this.repositorio = new InstituicaoBancariaRepositorio();
    }

    @Override
    public InstituicaoBancaria Criar(InstituicaoBancaria obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public InstituicaoBancaria Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public List<InstituicaoBancaria> Ler() {
        return this.repositorio.Read();
    }

    @Override
    public InstituicaoBancaria Atualizar(InstituicaoBancaria obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public InstituicaoBancaria Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }

}

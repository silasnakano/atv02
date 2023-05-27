package br.com.biblioteca2.servico;

import java.util.List;

import br.com.biblioteca2.dominio.Profissao;
import br.com.biblioteca2.repositorio.ProfissaoRepositorio;

public class ProfissaoServico extends BaseServico<Profissao> {

    public ProfissaoServico() {
        super();
        this.repositorio = new ProfissaoRepositorio();
    }

    @Override
    public Profissao Criar(Profissao obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public Profissao Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public List<Profissao> Ler() {
        return this.repositorio.Read();
    }

    @Override
    public Profissao Atualizar(Profissao obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public Profissao Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }

}

package br.com.biblioteca2.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.biblioteca2.dominio.InstituicaoBancaria;
import br.com.biblioteca2.servico.InstituicaoBancariaServico;

public class InstituicaoBancariaTeste extends BaseTeste<InstituicaoBancaria> {

    public InstituicaoBancariaTeste() {
        super();
        this.servico = new InstituicaoBancariaServico();
    }

    @Override
    public void Executar() {
        int valorChave = this.TestarCriacao();

        this.TestarAtualizacao(valorChave);
        this.TestarDeletar(valorChave);
        // this.TestarLeitura();
        // this.TestarLeituraVarios();
    }

    @Override
    protected int TestarCriacao() {
        System.out.println("Agora testando Create: ");

        InstituicaoBancaria cat = new InstituicaoBancaria(1, "Banco01", LocalDate.now(), true, 1, "www.banco01.com.br");
        InstituicaoBancaria novo = this.servico.Criar(cat);

        System.out.println(novo.toString());

        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        InstituicaoBancaria cat = this.servico.Ler(chave);

        System.out.println(cat.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        List<InstituicaoBancaria> lista = this.servico.Ler();

        for (InstituicaoBancaria cat : lista) {
            System.out.println(cat.toString());
        }
    }

    @Override
    protected void TestarAtualizacao(int chave) {
        System.out.println("Agora testando Update: ");

        InstituicaoBancaria antigo = this.servico.Ler(chave);

        antigo.setDescricao("Outro Banco");

        InstituicaoBancaria alterada = this.servico.Atualizar(antigo);

        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarDeletar(int chave) {
        System.out.println("Agora testando Remove: ");

        InstituicaoBancaria alvo = this.servico.Ler(chave);

        InstituicaoBancaria excluido = this.servico.Deletar(alvo.getCodigo());

        System.out.println(excluido.toString());
    }

}

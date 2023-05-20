package br.com.biblioteca.teste;

import java.util.List;

import br.com.biblioteca.dominio.Colecao;
import br.com.biblioteca.servico.ColecaoServico;

public class ColecaoTeste extends BaseTeste<Colecao> {

    public ColecaoTeste() {
        super();
        this.servico = new ColecaoServico();
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

        Colecao cat = new Colecao("Editora01");
        Colecao novo = this.servico.Criar(cat);

        System.out.println(novo.toString());

        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        Colecao cat = this.servico.Ler(chave);

        System.out.println(cat.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        List<Colecao> lista = this.servico.Ler();

        for (Colecao cat : lista) {
            System.out.println(cat.toString());
        }
    }

    @Override
    protected void TestarAtualizacao(int chave) {
        System.out.println("Agora testando Update: ");

        Colecao antigo = this.servico.Ler(chave);

        antigo.setDescricao("Conto de Fadas");

        Colecao alterada = this.servico.Atualizar(antigo);

        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarDeletar(int chave) {
        System.out.println("Agora testando Remove: ");

        Colecao alvo = this.servico.Ler(chave);

        Colecao excluido = this.servico.Deletar(alvo.getCodigo());

        System.out.println(excluido.toString());
    }

}

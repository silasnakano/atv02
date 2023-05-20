package br.com.biblioteca.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.biblioteca.dominio.Livro;
import br.com.biblioteca.servico.LivroServico;

public class LivroTeste extends BaseTeste<Livro> {

    public LivroTeste() {
        super();
        this.servico = new LivroServico();
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

        Livro cat = new Livro(1, "Colecao01", LocalDate.now(), "SBN01", 1, "Título01");
        Livro novo = this.servico.Criar(cat);

        System.out.println(novo.toString());

        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        Livro cat = this.servico.Ler(chave);

        System.out.println(cat.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        List<Livro> lista = this.servico.Ler();

        for (Livro cat : lista) {
            System.out.println(cat.toString());
        }
    }

    @Override
    protected void TestarAtualizacao(int chave) {
        System.out.println("Agora testando Update: ");

        Livro antigo = this.servico.Ler(chave);

        antigo.setDescricao("Conto de Fadas");

        Livro alterada = this.servico.Atualizar(antigo);

        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarDeletar(int chave) {
        System.out.println("Agora testando Remove: ");

        Livro alvo = this.servico.Ler(chave);

        Livro excluido = this.servico.Deletar(alvo.getCodigo());

        System.out.println(excluido.toString());
    }

}

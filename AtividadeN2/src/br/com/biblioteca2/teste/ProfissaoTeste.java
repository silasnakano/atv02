package br.com.biblioteca2.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.biblioteca2.dominio.Profissao;
import br.com.biblioteca2.servico.ProfissaoServico;

public class ProfissaoTeste extends BaseTeste<Profissao> {

    public ProfissaoTeste() {
        super();
        this.servico = new ProfissaoServico();
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

        Profissao cat = new Profissao(1, "Profissão01", LocalDate.now(), true);
        Profissao novo = this.servico.Criar(cat);

        System.out.println(novo.toString());

        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        Profissao cat = this.servico.Ler(chave);

        System.out.println(cat.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        List<Profissao> lista = this.servico.Ler();

        for (Profissao cat : lista) {
            System.out.println(cat.toString());
        }
    }

    @Override
    protected void TestarAtualizacao(int chave) {
        System.out.println("Agora testando Update: ");

        Profissao antigo = this.servico.Ler(chave);

        antigo.setDescricao("Autônomo");

        Profissao alterada = this.servico.Atualizar(antigo);

        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarDeletar(int chave) {
        System.out.println("Agora testando Remove: ");

        Profissao alvo = this.servico.Ler(chave);

        Profissao excluido = this.servico.Deletar(alvo.getCodigo());

        System.out.println(excluido.toString());
    }

}

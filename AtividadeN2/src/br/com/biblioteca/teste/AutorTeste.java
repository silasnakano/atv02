package br.com.biblioteca.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.biblioteca.dominio.Autor;
import br.com.biblioteca.servico.AutorServico;

public class AutorTeste extends BaseTeste<Autor> {

    public AutorTeste() {
        super();
        this.servico = new AutorServico();
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

        Autor cat = new Autor(1, "Autor 01", LocalDate.now(), "Nome 01", "Sobrenome 01");
        Autor novo = this.servico.Criar(cat);

        System.out.println(novo.toString());

        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        Autor cat = this.servico.Ler(chave);

        System.out.println(cat.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        List<Autor> lista = this.servico.Ler();

        for (Autor cat : lista) {
            System.out.println(cat.toString());
        }
    }

    @Override
    protected void TestarAtualizacao(int chave) {
        System.out.println("Agora testando Update: ");

        Autor antigo = this.servico.Ler(chave);

        antigo.setDescricao("Conto de Fadas");

        Autor alterada = this.servico.Atualizar(antigo);

        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarDeletar(int chave) {
        System.out.println("Agora testando Remove: ");

        Autor alvo = this.servico.Ler(chave);

        Autor excluido = this.servico.Deletar(alvo.getCodigo());

        System.out.println(excluido.toString());
    }

}

import br.com.biblioteca.teste.AutorTeste;
import br.com.biblioteca.teste.ColecaoTeste;
import br.com.biblioteca.teste.LivroTeste;

public class App {
    public static void main(String[] args) throws Exception {

        ColecaoTeste teste1 = new ColecaoTeste();
        teste1.Executar();

        System.out.println();

        LivroTeste teste2 = new LivroTeste();
        teste2.Executar();

        System.out.println();

        AutorTeste teste3 = new AutorTeste();
        teste3.Executar();

    }
    
}

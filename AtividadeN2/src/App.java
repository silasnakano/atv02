
//import br.com.biblioteca.teste.AutorTeste;
//import br.com.biblioteca.teste.ColecaoTeste;
//import br.com.biblioteca.teste.LivroTeste;
import br.com.biblioteca2.teste.InstituicaoBancariaTeste;
import br.com.biblioteca2.teste.ProfissaoTeste;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * ColecaoTeste teste1 = new ColecaoTeste();
         * teste1.Executar();
         * 
         * System.out.println();
         * 
         * LivroTeste teste2 = new LivroTeste();
         * teste2.Executar();
         * 
         * System.out.println();
         * 
         * AutorTeste teste3 = new AutorTeste();
         * teste3.Executar();
         */

        InstituicaoBancariaTeste teste1 = new InstituicaoBancariaTeste();
        teste1.Executar();

        System.out.println();

        ProfissaoTeste teste2 = new ProfissaoTeste();
        teste2.Executar();

    }

}

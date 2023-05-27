package br.com.biblioteca2.dominio;

import java.time.LocalDate;

public class InstituicaoBancaria extends BaseAtributos {

    private int codigoBanco;
    private String siteWWW;

    public int getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(int codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public String getSiteWWW() {
        return siteWWW;
    }

    public void setSiteWWW(String siteWWW) {
        this.siteWWW = siteWWW;
    }

    public InstituicaoBancaria() {

    }

    public InstituicaoBancaria(int codigo, String descricao, LocalDate dataInclusao, Boolean ativo, int codigoBanco,
            String siteWWW) {
        super(codigo, descricao, dataInclusao, ativo);
        this.codigoBanco = codigoBanco;
        this.siteWWW = siteWWW;
    }

    @Override
    public String toString() {
        return "InstituicaoBancaria [codigoBanco=" + codigoBanco + ", siteWWW=" + siteWWW + "]";
    }

}

package br.com.biblioteca2.dominio;

import java.time.LocalDate;

public abstract class BaseAtributos {

    protected int codigo;
    protected String descricao;
    protected LocalDate dataInclusao;
    protected Boolean ativo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public BaseAtributos() {
    }

    public BaseAtributos(int codigo, String descricao, LocalDate dataInclusao, Boolean ativo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataInclusao = dataInclusao;
        this.ativo = ativo;
    }

}

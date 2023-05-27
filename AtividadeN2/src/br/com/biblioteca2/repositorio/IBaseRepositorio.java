package br.com.biblioteca2.repositorio;

import java.util.List;

public interface IBaseRepositorio<TTipo> {

    TTipo Create(TTipo obj);

    TTipo Read(int chave);

    List<TTipo> Read();

    TTipo Update(TTipo obj);

    TTipo Delete(int chave);

}

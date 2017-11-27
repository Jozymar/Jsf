package com.ifpb.album;

import java.util.List;

public interface Albuns {

    void excluir(Album albumParaExcluir);

    List<Album> listarTodos();

    boolean salvar(Album album);

}

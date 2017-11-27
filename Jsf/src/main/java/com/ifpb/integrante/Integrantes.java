package com.ifpb.integrante;

import java.util.List;

public interface Integrantes {

    void excluir(Integrante integranteParaExcluir);

    List<Integrante> listarTodos();

    boolean salvar(Integrante integrante);

}

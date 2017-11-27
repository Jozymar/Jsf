
package com.ifpb.memoria;

import com.ifpb.integrante.Integrante;
import com.ifpb.integrante.Integrantes;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IntegrantesEmMemoria implements Integrantes {

   private static final List<Integrante> integrantes = new CopyOnWriteArrayList<>();

    @Override
    public boolean salvar(Integrante integrante) {
        return integrantes.add(integrante);
    }

    @Override
    public List<Integrante> listarTodos() {
        return Collections.unmodifiableList(integrantes);
    }

    @Override
    public void excluir(Integrante integranteParaExcluir) {
        this.integrantes.remove(integranteParaExcluir);
    }
    
}

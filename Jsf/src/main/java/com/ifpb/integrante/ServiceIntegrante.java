package com.ifpb.integrante;

import com.ifpb.memoria.IntegrantesEmMemoria;
import java.util.List;

public class ServiceIntegrante {

    private final Integrantes dao = new IntegrantesEmMemoria();

    public boolean salvar(Integrante integrante) {
        if (naoEIntegranteValido(integrante)) {
            return false;
        }
        return dao.salvar(integrante);
    }

    public void excluirIntegrante(Integrante integranteParaExcluir) {
        dao.excluir(integranteParaExcluir);
    }

    public List<Integrante> todosOsIntegrantes() {
        return dao.listarTodos();
    }

    private boolean naoEIntegranteValido(Integrante integrante) {
        return integrante.getCpf() == null || 
                integrante.getCpf().toString().length() < 11  ||
                integrante.getCpf().toString().length() > 14;    
    }

}

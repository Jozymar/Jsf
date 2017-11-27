package com.ifpb.web;

import com.ifpb.integrante.Integrante;
import com.ifpb.integrante.ServiceIntegrante;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ControlaIntegrante {

    private Integrante integrante = new Integrante();

    private ServiceIntegrante service = new ServiceIntegrante();

    public String salvar() {
        if (this.service.salvar(integrante)) {
            return "cadastro.xhtml";
        }
        return null;
    }

    public String excluir(Integrante integranteParaExcluir) {
        this.service.excluirIntegrante(integranteParaExcluir);
        return null;
    }

    public Integrante getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
    }

    public List<Integrante> integrantes() {
        return this.service.todosOsIntegrantes();

    }

}

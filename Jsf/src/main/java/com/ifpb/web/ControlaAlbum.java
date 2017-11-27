package com.ifpb.web;

import com.ifpb.album.ServiceAlbum;
import com.ifpb.album.Album;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ControlaAlbum {

    private Album album = new Album();

    private ServiceAlbum service = new ServiceAlbum();

    public String salvar() {
        if (this.service.salvar(album)) {
            return "listar.xhtml";
        }
        return null;
    }

    public String excluir(Album albumParaExcluir) {
        this.service.excluirAlbum(albumParaExcluir);
        return null;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public List<Album> albuns() {
        return this.service.todosOsAlbuns();

    }

}

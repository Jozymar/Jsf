package com.ifpb.album;

import com.ifpb.jdbc.AlbunsEmJDBC;
import com.ifpb.memoria.AlbunsEmMemoria;
import java.time.LocalDate;
import java.util.List;

public class ServiceAlbum {

    private final Albuns dao = new AlbunsEmMemoria();

    public boolean salvar(Album album) {
        if (naoEAlbumValido(album)) {
            return false;
        }
        return dao.salvar(album);
    }

    public void excluirAlbum(Album albumParaExcluir) {
        dao.excluir(albumParaExcluir);
    }

    public List<Album> todosOsAlbuns() {
        return dao.listarTodos();
    }

//    private boolean naoEAlbumValido(Album album) {
//        return album.getDataDeLancamento() == null
//                || "".equalsIgnoreCase(album.getDataDeLancamento().trim());
//    }
    
    private boolean naoEAlbumValido(Album album) {
        return album.getDataDeLancamento() == null || 
                LocalDate.now().isBefore(album.getDataDeLancamento());
       
    }

}


package com.ifpb.memoria;

import com.ifpb.album.Album;
import com.ifpb.album.Albuns;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AlbunsEmMemoria implements Albuns {

   private static final List<Album> albuns = new CopyOnWriteArrayList<>();

    @Override
    public boolean salvar(Album album) {
        return albuns.add(album);
    }

    @Override
    public List<Album> listarTodos() {
        return Collections.unmodifiableList(albuns);
    }

    @Override
    public void excluir(Album albumParaExcluir) {
        this.albuns.remove(albumParaExcluir);
    }
    
}

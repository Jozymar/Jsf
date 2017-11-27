
package com.ifpb.album;

import java.time.LocalDate;
import java.util.Objects;

public class Album {
    
    private int id;
    private String descricao;
    //private String dataDeLancamento;
    private LocalDate dataDeLancamento;

    public Album() {
    }

    public Album(int id, String descricao, LocalDate dataDeLancamento) {
        this.descricao = descricao;
        this.dataDeLancamento = dataDeLancamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.descricao);
        hash = 47 * hash + Objects.hashCode(this.dataDeLancamento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Album other = (Album) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.dataDeLancamento, other.dataDeLancamento)) {
            return false;
        }
        return true;
    }
 
}

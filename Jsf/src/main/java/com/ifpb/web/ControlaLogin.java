
package com.ifpb.web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class ControlaLogin implements Serializable{
    
    private String login;
    private String senha;
    
    public String logar(){
        if(usuarioValido()){
            return "cadastro.xhtml";
        }
        return null;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    private boolean usuarioValido() {
        return "joao".equalsIgnoreCase(login) && "123".equalsIgnoreCase(senha);
    }
}

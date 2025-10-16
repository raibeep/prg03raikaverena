/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;
import java.util.UUID; //classe do java.util que gera identificadores únicos

/**
 *
 * @author Raika
 */
public class Sessao {
    private long id;
    private Usuario usuario;
    private String token;
    
    public Sessao(Usuario usuario){
        this.usuario = usuario;
        this.token = UUID.randomUUID().toString(); //gera um código e coverte para String
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    public String toString(){
        return "Sessão{ " + "id: " +id+ 
                ", usuário: " +usuario.getNomeUsuario()+ 
                ", token: " +token+ "}";
    }
}

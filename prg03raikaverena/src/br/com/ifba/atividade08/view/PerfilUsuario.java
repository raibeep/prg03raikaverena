/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Raika
 */
public class PerfilUsuario {
    private long id;
    private String descricao;
    private List<String> permissoes;
    
    public PerfilUsuario(long id, String descricao, List<String> permissoes){
        this.id = id;
        this.descricao = descricao;
        this.permissoes = new ArrayList<>(permissoes); //cria uma nova lista dentro do objeto, evitando erros futuros
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }
    
    public String toString(){
        return "Perfil: " +descricao+ "/Permissões: " +permissoes;
    }
    
}

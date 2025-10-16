/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;
import java.time.LocalDateTime;

/**
 *
 * @author Raika
 */
public class Usuario {
    private long id;
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senha;
    private LocalDateTime ultimoLogin;
    private boolean ativo;
    
    public Usuario(long id, String nomeUsuario, String email, String senha, PerfilUsuario perfil){//método construtor
        this.id = id;
        this.email = email;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.perfil = perfil;
        this.ultimoLogin = null;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public void logar(String senha) {
        if (this.senha.equals(senha)) {
            this.ultimoLogin = LocalDateTime.now();
            System.out.println(nomeUsuario + " logado com sucesso!");
            new LogAuditoria(this, "Usuário logou no sistema.");
        } else {
            System.out.println("Senha incorreta para " + nomeUsuario);
        }
    }
    
    public Sessao criarSessao() {
        Sessao s = new Sessao(this);
        System.out.println("Sessão criada para " + nomeUsuario + ". Token: " + s.getToken());
        return s;
    }
    
    public String toString(){
        return "Usuário: " +nomeUsuario+ "/E-mail: " +email+ "/Perfil: " +perfil.getDescricao();
    }
}

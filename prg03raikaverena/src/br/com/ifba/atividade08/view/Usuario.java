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
        if (this.senha.equals(senha)) { //compara a senha armazenada no objeto (this.senha) com a senha passada como argumento
            this.ultimoLogin = LocalDateTime.now(); //atualiza o campo 'ultimoLogin' com o instante atual
            System.out.println(nomeUsuario + " logado com sucesso!"); 
            new LogAuditoria(this, "Usuário logou no sistema."); //cria uma nova instância de LogAuditoria registrando a ação de login
        } else {
            System.out.println("Senha incorreta para " + nomeUsuario); //caso a senha esteja errada, imrpime essa mensagem
        }
    }
    
    public Sessao criarSessao() {
        Sessao s = new Sessao(this); //instancia uma nova Sessao vinculada a este usuário (this)
        System.out.println("Sessão criada para " + nomeUsuario + ". Token: " + s.getToken()); //imprime no console que a sessão foi criada e mostra o token
        return s; //retorna a sessão criada a quem chamou
    }
    
    public String toString(){
        return "Usuário: " +nomeUsuario+ "/E-mail: " +email+ "/Perfil: " +perfil.getDescricao();
    }
}

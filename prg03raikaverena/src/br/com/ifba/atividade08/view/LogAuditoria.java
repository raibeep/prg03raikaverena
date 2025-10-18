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
public class LogAuditoria {
    private long id;
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;
    private String ip;
    
    public LogAuditoria(Usuario usuario, String acao){
        this.usuario = usuario;
        this.acao = acao;
        this.ip = "125.09.0"; 
        this.dataHora = LocalDateTime.now();
        System.out.println(this); //imprime automáticamente o log
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

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    public String toString(){
        return "LogAuditoria{ "+ 
                "usuário: " +usuario.getNomeUsuario() + 
                ", ação: " +acao+ ", dataHora: " +dataHora+ ", ip: " +ip+ "}";
    }

}

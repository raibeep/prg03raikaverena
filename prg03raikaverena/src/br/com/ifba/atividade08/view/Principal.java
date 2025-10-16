/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;
import java.util.List;
/**
 *
 * @author Raika
 */
public class Principal {
    public static void main(String[] args){
        PerfilUsuario perfilAdm = new PerfilUsuario(1, "Administrador", List.of("CRIAR_USUÁRIO", "EXCLUIR_USUÁRIO"));
        PerfilUsuario perfilComum = new PerfilUsuario(2, "Comum", List.of("VISUALIZAR_CONTEÚDO"));
        
        Usuario leo = new Usuario (1, "Léo", "leo@gmail.com", "1234", perfilAdm);
        Usuario carla = new Usuario (1, "Carla", "carla@gmail.com", "6736", perfilComum);
        
        System.out.println(leo);
        System.out.println(carla);
        
        leo.logar("1234");
        carla.logar("6736");
        
        Sessao s1 = leo.criarSessao();
        Sessao s2 = carla.criarSessao();
        
        System.out.println(s1);
        System.out.println(s2);
    }
}

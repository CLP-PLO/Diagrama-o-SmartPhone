package Aparelho;

import Modo.*;
public class Iphone implements Telefone, Musica, Internet {
    public static void main(String[] args) {
        // Iphone Acessando a internet 
        Internet.acessoInternet();
        Internet.acessoPagina();
        Internet.adicionarAba();

        // Iphone Acessando o Reprodutor de Musica
        Musica.tocar();
        Musica.pausar();
        Musica.mudarMusica();

        //Iphone acessando Telefone  
        Telefone.ligar();
        Telefone.atender();
        Telefone.caixaCorreio();

    }

     
    

    
}

package app;

import Interface.*;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementações dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        // Implementação
        System.out.println("iPhone em pausa");
    }

    @Override
    public void parar() {
        System.out.println("iPhone Parado");
    }

    @Override
    public void avancarFaixa() {
        System.out.println("Avançando Faixa");
    }

    @Override
    public void voltarFaixa() {
        System.out.println("Voltando Faixa");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Musica");
    }

    // Implementações dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar() {
        // Implementação
        System.out.println("Aparelho Ligado!");
    }

    @Override
    public void desligar() {
        // Implementação
        System.out.println("Aparelho Desligando...");
    }

    @Override
    public void enviarMensagem(String mensagem) {
        // Implementação
    }

    @Override
    public void atender() {
        // Implementação
        System.out.println("Aparelho Atendido!");
    }

    @Override
    public void iniciarCorrerioVoz() {
        // Implementação
        System.out.println("Iniciando correrio de voz!");
    }

    // Implementações dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina() {
        // Implementação
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação
        System.out.println("Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        // Implementação
        System.out.println("Atualizando pagina");
    }

    public static void main(String[] args) {

        iPhone meuIPhone = new iPhone();

        meuIPhone.tocar();
        meuIPhone.enviarMensagem("Olá Tudo bem");
        meuIPhone.exibirPagina();
        meuIPhone.adicionarNovaAba();
        meuIPhone.atender();
        meuIPhone.avancarFaixa();
        meuIPhone.desligar();
    }
}

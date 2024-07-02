
public class Main {
    public static void main(String[] args) {

        Iphone meuIphone = new Iphone();

        // Testa as funcionalidades do ReprodutorMusical
        meuIphone.selecionarMusica("Soul For Real - Candy Rain ");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testa as funcionalidades do AparelhoTelefonico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testa as funcionalidades do NavegadorInternet
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

    }
}
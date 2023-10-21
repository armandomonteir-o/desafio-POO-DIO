import Entidade.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Aparelho Telefonico
        iphone.ligar("(24)999565630");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Reprodutor de Musica
        iphone.tocar("for-all-the-dogs");
        iphone.pausar();
        iphone.selecionarMusica();

        //Navegar na internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
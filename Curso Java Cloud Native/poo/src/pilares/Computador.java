package pilares;

import pilares.apps.FacebookMessenger;
import pilares.apps.MSNMessenger;
import pilares.apps.ServicoMensagemInstantanea;
import pilares.apps.Telegram;

public class Computador {
    public static void main(String[] args) {
        // Aplicando polimorfismo:
        ServicoMensagemInstantanea smi = null;
        String appEscolhido = "tlg";

        switch (appEscolhido) {
            case "msn":
                smi = new MSNMessenger();
                break;
            case "fcb":
                smi = new FacebookMessenger();
                break;
            case "tlg":
                smi = new Telegram();
                break;
            default:
                System.out.println("Serviço de Mensagem não identificado");
                break;
        }

        System.out.println("=== Serviço de Mensagem Instantânea ===");
        smi.enviarMensagem();
        smi.receberMensagem();
    }
}

package je24_pilares_poo;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessenger msnMessenger = new MSNMessenger();
        msnMessenger.enviarMensagem();
        msnMessenger.receberMensagem();

        FacebookMessenger facebookMessenger = new FacebookMessenger();
        facebookMessenger.enviarMensagem();
        facebookMessenger.receberMensagem();

        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}

package je24_pilares_poo;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        SistemaMensagemInstatanea smi = null;
    /*
      NÃO SE SABE QUAL APP
      MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
    */
        String appEscolhido="tlg";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();


        smi.enviarMensagem();
        smi.receberMensagem();
    }
}

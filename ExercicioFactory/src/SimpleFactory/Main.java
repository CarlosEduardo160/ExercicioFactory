package SimpleFactory;

public class Main {
    public static void main(String[] args) {
        Notificacao noti = NotificacaoFactory.criar("sms");
        noti.enviar();
    }
}

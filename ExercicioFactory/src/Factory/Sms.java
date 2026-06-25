package Factory;

public class Sms implements Notificacao{

    @Override
    public void enviar() {
        System.out.println("enviando sms");
    }
}

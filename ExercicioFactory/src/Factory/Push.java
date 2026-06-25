package Factory;

public class Push implements Notificacao{

    @Override
    public void enviar() {
        System.out.println("enviando push");
    }
}

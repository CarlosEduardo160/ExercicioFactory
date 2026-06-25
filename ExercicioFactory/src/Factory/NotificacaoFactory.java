package Factory;

public class NotificacaoFactory {
    public static Notificacao criar(String tipo){
        if(tipo.equalsIgnoreCase("email")){
            return new Email();
        } else if (tipo.equalsIgnoreCase("sms")){
            return new Sms();
        } else if (tipo.equalsIgnoreCase("push")){
            return new Push();
        }
        throw new IllegalArgumentException("Tipo inválido");
    }
}

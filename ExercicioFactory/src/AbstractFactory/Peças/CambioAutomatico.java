package AbstractFactory.Peças;

import AbstractFactory.Interfaces.Cambio;

public class CambioAutomatico implements Cambio {
    @Override
    public void trocarMarcha() {
        System.out.println("Troca de marcha automática");
    }
}

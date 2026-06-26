package AbstractFactory.Peças;

import AbstractFactory.Interfaces.Cambio;

public class CambioManual implements Cambio {
    @Override
    public void trocarMarcha() {
        System.out.println("Troca de marcha manual");
    }
}

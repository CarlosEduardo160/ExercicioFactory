package AbstractFactory.Peças;

import AbstractFactory.Interfaces.Roda;

public class RodaEsportiva implements Roda {
    @Override
    public void girar() {
        System.out.println("Roda esportiva girando");
    }
}

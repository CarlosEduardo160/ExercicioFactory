package AbstractFactory.Peças;

import AbstractFactory.Interfaces.Roda;

public class RodaSimples implements Roda {
    @Override
    public void girar() {
        System.out.println("Roda simples girando");
    }
}

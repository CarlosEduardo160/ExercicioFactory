package AbstractFactory.Peças;

import AbstractFactory.Interfaces.Motor;

public class MotorEsportivo implements Motor {
    @Override
    public void ligar() {
        System.out.println("Motor esportivo ligado");
    }
}

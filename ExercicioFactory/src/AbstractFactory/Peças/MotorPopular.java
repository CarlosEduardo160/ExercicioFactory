package AbstractFactory.Peças;

import AbstractFactory.Interfaces.Motor;

public class MotorPopular implements Motor {
    @Override
    public void ligar() {
        System.out.println("Motor popular ligado");
    }
}

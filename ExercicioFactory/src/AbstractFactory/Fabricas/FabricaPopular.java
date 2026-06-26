package AbstractFactory.Fabricas;

import AbstractFactory.Interfaces.Cambio;
import AbstractFactory.Interfaces.FabricaCarro;
import AbstractFactory.Interfaces.Motor;
import AbstractFactory.Interfaces.Roda;
import AbstractFactory.Peças.CambioManual;
import AbstractFactory.Peças.MotorPopular;
import AbstractFactory.Peças.RodaSimples;

public class FabricaPopular implements FabricaCarro {

    @Override
    public Motor criarMotor() {
        return new MotorPopular();
    }

    @Override
    public Roda criarRoda() {
        return new RodaSimples();
    }

    @Override
    public Cambio criarCambio() {
        return new CambioManual();
    }
}

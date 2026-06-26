package AbstractFactory.Fabricas;

import AbstractFactory.Interfaces.Cambio;
import AbstractFactory.Interfaces.FabricaCarro;
import AbstractFactory.Interfaces.Motor;
import AbstractFactory.Interfaces.Roda;
import AbstractFactory.Peças.CambioAutomatico;
import AbstractFactory.Peças.MotorEsportivo;
import AbstractFactory.Peças.RodaEsportiva;

public class FabricaEsportiva implements FabricaCarro {
    @Override
    public Motor criarMotor() {
        return new MotorEsportivo();
    }

    @Override
    public Roda criarRoda() {
        return new RodaEsportiva();
    }

    @Override
    public Cambio criarCambio() {
        return new CambioAutomatico();
    }
}

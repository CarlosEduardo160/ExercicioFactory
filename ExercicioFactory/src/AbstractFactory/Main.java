package AbstractFactory;

import AbstractFactory.Fabricas.FabricaEsportiva;
import AbstractFactory.Interfaces.Cambio;
import AbstractFactory.Interfaces.FabricaCarro;
import AbstractFactory.Interfaces.Motor;
import AbstractFactory.Interfaces.Roda;

public class Main {
    static void main(String[] args) {
        FabricaCarro fabrica = new FabricaEsportiva();

        Motor motor = fabrica.criarMotor();
        Roda roda = fabrica.criarRoda();
        Cambio cambio = fabrica.criarCambio();

        motor.ligar();
        roda.girar();
        cambio.trocarMarcha();
    }
}

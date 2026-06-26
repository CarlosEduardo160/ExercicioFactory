package AbstractFactory.Interfaces;

public interface FabricaCarro {
    Motor criarMotor();
    Roda criarRoda();
    Cambio criarCambio();
}

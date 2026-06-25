package FactoryMethod;

public class ConsoleLoggerFactory extends LoggerFactory{

    @Override
    Logger criarLogger() {
        return new ConsoleLogger();
    }
}

package FactoryMethod;

public class FileLoggerFactory extends LoggerFactory{

    @Override
    Logger criarLogger() {
        return new FileLogger();
    }
}

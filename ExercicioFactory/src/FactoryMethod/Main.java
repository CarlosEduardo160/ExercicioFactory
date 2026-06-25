package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        LoggerFactory factory = new FileLoggerFactory();
        factory.log("ola");
    }
}

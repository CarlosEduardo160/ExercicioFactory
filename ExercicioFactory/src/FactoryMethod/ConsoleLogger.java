package FactoryMethod;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String msg) {
        System.out.println("Console logger: " + msg);
    }
}

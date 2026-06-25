package FactoryMethod;

public abstract class LoggerFactory {
    abstract Logger criarLogger();

    public void log(String msg){
        Logger logger = criarLogger();
        logger.log(msg);
    }
}

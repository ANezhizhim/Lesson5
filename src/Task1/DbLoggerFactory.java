package Task1;

public class DbLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DbLogger();
    }
}

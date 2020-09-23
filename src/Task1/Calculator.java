package Task1;

public class Calculator {

    public Calculator() {

    }

    private Logger []log =new Logger [3];

    public void setLog(Logger... logg) {
        log = logg;


    }


    public double addition(double a, double b) {
        for (Logger lg:
                log) {
           lg.log ("Addition");
        }
        //log[0].log("Addition");
        return a + b;

    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }
}

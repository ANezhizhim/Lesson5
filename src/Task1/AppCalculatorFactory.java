package Task1;
import java.util.Scanner;

public class AppCalculatorFactory {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Logger[] loggers = new Logger[3];
        LoggerFactory[] logFactories = new LoggerFactory[3];
        logFactories[0] = new FileLoggerFactory();
        logFactories[1] = new DbLoggerFactory();
        logFactories[2] = new ConsoleLoggerFactory();

        for (int i = 0; i < 3; i++) {
            loggers[i] = logFactories[i].createLogger();
        }

        calculator.setLog(loggers);//Привязываем  логгеры к калькулятору
        String strExpression;//Строка с арифметическим выражением

        do {
            System.out.println("Введите выражение и нажмите [Enter] , для выхода 'ex': ");
            Scanner exprScan = new Scanner(System.in);
            strExpression = exprScan.nextLine();//Блок try-catch не имеет смысла т.к. к преобразованию в тип double подлежат только проверенные в теле программы символы (0-9, ".", арифметические знаки)
            if (!strExpression.equals("ex")) {
                System.out.println("Ответ: " + calculator.execute(strExpression));
            }
        } while (!strExpression.equals("ex"));
        System.out.println("До свидания!");
    }
}
/*

С помощью фабричного метода реализуйте логирование. Есть
три логера: ConsoleLogger, FileLogger, DbLogger. Логгер должен
реализовать метод log(String message) . Все логгеры пишут в к
консоль следующее:
ConsoleLogger
– Log into console: {message}
FileLogger
– Log into file: {message}
DbLogger
– Log into database: {message}
Реализуйте класс калькулятор с методами, умножения, деления,
вычитания и сложения. Добавьте в каждый метод логирование
полученного результата
 */


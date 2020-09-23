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

        calculator.setLog(loggers);

        int intLen, i, int_c, intCodeOper;
        char c;
        String strOperand;
        double dblOperand = 0, dblResult = 0;
        boolean boolExecuteOperation;//Признак необходимости выполнения арифметической операции
        String strExpression;

        do {
            System.out.println("Введите выражение и нажмите [Enter] , для выхода 'ex': ");
            Scanner exprScan = new Scanner(System.in);
            strExpression = exprScan.nextLine();//Блок try-catch не имеет смысла т.к. к преобразованию в тип double подлежат только проверенные в теле программы символы (0-9, ".", арифметические знаки)
//Определяем длину выражения
            intLen = strExpression.length();
//парсим строку
            dblResult = 0;//обнуляем результат предыдущих вычислений
            strOperand = "0";//обнуляем строчное представление последнего операнда
            boolExecuteOperation = false;//Признак необходимости выполнения арифметической операции
            intCodeOper = 43;//Код операции , по умолчанию "+";
            i = -1;
            while (++i < intLen) {
                c = strExpression.charAt(i);
                int_c = (int) c;
                if ((int_c == 46) || (int_c > 47) && (int_c < 58)) {
                    strOperand += c;// конкатенируем числовую строку операнда
                } else if ((int_c == 42) || (int_c == 43) || (int_c == 45) || (int_c == 47)) { //если попадаем на знаки операций , то выполняем операцию с последним операндом
                    boolExecuteOperation = true;
                }

                if (i == (intLen - 1)) {
                    boolExecuteOperation = true;//если попадаем на конец строки, то выполняем операцию с последним операндом
                }

                if (boolExecuteOperation) {
                    dblOperand = Double.parseDouble(strOperand);//переводим строку в тип Double
                    switch (intCodeOper) {
                        case 42:
                            dblResult = calculator.multiplication(dblResult, dblOperand);
                            break;
                        case 43:
                            dblResult = calculator.addition(dblResult, dblOperand);
                            break;
                        case 45:
                            dblResult = calculator.subtraction(dblResult, dblOperand);
                            break;
                        case 47:
                            dblResult = calculator.division(dblResult, dblOperand);
                            break;

                    }
                    boolExecuteOperation = false;
                    strOperand = "0";
                    intCodeOper = int_c;
                }
            }
            if (!strExpression.equals("ex")) System.out.println("Ответ: " + dblResult);
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


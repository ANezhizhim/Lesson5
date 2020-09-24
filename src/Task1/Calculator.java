package Task1;

public class Calculator {
    public Calculator() {
    }
    private Logger[] log = new Logger[3];
    private String clcStr;

    public void setLog(Logger... logg) {
        log = logg;
    }

    public double execute(String calcString) {
        clcStr = calcString;

        int intLen = clcStr.length() - 1,//длина введенной строки с арифметическим выражением
                i = -1,//счетчик
                int_c,//код символа в введенной строке , распознается как операнд или его часть или знак операции(+,-,*,/)
                intCodeOper=43;//Код операции , по умолчанию "+";
        char c;//символ в строке с арифметическим выражением
        String strOperand="0" ;//строчное представление последнего операнда
        double dblOperand = 0, dblResult = 0;// числовое предсавление операнда и результата
        boolean boolExecuteOperation = false;//Признак необходимости выполнения арифметической операции

//парсим строку
        while (++i <= intLen) {
            c = clcStr.charAt(i);
            int_c = (int) c;
            if ((int_c == 46) || (int_c > 47) && (int_c < 58)) {
                strOperand += c;// конкатенируем числовую строку операнда
            } else if ((int_c == 42) || (int_c == 43) || (int_c == 45) || (int_c == 47)) { //если попадаем на знаки операций , то выполняем операцию с последним операндом
                boolExecuteOperation = true;//признак необходимости выполнить арифметическую операцию
            }

            if (i == intLen) {
                boolExecuteOperation = true;//если попадаем на конец строки, то выполняем операцию с последним операндом
            }

            if (boolExecuteOperation) {
                dblOperand = Double.parseDouble(strOperand);//переводим строку в тип Double
                switch (intCodeOper) {
                    case 42:
                        dblResult = this.multiplication(dblResult, dblOperand);
                        break;
                    case 43:
                        dblResult = this.addition(dblResult, dblOperand);
                        break;
                    case 45:
                        dblResult = this.subtraction(dblResult, dblOperand);
                        break;
                    case 47:
                        dblResult = this.division(dblResult, dblOperand);
                        break;
                }
                boolExecuteOperation = false;//сбрасываем признак необходимости выполнения арифметической операции
                strOperand = "0";//Обнуляем строковое значение операнда
                intCodeOper = int_c;//код последнего символа запоминаем для выполнения следующец операции
            }
        }
        return dblResult;
    }

    private double addition(double a, double b) {
        double ret = a + b;
        for (Logger lg :
                log) {
            lg.log("Addition result: " + ret);
        }
        return ret;
    }

    private double subtraction(double a, double b) {
        double ret = a - b;
        for (Logger lg :
                log) {
            lg.log("subtraction result: " + ret);
        }
        return ret;
    }

    private double multiplication(double a, double b) {
        double ret = a * b;
        for (Logger lg :
                log) {
            lg.log("multiplication result: " + ret);
        }
        return ret;
    }

    private double division(double a, double b) {

        double ret = a / b;
        for (Logger lg :
                log) {
            lg.log("division result: " + ret);
        }
        return ret;
    }
}

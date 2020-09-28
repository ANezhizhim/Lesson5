package Task2;

public class HDD extends ComponentPC {
    public HDD(String name, String volMem, String tipMem, String manufacturerName, double formFactor) {
        super(name, volMem, tipMem, manufacturerName);

        this.formFactor = formFactor;
        this.componentTip = "HDD";
    }

    private double formFactor;

    public double getformFactor() {
        return this.formFactor;
    }
}




/*
Характеристики
накопителя: производитель, объем памяти, тип накопителя(HDD или
SSD), форм
-фактор.
 */
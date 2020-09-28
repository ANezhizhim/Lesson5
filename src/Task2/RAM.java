package Task2;

public class RAM extends ComponentPC {
    public RAM(String name, String volMem, String tipMem, String manufacturerName, double ramSpeed) {
        super(name, volMem, tipMem, manufacturerName);
        this.ramSpeed = ramSpeed;
        this.componentTip = "RAM";
    }

    double ramSpeed;

    public double getRamSpeed() {
        return this.ramSpeed;
    }


}
/*
 Характеристики оперативной
памяти: производитель, объем памяти, частота, тип памяти.
 */
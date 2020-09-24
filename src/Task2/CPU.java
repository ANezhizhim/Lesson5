package Task2;

public class CPU extends ComponentPC {
    public CPU(String name, String volMem, String tipMem, String manufacturerName, double cpuspeed, int cpunumCores) {
        super(name, volMem, tipMem, manufacturerName);
        this.cpuSpeed = cpuspeed;
        this.cpuNumCores = cpunumCores;
    }

    private double cpuSpeed;
    private int cpuNumCores;

    public double getCpuSpeed() {
        return this.cpuSpeed;
    }

    public int getCpuNumCores() {
        return this.cpuNumCores;
    }
}


/*
тактовая чистота, кол
-во ядер, кеш
память, название, производитель.
 */
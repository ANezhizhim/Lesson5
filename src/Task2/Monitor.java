package Task2;

public class Monitor extends ComponentPC {
    public Monitor(String name, String volMem, String tipMem, String manufacturerName, String diagonal, String resolution) {

        super(name, "not provided", "not provided", manufacturerName);

        this.componentTip = "Monitor";
        this.diagonal = diagonal;
        this.resolution = resolution;

    }

    private String diagonal;
    private String resolution;

    public String getDiagonal() {
        return this.diagonal;
    }

    public String getResolution() {
        return this.resolution;
    }
}

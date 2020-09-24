package Task2;

public abstract class ComponentPC implements Component {

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getVolumeMemory() {
        return this.volumeMemory;
    }

    @Override
    public String getTipMemory() {
        return this.tipMemory;
    }

    @Override
    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override
    public void setName(String str) {
        this.name = str;

    }

    @Override
    public void setVolumeMemory(String str) {
        this.volumeMemory = str;
    }

    @Override
    public void setTipMemory(String str) {

    }

    @Override
    public void setManufacturer(String str) {

    }

    public ComponentPC(String name, String volMem, String tipMem, String manufacturerName) {
        this.name = name;
        this.volumeMemory = volMem;
        this.tipMemory = tipMem;
        this.manufacturer = manufacturerName;
    }

    private String name;
    private String volumeMemory;
    private String tipMemory;
    private String manufacturer;

}

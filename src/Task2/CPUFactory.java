package Task2;

public class CPUFactory extends ComponentFactory {
    @Override
    public Component createComponentPC() {
        return new CPU("", "", "", "", 0, 0);
    }

}
